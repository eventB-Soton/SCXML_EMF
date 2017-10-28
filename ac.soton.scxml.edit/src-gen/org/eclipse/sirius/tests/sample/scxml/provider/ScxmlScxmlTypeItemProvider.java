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
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;
import org.eclipse.sirius.tests.sample.scxml.ScxmlScxmlType;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.ScxmlScxmlType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlScxmlTypeItemProvider 
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
	public ScxmlScxmlTypeItemProvider(AdapterFactory adapterFactory) {
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

			addBindingPropertyDescriptor(object);
			addDatamodel1PropertyDescriptor(object);
			addExmodePropertyDescriptor(object);
			addInitialPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Binding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_binding_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_binding_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__BINDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datamodel1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatamodel1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_datamodel1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_datamodel1_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__DATAMODEL1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exmode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExmodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_exmode_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_exmode_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__EXMODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_initial_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_initial_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__INITIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_name_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlScxmlType_version_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlScxmlType_version_feature", "_UI_ScxmlScxmlType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_SCXML_TYPE__VERSION,
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
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_SCXML_TYPE__ANY_ATTRIBUTE);
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
	 * This returns ScxmlScxmlType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScxmlScxmlType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScxmlScxmlType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScxmlScxmlType_type") : //$NON-NLS-1$
			getString("_UI_ScxmlScxmlType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ScxmlScxmlType.class)) {
			case ScxmlPackage.SCXML_SCXML_TYPE__BINDING:
			case ScxmlPackage.SCXML_SCXML_TYPE__DATAMODEL1:
			case ScxmlPackage.SCXML_SCXML_TYPE__EXMODE:
			case ScxmlPackage.SCXML_SCXML_TYPE__INITIAL:
			case ScxmlPackage.SCXML_SCXML_TYPE__NAME:
			case ScxmlPackage.SCXML_SCXML_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SCXML_SCXML_TYPE__SCXML_SCXML_MIX:
			case ScxmlPackage.SCXML_SCXML_TYPE__ANY_ATTRIBUTE:
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
				(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_SCXML_TYPE__STATE,
					 ScxmlFactory.eINSTANCE.createScxmlStateType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_SCXML_TYPE__PARALLEL,
					 ScxmlFactory.eINSTANCE.createScxmlParallelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_SCXML_TYPE__FINAL,
					 ScxmlFactory.eINSTANCE.createScxmlFinalType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_SCXML_TYPE__DATAMODEL,
					 ScxmlFactory.eINSTANCE.createScxmlDatamodelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCXML_SCXML_MIX,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_SCXML_TYPE__SCRIPT,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));
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
