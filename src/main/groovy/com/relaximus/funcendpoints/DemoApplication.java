package com.relaximus.funcendpoints;

import com.relaximus.funcendpoints.handlers.PersonHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.servlet.function.RequestPredicates.*;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@SpringBootApplication
class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public RouterFunction<ServerResponse> routerFunction() {
//		PersonHandler handler = new PersonHandler();
//
//		return route()
//				.GET("/person/{id}", accept(APPLICATION_JSON), handler::getPerson)
//				.GET("/person", accept(APPLICATION_JSON), handler::listPeople)
//				.POST("/person", handler::createPerson)
//				.build();
//	}
}
