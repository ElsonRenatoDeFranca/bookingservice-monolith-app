package com.hotelreservation.microservices.service;

import com.hotelreservation.microservices.demoapp.BookingCloudNativeMicroservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingCloudNativeMicroservice.class)
@WebAppConfiguration

public class RoomServicesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
