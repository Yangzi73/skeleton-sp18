public class MaxNumber {
    int nums;
    public static int max(int[] m) {
        int max_num = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max_num) {
                max_num = m[i];
            }
        }
        System.out.println(max_num);
        return 0;
    }

    public int maxN(int x){
        if (this.nums > x){
            return this.nums;
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        // int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        // max(numbers);
        MaxNumber a = new MaxNumber();
        MaxNumber b = new MaxNumber();
        a.nums = 10;
        b.nums = 20;
        System.out.println(a.maxN(b.nums));
    }
}
