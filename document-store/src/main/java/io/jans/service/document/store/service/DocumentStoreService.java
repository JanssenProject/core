/*
 * Janssen Project software is available under the Apache License (2004). See http://www.apache.org/licenses/ for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.service.document.store.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.jans.service.document.store.provider.DocumentStoreProvider;

/**
 * @author Yuriy Movchan on 04/10/2020
 */
@ApplicationScoped
public class DocumentStoreService extends BaseDocumentStoreService {

    @Inject
    private DocumentStoreProvider documentStoreProvider;

	@Override
	protected DocumentStoreProvider getDocumentStoreProvider() {
		return documentStoreProvider;
	}

}
