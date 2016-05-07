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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to OCRR.OrderingResults.OrderedInvestigationStatus business object (ID: 1070100011).
 */
public class OrderedInvestigationStatusVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<OrderedInvestigationStatusVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<OrderedInvestigationStatusVo> col = new ArrayList<OrderedInvestigationStatusVo>();
	public String getBoClassName()
	{
		return "ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus";
	}
	public boolean add(OrderedInvestigationStatusVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, OrderedInvestigationStatusVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(OrderedInvestigationStatusVo instance)
	{
		return col.indexOf(instance);
	}
	public OrderedInvestigationStatusVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, OrderedInvestigationStatusVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(OrderedInvestigationStatusVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(OrderedInvestigationStatusVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		OrderedInvestigationStatusVoCollection clone = new OrderedInvestigationStatusVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((OrderedInvestigationStatusVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public OrderedInvestigationStatusVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public OrderedInvestigationStatusVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public OrderedInvestigationStatusVoCollection sort(SortOrder order)
	{
		return sort(new OrderedInvestigationStatusVoComparator(order));
	}
	public OrderedInvestigationStatusVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new OrderedInvestigationStatusVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public OrderedInvestigationStatusVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection toRefVoCollection()
	{
		ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection result = new ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public OrderedInvestigationStatusVo[] toArray()
	{
		OrderedInvestigationStatusVo[] arr = new OrderedInvestigationStatusVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<OrderedInvestigationStatusVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class OrderedInvestigationStatusVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public OrderedInvestigationStatusVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public OrderedInvestigationStatusVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public OrderedInvestigationStatusVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			OrderedInvestigationStatusVo voObj1 = (OrderedInvestigationStatusVo)obj1;
			OrderedInvestigationStatusVo voObj2 = (OrderedInvestigationStatusVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] getBeanCollectionArray()
	{
		ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] result = new ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			OrderedInvestigationStatusVo vo = ((OrderedInvestigationStatusVo)col.get(i));
			result[i] = (ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean)vo.getBean();
		}
		return result;
	}
	public static OrderedInvestigationStatusVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		OrderedInvestigationStatusVoCollection coll = new OrderedInvestigationStatusVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static OrderedInvestigationStatusVoCollection buildFromBeanCollection(ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] beans)
	{
		OrderedInvestigationStatusVoCollection coll = new OrderedInvestigationStatusVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}