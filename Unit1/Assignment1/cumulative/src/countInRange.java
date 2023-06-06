// Write a method named countInRange that accepts three parameters: an ArrayList of integers, a
// minimum and maximum integer, and returns the number of elements in the list within that range
// inclusive. For example, if the list v contains {28, 1, 17, 4, 41, 9, 59, 8, 31, 30, 25}, the call
// of countInRange(v, 10, 30) should return 4. If the list is empty, return 0. Do not modify the
// list that is passed in.

import java.util.ArrayList;

public class countInRange {
  public static int countInRange(ArrayList<Integer> arrList, int min, int max){
    int counter = 0;
    for (int i = 0; i < arrList.size(); i++){
      if (arrList.get(i)<= max && arrList.get(i) >= min){
        counter += 1;
      }
    }
    return counter;
  }

  public static void main(String[] args) throws Exception {
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    arrList.add(2);
    arrList.add(3);
    arrList.add(5);
    System.out.println(countInRange(arrList, 2, 6));
}
}
