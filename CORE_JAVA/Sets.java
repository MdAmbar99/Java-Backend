import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class Sets{
    public static void main(String args[]) {

        // Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();          // for Sorted order

        nums.add(61);
        nums.add(81);
        nums.add(32);
        nums.add(56);
        nums.add(46);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // for(Object n : nums){
        //     System.out.println(n);
        // }
    }
}