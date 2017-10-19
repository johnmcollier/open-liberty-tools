/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.etools.maven.liberty.integration.ui.rtexplorer.internal;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;

import com.ibm.etools.maven.liberty.integration.ui.actions.internal.GenerationAction;
import com.ibm.etools.maven.liberty.integration.ui.actions.internal.RefreshAction;
import com.ibm.ws.st.liberty.buildplugin.integration.ui.rtexplorer.internal.AbstractBuildPluginRuntimeActionProvider;

public class MavenRuntimeActionProvider extends AbstractBuildPluginRuntimeActionProvider {

    @Override
    public void init(ICommonActionExtensionSite aSite) {
        super.init(aSite);

        ISelectionProvider selProvider = aSite.getStructuredViewer();
        StructuredViewer viewer = aSite.getStructuredViewer();

        refreshAction = new RefreshAction(selProvider, viewer);

        generationAction = new GenerationAction(selProvider, viewer);

    }
}
