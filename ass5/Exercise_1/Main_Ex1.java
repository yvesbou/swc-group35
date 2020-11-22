public class Main_Ex1 {

    public static void main(String[] args){


    //Sandwich fein = new Bread(new Cheese(),new Ham(), new Tomatoes(), new Tuna());

    Sandwich sandwich = new Bread();

    Sandwich sandwich_wTuna_wCheese = new Cheese(new Cheese(new Tuna(new Bread())));
    Cake cake_wTopping = new Chocolate(new Chocolate(new Chocolate(new RawCake())));
    System.out.println(sandwich_wTuna_wCheese.cost());
    System.out.println(cake_wTopping.cost());
}}
