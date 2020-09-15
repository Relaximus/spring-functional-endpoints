package com.relaximus.funcendpoints.handlers

import com.relaximus.funcendpoints.model.Person
import org.springframework.web.servlet.function.HandlerFunction
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import static org.springframework.http.MediaType.APPLICATION_JSON;

class PersonHandler {

    static HandlerFunction<ServerResponse> listPeople() {
        List<Person> people = [
                Person.builder()
                        .name("Alex")
                        .birthDate(new Date())
                        .hobbies(List.of("skiing", "tennis"))
                        .build()
        ];

        { ServerRequest request ->
            ServerResponse.ok()
                    .contentType(APPLICATION_JSON)
                    .body(people)
        }
    }

    static ServerResponse createPersonFrom(ServerRequest request) {
        ServerResponse.ok().build()
    }

    static ServerResponse getPersonFor(ServerRequest request) {
        ServerResponse.ok().build()
    }
}