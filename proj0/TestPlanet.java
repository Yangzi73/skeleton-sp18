public class TestPlanet {
    // This is just a simple optional application for you to test your code.
    public static void main(String[] args) {
        Planet a = new Planet(1, 1, 1, 1, 1000, "jupiter.gif");
        Planet b = new Planet(4, 5, 1, 1, 10, null);
        System.out.println(a.calcDistance(b));
        System.out.println(a.calcForceExertedBy(b));
    }

}