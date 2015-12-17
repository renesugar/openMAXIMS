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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;

import java.util.ArrayList;

import ims.clinical.vo.ClinicalProblemShortVoCollection;
import ims.clinical.vo.domain.ClinicalProblemShortVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.emergency.domain.base.impl.BaseProblemSelectDialogImpl;

public class ProblemSelectDialogImpl extends BaseProblemSelectDialogImpl
{

	private static final long serialVersionUID = 1L;

//	@Override
	public ClinicalProblemShortVoCollection listProblems(String problemName)
	{
		DomainFactory factory = getDomainFactory();

		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		if (problemName == null || (problemName != null && problemName.trim().length() == 0))
			throw new DomainRuntimeException("String for search is null.");

		String probNameLite = problemName != null ? problemName.toUpperCase() + "%" : "%%";

		StringBuffer hql = new StringBuffer();

		hql.append(" select probl from ClinicalProblem as probl left join probl.keywords as k where (probl.pCName like :ClinicalProblemSearchText or k.keyword like :ClinicalProblemSearchText) and probl.isActive = 1");
		hql.append(" order by UPPER(probl.pCName) asc");

		markers.add("ClinicalProblemSearchText");
		values.add(probNameLite);

		return ClinicalProblemShortVoAssembler.createClinicalProblemShortVoCollectionFromClinicalProblem(factory.find(hql.toString(), markers, values));
	}

}