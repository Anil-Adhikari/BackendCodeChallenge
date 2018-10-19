package com.anil.codechallenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.entities.UserInformation;
import com.anil.codechallenge.service.IApplicationDetailService;
import com.anil.codechallenge.util.ApplicationDetailDataLoader;

@Controller
public class JSONRequestController {
	@Autowired
	IApplicationDetailService appDaoImpl;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getRequestPage(Model model) {
		UserInformation userinfo = new UserInformation();
		model.addAttribute("section",userinfo);
		
		// loading dummy data into the database
		loadApplicationDetailData();
		
		return "requestjson";
	}

	private void loadApplicationDetailData() {
		ApplicationDetail applicationDetail = ApplicationDetailDataLoader.createApplicationDetail();
		appDaoImpl.addAppDetail(applicationDetail);
		
		ApplicationDetail applicationDetail1 = ApplicationDetailDataLoader.createApplicationDetail();
		appDaoImpl.addAppDetail(applicationDetail1);
	}
}
