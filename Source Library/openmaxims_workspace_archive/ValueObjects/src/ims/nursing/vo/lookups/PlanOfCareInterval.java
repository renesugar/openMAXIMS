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

package ims.nursing.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class PlanOfCareInterval extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PlanOfCareInterval()
	{
		super();
	}
	public PlanOfCareInterval(int id)
	{
		super(id, "", true);
	}
	public PlanOfCareInterval(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PlanOfCareInterval(int id, String text, boolean active, PlanOfCareInterval parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PlanOfCareInterval(int id, String text, boolean active, PlanOfCareInterval parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PlanOfCareInterval(int id, String text, boolean active, PlanOfCareInterval parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PlanOfCareInterval buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PlanOfCareInterval(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PlanOfCareInterval)super.getParentInstance();
	}
	public PlanOfCareInterval getParent()
	{
		return (PlanOfCareInterval)super.getParentInstance();
	}
	public void setParent(PlanOfCareInterval parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PlanOfCareInterval[] typedChildren = new PlanOfCareInterval[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PlanOfCareInterval)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PlanOfCareInterval)
		{
			super.addChild((PlanOfCareInterval)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PlanOfCareInterval)
		{
			super.removeChild((PlanOfCareInterval)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		PlanOfCareIntervalCollection result = new PlanOfCareIntervalCollection();
		result.add(HOURS12);
		result.add(HOURS24);
		result.add(HOURS36);
		result.add(HOURS48);
		result.add(HOURS72);
		return result;
	}
	public static PlanOfCareInterval[] getNegativeInstances()
	{
		PlanOfCareInterval[] instances = new PlanOfCareInterval[5];
		instances[0] = HOURS12;
		instances[1] = HOURS24;
		instances[2] = HOURS36;
		instances[3] = HOURS48;
		instances[4] = HOURS72;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[5];
		negativeInstances[0] = "HOURS12";
		negativeInstances[1] = "HOURS24";
		negativeInstances[2] = "HOURS36";
		negativeInstances[3] = "HOURS48";
		negativeInstances[4] = "HOURS72";
		return negativeInstances;
	}
	public static PlanOfCareInterval getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static PlanOfCareInterval getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PlanOfCareInterval[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1001082;
	public static final PlanOfCareInterval HOURS12 = new PlanOfCareInterval(-1124, "12 Hours", true, null, null, Color.Default);
	public static final PlanOfCareInterval HOURS24 = new PlanOfCareInterval(-1125, "24 Hours", true, null, null, Color.Default);
	public static final PlanOfCareInterval HOURS36 = new PlanOfCareInterval(-1126, "36 Hours", true, null, null, Color.Default);
	public static final PlanOfCareInterval HOURS48 = new PlanOfCareInterval(-1127, "48 Hours", true, null, null, Color.Default);
	public static final PlanOfCareInterval HOURS72 = new PlanOfCareInterval(-1128, "72 Hours", true, null, null, Color.Default);
}