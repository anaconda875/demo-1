package com.example.demo.dto.response;

import com.example.demo.domain.model.HelloEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloResponse {

  private Long id;
  private String name;
  private Integer age;

  public HelloResponse(HelloEntity entity) {
    this(entity.getId(), entity.getName(), entity.getAge());
  }

}
