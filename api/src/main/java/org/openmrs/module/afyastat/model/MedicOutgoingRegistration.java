package org.openmrs.module.afyastat.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.BaseOpenmrsObject;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "afyastat.MedicOutgoingRegistration")
@Table(name = "afyastat_medicoutgoingregistration")
public class MedicOutgoingRegistration extends BaseOpenmrsData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "patient_id")
	private Integer patient_id;
	
	@Column(name = "cht_ref")
	private String cht_ref;
	
	@Column(name = "kemr_ref")
	private String kemr_ref;
	
	@Column(name = "purpose")
	private String purpose;
	
	@Column(name = "payload")
	private String payload;
	
	@Column(name = "status")
	private Integer status;
	
	/**
	 * @return id - The unique Identifier for the object
	 */
	@Override
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id - The unique Identifier for the object
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getPatient_id() {
		return patient_id;
	}
	
	public void setPatient_id(Integer patient_id) {
		this.patient_id = patient_id;
	}
	
	public String getCht_ref() {
		return cht_ref;
	}
	
	public void setCht_ref(String cht_ref) {
		this.cht_ref = cht_ref;
	}
	
	public String getKemr_ref() {
		return kemr_ref;
	}
	
	public void setKemr_ref(String kemr_ref) {
		this.kemr_ref = kemr_ref;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getPayload() {
		return payload;
	}
	
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
}
