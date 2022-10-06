package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PointTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(5.0, 5.0);
    Point p2 = new Point(3.0, 5.0);
    assertEquals(p2.distance(p1),2.0);
    System.out.println("Расстояние между точками вычисляется правильно! " + 2 + " = " + 2);
  }
  @Test
  public void testDistance2() {
    Point p1 = new Point(0.0, 5.0);
    Point p2 = new Point(-5.0, 5.0);
    assertEquals(p2.distance(p1),5.0);
    System.out.println("Расстояние между точками вычисляется правильно! " + 5 + " = " + 5);
  }
  @Test
  public void testDistance3() {
    Point p1 = new Point(-1.0, 3.0);
    Point p2 = new Point(-5.0, 7.0);
    assertEquals(p2.distance(p1),5.656854249492381);
    System.out.println("Расстояние между точками вычисляется правильно! " + 5.656854249492381 + " = " + 5.656854249492381);
  }
}