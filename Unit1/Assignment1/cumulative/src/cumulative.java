// Write a method named cumulative that accepts as a parameter an ArrayList of integers, and
// modifies it so that each element contains the cumulative sum of the elements up through that
// index. For example, if the list passed contains {1, 1, 2, 3, 5}, your method should modify it to
// store {1, 2, 4, 7, 12}.

import java.util.ArrayList;

public class cumulative {
    public static ArrayList<Integer> cumulative(ArrayList<Integer> num){
        if (num.size() > 1){
            int cumulative = num.get(0);

            // ArrayList<Integer> result = new ArrayList<Integer>();
            // result.add(num.get(0));
            for (int i=1; i < num.size(); i++){
                int temp = num.get(1);
                cumulative += temp;
                num.remove(1);
                num.add(cumulative);
            }
            return num;
        }
        else return num;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);

        System.out.println(cumulative(num));
    }
}
