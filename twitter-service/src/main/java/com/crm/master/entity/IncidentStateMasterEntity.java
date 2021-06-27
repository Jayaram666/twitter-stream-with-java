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
public class IncidentStateMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incidentStateId;
	private String incidentStateDesc;
	private Integer incidentStateTypeId;
	/*
	 * Private Integer IncidentNextStateId - JSONB (List of IncidentStateTypeId-int)
	 */
	private String incidentLifeCycleType; // - String (Sales, PostSales)
	private Boolean isEndState;// ex. DecisiveStage
	/* IncidentLifeCycleStages- JsonB */
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public Integer getIncidentStateId() {
		return incidentStateId;
	}

	public void setIncidentStateId(Integer incidentStateId) {
		this.incidentStateId = incidentStateId;
	}

	public String getIncidentStateDesc() {
		return incidentStateDesc;
	}

	public void setIncidentStateDesc(String incidentStateDesc) {
		this.incidentStateDesc = incidentStateDesc;
	}

	public Integer getIncidentStateTypeId() {
		return incidentStateTypeId;
	}

	public void setIncidentStateTypeId(Integer incidentStateTypeId) {
		this.incidentStateTypeId = incidentStateTypeId;
	}

	public String getIncidentLifeCycleType() {
		return incidentLifeCycleType;
	}

	public void setIncidentLifeCycleType(String incidentLifeCycleType) {
		this.incidentLifeCycleType = incidentLifeCycleType;
	}

	public Boolean getIsEndState() {
		return isEndState;
	}

	public void setIsEndState(Boolean isEndState) {
		this.isEndState = isEndState;
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
