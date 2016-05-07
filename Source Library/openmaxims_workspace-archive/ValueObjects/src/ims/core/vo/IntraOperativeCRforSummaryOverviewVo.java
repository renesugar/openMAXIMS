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

package ims.core.vo;

/**
 * Linked to core.clinical.IntraOperativeCareRecord business object (ID: 1072100081).
 */
public class IntraOperativeCRforSummaryOverviewVo extends ims.core.clinical.vo.IntraOperativeCareRecordRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IntraOperativeCRforSummaryOverviewVo()
	{
	}
	public IntraOperativeCRforSummaryOverviewVo(Integer id, int version)
	{
		super(id, version);
	}
	public IntraOperativeCRforSummaryOverviewVo(ims.core.vo.beans.IntraOperativeCRforSummaryOverviewVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.actualprocedure = bean.getActualProcedure() == null ? null : bean.getActualProcedure().buildVo();
		this.surgerystarttime = bean.getSurgeryStartTime() == null ? null : bean.getSurgeryStartTime().buildDateTime();
		this.surgeon = bean.getSurgeon() == null ? null : bean.getSurgeon().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.IntraOperativeCRforSummaryOverviewVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.actualprocedure = bean.getActualProcedure() == null ? null : bean.getActualProcedure().buildVo(map);
		this.surgerystarttime = bean.getSurgeryStartTime() == null ? null : bean.getSurgeryStartTime().buildDateTime();
		this.surgeon = bean.getSurgeon() == null ? null : bean.getSurgeon().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.IntraOperativeCRforSummaryOverviewVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.IntraOperativeCRforSummaryOverviewVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.IntraOperativeCRforSummaryOverviewVoBean();
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
		if(fieldName.equals("ACTUALPROCEDURE"))
			return getActualProcedure();
		if(fieldName.equals("SURGERYSTARTTIME"))
			return getSurgeryStartTime();
		if(fieldName.equals("SURGEON"))
			return getSurgeon();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getActualProcedureIsNotNull()
	{
		return this.actualprocedure != null;
	}
	public ims.core.vo.PatientProcedureForSummaryOverviewVo getActualProcedure()
	{
		return this.actualprocedure;
	}
	public void setActualProcedure(ims.core.vo.PatientProcedureForSummaryOverviewVo value)
	{
		this.isValidated = false;
		this.actualprocedure = value;
	}
	public boolean getSurgeryStartTimeIsNotNull()
	{
		return this.surgerystarttime != null;
	}
	public ims.framework.utils.DateTime getSurgeryStartTime()
	{
		return this.surgerystarttime;
	}
	public void setSurgeryStartTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.surgerystarttime = value;
	}
	public boolean getSurgeonIsNotNull()
	{
		return this.surgeon != null;
	}
	public ims.core.vo.HcpLiteVo getSurgeon()
	{
		return this.surgeon;
	}
	public void setSurgeon(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.surgeon = value;
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
		if(this.actualprocedure == null)
			listOfErrors.add("ActualProcedure is mandatory");
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
	
		IntraOperativeCRforSummaryOverviewVo clone = new IntraOperativeCRforSummaryOverviewVo(this.id, this.version);
		
		if(this.actualprocedure == null)
			clone.actualprocedure = null;
		else
			clone.actualprocedure = (ims.core.vo.PatientProcedureForSummaryOverviewVo)this.actualprocedure.clone();
		if(this.surgerystarttime == null)
			clone.surgerystarttime = null;
		else
			clone.surgerystarttime = (ims.framework.utils.DateTime)this.surgerystarttime.clone();
		if(this.surgeon == null)
			clone.surgeon = null;
		else
			clone.surgeon = (ims.core.vo.HcpLiteVo)this.surgeon.clone();
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
		if (!(IntraOperativeCRforSummaryOverviewVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IntraOperativeCRforSummaryOverviewVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((IntraOperativeCRforSummaryOverviewVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((IntraOperativeCRforSummaryOverviewVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.actualprocedure != null)
			count++;
		if(this.surgerystarttime != null)
			count++;
		if(this.surgeon != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.vo.PatientProcedureForSummaryOverviewVo actualprocedure;
	protected ims.framework.utils.DateTime surgerystarttime;
	protected ims.core.vo.HcpLiteVo surgeon;
	private boolean isValidated = false;
	private boolean isBusy = false;
}