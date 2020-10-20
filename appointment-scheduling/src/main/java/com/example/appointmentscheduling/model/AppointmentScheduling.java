package com.example.appointmentscheduling.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="appointments")
public class AppointmentScheduling {
	private int truckNumber;
	//private Dc dc;  //using feign
	//private DcSlot dcSlot;
	private int dcNumber;
	private int dcSlotNumber;
	private int poNumber;
	private String DateOfAppointment;
}
