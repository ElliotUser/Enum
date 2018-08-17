package exc03;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Яблоко сорта Winesap стоит "+Apple.Winesap.getPrice()+" центов.");

        System.out.println("Цена на все сорта яблок: ");
        for(Apple a : Apple.values()) {
            System.out.println(a+" стоит "+a.getPrice()+" центов.");
        }
    }
}
