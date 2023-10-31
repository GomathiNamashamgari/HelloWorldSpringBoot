package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello 
{
	@GetMapping("/msg")
	public String helloworld()
	{
		return "Hello Spring-Boot" ;
	}
	@GetMapping("/date")
	public String date()
	{
        LocalDate d = LocalDate.now();
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s=d.format(d1);
        return s;
    }
}
