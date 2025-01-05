public class NBody {
    public static String background = "starfield.jpg";

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
        Double T = Double.parseDouble(args[0]);
        Double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        In in = new In(filename);
        double Radius = readRadius(filename);
        Planet[] planets = readPlanets(filename);
        
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-Radius,Radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, "images/"+background);
        for (Planet p : planets){
            p.draw();
            // StdDraw.pause(200);
        }
    }
}
