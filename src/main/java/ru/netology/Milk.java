package ru.netology;

public class Milk extends Product implements  IEatNow, IEatAfter{
    //SOLID. Single Responsibility Principle - класс Milk описывает только один продукт
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Молоко";
    private final int price = 74;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void cook() {
        System.out.println("Сначала приготовить");
    }

    @Override
    public void eat() {
        System.out.println("Можно употреблять сразу");
    }
}