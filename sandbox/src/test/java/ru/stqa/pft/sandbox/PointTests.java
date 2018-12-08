package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sanbox.Point;

public class PointTests {

  @Test
  public void testPoint() {

    Point p = new Point(6,3,8,4);
    Assert.assertEquals(p.distance(), 5);
  }

  @Test
  public void negativPoint() {

    Point d = new Point(6,3,8,4);
    assert(d.distance() != 8);
  }
}
