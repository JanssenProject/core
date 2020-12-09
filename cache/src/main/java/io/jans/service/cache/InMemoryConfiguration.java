/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.service.cache;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * @author yuriyz on 02/21/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InMemoryConfiguration implements Serializable {

    private static final long serialVersionUID = 7544731515017051209L;

    @XmlElement(name = "defaultPutExpiration")
    private int defaultPutExpiration = 60; // in seconds

    public int getDefaultPutExpiration() {
        return defaultPutExpiration;
    }

    public void setDefaultPutExpiration(int defaultPutExpiration) {
        this.defaultPutExpiration = defaultPutExpiration;
    }

    @Override
    public String toString() {
        return "InMemoryConfiguration{" + "defaultPutExpiration=" + defaultPutExpiration + '}';
    }
}