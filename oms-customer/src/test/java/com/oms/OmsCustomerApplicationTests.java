package com.oms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.oms.controller.CustomerController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OmsCustomerApplicationTests {
	
	MockMvc mockMvc;
	
    @Autowired

    protected WebApplicationContext wac;

    @Autowired

    CustomerController customerController;
    
   

	@Test
	public void contextLoads() {
	}

}
