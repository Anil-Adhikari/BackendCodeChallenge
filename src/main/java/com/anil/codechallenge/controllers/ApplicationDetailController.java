package com.anil.codechallenge.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.entities.BaseApplicationDetail;
import com.anil.codechallenge.entities.UserInformation;
import com.anil.codechallenge.service.IApplicationDetailService;

@RestController
public class ApplicationDetailController {

	@Autowired
	IApplicationDetailService appDaoImpl;

	@GetMapping(path = "/get")
	public BaseApplicationDetail getApplication() {

		ApplicationDetail appDetail = appDaoImpl.getAppDetail(1);
		List<ApplicationDetail> appDetailList = new ArrayList<>();
		appDetailList.add(appDetail);

		BaseApplicationDetail baseApplicationDetail = new BaseApplicationDetail();
		baseApplicationDetail.setApplicationDetailsList(appDetailList);
		return baseApplicationDetail;
	}

	@GetMapping("/getapps")
	public Object getApp(@RequestParam("file") File file, @ModelAttribute(value = "section") UserInformation section) {

		if (file.getName() == null) {
			return new String("File is not provided");
		}
		UserInformation originalUserInfo = new UserInformation("anil", "anil");
		if (!originalUserInfo.equals(section)) {
			return new String("Invalid user information");
		}

		List<ApplicationDetail> appDetailList = appDaoImpl.getAllAppDetails();

		BaseApplicationDetail baseApplicationDetail = new BaseApplicationDetail();
		baseApplicationDetail.setApplicationDetailsList(appDetailList);
		return (BaseApplicationDetail) baseApplicationDetail;
	}
	
}
