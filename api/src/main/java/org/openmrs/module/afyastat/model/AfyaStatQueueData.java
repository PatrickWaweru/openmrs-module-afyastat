package org.openmrs.module.afyastat.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Location;
import org.openmrs.Provider;

import java.util.UUID;

public class AfyaStatQueueData extends BaseOpenmrsData {
	
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
	
	private Long dateFormFilled;
	
	public AfyaStatQueueData() {
		prePersist();
	}
	
	public AfyaStatQueueData(String discriminator, String payload, String formName, String patientUuid, String formDataUuid,
	    AfyaDataSource dataSource, Location location, Provider provider, Long dateFormFilled) {
		this.location = location;
		this.discriminator = discriminator;
		this.dataSource = dataSource;
		this.payload = payload;
		this.provider = provider;
		this.formName = formName;
		this.patientUuid = patientUuid;
		this.formDataUuid = formDataUuid;
		this.dateFormFilled = dateFormFilled;
	}
	
	public AfyaStatQueueData(String discriminator, String payload, String formName, String patientUuid, String clientName,
	    String formDataUuid, AfyaDataSource dataSource, Location location, Provider provider) {
		this.location = location;
		this.discriminator = discriminator;
		this.dataSource = dataSource;
		this.payload = payload;
		this.provider = provider;
		this.formName = formName;
		this.patientUuid = patientUuid;
		this.clientName = clientName;
		this.formDataUuid = formDataUuid;
	}
	
	public void prePersist() {
		
		if (null == getUuid())
			setUuid(UUID.randomUUID().toString());
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
	
	public Long getDateFormFilled() {
		return dateFormFilled;
	}
	
	public void setDateFormFilled(Long dateFormFilled) {
		this.dateFormFilled = dateFormFilled;
	}
	
}
