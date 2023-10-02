package com.example.demo.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "hello_entity")
@Data
public class HelloEntity {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Column(columnDefinition = "VARCHAR(60) CHECK (age > 0)")
  private Integer age;

  private String address;

}
