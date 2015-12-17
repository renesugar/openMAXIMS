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

package ims.assessment.forms.userdefinedform;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void bindcmbCategoryLookup();
	abstract protected void defaultcmbCategoryLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrTabsTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onGrdUserObjectsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbCategoryValueSet(Object value);
	abstract protected void onImbClearSelectClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbSeachSelectClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdUserObjectsSelectGridCheckBoxClicked(int column, GenForm.lyrTabsLayer.tabPageSelectContainer.grdUserObjectsSelectRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSelectClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelFavouriteClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSelectFavouriteClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveFavouriteClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTreFavouritesTreeViewNodeDropped(ims.framework.controls.TreeNode node, ims.framework.controls.TreeNode previousParentNode) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTreFavouritesTreeViewCheck(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTreFavouritesTreeViewSelectionChanged(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen();
			}
		});
		this.form.lyrTabs().tabPageSearch().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrTabstabPageSearchActivated();
			}
		});
		this.form.lyrTabs().tabPageSelect().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrTabstabPageSelectActivated();
			}
		});
		this.form.lyrTabs().tabPageFavourites().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrTabstabPageFavouritesActivated();
			}
		});
		this.form.lyrTabs().tabPageSearch().grdUserObjects().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdUserObjectsSelectionChanged();
			}
		});
		this.form.lyrTabs().tabPageSearch().imbClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbClearClick();
			}
		});
		this.form.lyrTabs().tabPageSearch().imbSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbSearchClick();
			}
		});
		this.form.lyrTabs().tabPageSearch().cmbCategory().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbCategoryValueSet(value);
			}
		});
		this.form.lyrTabs().tabPageSelect().imbClearSelect().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbClearSelectClick();
			}
		});
		this.form.lyrTabs().tabPageSelect().imbSeachSelect().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbSeachSelectClick();
			}
		});
		this.form.lyrTabs().tabPageSelect().grdUserObjectsSelect().setGridCheckBoxClickedEvent(new GridCheckBoxClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdUserObjectsSelectGridCheckBoxClicked(column, new GenForm.lyrTabsLayer.tabPageSelectContainer.grdUserObjectsSelectRow(row), isChecked);
			}
		});
		this.form.lyrTabs().tabPageSelect().btnSelect().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSelectClick();
			}
		});
		this.form.lyrTabs().tabPageSelect().btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.lyrTabs().tabPageFavourites().btnCancelFavourite().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelFavouriteClick();
			}
		});
		this.form.lyrTabs().tabPageFavourites().btnSelectFavourite().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSelectFavouriteClick();
			}
		});
		this.form.lyrTabs().tabPageFavourites().btnSaveFavourite().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveFavouriteClick();
			}
		});
		this.form.lyrTabs().tabPageFavourites().treFavourites().setTreeViewNodeDroppedEvent(new TreeViewNodeDropped()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.TreeNode node, ims.framework.controls.TreeNode previousParentNode) throws ims.framework.exceptions.PresentationLogicException
			{
				onTreFavouritesTreeViewNodeDropped(node, previousParentNode);
			}
		});
		this.form.lyrTabs().tabPageFavourites().treFavourites().setTreeViewCheckEvent(new TreeViewCheck()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException
			{
				onTreFavouritesTreeViewCheck(node);
			}
		});
		this.form.lyrTabs().tabPageFavourites().treFavourites().setTreeViewSelectionChangedEvent(new TreeViewSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException
			{
				onTreFavouritesTreeViewSelectionChanged(node);
			}
		});
		this.form.getContextMenus().getGenericGridAddItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Add, sender);
			}
		});
		this.form.getContextMenus().getGenericGridUpdateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Update, sender);
			}
		});
		this.form.getContextMenus().getGenericGridRemoveItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Remove, sender);
			}
		});
		this.form.getContextMenus().getGenericGridViewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.View, sender);
			}
		});
		this.form.getContextMenus().getGenericGridMoveUpItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.MoveUp, sender);
			}
		});
		this.form.getContextMenus().getGenericGridMoveDownItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.MoveDown, sender);
			}
		});
		this.form.getContextMenus().getGenericGridReplaceItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Replace, sender);
			}
		});
		this.form.getContextMenus().getGenericGridConfirmItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Confirm, sender);
			}
		});
		this.form.getContextMenus().getGenericGridEDIT_VIEW_ICP_ACTIONSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.EDIT_VIEW_ICP_ACTIONS, sender);
			}
		});
		this.form.getContextMenus().getFavouritesAddItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.Favourites.Add, sender);
			}
		});
		this.form.getContextMenus().getFavouritesAddNewFolderItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.Favourites.AddNewFolder, sender);
			}
		});
		this.form.getContextMenus().getFavouritesEditFolderItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.Favourites.EditFolder, sender);
			}
		});
		this.form.getContextMenus().getFavouritesRemoveFolderItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.Favourites.RemoveFolder, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbCategoryLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbCategoryLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbCategoryLookupValue();
	}
	private void onlyrTabstabPageSearchActivated()
	{
		this.form.lyrTabs().showtabPageSearch();
		onlyrTabsTabChanged(this.form.lyrTabs().tabPageSearch());
	}
	private void onlyrTabstabPageSelectActivated()
	{
		this.form.lyrTabs().showtabPageSelect();
		onlyrTabsTabChanged(this.form.lyrTabs().tabPageSelect());
	}
	private void onlyrTabstabPageFavouritesActivated()
	{
		this.form.lyrTabs().showtabPageFavourites();
		onlyrTabsTabChanged(this.form.lyrTabs().tabPageFavourites());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}