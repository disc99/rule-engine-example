package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	public static void main(String[] args) {
//		Facts facts = new Facts();
//		facts.put("rain", true);
//
//		// define rules
//		WeatherRule weatherRule = new WeatherRule();
//		Rules rules = new Rules();
//		rules.register(weatherRule);
//
//		// fire rules on known facts
//		RulesEngine rulesEngine = new DefaultRulesEngine();
//		rulesEngine.fire(rules, facts);
//	}

//	public static void main(String[] args) {
//		Facts facts = new Facts();
//		User user = new User();
//		user.name = "Tom";
//		user.age = 25;
//
//		facts.put("user", user);
//
//		UserRule userRule = new UserRule();
//		Rules rules = new Rules();
//		rules.register(userRule);
//
//		RulesEngine rulesEngine = new DefaultRulesEngine();
//		rulesEngine.fire(rules, facts);
//	}
}
