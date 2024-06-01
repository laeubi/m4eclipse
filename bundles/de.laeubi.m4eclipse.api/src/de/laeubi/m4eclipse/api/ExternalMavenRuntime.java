/*******************************************************************************
 * Copyright (c) 2024 Christoph Läubrich
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Christoph Läubrich - initial API and implementation
 *******************************************************************************/
package de.laeubi.m4eclipse.api;

import java.nio.file.Path;

import org.osgi.annotation.versioning.ProviderType;

/**
 * An {@link ExternalMavenRuntime} is one that is located as a path in a file
 * system usually installed or downloaded by the user into the system.
 */
@ProviderType
public interface ExternalMavenRuntime extends MavenRuntime {

	/**
	 * 
	 * @return the path where this maven runtime is located
	 */
	Path getPath();
}
