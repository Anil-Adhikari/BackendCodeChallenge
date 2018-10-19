package com.anil.codechallenge;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.repo.ApplicationDetailRepository;
import com.anil.codechallenge.util.ApplicationDetailDataLoader;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ApplicationDetailDbAccessTest {
	
	@Autowired
	private TestEntityManager entitymanager;
	
	@Autowired
	private ApplicationDetailRepository appRepository;


	@Test
	public void testAddAppDetail() {
		ApplicationDetail appdetail = ApplicationDetailDataLoader.createApplicationDetail();				
		Integer appId =  appRepository.save(appdetail).getApplicationDetailId();
		
		assertThat(appId.equals(1));
	}

	@Test
	public void testGetAppDetail() {
		ApplicationDetail appdetail = ApplicationDetailDataLoader.createApplicationDetail();
		assertThat(appdetail).isNotNull();
		entitymanager.persist(appdetail);
		entitymanager.flush();
		
		
		assertTrue(appdetail.getSubtype().equals(appRepository.getOne(appdetail.getApplicationDetailId()).getSubtype()));
	}

	@Test
	public void testGetAllAppDetails() {
		ApplicationDetail appdetail = ApplicationDetailDataLoader.createApplicationDetail();				
		ApplicationDetail appdetail1 = ApplicationDetailDataLoader.createApplicationDetail();

		appRepository.save(appdetail);
		appRepository.save(appdetail1);
		
		assertEquals(2, appRepository.findAll().size());
	}

}
