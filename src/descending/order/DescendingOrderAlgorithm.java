package descending.order;
/**
 *
 * @author Amr Halawani
 */
public class DescendingOrderAlgorithm {
    public static void main(String[] args) {
        //task:  https://www.codewars.com/kata/descending-order/java
       
        int testedNum= 167835492;
        
        long startTime1 = System.currentTimeMillis();
        int sol = DescendingOrder1.sortDesc(testedNum);
        long endTime1 = System.currentTimeMillis();
long duration1 = (endTime1 - startTime1); //millseconds  
System.out.println("sol = "+sol +" / time cons= "+ duration1 );
     
//-----------------------------------------------------------------------------//
        long startTime2 = System.currentTimeMillis();
        int bestP = DescendingOrder1.sortDesc2(testedNum);
        long endTime2 = System.currentTimeMillis();
        long duration2 = (endTime2 - startTime2); //millseconds  

     
        System.out.println(" best practice = "+ bestP +" / time cons= "+ duration2);
    }
    
}
