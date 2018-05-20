package com.example.demo.easyrules;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

		// define rules
//		WeatherRule weatherRule = new WeatherRule();

		// build rules
		Rule weatherRule = new RuleBuilder()
				.name("weather rule")
				.description("if it rains then take an umbrella")
				.when(facts -> facts.get("rain").equals(true))
				.then(facts -> System.out.println("It rains, take an umbrella!"))
				.build();

		Rules rules = new Rules();
		rules.register(weatherRule);

		Facts facts = new Facts();
		facts.put("rain", true);

		// fire rules on known facts
		RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);
    }
}
