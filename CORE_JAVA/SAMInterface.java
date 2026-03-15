
@FunctionalInterface
interface A{
    void show(int i);
}

@FunctionalInterface
interface B{
    int add(int a, int b);
}


// class C implements A{
//     public void show(){
//         System.out.println("in Show");
//     }
// }



public class SAMInterface{
    public static void main(String args[]){

        // A obj = new C();
        // obj.show();

        A obj = new A(){
            public void show(int i){
                System.out.println("in Show : " + i);
            }
        };

        obj.show(6);

        // lamda expression   - works only on functional interface

        A obj1 = (i) -> {
            System.out.println("in Show : " + i);
        };

        obj1.show(7);

        // return is removed (return a+b)
        B sum = (a,b) -> a+b;

        int result = sum.add(9,10);
        System.out.println(result);

    }
}