package com.anil.codechallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.repo.ApplicationDetailRepository;

@Service
public class ApplicationDetailServiceImpl implements IApplicationDetailService{

	@Autowired
	private ApplicationDetailRepository repository;

	@Override
	public Integer addAppDetail(ApplicationDetail applicationDetail) {
		return repository.save(applicationDetail).getApplicationDetailId();	

	}

	@Override
	public ApplicationDetail getAppDetail(Integer id) {
		ApplicationDetail appDetail = repository.getOne(id);
		return appDetail;
	}
	
	@Override
	public List<ApplicationDetail> getAllAppDetails(){
		return repository.findAll();

	}
	
}
