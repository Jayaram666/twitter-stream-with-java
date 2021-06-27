package com.crm.master.dto;

import java.util.Date;

public class IncidentBusinessRulesMaster {
	
	private Long incidentBusinessId;// -Long
	private Long incidentBusinessRulesVersion;// - Long
	private Long incidentBusinessRulesType;// -Long
	/* IncidentBusinessRulesObject-JsonB ..ex: below */
	/*
	 * CreatedDate-Epoc UpdatedDate-Epoc
	 */
	
	private Date createdAt;

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
