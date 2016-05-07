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

package ims.correspondence.forms.batchupdatepatientlists;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Correspondence = new CorrespondenceContext(context);
		Core = new CoreContext(context);
	}
	public final class CorrespondenceContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CorrespondenceContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientListsBatchUpdateTypeIsNotNull()
		{
			return !cx_CorrespondencePatientListsBatchUpdateType.getValueIsNull(context);
		}
		public ims.core.vo.lookups.DocumentStatus getPatientListsBatchUpdateType()
		{
			return (ims.core.vo.lookups.DocumentStatus)cx_CorrespondencePatientListsBatchUpdateType.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorrespondencePatientListsBatchUpdateType = new ims.framework.ContextVariable("Correspondence.PatientListsBatchUpdateType", "_cv_Correspondence.PatientListsBatchUpdateType");
		public boolean getPatientListSearchCriteriaIsNotNull()
		{
			return !cx_CorrespondencePatientListSearchCriteria.getValueIsNull(context);
		}
		public ims.core.vo.PatientListsFilterVo getPatientListSearchCriteria()
		{
			return (ims.core.vo.PatientListsFilterVo)cx_CorrespondencePatientListSearchCriteria.getValue(context);
		}
		public void setPatientListSearchCriteria(ims.core.vo.PatientListsFilterVo value)
		{
			cx_CorrespondencePatientListSearchCriteria.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorrespondencePatientListSearchCriteria = new ims.framework.ContextVariable("Correspondence.PatientListSearchCriteria", "_cvp_Correspondence.PatientListSearchCriteria");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getOutPatientSearchCriteriaIsNotNull()
		{
			return !cx_CoreOutPatientSearchCriteria.getValueIsNull(context);
		}
		public ims.core.vo.OutPatientListSearchCriteriaVo getOutPatientSearchCriteria()
		{
			return (ims.core.vo.OutPatientListSearchCriteriaVo)cx_CoreOutPatientSearchCriteria.getValue(context);
		}
		public void setOutPatientSearchCriteria(ims.core.vo.OutPatientListSearchCriteriaVo value)
		{
			cx_CoreOutPatientSearchCriteria.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreOutPatientSearchCriteria = new ims.framework.ContextVariable("Core.OutPatientSearchCriteria", "_cvp_Core.OutPatientSearchCriteria");

		private ims.framework.Context context;
	}

	public CorrespondenceContext Correspondence;
	public CoreContext Core;
}