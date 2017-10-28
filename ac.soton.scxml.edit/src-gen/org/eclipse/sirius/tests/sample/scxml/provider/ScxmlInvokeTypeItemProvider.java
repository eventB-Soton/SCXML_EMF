/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package org.eclipse.sirius.tests.sample.scxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.tests.sample.scxml.ScxmlFactory;
import org.eclipse.sirius.tests.sample.scxml.ScxmlInvokeType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.ScxmlInvokeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlInvokeTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScxmlInvokeTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAutoforwardPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addIdlocationPropertyDescriptor(object);
			addNamelistPropertyDescriptor(object);
			addSrcPropertyDescriptor(object);
			addSrcexprPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addTypeexprPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Autoforward feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoforwardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_autoforward_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_autoforward_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__AUTOFORWARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_id_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Idlocation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdlocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_idlocation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_idlocation_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__IDLOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namelist feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamelistPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_namelist_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_namelist_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__NAMELIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Src feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_src_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_src_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SRC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Srcexpr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcexprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_srcexpr_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_srcexpr_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SRCEXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_type_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typeexpr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeexprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlInvokeType_typeexpr_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlInvokeType_typeexpr_feature", "_UI_ScxmlInvokeType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_INVOKE_TYPE__TYPEEXPR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SCXML_INVOKE_MIX);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__ANY_ATTRIBUTE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ScxmlInvokeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScxmlInvokeType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScxmlInvokeType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ScxmlInvokeType_type") : //$NON-NLS-1$
			getString("_UI_ScxmlInvokeType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScxmlInvokeType.class)) {
			case ScxmlPackage.SCXML_INVOKE_TYPE__AUTOFORWARD:
			case ScxmlPackage.SCXML_INVOKE_TYPE__ID:
			case ScxmlPackage.SCXML_INVOKE_TYPE__IDLOCATION:
			case ScxmlPackage.SCXML_INVOKE_TYPE__NAMELIST:
			case ScxmlPackage.SCXML_INVOKE_TYPE__SRC:
			case ScxmlPackage.SCXML_INVOKE_TYPE__SRCEXPR:
			case ScxmlPackage.SCXML_INVOKE_TYPE__TYPE:
			case ScxmlPackage.SCXML_INVOKE_TYPE__TYPEEXPR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SCXML_INVOKE_TYPE__SCXML_INVOKE_MIX:
			case ScxmlPackage.SCXML_INVOKE_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SCXML_INVOKE_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__CONTENT,
					 ScxmlFactory.eINSTANCE.createScxmlContentType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SCXML_INVOKE_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__PARAM,
					 ScxmlFactory.eINSTANCE.createScxmlParamType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__SCXML_INVOKE_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_INVOKE_TYPE__FINALIZE,
					 ScxmlFactory.eINSTANCE.createScxmlFinalizeType())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScxmlEditPlugin.INSTANCE;
	}

}
