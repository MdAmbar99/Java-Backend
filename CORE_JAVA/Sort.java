import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + " : name = " + name + "]";
    }
}

public class Sort{
    public static void main(String args[]) {

        Comparator <Integer> com = new Comparator <Integer> (){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Comparator <Student> comp = new Comparator <Student> (){
            public int compare(Student i, Student j){
                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(63);
        nums.add(81);
        nums.add(29);
        nums.add(57);

        System.out.println(nums);

        Collections.sort(nums, com);

        System.out.println(nums);


        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Ambar"));
        studs.add(new Student(27, "Amar"));
        studs.add(new Student(29, "Aamir"));
        studs.add(new Student(12, "Asad"));

        for(Object s : studs){
            System.out.println(s);
        }

        System.out.println( " xxxxxxxxxx  ");

        Collections.sort(studs, comp);

        for(Object s : studs){
            System.out.println(s);
        }
    }
}