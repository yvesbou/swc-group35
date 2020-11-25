import java.util.ArrayList;
import java.util.List;

public class Main_Ex1 {

    public static void main(String[] args){
    Facility centraloffice = new CentralOffice();

    Facility cityoffice1 = new CityOffice("Bonstetten");
    Facility cityoffice2 = new CityOffice("Rikon");
    Facility cityoffice3 = new CityOffice("Sennhof");

    centraloffice.add(cityoffice1);
    centraloffice.add(cityoffice2);
    centraloffice.add(cityoffice3);

    Address a1 = new Address("Sonnenhaldestrasse", 5,8906,"Bonstetten");
    Address a2 = new Address("Sennenhof", 68, 6869, "Rikon");
    Address a3 = new Address("Boringstrasse", 0, 1000, "Sennhof");
    Address a4 = new Address("Bodenfeldstrasse", 14,8906,"Bonstetten");
    Address a5 = new Address("Hinterdorfstrasse", 70, 6869, "Rikon");
    Address a6 = new Address("Zürcherstrasse", 10, 1000, "Sennhof");
    Address a7 = new Address("Rainlistrasse", 5,8906,"Bonstetten");
    Address a8 = new Address("Im Hummel", 65, 6869, "Rikon");
    Address a9 = new Address("HolprigerWeg", 0, 1000, "Sennhof");
    Facility bakery1 = new NormalBakery(a1, "Steiner");
    Facility bakery2 = new NormalBakery(a2, "Sprüngli");
    Facility bakery3 = new BreadOnlyBakery(a3, "HartesBrot");
    Facility bakery4 = new BreadOnlyBakery(a4, "Müller");
    Facility bakery5 = new NormalBakery(a5, "Vittez");
    Facility bakery6 = new SweetsOnlyBakery(a6, "Siegenthalers Schleckereien");
    Facility bakery7 = new NormalBakery(a7, "Ferdinands Brot");
    Facility bakery8 = new BreadOnlyBakery(a8, "Hohenzollers Brot");
    Facility bakery9 = new SweetsOnlyBakery(a9, "Wüthrich Macrons");

    cityoffice1.add(bakery1);
    cityoffice1.add(bakery4);
    cityoffice1.add(bakery7);

    cityoffice2.add(bakery2);
    cityoffice2.add(bakery5);
    cityoffice2.add(bakery8);

    cityoffice3.add(bakery3);
    cityoffice3.add(bakery6);
    cityoffice3.add(bakery9);

    CEO ceo = new CEO(centraloffice);
    ceo.printAllEntities();

    ArrayList<String> list=new ArrayList<String>();
    list.add("Cheese");
    list.add("Cheese");
    list.add("Tuna");
    Sandwich sandwich_wTuna_wCheese = null;
    try {
        sandwich_wTuna_wCheese = bakery1.SellBreads(list);
    } catch (WeSellSweetsOnlyException e) {
        System.out.println("It was worth a try to see if they have a delicious cake");
    }

    ArrayList<String> sweetList=new ArrayList<String>();
    sweetList.add("Chocolate");
    sweetList.add("Chocolate");
    Cake cake_wTopping = null;
    try {
        cake_wTopping = bakery6.SellSweets(sweetList);
    } catch (WeSellBreadOnlyException e) {
        System.out.println("It was worth a try to see if they have a delicious sandwich");
    }

    try {
        Cake doTheyEvenHave_aCake = bakery3.SellSweets(sweetList);
    } catch (WeSellBreadOnlyException e) {
        System.out.println("It was worth a try to see if they have a delicious sandwich");
    }

    System.out.println(sandwich_wTuna_wCheese.cost());
    System.out.println(cake_wTopping.cost());
}}
