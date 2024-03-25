package com.CRM.CRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.entity.custEntity;

@Repository
public interface custRepository extends JpaRepository<custEntity, Long> {

}
