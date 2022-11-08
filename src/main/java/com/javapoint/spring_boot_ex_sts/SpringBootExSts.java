package com.javapoint.spring_boot_ex_sts;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;   
@SpringBootApplication   

public class SpringBootExSts implements CommandLineRunner{
	public static void main(String[] args)  
	{    
	SpringApplication.run(SpringBootExSts.class, args);    
	}

	@Override
	 public void run(String args[]) throws Exception{
		  System.out.println("HEllo world");
		
	}   

}
