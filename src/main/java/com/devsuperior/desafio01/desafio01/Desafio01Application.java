package com.devsuperior.desafio01.desafio01;

import com.devsuperior.desafio01.desafio01.entities.Order;
import com.devsuperior.desafio01.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();
		Order order01 = new Order(code, basic, discount);
		System.out.println("Pedido código " + order01.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order01));
	}
}
