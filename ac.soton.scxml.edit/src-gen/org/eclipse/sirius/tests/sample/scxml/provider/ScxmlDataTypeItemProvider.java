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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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

import org.eclipse.sirius.tests.sample.scxml.ScxmlDataType;
import org.eclipse.sirius.tests.sample.scxml.ScxmlFactory;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.ScxmlDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScxmlDataTypeItemProvider 
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
	public ScxmlDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addExprPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addSrcPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Expr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExprPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScxmlDataType_expr_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlDataType_expr_feature", "_UI_ScxmlDataType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_DATA_TYPE__EXPR,
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
				 getString("_UI_ScxmlDataType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlDataType_id_feature", "_UI_ScxmlDataType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_DATA_TYPE__ID,
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
				 getString("_UI_ScxmlDataType_src_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ScxmlDataType_src_feature", "_UI_ScxmlDataType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ScxmlPackage.Literals.SCXML_DATA_TYPE__SRC,
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
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED);
			childrenFeatures.add(ScxmlPackage.Literals.SCXML_DATA_TYPE__ANY_ATTRIBUTE);
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
	 * This returns ScxmlDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScxmlDataType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScxmlDataType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ScxmlDataType_type") : //$NON-NLS-1$
			getString("_UI_ScxmlDataType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ScxmlDataType.class)) {
			case ScxmlPackage.SCXML_DATA_TYPE__EXPR:
			case ScxmlPackage.SCXML_DATA_TYPE__ID:
			case ScxmlPackage.SCXML_DATA_TYPE__SRC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SCXML_DATA_TYPE__MIXED:
			case ScxmlPackage.SCXML_DATA_TYPE__ANY_ATTRIBUTE:
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
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__ASSIGN,
					 ScxmlFactory.eINSTANCE.createScxmlAssignType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__CANCEL,
					 ScxmlFactory.eINSTANCE.createScxmlCancelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__CONTENT,
					 ScxmlFactory.eINSTANCE.createScxmlContentType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__DATA,
					 ScxmlFactory.eINSTANCE.createScxmlDataType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__DATAMODEL,
					 ScxmlFactory.eINSTANCE.createScxmlDatamodelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__DONEDATA,
					 ScxmlFactory.eINSTANCE.createScxmlDonedataType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSE,
					 ScxmlFactory.eINSTANCE.createScxmlElseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSEIF,
					 ScxmlFactory.eINSTANCE.createScxmlElseifType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__FINAL,
					 ScxmlFactory.eINSTANCE.createScxmlFinalType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__FINALIZE,
					 ScxmlFactory.eINSTANCE.createScxmlFinalizeType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__FOREACH,
					 ScxmlFactory.eINSTANCE.createScxmlForeachType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__HISTORY,
					 ScxmlFactory.eINSTANCE.createScxmlHistoryType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__IF,
					 ScxmlFactory.eINSTANCE.createScxmlIfType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__INITIAL,
					 ScxmlFactory.eINSTANCE.createScxmlInitialType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__INVOKE,
					 ScxmlFactory.eINSTANCE.createScxmlInvokeType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__LOG,
					 ScxmlFactory.eINSTANCE.createScxmlLogType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__ONENTRY,
					 ScxmlFactory.eINSTANCE.createScxmlOnentryType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__ONEXIT,
					 ScxmlFactory.eINSTANCE.createScxmlOnexitType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__PARALLEL,
					 ScxmlFactory.eINSTANCE.createScxmlParallelType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__PARAM,
					 ScxmlFactory.eINSTANCE.createScxmlParamType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__RAISE,
					 ScxmlFactory.eINSTANCE.createScxmlRaiseType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__SCRIPT,
					 ScxmlFactory.eINSTANCE.createScxmlScriptType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__SCXML,
					 ScxmlFactory.eINSTANCE.createScxmlScxmlType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__SEND,
					 ScxmlFactory.eINSTANCE.createScxmlSendType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__STATE,
					 ScxmlFactory.eINSTANCE.createScxmlStateType())));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SCXML_DATA_TYPE__MIXED,
				 FeatureMapUtil.createEntry
					(ScxmlPackage.Literals.DOCUMENT_ROOT__TRANSITION,
					 ScxmlFactory.eINSTANCE.createScxmlTransitionType())));
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
