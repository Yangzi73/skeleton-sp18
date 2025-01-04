public class NBody {
    public static double readRadius(String fileAddress){
        In in = new In(fileAddress);
        int Planet_nums = in.readInt();
        double Radius = in.readDouble();
        // System.out.println(Radius);
        return Radius;
    }

    public static void main(String[] args) {
        readRadius("data/planets.txt");
    }
}
