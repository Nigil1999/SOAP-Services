package com.th.ws.demo;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(App.class, args);
		LOG.info("Running...");
	}
}*/

/*package com.th.ws.consume.demo;*/

import com.th.ws.demo.model.EmployeeClient;
import https.www_torryharris_com.soap_ws_demo.GetEmployeeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	CommandLineRunner lookup(EmployeeClient quoteClient) {
		return args -> {

			GetEmployeeResponse response = quoteClient.getEmployee(3);
			LOG.info(response.getEmployeeType().getEmployeeId() + " " + response.getEmployeeType().getFirstName() + " "
					+ response.getEmployeeType().getSalary());

//			GetAllEmployeesResponse response2 = quoteClient.getAllEmployees();
//			response2.getEmployeesType()
//					.forEach(obj -> LOG.info(obj.employeeId + " " + obj.firstName + " " + obj.salary));

			GetEmployeeResponse response3 = quoteClient.addEmployee();
			LOG.info(response3.getEmployeeType().getEmployeeId() + " " + response3.getEmployeeType().getFirstName()
					+ " " + response3.getEmployeeType().getSalary());

		};
	}
}
