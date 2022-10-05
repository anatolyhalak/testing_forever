package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    assertEquals(s.area(),25.0);
  }
}

//Первый тест, используя фреймворк для запуска тестов TestNG