/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.afyastat.model;

import java.util.Date;
import java.util.Set;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Location;
import org.openmrs.Provider;
import java.util.UUID;

/**
 */
public class AfyaStatErrorData extends BaseOpenmrsData {
	
	private Integer id;
	
	private String uuid;
	
	private Location location;
	
	private Provider provider;
	
	private String discriminator;
	
	private AfyaDataSource dataSource;
	
	private String payload;
	
	private String formName;
	
	private String patientUuid;
	
	private String clientName;
	
	private String formDataUuid;

	private String message;
	
	private Date dateProcessed;
	
	private Set<ErrorMessagesInfo> errorMessages;
	
	private Long dateFormFilled;
	
	public AfyaStatErrorData() {
		prePersist();
	}

	public AfyaStatErrorData(Location location, Provider provider, String discriminator, AfyaDataSource dataSource,
			String payload, String formName, String patientUuid, String clientName, String formDataUuid, String message,
			Date dateProcessed, Set<ErrorMessagesInfo> errorMessages, Long dateFormFilled) {
		this.location = location;
		this.provider = provider;
		this.discriminator = discriminator;
		this.dataSource = dataSource;
		this.payload = payload;
		this.formName = formName;
		this.patientUuid = patientUuid;
		this.clientName = clientName;
		this.formDataUuid = formDataUuid;
		this.message = message;
		this.dateProcessed = dateProcessed;
		this.errorMessages = errorMessages;
		this.dateFormFilled = dateFormFilled;
	}

	public void prePersist() {
		
		if (null == getUuid())
			setUuid(UUID.randomUUID().toString());
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(final String message) {
		this.message = message;
	}
	
	public Date getDateProcessed() {
		return dateProcessed;
	}
	
	public void setDateProcessed(final Date dateProcessed) {
		this.dateProcessed = dateProcessed;
	}
	
	public Set<ErrorMessagesInfo> getErrorMessages() {
		return errorMessages;
	}
	
	public void setErrorMessages(Set<ErrorMessagesInfo> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	public Long getDateFormFilled() {
		return dateFormFilled;
	}
	
	public void setDateFormFilled(final Long dateFormFilled) {
		this.dateFormFilled = dateFormFilled;
	}
	
		
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Provider getProvider() {
		return provider;
	}
	
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	public String getDiscriminator() {
		return discriminator;
	}
	
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	
	public String getPayload() {
		return payload;
	}
	
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	public AfyaDataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(AfyaDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public String getFormName() {
		return formName;
	}
	
	public void setFormName(String formName) {
		this.formName = formName;
	}
	
	public String getPatientUuid() {
		return patientUuid;
	}
	
	public void setPatientUuid(String patientUuid) {
		this.patientUuid = patientUuid;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getFormDataUuid() {
		return formDataUuid;
	}
	
	public void setFormDataUuid(String formDataUuid) {
		this.formDataUuid = formDataUuid;
	}
}
