public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rectA  = new Rectangle(150, 200);
        Rectangle rectB = new Rectangle(100, 100);
        Rectangle rectC = new Rectangle(100, 50);
        rectA.setWidth(125);
        rectB.setWidth(125);
        rectB.setLength(125);
        rectB.setWidth(125);
        rectC.setWidth(125);
        rectA.printRectangleInfo();
        rectB.printRectangleInfo();
        rectC.printRectangleInfo();
        int rectAperimeter = (2* rectA.getLength()) + (2 * rectA.getWidth());
        int rectBperimeter = 4 * rectB.getLength();
        int rectCperimeter = (2* rectC.getWidth()) + (2* rectC.getLength());
        int totalPerimeter = rectAperimeter + rectBperimeter+rectCperimeter;
        int totalArea = (rectA.calculateArea() + rectB.calculateArea() + rectC.calculateArea());
        System.out.println("The perimeter is: " + totalPerimeter);
        System.out.println("The area is: "+ totalArea);



    }

    }


