package com.relaximus.funcendpoints.model

import groovy.transform.CompileStatic
import groovy.transform.builder.Builder

@Builder
@CompileStatic
class Person {
    String name
    Date birthDate
    List<String> hobbies
}
