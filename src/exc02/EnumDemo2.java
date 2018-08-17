package exc02;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Константы перечеслимого типа Apple:");

        Apple allApples[] = Apple.values();

        for(Apple a:
            allApples) {
            System.out.println(a);
        }
        System.out.println();

        apple = Apple.valueOf("Winesap");
        System.out.println("Переменная apple содержит "+apple);
    }
}
