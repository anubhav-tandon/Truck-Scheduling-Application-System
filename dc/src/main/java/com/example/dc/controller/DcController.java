package com.example.dc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dc.exception.DcNotExistsException;
import com.example.dc.exception.DcNumberNotFoundException;
import com.example.dc.model.Dc;
import com.example.dc.repository.DcRepository;
import com.example.dc.service.DcService;

@RestController
@RequestMapping("/dc")
public class DcController {
	@Autowired
	private DcService dcService;
	@GetMapping("/all")
	public List<Dc> getAllDc(){
		return dcService.getAllDc();
	}
	
	@PostMapping("/add")
	public Dc addDc(@RequestBody Dc dc) {
		return dcService.addDc(dc);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDc(@PathVariable Integer id) throws DcNotExistsException, DcNumberNotFoundException {
	 dcService.deleteDc(id);
	}
//	@GetMapping("/search/{id}")
//	public Dc getDc(@RequestBody Dc dc) {
//		return dcService.getDc(dc);
//	}
//	@GetMapping("/message")
//	public String print() {
//		System.out.println("Hello");
//		return "HELOOOO!!!!";
//	}
}
