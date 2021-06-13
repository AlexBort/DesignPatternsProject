package com.example.designpatternsproject.factory_method_pattern.implementation.japan;

import com.example.designpatternsproject.factory_method_pattern.core.Car;
import com.example.designpatternsproject.factory_method_pattern.core.CarCreator;

public class JapanCarCreator extends CarCreator {

  public static final String INFINITI = "INFINITI";
  public static final String MAZDA = "MAZDA";
  public static final String TOYOTA = "TOYOTA";

  @Override
  public Car create(String name) {
    if (INFINITI.equals(name)) {
      return new Infiniti();
    } else if (MAZDA.equals(name)) {
      return new Mazda();
    } else if (TOYOTA.equals(name)) {
      return new Toyota();
    }
    return null;
  }
}
