package com.naren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren.model.Order;
import com.naren.model.Participant;
import com.naren.model.Rate;
import com.naren.service.DroolsService;

@RestController()
@RequestMapping("/bankservice")
public class DroolsSampleController {
 
 @Autowired
 private DroolsService bankService;
 
 @PostMapping("/getrate")
 public ResponseEntity<Rate> getRate(@RequestBody Participant request){
  Rate rate = bankService.getRate(request);
  return new ResponseEntity<>(rate, HttpStatus.OK);
 }
 
 @PostMapping("/getdiscount")
 public ResponseEntity<Order> getDiscount(@RequestBody Order order){
  Order orderObj = bankService.getDiscount(order);
  return new ResponseEntity<>(orderObj, HttpStatus.OK);
 }

}