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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OcsOrderSession business object (ID: 1070100000).
 */
public class OcsOrderWebServiceVo extends ims.ocrr.vo.OcsOrderWebServiceListVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OcsOrderWebServiceVo()
	{
	}
	public OcsOrderWebServiceVo(Integer id, int version)
	{
		super(id, version);
	}
	public OcsOrderWebServiceVo(ims.ocrr.vo.beans.OcsOrderWebServiceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hasneworupdatedresults = bean.getHasNewOrUpdatedResults();
		this.responsibleclinician = bean.getResponsibleClinician() == null ? null : bean.getResponsibleClinician().buildVo();
		this.responsiblegp = bean.getResponsibleGp() == null ? null : bean.getResponsibleGp().buildVo();
		this.patientlocation = bean.getPatientLocation() == null ? null : bean.getPatientLocation().buildVo();
		this.patientclinic = bean.getPatientClinic() == null ? null : bean.getPatientClinic().buildVo();
		this.orderedby = bean.getOrderedBy() == null ? null : bean.getOrderedBy().buildVo();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.investigations = ims.ocrr.vo.OrderInvestigationWebServiceVoCollection.buildFromBeanCollection(bean.getInvestigations());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.OcsOrderWebServiceVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hasneworupdatedresults = bean.getHasNewOrUpdatedResults();
		this.responsibleclinician = bean.getResponsibleClinician() == null ? null : bean.getResponsibleClinician().buildVo(map);
		this.responsiblegp = bean.getResponsibleGp() == null ? null : bean.getResponsibleGp().buildVo(map);
		this.patientlocation = bean.getPatientLocation() == null ? null : bean.getPatientLocation().buildVo(map);
		this.patientclinic = bean.getPatientClinic() == null ? null : bean.getPatientClinic().buildVo(map);
		this.orderedby = bean.getOrderedBy() == null ? null : bean.getOrderedBy().buildVo(map);
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.investigations = ims.ocrr.vo.OrderInvestigationWebServiceVoCollection.buildFromBeanCollection(bean.getInvestigations());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.OcsOrderWebServiceVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.OcsOrderWebServiceVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.OcsOrderWebServiceVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("INVESTIGATIONS"))
			return getInvestigations();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientLiteVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientLiteVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getInvestigationsIsNotNull()
	{
		return this.investigations != null;
	}
	public ims.ocrr.vo.OrderInvestigationWebServiceVoCollection getInvestigations()
	{
		return this.investigations;
	}
	public void setInvestigations(ims.ocrr.vo.OrderInvestigationWebServiceVoCollection value)
	{
		this.isValidated = false;
		this.investigations = value;
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
		if(this.responsibleclinician != null)
		{
			if(!this.responsibleclinician.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.responsiblegp != null)
		{
			if(!this.responsiblegp.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patientlocation != null)
		{
			if(!this.patientlocation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patientclinic != null)
		{
			if(!this.patientclinic.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patient != null)
		{
			if(!this.patient.isValidated())
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
		if(this.responsibleclinician != null)
		{
			String[] listOfOtherErrors = this.responsibleclinician.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.responsiblegp != null)
		{
			String[] listOfOtherErrors = this.responsiblegp.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patientlocation != null)
		{
			String[] listOfOtherErrors = this.patientlocation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patientclinic != null)
		{
			String[] listOfOtherErrors = this.patientclinic.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.patient != null)
		{
			String[] listOfOtherErrors = this.patient.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.investigations == null || this.investigations.size() == 0)
			listOfErrors.add("Investigations are mandatory");
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
	
		OcsOrderWebServiceVo clone = new OcsOrderWebServiceVo(this.id, this.version);
		
		clone.hasneworupdatedresults = this.hasneworupdatedresults;
		if(this.responsibleclinician == null)
			clone.responsibleclinician = null;
		else
			clone.responsibleclinician = (ims.core.vo.HcpLiteVo)this.responsibleclinician.clone();
		if(this.responsiblegp == null)
			clone.responsiblegp = null;
		else
			clone.responsiblegp = (ims.core.vo.GpLiteVo)this.responsiblegp.clone();
		if(this.patientlocation == null)
			clone.patientlocation = null;
		else
			clone.patientlocation = (ims.core.vo.LocationLiteVo)this.patientlocation.clone();
		if(this.patientclinic == null)
			clone.patientclinic = null;
		else
			clone.patientclinic = (ims.core.vo.ClinicLiteVo)this.patientclinic.clone();
		if(this.orderedby == null)
			clone.orderedby = null;
		else
			clone.orderedby = (ims.core.vo.MemberOfStaffLiteVo)this.orderedby.clone();
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientLiteVo)this.patient.clone();
		if(this.investigations == null)
			clone.investigations = null;
		else
			clone.investigations = (ims.ocrr.vo.OrderInvestigationWebServiceVoCollection)this.investigations.clone();
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
		if (!(OcsOrderWebServiceVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OcsOrderWebServiceVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((OcsOrderWebServiceVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((OcsOrderWebServiceVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.patient != null)
			count++;
		if(this.investigations != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 2;
	}
	protected ims.core.vo.PatientLiteVo patient;
	protected ims.ocrr.vo.OrderInvestigationWebServiceVoCollection investigations;
	private boolean isValidated = false;
	private boolean isBusy = false;
}