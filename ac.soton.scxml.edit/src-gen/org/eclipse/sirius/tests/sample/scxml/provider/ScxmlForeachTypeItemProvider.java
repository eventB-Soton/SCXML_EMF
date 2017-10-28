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
import org.eclipse.sirius.tests.sample.scxml.ScxmlForeachType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.ScxmlForeachType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlForeachTypeItemProvider 
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
	public ScxmlForeachTypeItemProvider(AdapterFactory adapterFactory) {
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

			addArrayPropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
			addItemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Array feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlForeachType_array_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlForeachType_array_feature", "_UI_ScxmlForeachType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_FOREACH_TYPE__ARRAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlForeachType_index_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlForeachType_index_feature", "_UI_ScxmlForeachType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_FOREACH_TYPE__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlForeachType_item_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlForeachType_item_feature", "_UI_ScxmlForeachType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_FOREACH_TYPE__ITEM,
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
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__ANY_ATTRIBUTE);
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
	 * This returns ScxmlForeachType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScxmlForeachType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScxmlForeachType)object).getArray();
		return label == null || label.length() == 0 ?
			getString("_UI_ScxmlForeachType_type") : //$NON-NLS-1$
			getString("_UI_ScxmlForeachType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ScxmlForeachType.class)) {
			case ScxmlPackage.SCXML_FOREACH_TYPE__ARRAY:
			case ScxmlPackage.SCXML_FOREACH_TYPE__INDEX:
			case ScxmlPackage.SCXML_FOREACH_TYPE__ITEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT:
			case ScxmlPackage.SCXML_FOREACH_TYPE__ANY_ATTRIBUTE:
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
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__RAISE,
					 ScxmlFactory.eINSTANCE.createScxmlRaiseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__IF,
					 ScxmlFactory.eINSTANCE.createScxmlIfType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__FOREACH,
					 ScxmlFactory.eINSTANCE.createScxmlForeachType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SEND,
					 ScxmlFactory.eINSTANCE.createScxmlSendType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCRIPT,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__ASSIGN,
					 ScxmlFactory.eINSTANCE.createScxmlAssignType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__LOG,
					 ScxmlFactory.eINSTANCE.createScxmlLogType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_FOREACH_TYPE__CANCEL,
					 ScxmlFactory.eINSTANCE.createScxmlCancelType())));
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
