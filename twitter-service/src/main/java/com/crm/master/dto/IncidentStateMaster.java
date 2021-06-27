package com.crm.master.dto;

import java.util.Date;


public class IncidentStateMaster {
	
	private Integer incidentStateId;
	private String incidentStateDesc;
	private Integer incidentStateTypeId;
	/*
	 * Private Integer IncidentNextStateId - JSONB (List of IncidentStateTypeId-int)
	 */
	private String incidentLifeCycleType; // - String (Sales, PostSales)
	private Boolean isEndState;// ex. DecisiveStage
	/* IncidentLifeCycleStages- JsonB */
	
	private Date createdAt;


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
