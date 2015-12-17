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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.pci.vo;

/**
 * Linked to PCI.StageVaccine business object (ID: 1091100004).
 */
public class StageVaccineVo extends ims.pci.vo.StageVaccineRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public StageVaccineVo()
	{
	}
	public StageVaccineVo(Integer id, int version)
	{
		super(id, version);
	}
	public StageVaccineVo(ims.pci.vo.beans.StageVaccineVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.vaccine = bean.getVaccine() == null ? null : bean.getVaccine().buildVo();
		this.canberescheduled = bean.getCanBeRescheduled();
		this.pcrscode = bean.getPcrsCode();
		this.shotno = bean.getShotNo();
		this.islastshotforvaccine = bean.getIsLastShotForVaccine();
		this.driver = bean.getDriver();
		this.intervalmonths = bean.getIntervalMonths();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pci.vo.beans.StageVaccineVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.vaccine = bean.getVaccine() == null ? null : bean.getVaccine().buildVo(map);
		this.canberescheduled = bean.getCanBeRescheduled();
		this.pcrscode = bean.getPcrsCode();
		this.shotno = bean.getShotNo();
		this.islastshotforvaccine = bean.getIsLastShotForVaccine();
		this.driver = bean.getDriver();
		this.intervalmonths = bean.getIntervalMonths();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pci.vo.beans.StageVaccineVoBean bean = null;
		if(map != null)
			bean = (ims.pci.vo.beans.StageVaccineVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pci.vo.beans.StageVaccineVoBean();
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
		if(fieldName.equals("VACCINE"))
			return getVaccine();
		if(fieldName.equals("CANBERESCHEDULED"))
			return getCanBeRescheduled();
		if(fieldName.equals("PCRSCODE"))
			return getPcrsCode();
		if(fieldName.equals("SHOTNO"))
			return getShotNo();
		if(fieldName.equals("ISLASTSHOTFORVACCINE"))
			return getIsLastShotForVaccine();
		if(fieldName.equals("DRIVER"))
			return getDriver();
		if(fieldName.equals("INTERVALMONTHS"))
			return getIntervalMonths();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getVaccineIsNotNull()
	{
		return this.vaccine != null;
	}
	public ims.core.vo.VaccineLiteVo getVaccine()
	{
		return this.vaccine;
	}
	public void setVaccine(ims.core.vo.VaccineLiteVo value)
	{
		this.isValidated = false;
		this.vaccine = value;
	}
	public boolean getCanBeRescheduledIsNotNull()
	{
		return this.canberescheduled != null;
	}
	public Boolean getCanBeRescheduled()
	{
		return this.canberescheduled;
	}
	public void setCanBeRescheduled(Boolean value)
	{
		this.isValidated = false;
		this.canberescheduled = value;
	}
	public boolean getPcrsCodeIsNotNull()
	{
		return this.pcrscode != null;
	}
	public String getPcrsCode()
	{
		return this.pcrscode;
	}
	public static int getPcrsCodeMaxLength()
	{
		return 25;
	}
	public void setPcrsCode(String value)
	{
		this.isValidated = false;
		this.pcrscode = value;
	}
	public boolean getShotNoIsNotNull()
	{
		return this.shotno != null;
	}
	public Integer getShotNo()
	{
		return this.shotno;
	}
	public void setShotNo(Integer value)
	{
		this.isValidated = false;
		this.shotno = value;
	}
	public boolean getIsLastShotForVaccineIsNotNull()
	{
		return this.islastshotforvaccine != null;
	}
	public Boolean getIsLastShotForVaccine()
	{
		return this.islastshotforvaccine;
	}
	public void setIsLastShotForVaccine(Boolean value)
	{
		this.isValidated = false;
		this.islastshotforvaccine = value;
	}
	public boolean getDriverIsNotNull()
	{
		return this.driver != null;
	}
	public Boolean getDriver()
	{
		return this.driver;
	}
	public void setDriver(Boolean value)
	{
		this.isValidated = false;
		this.driver = value;
	}
	public boolean getIntervalMonthsIsNotNull()
	{
		return this.intervalmonths != null;
	}
	public Integer getIntervalMonths()
	{
		return this.intervalmonths;
	}
	public void setIntervalMonths(Integer value)
	{
		this.isValidated = false;
		this.intervalmonths = value;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		if(this.vaccine != null)
			sb.append(this.vaccine);
		return sb.toString();
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof StageVaccineVo))
			return false;
		StageVaccineVo compareObj = (StageVaccineVo)obj;
		if(this.getVaccine() == null && compareObj.getVaccine() != null)
			return false;
		if(this.getVaccine() != null && compareObj.getVaccine() == null)
			return false;
		if(this.getVaccine() != null && compareObj.getVaccine() != null)
			return this.getVaccine().equals(compareObj.getVaccine());
		return super.equals(obj);
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
		if(this.vaccine != null)
		{
			if(!this.vaccine.isValidated())
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
		if(this.vaccine == null)
			listOfErrors.add("Vaccine is mandatory");
		if(this.vaccine != null)
		{
			String[] listOfOtherErrors = this.vaccine.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.canberescheduled == null)
			listOfErrors.add("CanBeRescheduled is mandatory");
		if(this.pcrscode != null)
			if(this.pcrscode.length() > 25)
				listOfErrors.add("The length of the field [pcrscode] in the value object [ims.pci.vo.StageVaccineVo] is too big. It should be less or equal to 25");
		if(this.shotno == null)
			listOfErrors.add("ShotNo is mandatory");
		if(this.islastshotforvaccine == null)
			listOfErrors.add("isLastShotForVaccine is mandatory");
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
	
		StageVaccineVo clone = new StageVaccineVo(this.id, this.version);
		
		if(this.vaccine == null)
			clone.vaccine = null;
		else
			clone.vaccine = (ims.core.vo.VaccineLiteVo)this.vaccine.clone();
		clone.canberescheduled = this.canberescheduled;
		clone.pcrscode = this.pcrscode;
		clone.shotno = this.shotno;
		clone.islastshotforvaccine = this.islastshotforvaccine;
		clone.driver = this.driver;
		clone.intervalmonths = this.intervalmonths;
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
		if (!(StageVaccineVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A StageVaccineVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		StageVaccineVo compareObj = (StageVaccineVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getVaccine() == null && compareObj.getVaccine() != null)
				return -1;
			if(this.getVaccine() != null && compareObj.getVaccine() == null)
				return 1;
			if(this.getVaccine() != null && compareObj.getVaccine() != null)
				retVal = this.getVaccine().compareTo(compareObj.getVaccine());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.vaccine != null)
			count++;
		if(this.canberescheduled != null)
			count++;
		if(this.pcrscode != null)
			count++;
		if(this.shotno != null)
			count++;
		if(this.islastshotforvaccine != null)
			count++;
		if(this.driver != null)
			count++;
		if(this.intervalmonths != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 7;
	}
	protected ims.core.vo.VaccineLiteVo vaccine;
	protected Boolean canberescheduled;
	protected String pcrscode;
	protected Integer shotno;
	protected Boolean islastshotforvaccine;
	protected Boolean driver;
	protected Integer intervalmonths;
	private boolean isValidated = false;
	private boolean isBusy = false;
}