package com.relaximus.funcendpoints

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import static com.relaximus.funcendpoints.handlers.PersonHandler.*
import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.web.servlet.function.RequestPredicates.accept
import static org.springframework.web.servlet.function.RouterFunctions.route

@Configuration
class RouterConfig {
    @Bean
    def routerFunction() {
        route().with {
            GET('/person/{id}', accept(APPLICATION_JSON)) {
                getPersonFor it
            }

            GET ("/person",
                    accept(APPLICATION_JSON),
                    listPeople())

            POST("/person") {
                createPersonFrom it
            }

            build()
        }
    }
}
