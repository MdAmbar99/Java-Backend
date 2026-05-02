import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamAPI{
    public static void main(String args[]) {

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // int sum=0;
        // for(int n : nums){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        //System.out.println(sum);

        // for(Object n : nums){
        //     System.out.println(n);
        // }

        // nums.forEach(n -> System.out.println(n));

        //Consumer<Integer> con =  n -> System.out.println(n);

        // nums.forEach(n -> System.out.println(n));

        Stream <Integer> s1 = nums.stream();
        Stream <Integer> s2 = s1.filter(n -> n%2 == 0);

        s2.forEach(n -> System.out.println(n));

        // Predicate<Integer> p = n -> n%2==0;

        // Function<Integer, Integer> fun = n -> n*2;

        Stream <Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted();

        
        sortedValues.forEach(n -> System.out.println(n));
    }
}
