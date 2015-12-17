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

package ims.clinicaladmin.vo;

/**
 * Linked to Oncology.Configuration.TumourGroup business object (ID: 1074100009).
 */
public class TumourGroupListForPrimaryTumourDetailsVo extends ims.oncology.configuration.vo.TumourGroupRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TumourGroupListForPrimaryTumourDetailsVo()
	{
	}
	public TumourGroupListForPrimaryTumourDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public TumourGroupListForPrimaryTumourDetailsVo(ims.clinicaladmin.vo.beans.TumourGroupListForPrimaryTumourDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.groupname = bean.getGroupName();
		this.sites = ims.clinicaladmin.vo.TumourSiteLiteVoCollection.buildFromBeanCollection(bean.getSites());
		this.tnmrequiresover45 = bean.getTnmRequiresOver45();
		this.isactive = bean.getIsActive();
		this.tnmvalues = ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection.buildFromBeanCollection(bean.getTNMValues());
		this.serummarkers = ims.clinicaladmin.vo.TumourSerumMarkersVoCollection.buildFromBeanCollection(bean.getSerumMarkers());
		this.otherclassifications = ims.oncology.vo.TumourGroupClassificationVoCollection.buildFromBeanCollection(bean.getOtherClassifications());
		this.associatedspecialties = ims.oncology.vo.TumourGroupSpecialtyVoCollection.buildFromBeanCollection(bean.getAssociatedSpecialties());
		this.hastnm = bean.getHasTNM();
		this.histologies = ims.clinicaladmin.vo.TumourGroupHistologyVoCollection.buildFromBeanCollection(bean.getHistologies());
		this.histopathologicgrades = ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection.buildFromBeanCollection(bean.getHistopathologicGrades());
		this.assessment = bean.getAssessment() == null ? null : new ims.assessment.configuration.vo.UserAssessmentRefVo(new Integer(bean.getAssessment().getId()), bean.getAssessment().getVersion());
		this.isprognosticgroupingrelevant = bean.getIsPrognosticGroupingRelevant();
		this.prognosticgroupingconfig = bean.getPrognosticGroupingConfig() == null ? null : bean.getPrognosticGroupingConfig().buildVo();
		this.tnmrequiresdiff = bean.getTnmRequiresDiff();
		this.tnmrequireshisto = bean.getTnmRequiresHisto();
		this.tnmrequiressmarkers = bean.getTnmRequiresSMarkers();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.TumourGroupListForPrimaryTumourDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.groupname = bean.getGroupName();
		this.sites = ims.clinicaladmin.vo.TumourSiteLiteVoCollection.buildFromBeanCollection(bean.getSites());
		this.tnmrequiresover45 = bean.getTnmRequiresOver45();
		this.isactive = bean.getIsActive();
		this.tnmvalues = ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection.buildFromBeanCollection(bean.getTNMValues());
		this.serummarkers = ims.clinicaladmin.vo.TumourSerumMarkersVoCollection.buildFromBeanCollection(bean.getSerumMarkers());
		this.otherclassifications = ims.oncology.vo.TumourGroupClassificationVoCollection.buildFromBeanCollection(bean.getOtherClassifications());
		this.associatedspecialties = ims.oncology.vo.TumourGroupSpecialtyVoCollection.buildFromBeanCollection(bean.getAssociatedSpecialties());
		this.hastnm = bean.getHasTNM();
		this.histologies = ims.clinicaladmin.vo.TumourGroupHistologyVoCollection.buildFromBeanCollection(bean.getHistologies());
		this.histopathologicgrades = ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection.buildFromBeanCollection(bean.getHistopathologicGrades());
		this.assessment = bean.getAssessment() == null ? null : new ims.assessment.configuration.vo.UserAssessmentRefVo(new Integer(bean.getAssessment().getId()), bean.getAssessment().getVersion());
		this.isprognosticgroupingrelevant = bean.getIsPrognosticGroupingRelevant();
		this.prognosticgroupingconfig = bean.getPrognosticGroupingConfig() == null ? null : bean.getPrognosticGroupingConfig().buildVo(map);
		this.tnmrequiresdiff = bean.getTnmRequiresDiff();
		this.tnmrequireshisto = bean.getTnmRequiresHisto();
		this.tnmrequiressmarkers = bean.getTnmRequiresSMarkers();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.TumourGroupListForPrimaryTumourDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.TumourGroupListForPrimaryTumourDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.TumourGroupListForPrimaryTumourDetailsVoBean();
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
		if(fieldName.equals("GROUPNAME"))
			return getGroupName();
		if(fieldName.equals("SITES"))
			return getSites();
		if(fieldName.equals("TNMREQUIRESOVER45"))
			return getTnmRequiresOver45();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("TNMVALUES"))
			return getTNMValues();
		if(fieldName.equals("SERUMMARKERS"))
			return getSerumMarkers();
		if(fieldName.equals("OTHERCLASSIFICATIONS"))
			return getOtherClassifications();
		if(fieldName.equals("ASSOCIATEDSPECIALTIES"))
			return getAssociatedSpecialties();
		if(fieldName.equals("HASTNM"))
			return getHasTNM();
		if(fieldName.equals("HISTOLOGIES"))
			return getHistologies();
		if(fieldName.equals("HISTOPATHOLOGICGRADES"))
			return getHistopathologicGrades();
		if(fieldName.equals("ASSESSMENT"))
			return getAssessment();
		if(fieldName.equals("ISPROGNOSTICGROUPINGRELEVANT"))
			return getIsPrognosticGroupingRelevant();
		if(fieldName.equals("PROGNOSTICGROUPINGCONFIG"))
			return getPrognosticGroupingConfig();
		if(fieldName.equals("TNMREQUIRESDIFF"))
			return getTnmRequiresDiff();
		if(fieldName.equals("TNMREQUIRESHISTO"))
			return getTnmRequiresHisto();
		if(fieldName.equals("TNMREQUIRESSMARKERS"))
			return getTnmRequiresSMarkers();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getGroupNameIsNotNull()
	{
		return this.groupname != null;
	}
	public String getGroupName()
	{
		return this.groupname;
	}
	public static int getGroupNameMaxLength()
	{
		return 255;
	}
	public void setGroupName(String value)
	{
		this.isValidated = false;
		this.groupname = value;
	}
	public boolean getSitesIsNotNull()
	{
		return this.sites != null;
	}
	public ims.clinicaladmin.vo.TumourSiteLiteVoCollection getSites()
	{
		return this.sites;
	}
	public void setSites(ims.clinicaladmin.vo.TumourSiteLiteVoCollection value)
	{
		this.isValidated = false;
		this.sites = value;
	}
	public boolean getTnmRequiresOver45IsNotNull()
	{
		return this.tnmrequiresover45 != null;
	}
	public Boolean getTnmRequiresOver45()
	{
		return this.tnmrequiresover45;
	}
	public void setTnmRequiresOver45(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiresover45 = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getTNMValuesIsNotNull()
	{
		return this.tnmvalues != null;
	}
	public ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection getTNMValues()
	{
		return this.tnmvalues;
	}
	public void setTNMValues(ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection value)
	{
		this.isValidated = false;
		this.tnmvalues = value;
	}
	public boolean getSerumMarkersIsNotNull()
	{
		return this.serummarkers != null;
	}
	public ims.clinicaladmin.vo.TumourSerumMarkersVoCollection getSerumMarkers()
	{
		return this.serummarkers;
	}
	public void setSerumMarkers(ims.clinicaladmin.vo.TumourSerumMarkersVoCollection value)
	{
		this.isValidated = false;
		this.serummarkers = value;
	}
	public boolean getOtherClassificationsIsNotNull()
	{
		return this.otherclassifications != null;
	}
	public ims.oncology.vo.TumourGroupClassificationVoCollection getOtherClassifications()
	{
		return this.otherclassifications;
	}
	public void setOtherClassifications(ims.oncology.vo.TumourGroupClassificationVoCollection value)
	{
		this.isValidated = false;
		this.otherclassifications = value;
	}
	public boolean getAssociatedSpecialtiesIsNotNull()
	{
		return this.associatedspecialties != null;
	}
	public ims.oncology.vo.TumourGroupSpecialtyVoCollection getAssociatedSpecialties()
	{
		return this.associatedspecialties;
	}
	public void setAssociatedSpecialties(ims.oncology.vo.TumourGroupSpecialtyVoCollection value)
	{
		this.isValidated = false;
		this.associatedspecialties = value;
	}
	public boolean getHasTNMIsNotNull()
	{
		return this.hastnm != null;
	}
	public Boolean getHasTNM()
	{
		return this.hastnm;
	}
	public void setHasTNM(Boolean value)
	{
		this.isValidated = false;
		this.hastnm = value;
	}
	public boolean getHistologiesIsNotNull()
	{
		return this.histologies != null;
	}
	public ims.clinicaladmin.vo.TumourGroupHistologyVoCollection getHistologies()
	{
		return this.histologies;
	}
	public void setHistologies(ims.clinicaladmin.vo.TumourGroupHistologyVoCollection value)
	{
		this.isValidated = false;
		this.histologies = value;
	}
	public boolean getHistopathologicGradesIsNotNull()
	{
		return this.histopathologicgrades != null;
	}
	public ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection getHistopathologicGrades()
	{
		return this.histopathologicgrades;
	}
	public void setHistopathologicGrades(ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection value)
	{
		this.isValidated = false;
		this.histopathologicgrades = value;
	}
	public boolean getAssessmentIsNotNull()
	{
		return this.assessment != null;
	}
	public ims.assessment.configuration.vo.UserAssessmentRefVo getAssessment()
	{
		return this.assessment;
	}
	public void setAssessment(ims.assessment.configuration.vo.UserAssessmentRefVo value)
	{
		this.isValidated = false;
		this.assessment = value;
	}
	public boolean getIsPrognosticGroupingRelevantIsNotNull()
	{
		return this.isprognosticgroupingrelevant != null;
	}
	public Boolean getIsPrognosticGroupingRelevant()
	{
		return this.isprognosticgroupingrelevant;
	}
	public void setIsPrognosticGroupingRelevant(Boolean value)
	{
		this.isValidated = false;
		this.isprognosticgroupingrelevant = value;
	}
	public boolean getPrognosticGroupingConfigIsNotNull()
	{
		return this.prognosticgroupingconfig != null;
	}
	public ims.clinicaladmin.vo.PrognosticGroupingCongfigVo getPrognosticGroupingConfig()
	{
		return this.prognosticgroupingconfig;
	}
	public void setPrognosticGroupingConfig(ims.clinicaladmin.vo.PrognosticGroupingCongfigVo value)
	{
		this.isValidated = false;
		this.prognosticgroupingconfig = value;
	}
	public boolean getTnmRequiresDiffIsNotNull()
	{
		return this.tnmrequiresdiff != null;
	}
	public Boolean getTnmRequiresDiff()
	{
		return this.tnmrequiresdiff;
	}
	public void setTnmRequiresDiff(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiresdiff = value;
	}
	public boolean getTnmRequiresHistoIsNotNull()
	{
		return this.tnmrequireshisto != null;
	}
	public Boolean getTnmRequiresHisto()
	{
		return this.tnmrequireshisto;
	}
	public void setTnmRequiresHisto(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequireshisto = value;
	}
	public boolean getTnmRequiresSMarkersIsNotNull()
	{
		return this.tnmrequiressmarkers != null;
	}
	public Boolean getTnmRequiresSMarkers()
	{
		return this.tnmrequiressmarkers;
	}
	public void setTnmRequiresSMarkers(Boolean value)
	{
		this.isValidated = false;
		this.tnmrequiressmarkers = value;
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
		if(this.sites != null)
		{
			if(!this.sites.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.tnmvalues != null)
		{
			if(!this.tnmvalues.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.serummarkers != null)
		{
			if(!this.serummarkers.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.otherclassifications != null)
		{
			if(!this.otherclassifications.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.associatedspecialties != null)
		{
			if(!this.associatedspecialties.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.histopathologicgrades != null)
		{
			if(!this.histopathologicgrades.isValidated())
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
		if(this.groupname == null || this.groupname.length() == 0)
			listOfErrors.add("GroupName is mandatory");
		else if(this.groupname.length() > 255)
			listOfErrors.add("The length of the field [groupname] in the value object [ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo] is too big. It should be less or equal to 255");
		if(this.sites != null)
		{
			String[] listOfOtherErrors = this.sites.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.tnmvalues != null)
		{
			String[] listOfOtherErrors = this.tnmvalues.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.serummarkers != null)
		{
			String[] listOfOtherErrors = this.serummarkers.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.otherclassifications != null)
		{
			String[] listOfOtherErrors = this.otherclassifications.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.associatedspecialties != null)
		{
			String[] listOfOtherErrors = this.associatedspecialties.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.histopathologicgrades != null)
		{
			String[] listOfOtherErrors = this.histopathologicgrades.validate();
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
	
		TumourGroupListForPrimaryTumourDetailsVo clone = new TumourGroupListForPrimaryTumourDetailsVo(this.id, this.version);
		
		clone.groupname = this.groupname;
		if(this.sites == null)
			clone.sites = null;
		else
			clone.sites = (ims.clinicaladmin.vo.TumourSiteLiteVoCollection)this.sites.clone();
		clone.tnmrequiresover45 = this.tnmrequiresover45;
		clone.isactive = this.isactive;
		if(this.tnmvalues == null)
			clone.tnmvalues = null;
		else
			clone.tnmvalues = (ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection)this.tnmvalues.clone();
		if(this.serummarkers == null)
			clone.serummarkers = null;
		else
			clone.serummarkers = (ims.clinicaladmin.vo.TumourSerumMarkersVoCollection)this.serummarkers.clone();
		if(this.otherclassifications == null)
			clone.otherclassifications = null;
		else
			clone.otherclassifications = (ims.oncology.vo.TumourGroupClassificationVoCollection)this.otherclassifications.clone();
		if(this.associatedspecialties == null)
			clone.associatedspecialties = null;
		else
			clone.associatedspecialties = (ims.oncology.vo.TumourGroupSpecialtyVoCollection)this.associatedspecialties.clone();
		clone.hastnm = this.hastnm;
		if(this.histologies == null)
			clone.histologies = null;
		else
			clone.histologies = (ims.clinicaladmin.vo.TumourGroupHistologyVoCollection)this.histologies.clone();
		if(this.histopathologicgrades == null)
			clone.histopathologicgrades = null;
		else
			clone.histopathologicgrades = (ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection)this.histopathologicgrades.clone();
		clone.assessment = this.assessment;
		clone.isprognosticgroupingrelevant = this.isprognosticgroupingrelevant;
		if(this.prognosticgroupingconfig == null)
			clone.prognosticgroupingconfig = null;
		else
			clone.prognosticgroupingconfig = (ims.clinicaladmin.vo.PrognosticGroupingCongfigVo)this.prognosticgroupingconfig.clone();
		clone.tnmrequiresdiff = this.tnmrequiresdiff;
		clone.tnmrequireshisto = this.tnmrequireshisto;
		clone.tnmrequiressmarkers = this.tnmrequiressmarkers;
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
		if (!(TumourGroupListForPrimaryTumourDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TumourGroupListForPrimaryTumourDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TumourGroupListForPrimaryTumourDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TumourGroupListForPrimaryTumourDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.groupname != null)
			count++;
		if(this.sites != null)
			count++;
		if(this.tnmrequiresover45 != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.tnmvalues != null)
			count++;
		if(this.serummarkers != null)
			count++;
		if(this.otherclassifications != null)
			count++;
		if(this.associatedspecialties != null)
			count++;
		if(this.hastnm != null)
			count++;
		if(this.histologies != null)
			count++;
		if(this.histopathologicgrades != null)
			count++;
		if(this.assessment != null)
			count++;
		if(this.isprognosticgroupingrelevant != null)
			count++;
		if(this.prognosticgroupingconfig != null)
			count++;
		if(this.tnmrequiresdiff != null)
			count++;
		if(this.tnmrequireshisto != null)
			count++;
		if(this.tnmrequiressmarkers != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 17;
	}
	protected String groupname;
	protected ims.clinicaladmin.vo.TumourSiteLiteVoCollection sites;
	protected Boolean tnmrequiresover45;
	protected Boolean isactive;
	protected ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection tnmvalues;
	protected ims.clinicaladmin.vo.TumourSerumMarkersVoCollection serummarkers;
	protected ims.oncology.vo.TumourGroupClassificationVoCollection otherclassifications;
	protected ims.oncology.vo.TumourGroupSpecialtyVoCollection associatedspecialties;
	protected Boolean hastnm;
	protected ims.clinicaladmin.vo.TumourGroupHistologyVoCollection histologies;
	protected ims.clinicaladmin.vo.TumourGroupHistopathologyGradeVoCollection histopathologicgrades;
	protected ims.assessment.configuration.vo.UserAssessmentRefVo assessment;
	protected Boolean isprognosticgroupingrelevant;
	protected ims.clinicaladmin.vo.PrognosticGroupingCongfigVo prognosticgroupingconfig;
	protected Boolean tnmrequiresdiff;
	protected Boolean tnmrequireshisto;
	protected Boolean tnmrequiressmarkers;
	private boolean isValidated = false;
	private boolean isBusy = false;
}