package com.example.appointmentscheduling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appointmentscheduling.model.AppointmentScheduling;
import com.example.appointmentscheduling.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	public List<AppointmentScheduling> getAllAppointments(){
		return appointmentService.getAllAppointments;
	}
}
