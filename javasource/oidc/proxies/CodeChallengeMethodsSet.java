// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package oidc.proxies;

public class CodeChallengeMethodsSet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject codeChallengeMethodsSetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OIDC.CodeChallengeMethodsSet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CodeChallengeMethodsSet_CodeChallengeMethods("OIDC.CodeChallengeMethodsSet_CodeChallengeMethods");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public CodeChallengeMethodsSet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected CodeChallengeMethodsSet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject codeChallengeMethodsSetMendixObject)
	{
		if (codeChallengeMethodsSetMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, codeChallengeMethodsSetMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.codeChallengeMethodsSetMendixObject = codeChallengeMethodsSetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CodeChallengeMethodsSet.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static oidc.proxies.CodeChallengeMethodsSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return oidc.proxies.CodeChallengeMethodsSet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static oidc.proxies.CodeChallengeMethodsSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new oidc.proxies.CodeChallengeMethodsSet(context, mendixObject);
	}

	public static oidc.proxies.CodeChallengeMethodsSet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return oidc.proxies.CodeChallengeMethodsSet.initialize(context, mendixObject);
	}

	public static java.util.List<oidc.proxies.CodeChallengeMethodsSet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> oidc.proxies.CodeChallengeMethodsSet.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of CodeChallengeMethodsSet_CodeChallengeMethods
	 */
	public final java.util.List<oidc.proxies.CodeChallengeMethods> getCodeChallengeMethodsSet_CodeChallengeMethods() throws com.mendix.core.CoreException
	{
		return getCodeChallengeMethodsSet_CodeChallengeMethods(getContext());
	}

	/**
	 * @param context
	 * @return value of CodeChallengeMethodsSet_CodeChallengeMethods
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<oidc.proxies.CodeChallengeMethods> getCodeChallengeMethodsSet_CodeChallengeMethods(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<oidc.proxies.CodeChallengeMethods> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.CodeChallengeMethodsSet_CodeChallengeMethods.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(oidc.proxies.CodeChallengeMethods.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of CodeChallengeMethodsSet_CodeChallengeMethods
	 * @param codechallengemethodsset_codechallengemethods
	 */
	public final void setCodeChallengeMethodsSet_CodeChallengeMethods(java.util.List<oidc.proxies.CodeChallengeMethods> codechallengemethodsset_codechallengemethods)
	{
		setCodeChallengeMethodsSet_CodeChallengeMethods(getContext(), codechallengemethodsset_codechallengemethods);
	}

	/**
	 * Set value of CodeChallengeMethodsSet_CodeChallengeMethods
	 * @param context
	 * @param codechallengemethodsset_codechallengemethods
	 */
	public final void setCodeChallengeMethodsSet_CodeChallengeMethods(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<oidc.proxies.CodeChallengeMethods> codechallengemethodsset_codechallengemethods)
	{
		var identifiers = codechallengemethodsset_codechallengemethods
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.CodeChallengeMethodsSet_CodeChallengeMethods.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return codeChallengeMethodsSetMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final oidc.proxies.CodeChallengeMethodsSet that = (oidc.proxies.CodeChallengeMethodsSet) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
