package com.naren.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naren.model.Order;
import com.naren.model.Participant;
import com.naren.model.Rate;

@Service
public class DroolsService {

	@Autowired
	private KieContainer kieContainer;

	public Rate getRate(Participant applicantRequest) {
		Rate rate = new Rate();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("rate", rate);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return rate;
	}
	

	public Order getDiscount(Order order) {
		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
		kieSession.insert(order);
		kieSession.fireAllRules();
		kieSession.dispose();
		return order;
	}

}
