

public class TryCatch{
    public static void main(String args[]){

        int i=1;
        int j=0;

        int nums[] = new int[5];

        String str = null;

        try{
            j = 18/i;                   // critical statement ( may give error )

            System.out.println(str.length());

            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)             // Exception - is a class
        {
            System.out.println("Cannot devive by zero." );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your limit." );
        }
        catch(Exception e){
            System.out.println("Something went wrong : " + e);
        }

        System.out.println(j);

        System.out.println("hello");
    }
}