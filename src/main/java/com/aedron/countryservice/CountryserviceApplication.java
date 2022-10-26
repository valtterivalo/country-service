package com.aedron.countryservice;

import com.aedron.countryservice.dto.CountryRESTAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@RestController
public class CountryserviceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CountryserviceApplication.class, args);
		CountryRESTAccess.getCountries();
	}

}
