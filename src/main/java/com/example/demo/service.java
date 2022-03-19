package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface service {
 List<model>getall();
 void save(model mod);
  Optional<model>getbyid(Integer id);
  List<model> getname();
}
