package com.sandin.learning.rest.webservices.restfulwebservices.infrastructure.helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message= message;
    }

    @Override
    public String toString() {
        return "HeelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
