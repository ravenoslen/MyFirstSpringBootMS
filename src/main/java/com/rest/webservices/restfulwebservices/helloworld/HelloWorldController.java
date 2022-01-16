package com.rest.webservices.restfulwebservices.helloworld;

import com.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"

    //@RequestMapping(method= RequestMethod.GET, path="/hello-world") //long anotation
    @GetMapping(path = "/hello-world") //short annotation
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean") //short annotation
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    //hello-world/path-variable/example
    @GetMapping(path = "/hello-world/path-variable/{name}") //short annotation
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
