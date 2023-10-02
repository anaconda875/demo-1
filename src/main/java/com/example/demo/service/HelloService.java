package com.example.demo.service;

import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;

public interface HelloService {

  HelloResponse save(HelloRequest request);

}
