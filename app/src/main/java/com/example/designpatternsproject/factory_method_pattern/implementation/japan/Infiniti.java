package com.example.designpatternsproject.factory_method_pattern.implementation.japan;

import com.example.designpatternsproject.factory_method_pattern.core.Car;

public class Infiniti extends Car {

  @Override
  public String getInfo() {
    return "Марка автомобиля: " + JapanCarCreator.INFINITI;
  }
}
