// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.followupnotesdialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.FollowUpNotesDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.FollowUpNotesDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FollowUpType existingInstance = (ims.core.vo.lookups.FollowUpType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.FollowUpType)
		{
			ims.core.vo.lookups.FollowUpType instance = (ims.core.vo.lookups.FollowUpType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FollowUpType existingInstance = (ims.core.vo.lookups.FollowUpType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTypeLookup()
	{
		this.form.cmbType().clear();
		ims.core.vo.lookups.FollowUpTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getFollowUpType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTypeLookupValue(int id)
	{
		ims.core.vo.lookups.FollowUpType instance = ims.core.vo.lookups.LookupHelper.getFollowUpTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbType().setValue(instance);
	}
	protected final void defaultcmbTypeLookupValue()
	{
		this.form.cmbType().setValue((ims.core.vo.lookups.FollowUpType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.FollowUpType.class, engine.getFormName().getID(), ims.core.vo.lookups.FollowUpType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.FollowUpNotesDialog domain;
}