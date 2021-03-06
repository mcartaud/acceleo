/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.compatibility.tests.unit.parser;

import junit.framework.TestCase;

import org.eclipse.acceleo.internal.compatibility.parser.mt.common.TemplateConstants;

public abstract class AbstractAcceleoTest extends TestCase {
	/**
	 * {@inheritDoc}
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	public void setUp() throws Exception {
		TemplateConstants.getDefault().initConstants();
	}
}
