package com.crm.master.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm.master.dto.TenantMaster;
import com.crm.master.service.TenantService;

@RestController("/tenant")
public class TenantController {
	@Autowired
	TenantService tenantService;

	@GetMapping("/{id}")
	public TenantMaster getTenantById(@PathVariable("id") Long id) {
		return tenantService.getTenant(id);
	}

	@PutMapping("/{id}")
	public TenantMaster updateTenant(@PathVariable("id") Long id, @RequestBody TenantMaster tenantMaster) {
		return tenantService.updateTenant(tenantMaster);
	}

	@GetMapping
	public List<TenantMaster> getAllTenants() {
		return tenantService.getAllTenant();
	}

	@PostMapping
	public TenantMaster saveTenant(@RequestBody TenantMaster tenantMaster) {
		return tenantService.saveTenant(tenantMaster);
	}

}
