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

package ims.oncology.forms.chemocycledrugdetails;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		Oncology = new OncologyContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}
	public final class OncologyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OncologyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getChemoTherapyDetailRecordIsNotNull()
		{
			return !cx_OncologyChemoTherapyDetailRecord.getValueIsNull(context);
		}
		public ims.oncology.vo.ChemotherapyDetailsRefVo getChemoTherapyDetailRecord()
		{
			return (ims.oncology.vo.ChemotherapyDetailsRefVo)cx_OncologyChemoTherapyDetailRecord.getValue(context);
		}
		public void setChemoTherapyDetailRecord(ims.oncology.vo.ChemotherapyDetailsRefVo value)
		{
			cx_OncologyChemoTherapyDetailRecord.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyChemoTherapyDetailRecord = new ims.framework.ContextVariable("Oncology.ChemoTherapyDetailRecord", "_cv_Oncology.ChemoTherapyDetailRecord");
		public boolean getChemotherapyCycleDetailsVoIsNotNull()
		{
			return !cx_OncologyChemotherapyCycleDetailsVo.getValueIsNull(context);
		}
		public ims.oncology.vo.ChemotherapyCycleDetailsVo getChemotherapyCycleDetailsVo()
		{
			return (ims.oncology.vo.ChemotherapyCycleDetailsVo)cx_OncologyChemotherapyCycleDetailsVo.getValue(context);
		}
		public void setChemotherapyCycleDetailsVo(ims.oncology.vo.ChemotherapyCycleDetailsVo value)
		{
			cx_OncologyChemotherapyCycleDetailsVo.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyChemotherapyCycleDetailsVo = new ims.framework.ContextVariable("Oncology.ChemotherapyCycleDetailsVo", "_cv_Oncology.ChemotherapyCycleDetailsVo");
		public boolean getChemoTherapyDayDetailsVoIsNotNull()
		{
			return !cx_OncologyChemoTherapyDayDetailsVo.getValueIsNull(context);
		}
		public ims.oncology.vo.ChemoTherapyDayDetailsVo getChemoTherapyDayDetailsVo()
		{
			return (ims.oncology.vo.ChemoTherapyDayDetailsVo)cx_OncologyChemoTherapyDayDetailsVo.getValue(context);
		}
		public void setChemoTherapyDayDetailsVo(ims.oncology.vo.ChemoTherapyDayDetailsVo value)
		{
			cx_OncologyChemoTherapyDayDetailsVo.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyChemoTherapyDayDetailsVo = new ims.framework.ContextVariable("Oncology.ChemoTherapyDayDetailsVo", "_cv_Oncology.ChemoTherapyDayDetailsVo");
		public boolean getCycleDrugDetailModeIsNotNull()
		{
			return !cx_OncologyCycleDrugDetailMode.getValueIsNull(context);
		}
		public ims.oncology.vo.enums.ChemoCycleMode getCycleDrugDetailMode()
		{
			return (ims.oncology.vo.enums.ChemoCycleMode)cx_OncologyCycleDrugDetailMode.getValue(context);
		}

		private ims.framework.ContextVariable cx_OncologyCycleDrugDetailMode = new ims.framework.ContextVariable("Oncology.CycleDrugDetailMode", "_cv_Oncology.CycleDrugDetailMode");
		public boolean getRegimenAcronimIsNotNull()
		{
			return !cx_OncologyRegimenAcronim.getValueIsNull(context);
		}
		public ims.oncology.vo.lookups.RegimenAcronym getRegimenAcronim()
		{
			return (ims.oncology.vo.lookups.RegimenAcronym)cx_OncologyRegimenAcronim.getValue(context);
		}
		public void setRegimenAcronim(ims.oncology.vo.lookups.RegimenAcronym value)
		{
			cx_OncologyRegimenAcronim.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyRegimenAcronim = new ims.framework.ContextVariable("Oncology.RegimenAcronim", "_cvp_Oncology.RegimenAcronim");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public OncologyContext Oncology;
}