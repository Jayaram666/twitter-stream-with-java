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
@Table(name = "crm_incident")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class IncidentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long incidentId;
	private Long tenantId;
	private String tenantName;
	private Long incidentSourceType;
	private String incidentSourceDesc;
	private Long incidentBusinessRuleId;
	private String incidentBusinessRulesType;
// IncidentBusinessRulesType - String, ex. Healthcare, Edutech
	private Long incidentBusinessRulesVersion;
	private Integer IncidentState;
	private String IncidentStateDesc;
	private Integer IncidentCreatorId;
	private Long IncidentOwnerId;
	private Long IncidentCurrentAssigneeId;
	private String IncidentCreatorName;
	private String IncidentOwnerName;
	private String IncidentCurrentAssigneeName;
	private Boolean IsActive;
	private Boolean IsCompleted;
	private Boolean IsSuspended;
	private Integer IncidentCompletedById;
	private String IncidentCompletedByName;
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
		return IncidentState;
	}

	public void setIncidentState(Integer incidentState) {
		IncidentState = incidentState;
	}

	public String getIncidentStateDesc() {
		return IncidentStateDesc;
	}

	public void setIncidentStateDesc(String incidentStateDesc) {
		IncidentStateDesc = incidentStateDesc;
	}

	public Integer getIncidentCreatorId() {
		return IncidentCreatorId;
	}

	public void setIncidentCreatorId(Integer incidentCreatorId) {
		IncidentCreatorId = incidentCreatorId;
	}

	public Long getIncidentOwnerId() {
		return IncidentOwnerId;
	}

	public void setIncidentOwnerId(Long incidentOwnerId) {
		IncidentOwnerId = incidentOwnerId;
	}

	public Long getIncidentCurrentAssigneeId() {
		return IncidentCurrentAssigneeId;
	}

	public void setIncidentCurrentAssigneeId(Long incidentCurrentAssigneeId) {
		IncidentCurrentAssigneeId = incidentCurrentAssigneeId;
	}

	public String getIncidentCreatorName() {
		return IncidentCreatorName;
	}

	public void setIncidentCreatorName(String incidentCreatorName) {
		IncidentCreatorName = incidentCreatorName;
	}

	public String getIncidentOwnerName() {
		return IncidentOwnerName;
	}

	public void setIncidentOwnerName(String incidentOwnerName) {
		IncidentOwnerName = incidentOwnerName;
	}

	public String getIncidentCurrentAssigneeName() {
		return IncidentCurrentAssigneeName;
	}

	public void setIncidentCurrentAssigneeName(String incidentCurrentAssigneeName) {
		IncidentCurrentAssigneeName = incidentCurrentAssigneeName;
	}

	public Boolean getIsActive() {
		return IsActive;
	}

	public void setIsActive(Boolean isActive) {
		IsActive = isActive;
	}

	public Boolean getIsCompleted() {
		return IsCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		IsCompleted = isCompleted;
	}

	public Boolean getIsSuspended() {
		return IsSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		IsSuspended = isSuspended;
	}

	public Integer getIncidentCompletedById() {
		return IncidentCompletedById;
	}

	public void setIncidentCompletedById(Integer incidentCompletedById) {
		IncidentCompletedById = incidentCompletedById;
	}

	public String getIncidentCompletedByName() {
		return IncidentCompletedByName;
	}

	public void setIncidentCompletedByName(String incidentCompletedByName) {
		IncidentCompletedByName = incidentCompletedByName;
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
