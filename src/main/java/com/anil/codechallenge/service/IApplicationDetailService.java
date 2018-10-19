package com.anil.codechallenge.service;

import java.util.List;

import com.anil.codechallenge.entities.ApplicationDetail;

public interface IApplicationDetailService{
	Integer addAppDetail(ApplicationDetail applicationDetail);
	ApplicationDetail getAppDetail(Integer Id);
	List<ApplicationDetail> getAllAppDetails();
}
