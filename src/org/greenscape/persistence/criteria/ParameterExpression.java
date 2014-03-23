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

import org.greenscape.persistence.Parameter;

/**
 * Type of criteria query parameter expressions.
 * 
 * @param <T>
 *            the type of the parameter expression
 * 
 * @since Java Persistence 2.0
 */
public interface ParameterExpression<T> extends Parameter<T>, Expression<T> {
}
