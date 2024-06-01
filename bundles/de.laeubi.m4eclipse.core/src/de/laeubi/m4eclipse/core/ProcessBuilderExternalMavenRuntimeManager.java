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
package de.laeubi.m4eclipse.core;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.osgi.service.component.annotations.Component;

import de.laeubi.m4eclipse.api.ExternalMavenRuntime;
import de.laeubi.m4eclipse.api.ExternalMavenRuntimeManager;

/**
 * provides {@link ExternalMavenRuntime}s by mean of {@link ProcessBuilder}
 * executions
 */
@Component(service = ExternalMavenRuntimeManager.class, immediate = true)
public class ProcessBuilderExternalMavenRuntimeManager implements ExternalMavenRuntimeManager {

	@Override
	public Stream<ExternalMavenRuntime> runtimes() {
		return Stream.empty();
	}

	@Override
	public ExternalMavenRuntime create(Path path) throws IOException {
		throw new IOException("Not implemented yet");
	}

}
