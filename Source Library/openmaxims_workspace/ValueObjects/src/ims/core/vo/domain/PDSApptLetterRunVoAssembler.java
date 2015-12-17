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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class PDSApptLetterRunVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSApptLetterRunVo copy(ims.core.vo.PDSApptLetterRunVo valueObjectDest, ims.core.vo.PDSApptLetterRunVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSApptLetterRun(valueObjectSrc.getID_PDSApptLetterRun());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FromDate
		valueObjectDest.setFromDate(valueObjectSrc.getFromDate());
		// ToDate
		valueObjectDest.setToDate(valueObjectSrc.getToDate());
		// ConfiguredJob
		valueObjectDest.setConfiguredJob(valueObjectSrc.getConfiguredJob());
		// LetterType
		valueObjectDest.setLetterType(valueObjectSrc.getLetterType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSApptLetterRun objects.
	 */
	public static ims.core.vo.PDSApptLetterRunVoCollection createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(java.util.Set domainObjectSet)	
	{
		return createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PDSApptLetterRun objects.
	 */
	public static ims.core.vo.PDSApptLetterRunVoCollection createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSApptLetterRunVoCollection voList = new ims.core.vo.PDSApptLetterRunVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.PDSApptLetterRun domainObject = (ims.core.admin.domain.objects.PDSApptLetterRun) iterator.next();
			ims.core.vo.PDSApptLetterRunVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSApptLetterRun objects.
	 */
	public static ims.core.vo.PDSApptLetterRunVoCollection createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(java.util.List domainObjectList) 
	{
		return createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PDSApptLetterRun objects.
	 */
	public static ims.core.vo.PDSApptLetterRunVoCollection createPDSApptLetterRunVoCollectionFromPDSApptLetterRun(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSApptLetterRunVoCollection voList = new ims.core.vo.PDSApptLetterRunVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.PDSApptLetterRun domainObject = (ims.core.admin.domain.objects.PDSApptLetterRun) domainObjectList.get(i);
			ims.core.vo.PDSApptLetterRunVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.admin.domain.objects.PDSApptLetterRun set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSApptLetterRunSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVoCollection voCollection) 
	 {
	 	return extractPDSApptLetterRunSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSApptLetterRunSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSApptLetterRunVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSApptLetterRun domainObject = PDSApptLetterRunVoAssembler.extractPDSApptLetterRun(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.admin.domain.objects.PDSApptLetterRun list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSApptLetterRunList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVoCollection voCollection) 
	 {
	 	return extractPDSApptLetterRunList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSApptLetterRunList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSApptLetterRunVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PDSApptLetterRun domainObject = PDSApptLetterRunVoAssembler.extractPDSApptLetterRun(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.admin.domain.objects.PDSApptLetterRun object.
	 * @param domainObject ims.core.admin.domain.objects.PDSApptLetterRun
	 */
	 public static ims.core.vo.PDSApptLetterRunVo create(ims.core.admin.domain.objects.PDSApptLetterRun domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.PDSApptLetterRun object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSApptLetterRunVo create(DomainObjectMap map, ims.core.admin.domain.objects.PDSApptLetterRun domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSApptLetterRunVo valueObject = (ims.core.vo.PDSApptLetterRunVo) map.getValueObject(domainObject, ims.core.vo.PDSApptLetterRunVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSApptLetterRunVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PDSApptLetterRun
	 */
	 public static ims.core.vo.PDSApptLetterRunVo insert(ims.core.vo.PDSApptLetterRunVo valueObject, ims.core.admin.domain.objects.PDSApptLetterRun domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PDSApptLetterRun
	 */
	 public static ims.core.vo.PDSApptLetterRunVo insert(DomainObjectMap map, ims.core.vo.PDSApptLetterRunVo valueObject, ims.core.admin.domain.objects.PDSApptLetterRun domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSApptLetterRun(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// FromDate
		java.util.Date FromDate = domainObject.getFromDate();
		if ( null != FromDate ) 
		{
			valueObject.setFromDate(new ims.framework.utils.Date(FromDate) );
		}
		// ToDate
		java.util.Date ToDate = domainObject.getToDate();
		if ( null != ToDate ) 
		{
			valueObject.setToDate(new ims.framework.utils.Date(ToDate) );
		}
		// ConfiguredJob
		if (domainObject.getConfiguredJob() != null)
		{
			if(domainObject.getConfiguredJob() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConfiguredJob();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(id, -1));				
			}
			else
			{
				valueObject.setConfiguredJob(new ims.core.configuration.vo.ConfiguredJobRefVo(domainObject.getConfiguredJob().getId(), domainObject.getConfiguredJob().getVersion()));
			}
		}
		// LetterType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getLetterType();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PDSLetterRunType voLookup4 = new ims.core.vo.lookups.PDSLetterRunType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PDSLetterRunType parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.PDSLetterRunType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setLetterType(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.PDSApptLetterRun extractPDSApptLetterRun(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVo valueObject) 
	{
		return 	extractPDSApptLetterRun(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.PDSApptLetterRun extractPDSApptLetterRun(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSApptLetterRunVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSApptLetterRun();
		ims.core.admin.domain.objects.PDSApptLetterRun domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.PDSApptLetterRun)domMap.get(valueObject);
			}
			// ims.core.vo.PDSApptLetterRunVo ID_PDSApptLetterRun field is unknown
			domainObject = new ims.core.admin.domain.objects.PDSApptLetterRun();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSApptLetterRun());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.PDSApptLetterRun)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.PDSApptLetterRun) domainFactory.getDomainObject(ims.core.admin.domain.objects.PDSApptLetterRun.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSApptLetterRun());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getFromDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setFromDate(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getToDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setToDate(value2);
		ims.core.configuration.domain.objects.ConfiguredJob value3 = null;
		if ( null != valueObject.getConfiguredJob() ) 
		{
			if (valueObject.getConfiguredJob().getBoId() == null)
			{
				if (domMap.get(valueObject.getConfiguredJob()) != null)
				{
					value3 = (ims.core.configuration.domain.objects.ConfiguredJob)domMap.get(valueObject.getConfiguredJob());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getConfiguredJob();	
			}
			else
			{
				value3 = (ims.core.configuration.domain.objects.ConfiguredJob)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ConfiguredJob.class, valueObject.getConfiguredJob().getBoId());
			}
		}
		domainObject.setConfiguredJob(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getLetterType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getLetterType().getID());
		}
		domainObject.setLetterType(value4);

		return domainObject;
	}

}