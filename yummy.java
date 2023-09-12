public class yummy {
    public static void main(String [] args){
        System.out.println("yummy");
        chocolate();
        frenchFries();
        iceCream();
    }
    public static void chocolate(){
        System.out.print("Chocolate ");
        System.out.println("cake");
    }
    public static void frenchFries(){
        System.out.println("French Fries with Ketchup.");
        chocolate();
        System.out.println("That was yummy.");
    }
    public static void iceCream(){
        System.out.println("Ice");
        frenchFries();
        System.out.print("cream");

    }
}