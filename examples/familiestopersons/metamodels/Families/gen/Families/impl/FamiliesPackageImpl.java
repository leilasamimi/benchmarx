/**
 */
package Families.impl;

import Families.FamiliesFactory;
import Families.FamiliesPackage;
import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamiliesPackageImpl extends EPackageImpl implements FamiliesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Families.FamiliesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FamiliesPackageImpl() {
		super(eNS_URI, FamiliesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FamiliesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FamiliesPackage init() {
		if (isInited)
			return (FamiliesPackage) EPackage.Registry.INSTANCE.getEPackage(FamiliesPackage.eNS_URI);

		// Obtain or create and register package
		FamiliesPackageImpl theFamiliesPackage = (FamiliesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FamiliesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FamiliesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFamiliesPackage.createPackageContents();

		// Initialize created meta-data
		theFamiliesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFamiliesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FamiliesPackage.eNS_URI, theFamiliesPackage);
		return theFamiliesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyRegister() {
		return familyRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyRegister_Families() {
		return (EReference) familyRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Father() {
		return (EReference) familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Mother() {
		return (EReference) familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Sons() {
		return (EReference) familyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Daughters() {
		return (EReference) familyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamily_Name() {
		return (EAttribute) familyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_FamiliesInverse() {
		return (EReference) familyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMember() {
		return familyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamilyMember_Name() {
		return (EAttribute) familyMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_FatherInverse() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_MotherInverse() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_SonsInverse() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMember_DaughtersInverse() {
		return (EReference) familyMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesFactory getFamiliesFactory() {
		return (FamiliesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		familyRegisterEClass = createEClass(FAMILY_REGISTER);
		createEReference(familyRegisterEClass, FAMILY_REGISTER__FAMILIES);

		familyEClass = createEClass(FAMILY);
		createEReference(familyEClass, FAMILY__FATHER);
		createEReference(familyEClass, FAMILY__MOTHER);
		createEReference(familyEClass, FAMILY__SONS);
		createEReference(familyEClass, FAMILY__DAUGHTERS);
		createEAttribute(familyEClass, FAMILY__NAME);
		createEReference(familyEClass, FAMILY__FAMILIES_INVERSE);

		familyMemberEClass = createEClass(FAMILY_MEMBER);
		createEAttribute(familyMemberEClass, FAMILY_MEMBER__NAME);
		createEReference(familyMemberEClass, FAMILY_MEMBER__FATHER_INVERSE);
		createEReference(familyMemberEClass, FAMILY_MEMBER__MOTHER_INVERSE);
		createEReference(familyMemberEClass, FAMILY_MEMBER__SONS_INVERSE);
		createEReference(familyMemberEClass, FAMILY_MEMBER__DAUGHTERS_INVERSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(familyRegisterEClass, FamilyRegister.class, "FamilyRegister", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamilyRegister_Families(), this.getFamily(), this.getFamily_FamiliesInverse(), "families",
				null, 0, -1, FamilyRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamily_Father(), this.getFamilyMember(), this.getFamilyMember_FatherInverse(), "father", null,
				0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Mother(), this.getFamilyMember(), this.getFamilyMember_MotherInverse(), "mother", null,
				0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Sons(), this.getFamilyMember(), this.getFamilyMember_SonsInverse(), "sons", null, 0,
				-1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Daughters(), this.getFamilyMember(), this.getFamilyMember_DaughtersInverse(),
				"daughters", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFamily_Name(), ecorePackage.getEString(), "name", null, 0, 1, Family.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_FamiliesInverse(), this.getFamilyRegister(), this.getFamilyRegister_Families(),
				"familiesInverse", null, 0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyMemberEClass, FamilyMember.class, "FamilyMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamilyMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, FamilyMember.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_FatherInverse(), this.getFamily(), this.getFamily_Father(), "fatherInverse",
				null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_MotherInverse(), this.getFamily(), this.getFamily_Mother(), "motherInverse",
				null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_SonsInverse(), this.getFamily(), this.getFamily_Sons(), "sonsInverse", null, 0,
				1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyMember_DaughtersInverse(), this.getFamily(), this.getFamily_Daughters(),
				"daughtersInverse", null, 0, 1, FamilyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FamiliesPackageImpl
