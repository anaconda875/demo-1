package com.example.demo.web.resource;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloResource {

  private final HelloService service;

  @GetMapping()
  public HelloResponse hello(String name, Integer age) {
    return new HelloResponse(null, name, age);
  }

  @PostMapping
  public HelloResponse hello2(@RequestBody HelloRequest req) {
    return service.save(req);
  }

}
