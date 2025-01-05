public class Planet {
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;
    private static double G = 6.67e-11;

    public Planet(double xP, double yP, double xV, double yV, double m, String img) {
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }
    public Planet(Planet p) {
        xxPos = p.xxPos;
        yyPos = p.yyPos;
        xxVel = p.xxVel;
        yyVel = p.yyVel;
        mass = p.mass;
        imgFileName = p.imgFileName;
    }

    public double calcDistance (Planet p){
        double distnace = Math.sqrt(Math.pow(xxPos - p.xxPos, 2) + Math.pow(yyPos - p.yyPos, 2));
        return distnace;
    }

    public double calcForceExertedBy(Planet p){
        double force = G * mass * p.mass / Math.pow(calcDistance(p), 2);
        return force;
    }

    public double calcForceExertedByX(Planet p){
        double force_x = calcForceExertedBy(p) * (p.xxPos - xxPos) / calcDistance(p);
        return force_x;
    }

    public double calcForceExertedByY(Planet p){
        double force_y = calcForceExertedBy(p) * (p.yyPos - yyPos) / calcDistance(p);
        return force_y;
    }

    public double calcNetForceExertedByX(Planet[] allPlanets){
        double netForce_x = 0;
        for (Planet s : allPlanets){
            if (equals(s)){
                continue;
            }
            netForce_x += calcForceExertedByX(s);
        }
        return netForce_x;
    }
    
    public double calcNetForceExertedByY(Planet[] allPlanets){
        double netForce_y = 0;
        for (Planet s : allPlanets){
            if (equals(s)){
                continue;
            }
                netForce_y += calcForceExertedByY(s);
        }
        return netForce_y;
    }

    public void update(double dt, double Fx , double Fy){
        double ax = Fx / mass;
        double ay = Fy / mass;
        xxVel = xxVel + dt * ax;
        yyVel = yyVel + dt * ay;
        xxPos = xxPos + dt * xxVel;
        yyPos = yyPos + dt * yyVel;
    }

    public void draw(){
        StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
    }
}
