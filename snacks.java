
public class Snack {

    //instance variables about snacks
    float price;
    String[] toppings;
    int quantity;
    Striing name;

    //constructor to make a snack
    public Snack(String name, int quanity, String[] toppings; float price){
        this.name = name;
        this.quanity = quanity;
        this.toppings = toppings;
        this.price = price;
    }

    public String toString(){
        return "Snack: " + name + " with " + Arrays.toString(toppings) + ", " + quantity + " at $" + price;
    }
    public static void main (String[] args){
        Snack oatmeal = new Snack("oatmeal", 0, new String[]{"brown sugar", "bananas", "cinnamon"}, price:0.02f);
        System.out.println(oatmeal);
        Snack cereal = new Snack("cereal", 2, new String[]{"honey", "bananas"}, price:0.5f);
        System.out.println(cereal);
    }

}