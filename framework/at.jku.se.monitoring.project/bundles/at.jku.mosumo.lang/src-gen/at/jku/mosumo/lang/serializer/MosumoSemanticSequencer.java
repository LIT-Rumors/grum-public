/*
 * generated by Xtext 2.23.0
 */
package at.jku.mosumo.lang.serializer;

import Monitoring.ConnectionOptions;
import Monitoring.DerivedProperty;
import Monitoring.MOAgent;
import Monitoring.MOConfig;
import Monitoring.MOProperty;
import Monitoring.MOValue;
import Monitoring.MoSystem;
import Monitoring.MonitoringPackage;
import Monitoring.Server;
import at.jku.mosumo.lang.services.MosumoGrammarAccess;
import com.google.inject.Inject;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MosumoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MosumoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MonitoringPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MonitoringPackage.CONNECTION_OPTIONS:
				sequence_ConnectionOptions(context, (ConnectionOptions) semanticObject); 
				return; 
			case MonitoringPackage.DERIVED_PROPERTY:
				sequence_DerivedProperty(context, (DerivedProperty) semanticObject); 
				return; 
			case MonitoringPackage.MO_AGENT:
				sequence_MOAgent(context, (MOAgent) semanticObject); 
				return; 
			case MonitoringPackage.MO_CONFIG:
				sequence_MOConfig(context, (MOConfig) semanticObject); 
				return; 
			case MonitoringPackage.MO_PROPERTY:
				sequence_MOProperty(context, (MOProperty) semanticObject); 
				return; 
			case MonitoringPackage.MO_VALUE:
				sequence_MOValue(context, (MOValue) semanticObject); 
				return; 
			case MonitoringPackage.MO_SYSTEM:
				sequence_MoSystem(context, (MoSystem) semanticObject); 
				return; 
			case MonitoringPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			}
		else if (epackage == EcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				sequence_EAnnotation(context, (EAnnotation) semanticObject); 
				return; 
			case EcorePackage.EATTRIBUTE:
				sequence_EAttribute(context, (EAttribute) semanticObject); 
				return; 
			case EcorePackage.ECLASS:
				sequence_EClass(context, (EClass) semanticObject); 
				return; 
			case EcorePackage.EDATA_TYPE:
				sequence_EDataType_Impl(context, (EDataType) semanticObject); 
				return; 
			case EcorePackage.EENUM:
				sequence_EEnum(context, (EEnum) semanticObject); 
				return; 
			case EcorePackage.EENUM_LITERAL:
				sequence_EEnumLiteral(context, (EEnumLiteral) semanticObject); 
				return; 
			case EcorePackage.EGENERIC_TYPE:
				sequence_EGenericType(context, (EGenericType) semanticObject); 
				return; 
			case EcorePackage.EOBJECT:
				sequence_EObject(context, (EObject) semanticObject); 
				return; 
			case EcorePackage.EOPERATION:
				sequence_EOperation(context, (EOperation) semanticObject); 
				return; 
			case EcorePackage.EPACKAGE:
				sequence_EPackage(context, (EPackage) semanticObject); 
				return; 
			case EcorePackage.EPARAMETER:
				sequence_EParameter(context, (EParameter) semanticObject); 
				return; 
			case EcorePackage.EREFERENCE:
				sequence_EReference(context, (EReference) semanticObject); 
				return; 
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				sequence_EStringToStringMapEntry(context, (Map.Entry) semanticObject); 
				return; 
			case EcorePackage.ETYPE_PARAMETER:
				sequence_ETypeParameter(context, (ETypeParameter) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ConnectionOptions returns ConnectionOptions
	 *
	 * Constraint:
	 *     (automaticReconnect=EBoolean? cleanSession=EBoolean? connectionTimeOut=EIntegerObject? setMaxInflight=EIntegerObject?)
	 */
	protected void sequence_ConnectionOptions(ISerializationContext context, ConnectionOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DerivedProperty returns DerivedProperty
	 *
	 * Constraint:
	 *     (name=EString topic=EString? sync=EBoolean? eClass=[EClass|EString]?)
	 */
	protected void sequence_DerivedProperty(ISerializationContext context, DerivedProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EAnnotation returns EAnnotation
	 *
	 * Constraint:
	 *     (
	 *         source=EString? 
	 *         (references+=[EObject|EString] references+=[EObject|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (details+=EStringToStringMapEntry details+=EStringToStringMapEntry*)? 
	 *         (contents+=EObject contents+=EObject*)?
	 *     )
	 */
	protected void sequence_EAnnotation(ISerializationContext context, EAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStructuralFeature returns EAttribute
	 *     EAttribute returns EAttribute
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         iD?='iD'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EAttribute(ISerializationContext context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EClass
	 *     EClass returns EClass
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         interface?='interface'? 
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         (eSuperTypes+=[EClass|EString] eSuperTypes+=[EClass|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eOperations+=EOperation eOperations+=EOperation*)? 
	 *         (eStructuralFeatures+=EStructuralFeature eStructuralFeatures+=EStructuralFeature*)? 
	 *         (eGenericSuperTypes+=EGenericType eGenericSuperTypes+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EClass(ISerializationContext context, EClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EDataType
	 *     EDataType_Impl returns EDataType
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)?
	 *     )
	 */
	protected void sequence_EDataType_Impl(ISerializationContext context, EDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EEnumLiteral returns EEnumLiteral
	 *
	 * Constraint:
	 *     (name=EString value=EInt? literal=EString? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EEnumLiteral(ISerializationContext context, EEnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EEnum
	 *     EEnum returns EEnum
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eLiterals+=EEnumLiteral eLiterals+=EEnumLiteral*)?
	 *     )
	 */
	protected void sequence_EEnum(ISerializationContext context, EEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EGenericType returns EGenericType
	 *
	 * Constraint:
	 *     (
	 *         eTypeParameter=[ETypeParameter|EString]? 
	 *         eClassifier=[EClassifier|EString]? 
	 *         eUpperBound=EGenericType? 
	 *         (eTypeArguments+=EGenericType eTypeArguments+=EGenericType*)? 
	 *         eLowerBound=EGenericType?
	 *     )
	 */
	protected void sequence_EGenericType(ISerializationContext context, EGenericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EObject returns EObject
	 *
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(ISerializationContext context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EOperation returns EOperation
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eExceptions+=[EClassifier|EString] eExceptions+=[EClassifier|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eParameters+=EParameter eParameters+=EParameter*)? 
	 *         (eGenericExceptions+=EGenericType eGenericExceptions+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EOperation(ISerializationContext context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EPackage returns EPackage
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         nsURI=EString? 
	 *         nsPrefix=EString? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eClassifiers+=EClassifier eClassifiers+=EClassifier*)? 
	 *         (eSubpackages+=EPackage eSubpackages+=EPackage*)?
	 *     )
	 */
	protected void sequence_EPackage(ISerializationContext context, EPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EParameter returns EParameter
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EParameter(ISerializationContext context, EParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStructuralFeature returns EReference
	 *     EReference returns EReference
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         containment?='containment'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         resolveProxies=EBoolean? 
	 *         eType=[EClassifier|EString]? 
	 *         eOpposite=[EReference|EString]? 
	 *         (eKeys+=[EAttribute|EString] eKeys+=[EAttribute|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EReference(ISerializationContext context, EReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStringToStringMapEntry returns EStringToStringMapEntry
	 *
	 * Constraint:
	 *     (key=EString? value=EString?)
	 */
	protected void sequence_EStringToStringMapEntry(ISerializationContext context, Map.Entry semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypeParameter returns ETypeParameter
	 *
	 * Constraint:
	 *     (name=EString (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (eBounds+=EGenericType eBounds+=EGenericType*)?)
	 */
	protected void sequence_ETypeParameter(ISerializationContext context, ETypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MOAgent returns MOAgent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         topic=EString? 
	 *         sync=EBoolean? 
	 *         eClass=[EClass|EString]? 
	 *         server=[Server|EString]? 
	 *         (elements+=MOElement elements+=MOElement*)? 
	 *         (derivedproperties+=DerivedProperty derivedproperties+=DerivedProperty*)?
	 *     )
	 */
	protected void sequence_MOAgent(ISerializationContext context, MOAgent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MOConfig returns MOConfig
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         namespace=EString? 
	 *         projectName=EString? 
	 *         defaultServer=[Server|EString] 
	 *         ePackage=[EPackage|EString] 
	 *         (servers+=Server servers+=Server*)? 
	 *         system=MoSystem
	 *     )
	 */
	protected void sequence_MOConfig(ISerializationContext context, MOConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MOElement returns MOProperty
	 *     MOProperty returns MOProperty
	 *
	 * Constraint:
	 *     (name=EString topic=EString? sync=EBoolean? eClass=[EClass|EString]? (properties+=MOElement properties+=MOElement*)?)
	 */
	protected void sequence_MOProperty(ISerializationContext context, MOProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MOElement returns MOValue
	 *     MOValue returns MOValue
	 *
	 * Constraint:
	 *     (name=EString topic=EString? sync=EBoolean? eAttribute=[EAttribute|EString]? (properties+=MOElement properties+=MOElement*)?)
	 */
	protected void sequence_MOValue(ISerializationContext context, MOValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MoSystem returns MoSystem
	 *
	 * Constraint:
	 *     (eClass=[EClass|EString]? (agents+=MOAgent agents+=MOAgent*)?)
	 */
	protected void sequence_MoSystem(ISerializationContext context, MoSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Server returns Server
	 *
	 * Constraint:
	 *     (name=EString connectionURL=EString? connectionOptions=ConnectionOptions?)
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}