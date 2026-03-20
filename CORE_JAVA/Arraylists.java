import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Arraylists{
    public static void main(String args[]) {

        // Collection<Integer> nums = new ArrayList<>();

        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(8);
        nums.add(2);
        nums.add(5);

        System.out.println(nums.get(1));
        System.out.println(nums);

        System.out.println(nums.indexOf(5));


        // for(Object n : nums){
        //     System.out.println(n);
        // }
    }
}