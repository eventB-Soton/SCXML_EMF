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

import org.eclipse.emf.ecore.util.FeatureMap;
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
import org.eclipse.sirius.tests.sample.scxml.ScxmlIfType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.ScxmlIfType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlIfTypeItemProvider 
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
	public ScxmlIfTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCondPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cond feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlIfType_cond_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlIfType_cond_feature", "_UI_ScxmlIfType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_IF_TYPE__COND,
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
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__ELSEIF);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__ELSE);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_IF_TYPE__ANY_ATTRIBUTE);
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
	 * This returns ScxmlIfType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScxmlIfType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScxmlIfType)object).getCond();
		return label == null || label.length() == 0 ?
			getString("_UI_ScxmlIfType_type") : //$NON-NLS-1$
			getString("_UI_ScxmlIfType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ScxmlIfType.class)) {
			case ScxmlPackage.SCXML_IF_TYPE__COND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT:
			case ScxmlPackage.SCXML_IF_TYPE__ELSEIF:
			case ScxmlPackage.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1:
			case ScxmlPackage.SCXML_IF_TYPE__ELSE:
			case ScxmlPackage.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2:
			case ScxmlPackage.SCXML_IF_TYPE__ANY_ATTRIBUTE:
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
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE,
					 ScxmlFactory.eINSTANCE.createScxmlRaiseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__IF,
					 ScxmlFactory.eINSTANCE.createScxmlIfType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH,
					 ScxmlFactory.eINSTANCE.createScxmlForeachType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SEND,
					 ScxmlFactory.eINSTANCE.createScxmlSendType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN,
					 ScxmlFactory.eINSTANCE.createScxmlAssignType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__LOG,
					 ScxmlFactory.eINSTANCE.createScxmlLogType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL,
					 ScxmlFactory.eINSTANCE.createScxmlCancelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__ELSEIF,
				 ScxmlFactory.eINSTANCE.createScxmlElseifType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE1,
					 ScxmlFactory.eINSTANCE.createScxmlRaiseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__IF1,
					 ScxmlFactory.eINSTANCE.createScxmlIfType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH1,
					 ScxmlFactory.eINSTANCE.createScxmlForeachType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SEND1,
					 ScxmlFactory.eINSTANCE.createScxmlSendType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT1,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN1,
					 ScxmlFactory.eINSTANCE.createScxmlAssignType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__LOG1,
					 ScxmlFactory.eINSTANCE.createScxmlLogType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT1,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL1,
					 ScxmlFactory.eINSTANCE.createScxmlCancelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__ELSE,
				 ScxmlFactory.eINSTANCE.createScxmlElseType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE2,
					 ScxmlFactory.eINSTANCE.createScxmlRaiseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__IF2,
					 ScxmlFactory.eINSTANCE.createScxmlIfType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH2,
					 ScxmlFactory.eINSTANCE.createScxmlForeachType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SEND2,
					 ScxmlFactory.eINSTANCE.createScxmlSendType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT2,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN2,
					 ScxmlFactory.eINSTANCE.createScxmlAssignType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__LOG2,
					 ScxmlFactory.eINSTANCE.createScxmlLogType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_IF_TYPE__SCXML_CORE_EXECUTABLECONTENT2,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL2,
					 ScxmlFactory.eINSTANCE.createScxmlCancelType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__RAISE2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__IF ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__IF1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__IF2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__FOREACH2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SEND ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SEND1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SEND2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__SCRIPT2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__ASSIGN2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__LOG ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__LOG1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__LOG2 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL1 ||
			childFeature == ScxmlPackage.Literals.SCXML_IF_TYPE__CANCEL2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
