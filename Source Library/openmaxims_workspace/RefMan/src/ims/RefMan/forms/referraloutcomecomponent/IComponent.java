// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referraloutcomecomponent;

import ims.framework.enumerations.FormMode;

public interface IComponent
{
	public void setMode(FormMode mode);
	public FormMode getMode();
	/**
	* initialize
	*/
	public void initialize(Boolean displayReadOnly, ims.RefMan.vo.ReferralDischargeVo discharge, ims.RefMan.vo.FurtherManagementDetailsVo furtherManagement, ims.RefMan.vo.ReferralOutcomeLiteVo outcome);
}