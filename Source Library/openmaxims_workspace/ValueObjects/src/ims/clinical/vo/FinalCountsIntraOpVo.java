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

package ims.clinical.vo;

/**
 * Linked to clinical.FinalCountIntraOp business object (ID: 1072100152).
 */
public class FinalCountsIntraOpVo extends ims.clinical.vo.FinalCountIntraOpRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public FinalCountsIntraOpVo()
	{
	}
	public FinalCountsIntraOpVo(Integer id, int version)
	{
		super(id, version);
	}
	public FinalCountsIntraOpVo(ims.clinical.vo.beans.FinalCountsIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo();
		this.swabsaccountableitemscorrect = bean.getSwabsAccountableItemscorrect() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getSwabsAccountableItemscorrect());
		this.instrumentscorrect = bean.getInstrumentsCorrect() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getInstrumentsCorrect());
		this.sharpsothercorrectandremovedfromset = bean.getSharpsOtherCorrectAndRemovedFromSet() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getSharpsOtherCorrectAndRemovedFromSet());
		this.verifiedby1 = bean.getVerifiedBy1() == null ? null : bean.getVerifiedBy1().buildVo();
		this.missingitems = ims.clinical.vo.lookups.FinalCountMissingItemCollection.buildFromBeanCollection(bean.getMissingItems());
		this.othermissingitems = bean.getOtherMissingItems();
		this.actionstaken = ims.clinical.vo.lookups.FinalCountActionsTakenCollection.buildFromBeanCollection(bean.getActionsTaken());
		this.verifiedby2 = bean.getVerifiedBy2() == null ? null : bean.getVerifiedBy2().buildVo();
		this.verifiedby = bean.getVerifiedBy() == null ? null : bean.getVerifiedBy().buildVo();
		this.otheractionstaken = bean.getOtherActionsTaken();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.FinalCountsIntraOpVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo(map);
		this.swabsaccountableitemscorrect = bean.getSwabsAccountableItemscorrect() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getSwabsAccountableItemscorrect());
		this.instrumentscorrect = bean.getInstrumentsCorrect() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getInstrumentsCorrect());
		this.sharpsothercorrectandremovedfromset = bean.getSharpsOtherCorrectAndRemovedFromSet() == null ? null : ims.core.vo.lookups.YesNoNotApplicable.buildLookup(bean.getSharpsOtherCorrectAndRemovedFromSet());
		this.verifiedby1 = bean.getVerifiedBy1() == null ? null : bean.getVerifiedBy1().buildVo(map);
		this.missingitems = ims.clinical.vo.lookups.FinalCountMissingItemCollection.buildFromBeanCollection(bean.getMissingItems());
		this.othermissingitems = bean.getOtherMissingItems();
		this.actionstaken = ims.clinical.vo.lookups.FinalCountActionsTakenCollection.buildFromBeanCollection(bean.getActionsTaken());
		this.verifiedby2 = bean.getVerifiedBy2() == null ? null : bean.getVerifiedBy2().buildVo(map);
		this.verifiedby = bean.getVerifiedBy() == null ? null : bean.getVerifiedBy().buildVo(map);
		this.otheractionstaken = bean.getOtherActionsTaken();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.FinalCountsIntraOpVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.FinalCountsIntraOpVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.FinalCountsIntraOpVoBean();
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
		if(fieldName.equals("THEATREAPPOINTMENT"))
			return getTheatreAppointment();
		if(fieldName.equals("PROCEDURE"))
			return getProcedure();
		if(fieldName.equals("SWABSACCOUNTABLEITEMSCORRECT"))
			return getSwabsAccountableItemscorrect();
		if(fieldName.equals("INSTRUMENTSCORRECT"))
			return getInstrumentsCorrect();
		if(fieldName.equals("SHARPSOTHERCORRECTANDREMOVEDFROMSET"))
			return getSharpsOtherCorrectAndRemovedFromSet();
		if(fieldName.equals("VERIFIEDBY1"))
			return getVerifiedBy1();
		if(fieldName.equals("MISSINGITEMS"))
			return getMissingItems();
		if(fieldName.equals("OTHERMISSINGITEMS"))
			return getOtherMissingItems();
		if(fieldName.equals("ACTIONSTAKEN"))
			return getActionsTaken();
		if(fieldName.equals("VERIFIEDBY2"))
			return getVerifiedBy2();
		if(fieldName.equals("VERIFIEDBY"))
			return getVerifiedBy();
		if(fieldName.equals("OTHERACTIONSTAKEN"))
			return getOtherActionsTaken();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTheatreAppointmentIsNotNull()
	{
		return this.theatreappointment != null;
	}
	public ims.scheduling.vo.Booking_AppointmentRefVo getTheatreAppointment()
	{
		return this.theatreappointment;
	}
	public void setTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo value)
	{
		this.isValidated = false;
		this.theatreappointment = value;
	}
	public boolean getProcedureIsNotNull()
	{
		return this.procedure != null;
	}
	public ims.core.vo.PatientProcedureMinVo getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.vo.PatientProcedureMinVo value)
	{
		this.isValidated = false;
		this.procedure = value;
	}
	public boolean getSwabsAccountableItemscorrectIsNotNull()
	{
		return this.swabsaccountableitemscorrect != null;
	}
	public ims.core.vo.lookups.YesNoNotApplicable getSwabsAccountableItemscorrect()
	{
		return this.swabsaccountableitemscorrect;
	}
	public void setSwabsAccountableItemscorrect(ims.core.vo.lookups.YesNoNotApplicable value)
	{
		this.isValidated = false;
		this.swabsaccountableitemscorrect = value;
	}
	public boolean getInstrumentsCorrectIsNotNull()
	{
		return this.instrumentscorrect != null;
	}
	public ims.core.vo.lookups.YesNoNotApplicable getInstrumentsCorrect()
	{
		return this.instrumentscorrect;
	}
	public void setInstrumentsCorrect(ims.core.vo.lookups.YesNoNotApplicable value)
	{
		this.isValidated = false;
		this.instrumentscorrect = value;
	}
	public boolean getSharpsOtherCorrectAndRemovedFromSetIsNotNull()
	{
		return this.sharpsothercorrectandremovedfromset != null;
	}
	public ims.core.vo.lookups.YesNoNotApplicable getSharpsOtherCorrectAndRemovedFromSet()
	{
		return this.sharpsothercorrectandremovedfromset;
	}
	public void setSharpsOtherCorrectAndRemovedFromSet(ims.core.vo.lookups.YesNoNotApplicable value)
	{
		this.isValidated = false;
		this.sharpsothercorrectandremovedfromset = value;
	}
	public boolean getVerifiedBy1IsNotNull()
	{
		return this.verifiedby1 != null;
	}
	public ims.core.vo.NurseLiteVo getVerifiedBy1()
	{
		return this.verifiedby1;
	}
	public void setVerifiedBy1(ims.core.vo.NurseLiteVo value)
	{
		this.isValidated = false;
		this.verifiedby1 = value;
	}
	public boolean getMissingItemsIsNotNull()
	{
		return this.missingitems != null;
	}
	public ims.clinical.vo.lookups.FinalCountMissingItemCollection getMissingItems()
	{
		return this.missingitems;
	}
	public void setMissingItems(ims.clinical.vo.lookups.FinalCountMissingItemCollection value)
	{
		this.isValidated = false;
		this.missingitems = value;
	}
	public boolean getOtherMissingItemsIsNotNull()
	{
		return this.othermissingitems != null;
	}
	public String getOtherMissingItems()
	{
		return this.othermissingitems;
	}
	public static int getOtherMissingItemsMaxLength()
	{
		return 500;
	}
	public void setOtherMissingItems(String value)
	{
		this.isValidated = false;
		this.othermissingitems = value;
	}
	public boolean getActionsTakenIsNotNull()
	{
		return this.actionstaken != null;
	}
	public ims.clinical.vo.lookups.FinalCountActionsTakenCollection getActionsTaken()
	{
		return this.actionstaken;
	}
	public void setActionsTaken(ims.clinical.vo.lookups.FinalCountActionsTakenCollection value)
	{
		this.isValidated = false;
		this.actionstaken = value;
	}
	public boolean getVerifiedBy2IsNotNull()
	{
		return this.verifiedby2 != null;
	}
	public ims.core.vo.HcpLiteVo getVerifiedBy2()
	{
		return this.verifiedby2;
	}
	public void setVerifiedBy2(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.verifiedby2 = value;
	}
	public boolean getVerifiedByIsNotNull()
	{
		return this.verifiedby != null;
	}
	public ims.core.vo.HcpLiteVo getVerifiedBy()
	{
		return this.verifiedby;
	}
	public void setVerifiedBy(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.verifiedby = value;
	}
	public boolean getOtherActionsTakenIsNotNull()
	{
		return this.otheractionstaken != null;
	}
	public String getOtherActionsTaken()
	{
		return this.otheractionstaken;
	}
	public static int getOtherActionsTakenMaxLength()
	{
		return 500;
	}
	public void setOtherActionsTaken(String value)
	{
		this.isValidated = false;
		this.otheractionstaken = value;
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
		if(this.procedure != null)
		{
			if(!this.procedure.isValidated())
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
		if(this.theatreappointment == null)
			listOfErrors.add("TheatreAppointment is mandatory");
		if(this.procedure == null)
			listOfErrors.add("Procedure is mandatory");
		if(this.procedure != null)
		{
			String[] listOfOtherErrors = this.procedure.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.swabsaccountableitemscorrect == null)
			listOfErrors.add("Swabs / Accountable Items Correct is mandatory");
		if(this.instrumentscorrect == null)
			listOfErrors.add("Instruments Correct is mandatory");
		if(this.sharpsothercorrectandremovedfromset == null)
			listOfErrors.add("Sharps / Other correct and removed from set is mandatory");
		if(this.verifiedby1 == null)
			listOfErrors.add("Verified By 1 is mandatory");
		if(this.othermissingitems != null)
			if(this.othermissingitems.length() > 500)
				listOfErrors.add("The length of the field [othermissingitems] in the value object [ims.clinical.vo.FinalCountsIntraOpVo] is too big. It should be less or equal to 500");
		if(this.verifiedby2 == null)
			listOfErrors.add("Verified By 2 is mandatory");
		if(this.otheractionstaken != null)
			if(this.otheractionstaken.length() > 500)
				listOfErrors.add("The length of the field [otheractionstaken] in the value object [ims.clinical.vo.FinalCountsIntraOpVo] is too big. It should be less or equal to 500");
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
	
		FinalCountsIntraOpVo clone = new FinalCountsIntraOpVo(this.id, this.version);
		
		clone.theatreappointment = this.theatreappointment;
		if(this.procedure == null)
			clone.procedure = null;
		else
			clone.procedure = (ims.core.vo.PatientProcedureMinVo)this.procedure.clone();
		if(this.swabsaccountableitemscorrect == null)
			clone.swabsaccountableitemscorrect = null;
		else
			clone.swabsaccountableitemscorrect = (ims.core.vo.lookups.YesNoNotApplicable)this.swabsaccountableitemscorrect.clone();
		if(this.instrumentscorrect == null)
			clone.instrumentscorrect = null;
		else
			clone.instrumentscorrect = (ims.core.vo.lookups.YesNoNotApplicable)this.instrumentscorrect.clone();
		if(this.sharpsothercorrectandremovedfromset == null)
			clone.sharpsothercorrectandremovedfromset = null;
		else
			clone.sharpsothercorrectandremovedfromset = (ims.core.vo.lookups.YesNoNotApplicable)this.sharpsothercorrectandremovedfromset.clone();
		if(this.verifiedby1 == null)
			clone.verifiedby1 = null;
		else
			clone.verifiedby1 = (ims.core.vo.NurseLiteVo)this.verifiedby1.clone();
		if(this.missingitems == null)
			clone.missingitems = null;
		else
			clone.missingitems = (ims.clinical.vo.lookups.FinalCountMissingItemCollection)this.missingitems.clone();
		clone.othermissingitems = this.othermissingitems;
		if(this.actionstaken == null)
			clone.actionstaken = null;
		else
			clone.actionstaken = (ims.clinical.vo.lookups.FinalCountActionsTakenCollection)this.actionstaken.clone();
		if(this.verifiedby2 == null)
			clone.verifiedby2 = null;
		else
			clone.verifiedby2 = (ims.core.vo.HcpLiteVo)this.verifiedby2.clone();
		if(this.verifiedby == null)
			clone.verifiedby = null;
		else
			clone.verifiedby = (ims.core.vo.HcpLiteVo)this.verifiedby.clone();
		clone.otheractionstaken = this.otheractionstaken;
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
		if (!(FinalCountsIntraOpVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A FinalCountsIntraOpVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((FinalCountsIntraOpVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((FinalCountsIntraOpVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.theatreappointment != null)
			count++;
		if(this.procedure != null)
			count++;
		if(this.swabsaccountableitemscorrect != null)
			count++;
		if(this.instrumentscorrect != null)
			count++;
		if(this.sharpsothercorrectandremovedfromset != null)
			count++;
		if(this.verifiedby1 != null)
			count++;
		if(this.missingitems != null)
			count++;
		if(this.othermissingitems != null)
			count++;
		if(this.actionstaken != null)
			count++;
		if(this.verifiedby2 != null)
			count++;
		if(this.verifiedby != null)
			count++;
		if(this.otheractionstaken != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.scheduling.vo.Booking_AppointmentRefVo theatreappointment;
	protected ims.core.vo.PatientProcedureMinVo procedure;
	protected ims.core.vo.lookups.YesNoNotApplicable swabsaccountableitemscorrect;
	protected ims.core.vo.lookups.YesNoNotApplicable instrumentscorrect;
	protected ims.core.vo.lookups.YesNoNotApplicable sharpsothercorrectandremovedfromset;
	protected ims.core.vo.NurseLiteVo verifiedby1;
	protected ims.clinical.vo.lookups.FinalCountMissingItemCollection missingitems;
	protected String othermissingitems;
	protected ims.clinical.vo.lookups.FinalCountActionsTakenCollection actionstaken;
	protected ims.core.vo.HcpLiteVo verifiedby2;
	protected ims.core.vo.HcpLiteVo verifiedby;
	protected String otheractionstaken;
	private boolean isValidated = false;
	private boolean isBusy = false;
}