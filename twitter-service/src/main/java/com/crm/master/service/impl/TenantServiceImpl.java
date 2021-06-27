package com.crm.master.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.master.dto.TenantMaster;
import com.crm.master.entity.TenantMasterEntity;
import com.crm.master.repository.TenantRepository;
import com.crm.master.service.TenantService;

@Service
public class TenantServiceImpl implements TenantService{
	@Autowired
	private ModelMapper modelMapper=new ModelMapper();
	@Autowired
	private TenantRepository tenantRepository;

	public TenantMaster getTenant(Long id) {
		return modelMapper.map(tenantRepository.findById(id), TenantMaster.class);
	}

	public TenantMaster saveTenant(TenantMaster tenantMaster) {
		TenantMasterEntity entity = modelMapper.map(tenantMaster, TenantMasterEntity.class);
		return modelMapper.map(tenantRepository.save(entity), TenantMaster.class);
	}

	public TenantMaster updateTenant(TenantMaster tenantMaster) {
		TenantMasterEntity entity = modelMapper.map(tenantMaster, TenantMasterEntity.class);
		return modelMapper.map(tenantRepository.save(entity), TenantMaster.class);
	}

	public List<TenantMaster> getAllTenant() {
		List<TenantMasterEntity> tenntmasters = tenantRepository.findAll();
		return modelMapper.map(tenntmasters, new TypeToken<List<TenantMaster>>() {
		}.getType());
	}

}
