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

package ims.nursing.forms.painreview;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		COE = new COEContext(context);
		Core = new CoreContext(context);
	}
	public final class COEContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private COEContext(ims.framework.Context context)
		{
			this.context = context;

			PainBodyChart = new PainBodyChartContext(context);
			ClinicalNotes = new ClinicalNotesContext(context);
		}
		public final class PainBodyChartContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private PainBodyChartContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getPainAssReviewVOIsNotNull()
			{
				return !cx_COEPainBodyChartPainAssReviewVO.getValueIsNull(context);
			}
			public ims.nursing.vo.PainAssessmentReview getPainAssReviewVO()
			{
				return (ims.nursing.vo.PainAssessmentReview)cx_COEPainBodyChartPainAssReviewVO.getValue(context);
			}
		public void setPainAssReviewVO(ims.nursing.vo.PainAssessmentReview value)
		{
				cx_COEPainBodyChartPainAssReviewVO.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartPainAssReviewVO = new ims.framework.ContextVariable("COE.PainBodyChart.PainAssReviewVO", "_cv_COE.PainBodyChart.PainAssReviewVO");
			public boolean getReadOnlyAssessmentIsNotNull()
			{
				return !cx_COEPainBodyChartReadOnlyAssessment.getValueIsNull(context);
			}
			public ims.nursing.vo.PainAssessment getReadOnlyAssessment()
			{
				return (ims.nursing.vo.PainAssessment)cx_COEPainBodyChartReadOnlyAssessment.getValue(context);
			}
		public void setReadOnlyAssessment(ims.nursing.vo.PainAssessment value)
		{
				cx_COEPainBodyChartReadOnlyAssessment.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartReadOnlyAssessment = new ims.framework.ContextVariable("COE.PainBodyChart.ReadOnlyAssessment", "_cv_COE.PainBodyChart.ReadOnlyAssessment");
			public boolean getReviewPageIsNotNull()
			{
				return !cx_COEPainBodyChartReviewPage.getValueIsNull(context);
			}
			public Boolean getReviewPage()
			{
				return (Boolean)cx_COEPainBodyChartReviewPage.getValue(context);
			}
		public void setReviewPage(Boolean value)
		{
				cx_COEPainBodyChartReviewPage.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartReviewPage = new ims.framework.ContextVariable("COE.PainBodyChart.ReviewPage", "_cv_COE.PainBodyChart.ReviewPage");
			public boolean getAreaListIsNotNull()
			{
				return !cx_COEPainBodyChartAreaList.getValueIsNull(context);
			}
			public ims.framework.controls.DrawingControlAreaCollection getAreaList()
			{
				return (ims.framework.controls.DrawingControlAreaCollection)cx_COEPainBodyChartAreaList.getValue(context);
			}
		public void setAreaList(ims.framework.controls.DrawingControlAreaCollection value)
		{
				cx_COEPainBodyChartAreaList.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartAreaList = new ims.framework.ContextVariable("COE.PainBodyChart.AreaList", "_cv_COE.PainBodyChart.AreaList");
			public boolean getAssessmentFindingIsNotNull()
			{
				return !cx_COEPainBodyChartAssessmentFinding.getValueIsNull(context);
			}
			public ims.nursing.vo.PainAssessmentFindings getAssessmentFinding()
			{
				return (ims.nursing.vo.PainAssessmentFindings)cx_COEPainBodyChartAssessmentFinding.getValue(context);
			}
		public void setAssessmentFinding(ims.nursing.vo.PainAssessmentFindings value)
		{
				cx_COEPainBodyChartAssessmentFinding.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartAssessmentFinding = new ims.framework.ContextVariable("COE.PainBodyChart.AssessmentFinding", "_cv_COE.PainBodyChart.AssessmentFinding");
			public boolean getGroupListIsNotNull()
			{
				return !cx_COEPainBodyChartGroupList.getValueIsNull(context);
			}
			public ims.framework.controls.DrawingControlGroupCollection getGroupList()
			{
				return (ims.framework.controls.DrawingControlGroupCollection)cx_COEPainBodyChartGroupList.getValue(context);
			}
		public void setGroupList(ims.framework.controls.DrawingControlGroupCollection value)
		{
				cx_COEPainBodyChartGroupList.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartGroupList = new ims.framework.ContextVariable("COE.PainBodyChart.GroupList", "_cv_COE.PainBodyChart.GroupList");
			public boolean getPainAssessmentVOIsNotNull()
			{
				return !cx_COEPainBodyChartPainAssessmentVO.getValueIsNull(context);
			}
			public ims.nursing.vo.PainAssessment getPainAssessmentVO()
			{
				return (ims.nursing.vo.PainAssessment)cx_COEPainBodyChartPainAssessmentVO.getValue(context);
			}
		public void setPainAssessmentVO(ims.nursing.vo.PainAssessment value)
		{
				cx_COEPainBodyChartPainAssessmentVO.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEPainBodyChartPainAssessmentVO = new ims.framework.ContextVariable("COE.PainBodyChart.PainAssessmentVO", "_cv_COE.PainBodyChart.PainAssessmentVO");
			private ims.framework.Context context;
		}
		public final class ClinicalNotesContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ClinicalNotesContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getCallingFormIsNotNull()
			{
				return !cx_COEClinicalNotesCallingForm.getValueIsNull(context);
			}
			public ims.framework.FormName getCallingForm()
			{
				return (ims.framework.FormName)cx_COEClinicalNotesCallingForm.getValue(context);
			}
		public void setCallingForm(ims.framework.FormName value)
		{
				cx_COEClinicalNotesCallingForm.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COEClinicalNotesCallingForm = new ims.framework.ContextVariable("COE.ClinicalNotes.CallingForm", "_cv_COE.ClinicalNotes.CallingForm");
			private ims.framework.Context context;
		}


		public PainBodyChartContext PainBodyChart;
		public ClinicalNotesContext ClinicalNotes;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

			CurrentClinicalContact = new CurrentClinicalContactContext(context);
		}
		public final class CurrentClinicalContactContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CurrentClinicalContactContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getSpecialtyIsNotNull()
			{
				return !cx_CoreCurrentClinicalContactSpecialty.getValueIsNull(context);
			}
			public Integer getSpecialty()
			{
				return (Integer)cx_CoreCurrentClinicalContactSpecialty.getValue(context);
			}
		public void setSpecialty(Integer value)
		{
				cx_CoreCurrentClinicalContactSpecialty.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CoreCurrentClinicalContactSpecialty = new ims.framework.ContextVariable("Core.CurrentClinicalContact.Specialty", "_cvp_Core.CurrentClinicalContact.Specialty");
			private ims.framework.Context context;
		}

		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getCurrentClinicalContactIsNotNull()
		{
			return !cx_CoreCurrentClinicalContact.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalContactShortVo getCurrentClinicalContact()
		{
			return (ims.core.vo.ClinicalContactShortVo)cx_CoreCurrentClinicalContact.getValue(context);
		}
		public void setCurrentClinicalContact(ims.core.vo.ClinicalContactShortVo value)
		{
			cx_CoreCurrentClinicalContact.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentClinicalContact = new ims.framework.ContextVariable("Core.CurrentClinicalContact", "_cvp_Core.CurrentClinicalContact");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		public CurrentClinicalContactContext CurrentClinicalContact;
		private ims.framework.Context context;
	}

	public COEContext COE;
	public CoreContext Core;
}