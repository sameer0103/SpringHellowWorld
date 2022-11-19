package com.javapoint.spring_boot_ex_sts;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;   
@SpringBootApplication   

public class SpringBootExSts implements CommandLineRunner{
	public static void main(String[] args)  
	{    
		String abc = "";
		
		
		if(!StringUtils.isEmpty(abc))
			
		{
			System.out.println("i am not null");
			
		}
		else
		{
			System.out.println(" i dont have any value ");
		}
		SpringApplication.run(SpringBootExSts.class, args);    
	}

	@Override
	 public void run(String args[]) throws Exception{
		  System.out.println("HEllo world");
		
	}   

}
