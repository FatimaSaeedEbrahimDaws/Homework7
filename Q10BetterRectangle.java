import java.awt.*;



    public class Q10BetterRectangle  extends Rectangle {

        public Q10BetterRectangle(int xPoint, int yPoint, int width, int height) {
            setLocation(xPoint, yPoint);
            setSize(width, height);
        }

        public double getPerimeter() {
            return getHeight() * 2 + getWidth() * 2;
        }

        public double getArea() {
            return getHeight() * getWidth();
        }



    }

