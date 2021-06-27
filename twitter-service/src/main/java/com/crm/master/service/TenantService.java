package com.crm.master.service;

import java.util.List;
import com.crm.master.dto.TenantMaster;


public interface TenantService {

	public TenantMaster getTenant(Long id) ;

	public TenantMaster saveTenant(TenantMaster tenantMaster) ;
	
	public TenantMaster updateTenant(TenantMaster tenantMaster) ;
	
	public List<TenantMaster> getAllTenant() ;

}
