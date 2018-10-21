package descending.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author Amr Halawani
 */
public class DescendingOrder1 {
     public static int sortDesc(final int num) {
         if(num == 0){return 0;}
         String nums=String.valueOf(num); String result="";
        ArrayList<Character> list = new ArrayList<>();
         for (int i = 0; i <= nums.length()-1; i++) { list.add(i, nums.charAt(i));  }
      Collections.sort(list,(arg1,arg2)-> arg2-arg1); //desc sorting  lambda exp
      for (int i = 0; i <= nums.length()-1; i++) {
        result = result.concat(String.valueOf(list.get(i)));
         }
         return Integer.valueOf(result.trim());
  }
     public static int sortDesc2(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
     
     
}
