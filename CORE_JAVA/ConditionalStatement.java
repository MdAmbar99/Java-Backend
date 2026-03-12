class ConditionalStatement{
    public static void main(String args[]){
        int x = 178;

        if(x > 10 && x <= 20){
            System.out.println("Hello ...");
        }
        else{
            System.out.println("bye...");
        }



        int a = 8;
        int b = 17;
        int c = 16;

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        // ternery operator
        int n=4;

        int result = 0;

        result = n%2==0  ? 10 : 20;

        System.out.println(result);


        // Switch 

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thu");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Enter a valid number...");
        }

    }
}