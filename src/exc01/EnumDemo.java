package exc01;

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;

        apple = Apple.RedDel;

        System.out.println("Значение apple: " + apple);
        System.out.println();

        apple = Apple.GoldenDel;

        if(apple == Apple.GoldenDel) System.out.println("Переменая apple содержит GoldenDel.\n");

        switch(apple){
            case RedDel:
                System.out.println("Сорт RedDel красный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный.");
                break;
            case Jonathan:
                System.out.println("Сорт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
        }
    }
}
