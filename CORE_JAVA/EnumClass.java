
enum Laptop{
    Macbook(2000),
    XPS(2200),
    Surface(),
    ThinkPad(1800);

    private int price;

    //defoult constructor
    private Laptop(){
        price = 500;
    }

    // parametorized constructor
    private Laptop(int price){
        this.price = price;
    }

    // setter
    public void setPrice(int price){
        this.price = price;
    }

    // getter
    public int getPrice(){
        return price;
    }

}

public class EnumClass{
    public static void main(String args[]){

        Laptop lap = Laptop.Macbook;

        System.out.println(lap + " : " + lap.getPrice());

        lap.setPrice(2500);

        // for all values
        Laptop lap1[] = Laptop.values();

        for(Laptop laptop : lap1){
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}