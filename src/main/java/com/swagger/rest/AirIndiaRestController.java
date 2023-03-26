package com.swagger.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.request.PassengerInfo;
import com.swagger.response.TicketInfo;


@RestController
@RequestMapping("/api")
public class AirIndiaRestController {
     @PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		//write logic for to bookTicket
		//Crate Object to TicketInfo
		TicketInfo ticket=new TicketInfo();
		ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticket.setTo(pinfo.getTo());
		ticket.setFrom(pinfo.getFrom());
		ticket.setFlightId(pinfo.getFlightId());
		ticket.setPrice("45000 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		ticket.setStatus("CONFIRMED");
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}
}
