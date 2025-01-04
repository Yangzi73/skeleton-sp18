package Users.Yang.Desktop.MyProject;

public class Two {
    public static void main(String[] args) {
        One a = new One();
        One b = new One();
        a.name = "Yang";
        b.name = "Cao";
        a.weight = 100;
        b.weight = 200;
        System.out.println(a.compare_weight(b));
    }   
}
