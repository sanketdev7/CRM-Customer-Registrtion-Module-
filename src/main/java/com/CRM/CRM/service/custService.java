package com.CRM.CRM.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.CRM.entity.custEntity;

@Service
public interface custService {

	public List<custEntity> getCustomerData();

	public void saveCust(custEntity custEntity);

	public void updateCust(custEntity customer);

	public void deleteCust(custEntity customer);

}
