public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (Point point : points) {
            sum += point.x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---
        System.out.println("Hello World!");



        //Exercise 7
        System.out.println("Exercise 7");
        Device d1 = new Device(0);
        Microwave m1 = new Microwave(0,0);

        Device polyDevice;
        polyDevice = m1;
        polyDevice.printDescription();

        //Exercise 8
        System.out.println("Exercise 8");

        if (polyDevice instanceof Microwave) {
            Microwave newMicrowave = (Microwave) polyDevice;
            newMicrowave.heatFood();                        //newer
        }

        //Exercise 5
        System.out.println("Exercise 5");
       int p1 = sumCoordinates(new Point(1, 2), new Point(3, 4));
       System.out.println(p1);
       Point[] points = {new Point(1, 2), new Point(3, 4)};
       int p2 = sumCoordinates(points);
       System.out.println(p2);


        //Exercise 3
        Point Test = new Point();
        System.out.println("Exercise 3 ");
        Test.printState();

        // Exercise 2
        System.out.println("Exercise 2 ");
        int originalPoint = 50;
        attemptToChangePrimitive(originalPoint);
        System.out.println(originalPoint);


        // Exercise 1 :
        System.out.println("Exercise 1 ");
        Point startpoint;
        startpoint = new Point(10, 20);
        System.out.println(startpoint.x);
        startpoint.move(5, -3);
        startpoint.printState();

    }

}
