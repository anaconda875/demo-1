package com.example.demo.service.impl;

import com.example.demo.domain.model.HelloEntity;
import com.example.demo.dto.request.HelloRequest;
import com.example.demo.dto.response.HelloResponse;
import com.example.demo.repository.HelloRepository;
import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultHelloService implements HelloService {

  private final HelloRepository repository;

  @Override
  public HelloResponse save(HelloRequest request) {
    HelloEntity entity = new HelloEntity();
    entity.setName(request.getName());
    entity.setAge(request.getAge());

    entity = repository.save(entity);

    return new HelloResponse(entity);
  }

}
