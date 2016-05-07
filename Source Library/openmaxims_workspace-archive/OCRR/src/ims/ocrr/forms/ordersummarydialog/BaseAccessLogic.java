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

package ims.ocrr.forms.ordersummarydialog;

import java.io.Serializable;
import ims.framework.Context;
import ims.framework.FormName;
import ims.framework.FormAccessLogic;

public class BaseAccessLogic extends FormAccessLogic implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final void setContext(Context context, FormName formName)
	{
		form = new CurrentForm(new GlobalContext(context), new CurrentForms());
		engine = new CurrentEngine(formName);
	}
	public boolean isAccessible()
	{
		if(!form.getGlobalContext().OCRR.PathologyResults.getOrderIsNotNull())
			return false;
		if(!form.getGlobalContext().Core.getPatientShortIsNotNull())
			return false;

		return true;
	}
	public boolean isReadOnly()
	{
		return false;
	}

	public CurrentEngine engine;
	public CurrentForm form;

	public final static class CurrentForm implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentForm(GlobalContext globalcontext, CurrentForms forms)
		{
			this.globalcontext = globalcontext;
			this.forms = forms;
		}
		public final GlobalContext getGlobalContext()
		{
			return globalcontext;
		}
		public final CurrentForms getForms()
		{
			return forms;
		}
		private GlobalContext globalcontext;
		private CurrentForms forms;
	}
	public final static class CurrentEngine implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentEngine(FormName formName)
		{
			this.formName = formName;
		}
		public final FormName getFormName()
		{
			return formName;
		}
		private FormName formName;
	}
	public static final class CurrentForms implements Serializable
	{
		private static final long serialVersionUID = 1L;

		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			protected LocalFormName(int value)
			{
				super(value);
			}
		}

		private CurrentForms()
		{
			OCRR = new OCRRForms();
			Emergency = new EmergencyForms();
		}
		public final class OCRRForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private OCRRForms()
			{
				MyOrderDialog = new LocalFormName(116137);
				PrintOrder = new LocalFormName(116102);
				QuestionsNotes = new LocalFormName(116141);
				OrderInvStatusHistory = new LocalFormName(116143);
				PathologyOrders = new LocalFormName(116139);
				RadiologyOrders = new LocalFormName(116138);
				CancelOrderInvestigationDialog = new LocalFormName(116148);
				CentricityWebPACSViewer = new LocalFormName(116156);
				ClinicalImagingResults = new LocalFormName(116126);
				SelectAndOrderDialog = new LocalFormName(116131);
				AmendOrderInvestigationDialog = new LocalFormName(116169);
				ViewPACSIMagesDialog = new LocalFormName(116184);
				NewResultsSearch = new LocalFormName(116176);
			}
			public final FormName MyOrderDialog;
			public final FormName PrintOrder;
			public final FormName QuestionsNotes;
			public final FormName OrderInvStatusHistory;
			public final FormName PathologyOrders;
			public final FormName RadiologyOrders;
			public final FormName CancelOrderInvestigationDialog;
			public final FormName CentricityWebPACSViewer;
			public final FormName ClinicalImagingResults;
			public final FormName SelectAndOrderDialog;
			public final FormName AmendOrderInvestigationDialog;
			public final FormName ViewPACSIMagesDialog;
			public final FormName NewResultsSearch;
		}
		public final class EmergencyForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private EmergencyForms()
			{
				AttendanceResultListDialog = new LocalFormName(129166);
				AttendanceResultList = new LocalFormName(129165);
			}
			public final FormName AttendanceResultListDialog;
			public final FormName AttendanceResultList;
		}

		public OCRRForms OCRR;
		public EmergencyForms Emergency;
	}
}