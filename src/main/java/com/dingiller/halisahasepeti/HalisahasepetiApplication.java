package com.dingiller.halisahasepeti;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HalisahasepetiApplication {

	private static Logger log = Logger.getLogger(HalisahasepetiApplication.class);

	public static void main (String[] args) {
		SpringApplication.run(HalisahasepetiApplication.class, args);
	}

}
