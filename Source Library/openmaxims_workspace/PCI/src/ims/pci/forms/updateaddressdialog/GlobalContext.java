//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.pci.forms.updateaddressdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		PCI = new PCIContext(context);
	}
	public final class PCIContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private PCIContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getClientAddressesIsNotNull()
		{
			return !cx_PCIClientAddresses.getValueIsNull(context);
		}
		public ims.pci.vo.ClientAddressVo getClientAddresses()
		{
			return (ims.pci.vo.ClientAddressVo)cx_PCIClientAddresses.getValue(context);
		}
		public void setClientAddresses(ims.pci.vo.ClientAddressVo value)
		{
			cx_PCIClientAddresses.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_PCIClientAddresses = new ims.framework.ContextVariable("PCI.ClientAddresses", "_cv_PCI.ClientAddresses");
		public boolean getClientParentIsNotNull()
		{
			return !cx_PCIClientParent.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getClientParent()
		{
			return (ims.core.vo.PatientShort)cx_PCIClientParent.getValue(context);
		}
		public void setClientParent(ims.core.vo.PatientShort value)
		{
			cx_PCIClientParent.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_PCIClientParent = new ims.framework.ContextVariable("PCI.ClientParent", "_cv_PCI.ClientParent");

		private ims.framework.Context context;
	}

	public PCIContext PCI;
}