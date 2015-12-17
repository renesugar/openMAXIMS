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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 5256.13787)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.base.impl.BaseRecordDelayedCodingReasonImpl;
import ims.RefMan.vo.domain.DischargedEpisodeForClinicalCodingWorklistVoAssembler;
import ims.core.admin.pas.domain.objects.DischargedEpisode;
import ims.core.clinical.domain.objects.CodingDelay;
import ims.core.vo.domain.CodingDelayVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.exceptions.CodingRuntimeException;

public class RecordDelayedCodingReasonImpl extends BaseRecordDelayedCodingReasonImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo save(ims.RefMan.vo.DischargedEpisodeForClinicalCodingWorklistVo dischEpisodeToSave) throws ims.domain.exceptions.StaleObjectException
	{
		if (dischEpisodeToSave == null)
			throw new CodingRuntimeException("Cannot save null DischargedEpisodeForClinicalCodingWorklistVo ");

		if (!dischEpisodeToSave.isValidated())
			throw new DomainRuntimeException("DischargedEpisodeForClinicalCodingWorklistVo Not Validated.");

		DomainFactory factory = getDomainFactory();
		DischargedEpisode domainDischargeEpisode = DischargedEpisodeForClinicalCodingWorklistVoAssembler.extractDischargedEpisode(factory, dischEpisodeToSave);

		factory.save(domainDischargeEpisode);

		return DischargedEpisodeForClinicalCodingWorklistVoAssembler.create(domainDischargeEpisode);
	}

	public ims.core.vo.CodingDelayVo getCodingDelay(ims.core.clinical.vo.CodingDelayRefVo codingDelayRef)
	{
		if (codingDelayRef == null || codingDelayRef.getID_CodingDelay() == null)
    	{
    		throw new CodingRuntimeException("Cannot get CodingDelayVo on null Id ");
    	}
    	
    	DomainFactory factory = getDomainFactory();
    
    	CodingDelay domainCodingDelay = (CodingDelay) factory.getDomainObject(CodingDelay.class, codingDelayRef.getID_CodingDelay());
    	
    	return CodingDelayVoAssembler.create(domainCodingDelay);
	}
}