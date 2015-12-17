//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.nursing.forms.contactinput;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.nursing.domain.ContactInput.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.nursing.domain.ContactInput domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected void clearScreen()
	{
	}
	protected void populateScreenFromData(ims.coe.vo.DischargeAssessment value)
	{
		clearScreen();
		if(value == null)
			return;

	}
	protected ims.coe.vo.DischargeAssessment populateDataFromScreen(ims.coe.vo.DischargeAssessment value)
	{
		if(value == null)
			value = new ims.coe.vo.DischargeAssessment();


		return value;
	}
	protected ims.coe.vo.DischargeAssessment populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.coe.vo.DischargeAssessment());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.nursing.domain.ContactInput domain;
}