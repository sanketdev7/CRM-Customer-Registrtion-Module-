package com.CRM.CRM.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.entity.custEntity;
import com.CRM.CRM.serviceImpl.custServiceImpl;

@RestController
@RequestMapping(value="/customer")
public class custController {
	@Autowired
	 custServiceImpl custServiceImpl;
	
	@GetMapping("/getAllCust")
	public List<custEntity> getAllcustomers(){
		List<custEntity >custList = new ArrayList<>();
		custList=custServiceImpl.getCustomerData();
		return custList;
	}
	
	@PostMapping("/saveCust")
	public String saveCust(@RequestBody custEntity custEntity) {
		try {
			custServiceImpl.saveCust(custEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Customer Saved Successfullly";
		
	}
	
	@PutMapping("/updateCust")
	public String updateCust(@RequestBody custEntity customer) {
		custServiceImpl.updateCust(customer);
		return "Customer Updated SuccessFully";
	}
	
	@DeleteMapping("/deleteCust")
	public String deleteCust(@RequestBody custEntity customer) {
		custServiceImpl.deleteCust(customer);
		
		return "Customer Deleted Successfully";
		
	}
}
