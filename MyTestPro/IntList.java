import java.util.Scanner;

public class IntList{
    int Int_First;
    IntList rest;
    public IntList(int f, IntList r){
        Int_First = f;
        rest = r;
    }

    public int size(){
        if (rest == null){
            return 1;
        }else{
            return 1 + rest.size();
        }
    }

    public int get(int i){
        if(i == 0){
            return Int_First;
        }else{
            return rest.get(i-1);
        }
    }

    public static void main(String[] args) {
        IntList list = new IntList(5,new IntList(10,new IntList(15,null)));
        System.out.println(list.size());

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        i -= 1;
        scanner.close();
        
        System.out.println(list.get(i));
    }
}