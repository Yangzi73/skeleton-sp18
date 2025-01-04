package Users.Yang.Desktop.MyProject;

public class One {
    String name;
    int weight;
    public int compare_weight(One p){
        int Max_weight;
        if (weight > p.weight){
            Max_weight = weight;
        }else{
            Max_weight = p.weight;
        }
        return Max_weight;
    }
}
