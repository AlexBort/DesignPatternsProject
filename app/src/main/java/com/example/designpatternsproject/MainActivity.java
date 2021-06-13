package com.example.designpatternsproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.designpatternsproject.factory_method_pattern.core.Car;
import com.example.designpatternsproject.factory_method_pattern.core.CarCreator;
import com.example.designpatternsproject.factory_method_pattern.implementation.japan.JapanCarCreator;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    CarCreator creator = new JapanCarCreator();
    Car infinity =  creator.create(JapanCarCreator.INFINITI);

  }
}