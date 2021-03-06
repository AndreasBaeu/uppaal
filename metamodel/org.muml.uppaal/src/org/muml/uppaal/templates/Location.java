/**
 */
package org.muml.uppaal.templates;

import org.muml.uppaal.core.CommentableElement;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.visuals.ColoredElement;
import org.muml.uppaal.visuals.PlanarElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location inside a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.templates.Location#getParentTemplate <em>Parent Template</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Location#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.muml.uppaal.templates.Location#getLocationTimeKind <em>Location Time Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.templates.TemplatesPackage#getLocation()
 * @model extendedMetaData="name='Location' kind='empty'"
 * @generated
 */
public interface Location extends NamedElement, CommentableElement, PlanarElement, ColoredElement {
	/**
	 * Returns the value of the '<em><b>Parent Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.uppaal.templates.Template#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent template containing the location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Template</em>' container reference.
	 * @see #setParentTemplate(Template)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getLocation_ParentTemplate()
	 * @see org.muml.uppaal.templates.Template#getLocation
	 * @model opposite="location" required="true" transient="false"
	 * @generated
	 */
	Template getParentTemplate();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Location#getParentTemplate <em>Parent Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Template</em>' container reference.
	 * @see #getParentTemplate()
	 * @generated
	 */
	void setParentTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean expression representing the location's invariant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(Expression)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getLocation_Invariant()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInvariant();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Location#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Expression value);

	/**
	 * Returns the value of the '<em><b>Location Time Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.templates.LocationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of location (default, urgent, or committed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Time Kind</em>' attribute.
	 * @see org.muml.uppaal.templates.LocationKind
	 * @see #setLocationTimeKind(LocationKind)
	 * @see org.muml.uppaal.templates.TemplatesPackage#getLocation_LocationTimeKind()
	 * @model required="true"
	 * @generated
	 */
	LocationKind getLocationTimeKind();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.templates.Location#getLocationTimeKind <em>Location Time Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Time Kind</em>' attribute.
	 * @see org.muml.uppaal.templates.LocationKind
	 * @see #getLocationTimeKind()
	 * @generated
	 */
	void setLocationTimeKind(LocationKind value);

} // Location
