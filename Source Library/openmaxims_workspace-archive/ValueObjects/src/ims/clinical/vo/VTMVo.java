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

package ims.clinical.vo;

/**
 * Linked to clinical.configuration.VTM business object (ID: 1073100022).
 */
public class VTMVo extends ims.clinical.configuration.vo.VTMRefVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IDMDValue
{
	private static final long serialVersionUID = 1L;

	public VTMVo()
	{
	}
	public VTMVo(Integer id, int version)
	{
		super(id, version);
	}
	public VTMVo(ims.clinical.vo.beans.VTMVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.invalid = bean.getInvalid();
		this.name = bean.getName();
		this.abbreviatedname = bean.getAbbreviatedName();
		this.moietyidentifier = bean.getMoietyIdentifier();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.VTMVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.invalid = bean.getInvalid();
		this.name = bean.getName();
		this.abbreviatedname = bean.getAbbreviatedName();
		this.moietyidentifier = bean.getMoietyIdentifier();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.VTMVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.VTMVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.VTMVoBean();
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
		if(fieldName.equals("INVALID"))
			return getInvalid();
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("ABBREVIATEDNAME"))
			return getAbbreviatedName();
		if(fieldName.equals("MOIETYIDENTIFIER"))
			return getMoietyIdentifier();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getInvalidIsNotNull()
	{
		return this.invalid != null;
	}
	public Boolean getInvalid()
	{
		return this.invalid;
	}
	public void setInvalid(Boolean value)
	{
		this.isValidated = false;
		this.invalid = value;
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public String getName()
	{
		return this.name;
	}
	public static int getNameMaxLength()
	{
		return 255;
	}
	public void setName(String value)
	{
		this.isValidated = false;
		this.name = value;
	}
	public boolean getAbbreviatedNameIsNotNull()
	{
		return this.abbreviatedname != null;
	}
	public String getAbbreviatedName()
	{
		return this.abbreviatedname;
	}
	public static int getAbbreviatedNameMaxLength()
	{
		return 60;
	}
	public void setAbbreviatedName(String value)
	{
		this.isValidated = false;
		this.abbreviatedname = value;
	}
	public boolean getMoietyIdentifierIsNotNull()
	{
		return this.moietyidentifier != null;
	}
	public String getMoietyIdentifier()
	{
		return this.moietyidentifier;
	}
	public static int getMoietyIdentifierMaxLength()
	{
		return 30;
	}
	public void setMoietyIdentifier(String value)
	{
		this.isValidated = false;
		this.moietyidentifier = value;
	}
	/**
	* IDMDValue Interface
	*/
		public Integer getIDMDValueId() 
		{
			return id;
		}
		public String getIDMDValueText() 
		{
			return name;
		}
		public ims.clinical.vo.enums.DMDType getIDMDValueType() 
		{
			return ims.clinical.vo.enums.DMDType.VTM;
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
		if(this.invalid == null)
			listOfErrors.add("Invalid is mandatory");
		if(this.name == null || this.name.length() == 0)
			listOfErrors.add("Name is mandatory");
		else if(this.name.length() > 255)
			listOfErrors.add("The length of the field [name] in the value object [ims.clinical.vo.VTMVo] is too big. It should be less or equal to 255");
		if(this.abbreviatedname != null)
			if(this.abbreviatedname.length() > 60)
				listOfErrors.add("The length of the field [abbreviatedname] in the value object [ims.clinical.vo.VTMVo] is too big. It should be less or equal to 60");
		if(this.moietyidentifier == null || this.moietyidentifier.length() == 0)
			listOfErrors.add("MoietyIdentifier is mandatory");
		else if(this.moietyidentifier.length() > 30)
			listOfErrors.add("The length of the field [moietyidentifier] in the value object [ims.clinical.vo.VTMVo] is too big. It should be less or equal to 30");
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
	
		VTMVo clone = new VTMVo(this.id, this.version);
		
		clone.invalid = this.invalid;
		clone.name = this.name;
		clone.abbreviatedname = this.abbreviatedname;
		clone.moietyidentifier = this.moietyidentifier;
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
		if (!(VTMVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A VTMVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((VTMVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((VTMVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.invalid != null)
			count++;
		if(this.name != null)
			count++;
		if(this.abbreviatedname != null)
			count++;
		if(this.moietyidentifier != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected Boolean invalid;
	protected String name;
	protected String abbreviatedname;
	protected String moietyidentifier;
	private boolean isValidated = false;
	private boolean isBusy = false;
}