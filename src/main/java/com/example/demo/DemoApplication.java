package com.example.demo;

import com.example.demo.testAutowire.ServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{

	@Autowired
	ServiceC serviceC;

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception
	{
		int a = 1;

		for (int e = 1; e  < 10; e++)
			System.out.println(a);

	}
}
