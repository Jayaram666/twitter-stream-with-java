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
public class TenantMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tenantId;
	private String tenantName;
	private Long tenantAdminId;
	private String TenantAdminName;
	private String TenantAdminEmailId;
	private Boolean isActive;
	private Boolean isInitiated;
	private Boolean isSuspended;
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

//  private Long boughtedDurationTill-Epoc private Long createdDate-epoc private
//  Long activeDate-epoc
// 
//private Long updatedDate-epoc
	private String createdBy;
	private String updatedBy;
	private Integer tenantBusinessPlanId;
	private Integer tenantSubsribedListOfUsers;
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
	public Long getTenantAdminId() {
		return tenantAdminId;
	}
	public void setTenantAdminId(Long tenantAdminId) {
		this.tenantAdminId = tenantAdminId;
	}
	public String getTenantAdminName() {
		return TenantAdminName;
	}
	public void setTenantAdminName(String tenantAdminName) {
		TenantAdminName = tenantAdminName;
	}
	public String getTenantAdminEmailId() {
		return TenantAdminEmailId;
	}
	public void setTenantAdminEmailId(String tenantAdminEmailId) {
		TenantAdminEmailId = tenantAdminEmailId;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsInitiated() {
		return isInitiated;
	}
	public void setIsInitiated(Boolean isInitiated) {
		this.isInitiated = isInitiated;
	}
	public Boolean getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Integer getTenantBusinessPlanId() {
		return tenantBusinessPlanId;
	}
	public void setTenantBusinessPlanId(Integer tenantBusinessPlanId) {
		this.tenantBusinessPlanId = tenantBusinessPlanId;
	}
	public Integer getTenantSubsribedListOfUsers() {
		return tenantSubsribedListOfUsers;
	}
	public void setTenantSubsribedListOfUsers(Integer tenantSubsribedListOfUsers) {
		this.tenantSubsribedListOfUsers = tenantSubsribedListOfUsers;
	}

}
