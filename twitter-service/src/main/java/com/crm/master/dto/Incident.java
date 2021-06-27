package com.crm.master.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class Incident {
	
	private Long incidentId;
	private Long tenantId;
	private String tenantName;
	private Long incidentSourceType;
	private String incidentSourceDesc;
	private Long incidentBusinessRuleId;
	private String incidentBusinessRulesType;
// IncidentBusinessRulesType - String, ex. Healthcare, Edutech
	private Long incidentBusinessRulesVersion;
	private Integer incidentState;
	private String incidentStateDesc;
	private Integer incidentCreatorId;
	private Long incidentOwnerId;
	private Long incidentCurrentAssigneeId;
	private String incidentCreatorName;
	private String incidentOwnerName;
	private String IncidentCurrentAssigneeName;
	private Boolean isActive;
	private Boolean isCompleted;
	private Boolean isSuspended;
	private Integer incidentCompletedById;
	private String incidentCompletedByName;
	/*
	 * DueDate-epoc Priority
	 */
	/*- String (ex. Sales , PostSales)*/
	private String IncidentLifeCycleTypeId;

	private Boolean isTouched;
	/*-int (ex. LEAD, OPPURTUNITY,CONVERTED, COLD Call)*/
	private String IncidentCurrentState;
	private Long LeadId;
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public Long getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(Long incidentId) {
		this.incidentId = incidentId;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public Long getIncidentSourceType() {
		return incidentSourceType;
	}

	public void setIncidentSourceType(Long incidentSourceType) {
		this.incidentSourceType = incidentSourceType;
	}

	public String getIncidentSourceDesc() {
		return incidentSourceDesc;
	}

	public void setIncidentSourceDesc(String incidentSourceDesc) {
		this.incidentSourceDesc = incidentSourceDesc;
	}

	public Long getIncidentBusinessRuleId() {
		return incidentBusinessRuleId;
	}

	public void setIncidentBusinessRuleId(Long incidentBusinessRuleId) {
		this.incidentBusinessRuleId = incidentBusinessRuleId;
	}

	public String getIncidentBusinessRulesType() {
		return incidentBusinessRulesType;
	}

	public void setIncidentBusinessRulesType(String incidentBusinessRulesType) {
		this.incidentBusinessRulesType = incidentBusinessRulesType;
	}

	public Long getIncidentBusinessRulesVersion() {
		return incidentBusinessRulesVersion;
	}

	public void setIncidentBusinessRulesVersion(Long incidentBusinessRulesVersion) {
		this.incidentBusinessRulesVersion = incidentBusinessRulesVersion;
	}

	public Integer getIncidentState() {
		return incidentState;
	}

	public void setIncidentState(Integer incidentState) {
		this.incidentState = incidentState;
	}

	public String getIncidentStateDesc() {
		return incidentStateDesc;
	}

	public void setIncidentStateDesc(String incidentStateDesc) {
		this.incidentStateDesc = incidentStateDesc;
	}

	public Integer getIncidentCreatorId() {
		return incidentCreatorId;
	}

	public void setIncidentCreatorId(Integer incidentCreatorId) {
		this.incidentCreatorId = incidentCreatorId;
	}

	public Long getIncidentOwnerId() {
		return incidentOwnerId;
	}

	public void setIncidentOwnerId(Long incidentOwnerId) {
		this.incidentOwnerId = incidentOwnerId;
	}

	public Long getIncidentCurrentAssigneeId() {
		return incidentCurrentAssigneeId;
	}

	public void setIncidentCurrentAssigneeId(Long incidentCurrentAssigneeId) {
		this.incidentCurrentAssigneeId = incidentCurrentAssigneeId;
	}

	public String getIncidentCreatorName() {
		return incidentCreatorName;
	}

	public void setIncidentCreatorName(String incidentCreatorName) {
		this.incidentCreatorName = incidentCreatorName;
	}

	public String getIncidentOwnerName() {
		return incidentOwnerName;
	}

	public void setIncidentOwnerName(String incidentOwnerName) {
		this.incidentOwnerName = incidentOwnerName;
	}

	public String getIncidentCurrentAssigneeName() {
		return IncidentCurrentAssigneeName;
	}

	public void setIncidentCurrentAssigneeName(String incidentCurrentAssigneeName) {
		IncidentCurrentAssigneeName = incidentCurrentAssigneeName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Boolean getIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	public Integer getIncidentCompletedById() {
		return incidentCompletedById;
	}

	public void setIncidentCompletedById(Integer incidentCompletedById) {
		this.incidentCompletedById = incidentCompletedById;
	}

	public String getIncidentCompletedByName() {
		return incidentCompletedByName;
	}

	public void setIncidentCompletedByName(String incidentCompletedByName) {
		this.incidentCompletedByName = incidentCompletedByName;
	}

	public String getIncidentLifeCycleTypeId() {
		return IncidentLifeCycleTypeId;
	}

	public void setIncidentLifeCycleTypeId(String incidentLifeCycleTypeId) {
		IncidentLifeCycleTypeId = incidentLifeCycleTypeId;
	}

	public Boolean getIsTouched() {
		return isTouched;
	}

	public void setIsTouched(Boolean isTouched) {
		this.isTouched = isTouched;
	}

	public String getIncidentCurrentState() {
		return IncidentCurrentState;
	}

	public void setIncidentCurrentState(String incidentCurrentState) {
		IncidentCurrentState = incidentCurrentState;
	}

	public Long getLeadId() {
		return LeadId;
	}

	public void setLeadId(Long leadId) {
		LeadId = leadId;
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
