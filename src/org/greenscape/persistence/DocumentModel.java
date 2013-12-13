package org.greenscape.persistence;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Sheikh Sajid
 * 
 */
public interface DocumentModel {
	/**
	 * Name of the identifier property
	 */
	String ID = "id";

	/**
	 * Gets the ID of the model row
	 * 
	 * @return the ID of the model row
	 */
	Object getId();

	/**
	 * Sets the row ID of the model
	 * 
	 * @param id
	 *            the ID to set
	 * @return the model for fluent interface
	 */
	DocumentModel setId(Object id);

	/**
	 * Gets the value of the property given by name
	 * 
	 * @param name
	 *            the property's name
	 * @return the value of the property
	 */
	Object getProperty(String name);

	/**
	 * Sets the value of the property in this entity given by name
	 * 
	 * @param name
	 *            the property's name
	 * @param value
	 *            the value to set for the property
	 * @return the entity object itself for method chaining
	 */
	DocumentModel setProperty(String name, Object value);

	/**
	 * Gets the number of properties in this entity
	 * 
	 * @return the number of properties
	 */
	int getPropertySize();

	/**
	 * Gets all the properties as a Key-Value pair
	 * 
	 * @return the map of properties
	 */
	Map<String, Object> getProperties();

	/**
	 * Gets all the property names in this entity
	 * 
	 * @return the set of property names
	 */
	Set<String> getPropertyNames();

	/**
	 * Gets all the property values in this entity
	 * 
	 * @return the collection of property values
	 */
	Collection<Object> getPropertyValues();

}