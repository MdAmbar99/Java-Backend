interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run ... ");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : Faster ... ");
    }
}

class Developer{
    public void devApp(Computer comp){             // passing - Computer object
        comp.code();
    }
}

public class Interface{
    public static void main(String args[]){

        // interface refrence
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer ambar = new Developer();
        ambar.devApp(desk);

    }
}