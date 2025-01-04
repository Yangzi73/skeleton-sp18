public class NBody {
    public static double readRadius(String fileAddress){
        In in = new In(fileAddress);
        int Planet_nums = in.readInt();
        double Radius = in.readDouble();
        // System.out.println(Radius);
        return Radius;
    }

    public static Planet[] readPlanets(String fileAddress){
        In in = new In(fileAddress);
        int Planet_nums = in.readInt();
        double Radius = in.readDouble();
        Planet[] planets = new Planet[Planet_nums];
        for (int i = 0 ; i < Planet_nums; i++){
            double xxPos = in.readDouble();
            double yyPos = in.readDouble();
            double xxVel = in.readDouble();
            double yyVel = in.readDouble();
            double mass = in.readDouble();
            String imgFileName = in.readString();
            planets[i] = new Planet(xxPos, yyPos, xxVel, yyVel, mass, imgFileName);
        }
        return planets;
    }

    public static void main(String[] args) {
        readRadius("data/planets.txt");
    }
}
