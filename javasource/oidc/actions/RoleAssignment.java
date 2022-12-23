// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package oidc.actions;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import system.proxies.UserRole;

public class RoleAssignment extends CustomJavaAction<java.lang.String>
{
	private java.lang.String AccessToken;
	private IMendixObject __Account;
	private administration.proxies.Account Account;

	public RoleAssignment(IContext context, java.lang.String AccessToken, IMendixObject Account)
	{
		super(context);
		this.AccessToken = AccessToken;
		this.__Account = Account;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.Account = this.__Account == null ? null : administration.proxies.Account.initialize(getContext(), __Account);

		// BEGIN USER CODE
		String decodedPayload = getDecodedPayload();
		JSONArray roles=getRoles(decodedPayload);
		if (roles != null) {
			IContext context=getContext();
			List<IMendixObject> rolesFromToken=getRoleObjects(roles,context);
		
			Boolean microflowResult = Core.microflowCall("OIDC.BCO_Account_ProcessRolesToken").withParam("UserRoleList", rolesFromToken)
					.withParam("Account", Account.getMendixObject()).execute(context);
			
			// In case of access_token contain's empty roles or access_token roles not match with Mendix roles this condition will be true
			if(microflowResult.equals(false)){
				 logger.info("false");
				 return null;
				  
			}
			
			if (!roles.isNull(0)) {
				return roles.get(0).toString();
			}
		}
		
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RoleAssignment";
	}

	// BEGIN EXTRA CODE
	private java.lang.String description="Parsed from access Token";
	private static final ILogNode logger=Core.getLogger("OIDC.LogNode");
	public java.lang.String getDecodedPayload(){
		DecodedJWT jwt=JWT.decode(AccessToken);
		String payload= jwt.getPayload();
		byte[] decodedBytes = Base64.getDecoder().decode(payload);
		String decodedPayload = new String(decodedBytes);
		return decodedPayload;
	}
	
	public JSONArray getRoles(String payload) throws JSONException {
		JSONObject jsonPayload=  new JSONObject(payload);
		JSONArray roles = (jsonPayload.has("sws.samauth.role.name")) ? jsonPayload.getJSONArray("sws.samauth.role.name") : null;
		logger.info(roles);
		return roles;
	}
	
	public List<IMendixObject> getRoleObjects(JSONArray roles, IContext context) throws JSONException{
		List<IMendixObject> rolesFromToken=new ArrayList<IMendixObject>();
		for(int i=0;i<roles.length();i++) {
			String role=roles.get(i).toString();
			logger.info(role);
			UserRole urole = new UserRole(context);
    		urole.setModelGUID(role);
    		urole.setDescription(description);
    		rolesFromToken.add(urole.getMendixObject());
		}
		return rolesFromToken;
	}
	// END EXTRA CODE
}