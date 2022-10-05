package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(5.0, 5.0);
    Point p2 = new Point(3.0, 6.0);
    assertEquals(p1.area(5.0, 5.0),25.0);
    assertEquals(p2.area(3.0, 6.0),18.0);
  }
}