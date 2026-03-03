

public class Inheritance{
    public static void main(String args[]){
        
    VeryAdvCalc obj = new VeryAdvCalc();
    int r1 = obj.add(4,7);
    int r2 = obj.sub(-7,9);
    int r3 = obj.multi(-7,2);
    int r4 = obj.div(27,9);
    double r5 = obj.power(4,2);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}

// Multiple inheritance will not work in java (because of AMBIGUITY problem)