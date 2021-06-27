package com.crm.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.master.entity.IncidentEntity;

/**
 * Created by gmartinezramirez on 01/03/18.
 * This use JpaRepository that extends the PagingAndSortingRepository that extends CRUDRepository.
 */
@Repository
public interface IncidentRepository extends JpaRepository<IncidentEntity, Long> {

}
