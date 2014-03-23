/*
 * Copyright (c) 2008, 2009, 2011 Oracle, Inc. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.  The Eclipse Public License is available
 * at http://www.eclipse.org/legal/epl-v10.html and the Eclipse Distribution License
 * is available at http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.greenscape.persistence.criteria;

import org.greenscape.persistence.metamodel.Attribute;

/**
 * Represents a join-fetched association or attribute.
 * 
 * @param <Z>
 *            the source type of the fetch
 * @param <X>
 *            the target type of the fetch
 * @since Java Persistence 2.0
 */
public interface Fetch<Z, X> extends FetchParent<Z, X> {
	/**
	 * Return the metamodel attribute corresponding to the fetch join.
	 * 
	 * @return metamodel attribute for the join
	 */
	Attribute<? super Z, ?> getAttribute();

	/**
	 * Return the parent of the fetched item.
	 * 
	 * @return fetch parent
	 */
	FetchParent<?, Z> getParent();

	/**
	 * Return the join type used in the fetch join.
	 * 
	 * @return join type
	 */
	JoinType getJoinType();
}
