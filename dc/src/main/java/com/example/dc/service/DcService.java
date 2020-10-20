package com.example.dc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dc.exception.DcNotExistsException;
import com.example.dc.exception.DcNumberNotFoundException;
import com.example.dc.model.Dc;
import com.example.dc.repository.DcRepository;

@Service
public class DcService {

	@Autowired
	DcRepository dcRepo;
	public List<Dc> getAllDc(){
		return dcRepo.findAll();
	}
	public Dc addDc(Dc dc) { 
		dc.setDcCity(dc.getDcCity());
		dc.setDcNumber(dc.getDcNumber());
		dc.setDcType(dc.getDcType());
		return dcRepo.save(dc);
	}
	public void deleteDc(Integer id) throws DcNotExistsException, DcNumberNotFoundException {
		 dcRepo.deleteById(id);
	}
//	public Dc getDc(Dc dc) {
//		return dcRepo.findById(dc.getDcNumber());
//	}
}
