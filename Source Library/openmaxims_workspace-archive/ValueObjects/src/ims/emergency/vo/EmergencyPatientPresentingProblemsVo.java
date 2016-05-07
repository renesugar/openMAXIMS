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

package ims.emergency.vo;

/**
 * Linked to emergency.PresProblemsProceduresPerformed business object (ID: 1086100007).
 */
public class EmergencyPatientPresentingProblemsVo extends ims.emergency.vo.PresProblemsProceduresPerformedRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EmergencyPatientPresentingProblemsVo()
	{
	}
	public EmergencyPatientPresentingProblemsVo(Integer id, int version)
	{
		super(id, version);
	}
	public EmergencyPatientPresentingProblemsVo(ims.emergency.vo.beans.EmergencyPatientPresentingProblemsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.presentingproblems = ims.core.vo.PatientProblemVoCollection.buildFromBeanCollection(bean.getPresentingProblems());
		this.historypresentingproblem = bean.getHistoryPresentingProblem();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.proceduresperformed = ims.core.vo.PatientProcedureVoCollection.buildFromBeanCollection(bean.getProceduresPerformed());
		this.orphanproblems = ims.core.vo.PatientProblemVoCollection.buildFromBeanCollection(bean.getOrphanProblems());
		this.orphanprocedures = ims.core.vo.PatientProcedureVoCollection.buildFromBeanCollection(bean.getOrphanProcedures());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.EmergencyPatientPresentingProblemsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.presentingproblems = ims.core.vo.PatientProblemVoCollection.buildFromBeanCollection(bean.getPresentingProblems());
		this.historypresentingproblem = bean.getHistoryPresentingProblem();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.proceduresperformed = ims.core.vo.PatientProcedureVoCollection.buildFromBeanCollection(bean.getProceduresPerformed());
		this.orphanproblems = ims.core.vo.PatientProblemVoCollection.buildFromBeanCollection(bean.getOrphanProblems());
		this.orphanprocedures = ims.core.vo.PatientProcedureVoCollection.buildFromBeanCollection(bean.getOrphanProcedures());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.EmergencyPatientPresentingProblemsVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.EmergencyPatientPresentingProblemsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.EmergencyPatientPresentingProblemsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("PRESENTINGPROBLEMS"))
			return getPresentingProblems();
		if(fieldName.equals("HISTORYPRESENTINGPROBLEM"))
			return getHistoryPresentingProblem();
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("PROCEDURESPERFORMED"))
			return getProceduresPerformed();
		if(fieldName.equals("ORPHANPROBLEMS"))
			return getOrphanProblems();
		if(fieldName.equals("ORPHANPROCEDURES"))
			return getOrphanProcedures();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getPresentingProblemsIsNotNull()
	{
		return this.presentingproblems != null;
	}
	public ims.core.vo.PatientProblemVoCollection getPresentingProblems()
	{
		return this.presentingproblems;
	}
	public void setPresentingProblems(ims.core.vo.PatientProblemVoCollection value)
	{
		this.isValidated = false;
		this.presentingproblems = value;
	}
	public boolean getHistoryPresentingProblemIsNotNull()
	{
		return this.historypresentingproblem != null;
	}
	public String getHistoryPresentingProblem()
	{
		return this.historypresentingproblem;
	}
	public static int getHistoryPresentingProblemMaxLength()
	{
		return 4000;
	}
	public void setHistoryPresentingProblem(String value)
	{
		this.isValidated = false;
		this.historypresentingproblem = value;
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getProceduresPerformedIsNotNull()
	{
		return this.proceduresperformed != null;
	}
	public ims.core.vo.PatientProcedureVoCollection getProceduresPerformed()
	{
		return this.proceduresperformed;
	}
	public void setProceduresPerformed(ims.core.vo.PatientProcedureVoCollection value)
	{
		this.isValidated = false;
		this.proceduresperformed = value;
	}
	public boolean getOrphanProblemsIsNotNull()
	{
		return this.orphanproblems != null;
	}
	public ims.core.vo.PatientProblemVoCollection getOrphanProblems()
	{
		return this.orphanproblems;
	}
	public void setOrphanProblems(ims.core.vo.PatientProblemVoCollection value)
	{
		this.isValidated = false;
		this.orphanproblems = value;
	}
	public boolean getOrphanProceduresIsNotNull()
	{
		return this.orphanprocedures != null;
	}
	public ims.core.vo.PatientProcedureVoCollection getOrphanProcedures()
	{
		return this.orphanprocedures;
	}
	public void setOrphanProcedures(ims.core.vo.PatientProcedureVoCollection value)
	{
		this.isValidated = false;
		this.orphanprocedures = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.presentingproblems != null)
		{
			if(!this.presentingproblems.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.proceduresperformed != null)
		{
			if(!this.proceduresperformed.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.orphanproblems != null)
		{
			if(!this.orphanproblems.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.orphanprocedures != null)
		{
			if(!this.orphanprocedures.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.presentingproblems == null || this.presentingproblems.size() == 0)
			listOfErrors.add("PresentingProblems are mandatory");
		if(this.presentingproblems != null)
		{
			String[] listOfOtherErrors = this.presentingproblems.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.historypresentingproblem == null || this.historypresentingproblem.length() == 0)
			listOfErrors.add("HistoryPresentingProblem is mandatory");
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.proceduresperformed != null)
		{
			String[] listOfOtherErrors = this.proceduresperformed.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.orphanproblems != null)
		{
			String[] listOfOtherErrors = this.orphanproblems.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.orphanprocedures != null)
		{
			String[] listOfOtherErrors = this.orphanprocedures.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		EmergencyPatientPresentingProblemsVo clone = new EmergencyPatientPresentingProblemsVo(this.id, this.version);
		
		clone.carecontext = this.carecontext;
		if(this.presentingproblems == null)
			clone.presentingproblems = null;
		else
			clone.presentingproblems = (ims.core.vo.PatientProblemVoCollection)this.presentingproblems.clone();
		clone.historypresentingproblem = this.historypresentingproblem;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.proceduresperformed == null)
			clone.proceduresperformed = null;
		else
			clone.proceduresperformed = (ims.core.vo.PatientProcedureVoCollection)this.proceduresperformed.clone();
		if(this.orphanproblems == null)
			clone.orphanproblems = null;
		else
			clone.orphanproblems = (ims.core.vo.PatientProblemVoCollection)this.orphanproblems.clone();
		if(this.orphanprocedures == null)
			clone.orphanprocedures = null;
		else
			clone.orphanprocedures = (ims.core.vo.PatientProcedureVoCollection)this.orphanprocedures.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(EmergencyPatientPresentingProblemsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EmergencyPatientPresentingProblemsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EmergencyPatientPresentingProblemsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EmergencyPatientPresentingProblemsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.carecontext != null)
			count++;
		if(this.presentingproblems != null)
			count++;
		if(this.historypresentingproblem != null)
			count++;
		if(this.authoringinformation != null)
			count++;
		if(this.proceduresperformed != null)
			count++;
		if(this.orphanproblems != null)
			count++;
		if(this.orphanprocedures != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 7;
	}
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.vo.PatientProblemVoCollection presentingproblems;
	protected String historypresentingproblem;
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.vo.PatientProcedureVoCollection proceduresperformed;
	protected ims.core.vo.PatientProblemVoCollection orphanproblems;
	protected ims.core.vo.PatientProcedureVoCollection orphanprocedures;
	private boolean isValidated = false;
	private boolean isBusy = false;
}