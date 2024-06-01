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

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a way to manage externally installed
 */
@ProviderType
public interface ExternalMavenRuntimeManager {

	/**
	 * 
	 * @return a stream of all external runtimes managed by this manager
	 */
	Stream<ExternalMavenRuntime> runtimes();

	/**
	 * Creates a new {@link ExternalMavenRuntime} located at the given path
	 * 
	 * @param path the path where the runtime is located
	 * @return the created runtime
	 * @throws IOException if creation of the runtime failed, this might include
	 *                     that it does not exits or can not be handled by this
	 *                     manager
	 */
	ExternalMavenRuntime create(Path path) throws IOException;

}
