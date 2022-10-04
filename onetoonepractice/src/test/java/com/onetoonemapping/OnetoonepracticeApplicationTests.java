package com.onetoonemapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onetoonemapping.entity.Capital;
import com.onetoonemapping.entity.Country;
import com.onetoonemapping.repository.CapitalRepository;

@SpringBootTest
class OnetoonepracticeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	CapitalRepository repository;
	
	@Test
	public void getInsert() {
		
		Capital capital = new Capital();
		capital.setName("India");
		Country country = new Country();
		country.setName("Delhi");
		capital.setCountry(country);
		repository.save(capital);
	}
	
	@Test
	public void getUpdate() {
		
		Capital capital = repository.findById(1).get();
		capital.setName("New Zealand");
		Country country = capital.getCountry();
		country.setName("Wellington");
		repository.save(capital);
	}
	

}
