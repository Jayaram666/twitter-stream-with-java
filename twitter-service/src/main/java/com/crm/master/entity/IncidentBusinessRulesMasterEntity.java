package com.crm.master.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "crm_incident_state_master")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class IncidentBusinessRulesMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long incidentBusinessId;// -Long
	private Long incidentBusinessRulesVersion;// - Long
	private Long incidentBusinessRulesType;// -Long
	/* IncidentBusinessRulesObject-JsonB ..ex: below */
	/*
	 * CreatedDate-Epoc UpdatedDate-Epoc
	 */
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public Long getIncidentBusinessId() {
		return incidentBusinessId;
	}

	public void setIncidentBusinessId(Long incidentBusinessId) {
		this.incidentBusinessId = incidentBusinessId;
	}

	public Long getIncidentBusinessRulesVersion() {
		return incidentBusinessRulesVersion;
	}

	public void setIncidentBusinessRulesVersion(Long incidentBusinessRulesVersion) {
		this.incidentBusinessRulesVersion = incidentBusinessRulesVersion;
	}

	public Long getIncidentBusinessRulesType() {
		return incidentBusinessRulesType;
	}

	public void setIncidentBusinessRulesType(Long incidentBusinessRulesType) {
		this.incidentBusinessRulesType = incidentBusinessRulesType;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
