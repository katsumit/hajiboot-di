package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Calculatorエントリ・ポイント
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner {
	
	@Autowired
	ArgumentResolver argumentResolver;

	@Autowired
	Calculator calculator;

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
