import java.util.Scanner;

public class Q10Test {    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompting and taking in user input
    System.out.print("Please enter a coordinate points for x and y: ");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.print("Please enter a width and height: ");
    int width = input.nextInt();
    int height = input.nextInt();
    Q10BetterRectangle creatingRectangles = new Q10BetterRectangle(x, y, width, height);
    double rectangleArea = creatingRectangles.getArea();
    double rectanglePerimeter = creatingRectangles.getPerimeter();

    System.out.printf("Area of a Rectangle is: %2.5f", rectangleArea);
    System.out.printf("\nPerimeter of a Rectangle is: %2.5f", rectanglePerimeter);
}
}
