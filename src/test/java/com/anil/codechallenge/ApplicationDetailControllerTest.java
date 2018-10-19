package com.anil.codechallenge;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.SerializationUtils;

import com.anil.codechallenge.entities.ApplicationDetail;
import com.anil.codechallenge.entities.UserInformation;
import com.anil.codechallenge.repo.ApplicationDetailRepository;
import com.anil.codechallenge.util.ApplicationDetailDataLoader;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationDetailControllerTest {

    private static final String BASE_URL = "/getapps";

    @Autowired
    private ApplicationDetailRepository repository;
    
    
    @Autowired
    private MockMvc mockMvc;
        
    @Before
    public void initTests() {
    	ApplicationDetail appdetail = ApplicationDetailDataLoader.createApplicationDetail();				
		repository.save(appdetail);
    }
	
	@Test
	public void checkContext() {
		assertThat(mockMvc).isNotNull();
	}
	
	@Test
	public void checkGetAllAppDetails() throws Exception {
		MvcResult result = invokeGetAllAppDetails("travel.pdf", "anil", "anil")
							.andExpect(status().isOk())
							.andExpect(jsonPath("$.ApplicationDetail[0].SubType", is("Application1")))
							.andReturn();

	}
	
	private ResultActions invokeGetAllAppDetails(String filename, String username, String password) throws Exception {
		UserInformation userInformation = new UserInformation(username, password);
		return mockMvc.perform(get(BASE_URL + "?file=%s&username=%s&password=%s", filename, username, password).accept(MediaType.APPLICATION_JSON));
    }

}
