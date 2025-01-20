// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testhorizontallayoutcontainer.proxies;

public class ListviewItem implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject listviewItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestHorizontalLayoutContainer.ListviewItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		IsAdditionalContent("IsAdditionalContent"),
		Caption("Caption"),
		Text("Text"),
		Explanation("Explanation");

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

	public ListviewItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ListviewItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject listviewItemMendixObject)
	{
		if (listviewItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, listviewItemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.listviewItemMendixObject = listviewItemMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testhorizontallayoutcontainer.proxies.ListviewItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testhorizontallayoutcontainer.proxies.ListviewItem(context, mendixObject);
	}

	public static testhorizontallayoutcontainer.proxies.ListviewItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testhorizontallayoutcontainer.proxies.ListviewItem.initialize(context, mendixObject);
	}

	public static java.util.List<testhorizontallayoutcontainer.proxies.ListviewItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testhorizontallayoutcontainer.proxies.ListviewItem.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of IsAdditionalContent
	 */
	public final java.lang.Boolean getIsAdditionalContent()
	{
		return getIsAdditionalContent(getContext());
	}

	/**
	 * @param context
	 * @return value of IsAdditionalContent
	 */
	public final java.lang.Boolean getIsAdditionalContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsAdditionalContent.toString());
	}

	/**
	 * Set value of IsAdditionalContent
	 * @param isadditionalcontent
	 */
	public final void setIsAdditionalContent(java.lang.Boolean isadditionalcontent)
	{
		setIsAdditionalContent(getContext(), isadditionalcontent);
	}

	/**
	 * Set value of IsAdditionalContent
	 * @param context
	 * @param isadditionalcontent
	 */
	public final void setIsAdditionalContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isadditionalcontent)
	{
		getMendixObject().setValue(context, MemberNames.IsAdditionalContent.toString(), isadditionalcontent);
	}

	/**
	 * @return value of Caption
	 */
	public final java.lang.String getCaption()
	{
		return getCaption(getContext());
	}

	/**
	 * @param context
	 * @return value of Caption
	 */
	public final java.lang.String getCaption(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Caption.toString());
	}

	/**
	 * Set value of Caption
	 * @param caption
	 */
	public final void setCaption(java.lang.String caption)
	{
		setCaption(getContext(), caption);
	}

	/**
	 * Set value of Caption
	 * @param context
	 * @param caption
	 */
	public final void setCaption(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String caption)
	{
		getMendixObject().setValue(context, MemberNames.Caption.toString(), caption);
	}

	/**
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of Explanation
	 */
	public final java.lang.String getExplanation()
	{
		return getExplanation(getContext());
	}

	/**
	 * @param context
	 * @return value of Explanation
	 */
	public final java.lang.String getExplanation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Explanation.toString());
	}

	/**
	 * Set value of Explanation
	 * @param explanation
	 */
	public final void setExplanation(java.lang.String explanation)
	{
		setExplanation(getContext(), explanation);
	}

	/**
	 * Set value of Explanation
	 * @param context
	 * @param explanation
	 */
	public final void setExplanation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String explanation)
	{
		getMendixObject().setValue(context, MemberNames.Explanation.toString(), explanation);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return listviewItemMendixObject;
	}

	@java.lang.Override
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
			final testhorizontallayoutcontainer.proxies.ListviewItem that = (testhorizontallayoutcontainer.proxies.ListviewItem) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
