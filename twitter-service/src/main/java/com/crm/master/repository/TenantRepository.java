package com.crm.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.master.entity.TenantMasterEntity;

@Repository
public interface TenantRepository extends JpaRepository<TenantMasterEntity, Long> {

}
