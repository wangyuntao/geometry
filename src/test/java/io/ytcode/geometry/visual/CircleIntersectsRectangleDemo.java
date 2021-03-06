package io.ytcode.geometry.visual;

import io.ytcode.geometry.Circle;

public class CircleIntersectsRectangleDemo extends RectangularCoordinateCanvas {

  public static void main(String[] args) {
    new CircleIntersectsRectangleDemo();
  }

  private CircleIntersectsRectangleDemo() {
    super("CircleDemo");
  }

  @Override
  protected boolean colorPoint(int x, int y) {
    return Circle.intersectsRectangle(0, 0, 100, 0, 200, 100, 45, x, y, 50);
  }
}
