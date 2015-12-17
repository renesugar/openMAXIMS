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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 5360.17707)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.util.HashMap;

import ims.RefMan.domain.base.impl.BaseManuallySetRTTClockStatusImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.vo.domain.CATSReferralManualRTTClockStatusVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;
import ims.pathways.vo.domain.RTTStatusPointLiteVoAssembler;

public class ManuallySetRTTClockStatusImpl extends BaseManuallySetRTTClockStatusImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.CATSReferralManualRTTClockStatusVo getReferral(ims.RefMan.vo.CatsReferralRefVo referral)
	{
		if (referral == null || referral.getID_CatsReferral() == null)
			return null;
		
		return CATSReferralManualRTTClockStatusVoAssembler.create((CatsReferral) getDomainFactory().getDomainObject(CatsReferral.class, referral.getID_CatsReferral()));
	}

	
	public ims.pathways.vo.RTTStatusPointLiteVoCollection listRTTStatusPoints(String statusPointDescription)
	{
		String query = "SELECT statusPoint FROM RTTStatusPoint AS statusPoint WHERE statusPoint.description LIKE :DESCRIPTION_VALUE";
		
		return RTTStatusPointLiteVoAssembler.createRTTStatusPointLiteVoCollectionFromRTTStatusPoint(getDomainFactory().find(query, "DESCRIPTION_VALUE", "%" + statusPointDescription + "%"));
	}

	
	public ims.RefMan.vo.CATSReferralManualRTTClockStatusVo saveReferral(ims.RefMan.vo.CATSReferralManualRTTClockStatusVo referral) throws ims.domain.exceptions.StaleObjectException
	{
		if (referral == null)
			throw new CodingRuntimeException("Cannot save null data.");
		
		if (referral.isValidated() == false)
			throw new CodingRuntimeException("Cannot save data not validated.");
		
		@SuppressWarnings("rawtypes")
		HashMap hashMap = new HashMap();
		CatsReferral domCatsReferral = CATSReferralManualRTTClockStatusVoAssembler.extractCatsReferral(getDomainFactory(), referral, hashMap);
		
		getDomainFactory().save(domCatsReferral);

		return CATSReferralManualRTTClockStatusVoAssembler.create(domCatsReferral);
	}
}