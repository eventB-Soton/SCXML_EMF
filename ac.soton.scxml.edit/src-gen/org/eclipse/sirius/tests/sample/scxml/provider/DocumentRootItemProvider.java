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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.tests.sample.scxml.DocumentRoot;
import org.eclipse.sirius.tests.sample.scxml.ScxmlFactory;
import org.eclipse.sirius.tests.sample.scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.tests.sample.scxml.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__ASSIGN);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__CANCEL);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__CONTENT);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__DATA);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__DATAMODEL);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__DONEDATA);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSE);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSEIF);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__FINAL);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__FINALIZE);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__FOREACH);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__HISTORY);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__IF);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__INITIAL);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__INVOKE);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__LOG);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__ONENTRY);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__ONEXIT);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__PARALLEL);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__PARAM);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__RAISE);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__SCRIPT);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__SCXML);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__SEND);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__STATE);
			childrenFeatures.add(ScxmlPackage.Literals.DOCUMENT_ROOT__TRANSITION);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case ScxmlPackage.DOCUMENT_ROOT__ASSIGN:
			case ScxmlPackage.DOCUMENT_ROOT__CANCEL:
			case ScxmlPackage.DOCUMENT_ROOT__CONTENT:
			case ScxmlPackage.DOCUMENT_ROOT__DATA:
			case ScxmlPackage.DOCUMENT_ROOT__DATAMODEL:
			case ScxmlPackage.DOCUMENT_ROOT__DONEDATA:
			case ScxmlPackage.DOCUMENT_ROOT__ELSE:
			case ScxmlPackage.DOCUMENT_ROOT__ELSEIF:
			case ScxmlPackage.DOCUMENT_ROOT__FINAL:
			case ScxmlPackage.DOCUMENT_ROOT__FINALIZE:
			case ScxmlPackage.DOCUMENT_ROOT__FOREACH:
			case ScxmlPackage.DOCUMENT_ROOT__HISTORY:
			case ScxmlPackage.DOCUMENT_ROOT__IF:
			case ScxmlPackage.DOCUMENT_ROOT__INITIAL:
			case ScxmlPackage.DOCUMENT_ROOT__INVOKE:
			case ScxmlPackage.DOCUMENT_ROOT__LOG:
			case ScxmlPackage.DOCUMENT_ROOT__ONENTRY:
			case ScxmlPackage.DOCUMENT_ROOT__ONEXIT:
			case ScxmlPackage.DOCUMENT_ROOT__PARALLEL:
			case ScxmlPackage.DOCUMENT_ROOT__PARAM:
			case ScxmlPackage.DOCUMENT_ROOT__RAISE:
			case ScxmlPackage.DOCUMENT_ROOT__SCRIPT:
			case ScxmlPackage.DOCUMENT_ROOT__SCXML:
			case ScxmlPackage.DOCUMENT_ROOT__SEND:
			case ScxmlPackage.DOCUMENT_ROOT__STATE:
			case ScxmlPackage.DOCUMENT_ROOT__TRANSITION:
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
				(ScxmlPackage.Literals.DOCUMENT_ROOT__ASSIGN,
				 ScxmlFactory.eINSTANCE.createScxmlAssignType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__CANCEL,
				 ScxmlFactory.eINSTANCE.createScxmlCancelType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__CONTENT,
				 ScxmlFactory.eINSTANCE.createScxmlContentType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__DATA,
				 ScxmlFactory.eINSTANCE.createScxmlDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__DATAMODEL,
				 ScxmlFactory.eINSTANCE.createScxmlDatamodelType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__DONEDATA,
				 ScxmlFactory.eINSTANCE.createScxmlDonedataType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSE,
				 ScxmlFactory.eINSTANCE.createScxmlElseType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__ELSEIF,
				 ScxmlFactory.eINSTANCE.createScxmlElseifType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__FINAL,
				 ScxmlFactory.eINSTANCE.createScxmlFinalType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__FINALIZE,
				 ScxmlFactory.eINSTANCE.createScxmlFinalizeType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__FOREACH,
				 ScxmlFactory.eINSTANCE.createScxmlForeachType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__HISTORY,
				 ScxmlFactory.eINSTANCE.createScxmlHistoryType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__IF,
				 ScxmlFactory.eINSTANCE.createScxmlIfType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__INITIAL,
				 ScxmlFactory.eINSTANCE.createScxmlInitialType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__INVOKE,
				 ScxmlFactory.eINSTANCE.createScxmlInvokeType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__LOG,
				 ScxmlFactory.eINSTANCE.createScxmlLogType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__ONENTRY,
				 ScxmlFactory.eINSTANCE.createScxmlOnentryType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__ONEXIT,
				 ScxmlFactory.eINSTANCE.createScxmlOnexitType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__PARALLEL,
				 ScxmlFactory.eINSTANCE.createScxmlParallelType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__PARAM,
				 ScxmlFactory.eINSTANCE.createScxmlParamType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__RAISE,
				 ScxmlFactory.eINSTANCE.createScxmlRaiseType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__SCRIPT,
				 ScxmlFactory.eINSTANCE.createScxmlScriptType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__SCXML,
				 ScxmlFactory.eINSTANCE.createScxmlScxmlType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__SEND,
				 ScxmlFactory.eINSTANCE.createScxmlSendType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__STATE,
				 ScxmlFactory.eINSTANCE.createScxmlStateType()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.DOCUMENT_ROOT__TRANSITION,
				 ScxmlFactory.eINSTANCE.createScxmlTransitionType()));
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
