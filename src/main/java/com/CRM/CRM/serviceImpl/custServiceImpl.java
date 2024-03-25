package com.CRM.CRM.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.service.custService;
import com.CRM.CRM.entity.custEntity;
import com.CRM.CRM.repository.custRepository;

@Service
public class custServiceImpl implements custService {
	@Autowired
	custRepository custRepository;

	@Override
	public List<custEntity> getCustomerData() {
		// TODO Auto-generated method stub
		return custRepository.findAll();
	}

	@Override
	public void saveCust(custEntity custEntity) {
		// TODO Auto-generated method stub
		 custRepository.save(custEntity);
		
	}

	@Override
	public void updateCust(custEntity customer) {
		// TODO Auto-generated method stub
		custRepository.save(customer);
	}

	@Override
	public void deleteCust(custEntity customer) {
		// TODO Auto-generated method stub
		custRepository.delete(customer);
		
	}

}