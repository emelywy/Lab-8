package org.example.colproj.labs.lab6.Decorator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

                System.out.println("Базовий номер");
                Room room1 = new Standart();
                System.out.println(room1.getDescription());
                System.out.println("Ціна: " + room1.getPrice());
                System.out.println("Послуги: " + room1.getServices());
                System.out.println();


                System.out.println("Люкс + Сніданок + СПА");
                Room room2 = new Lux();
                room2 = new Breakfast(room2);
                room2 = new Spa(room2);

                System.out.println(room2.getDescription());
                System.out.println("Ціна: " + room2.getPrice());
                System.out.println("Послуги: " + room2.getServices());

                RoomDecorator d2 = (RoomDecorator) room2;
                System.out.println("Має СПА? " + d2.douhaveServise("СПА"));
                System.out.println("Має більярд? " + d2.douhaveServise("Більярд"));
                System.out.println();


                System.out.println("Сімейний номер + Більярд + Квадроцикли + СПА");
                Room room3 = new Family();
                room3 = new Billiard(room3);
                room3 = new QuadBike(room3);
                room3 = new Spa(room3);

                System.out.println(room3.getDescription());
                System.out.println("Ціна: " + room3.getPrice());
                System.out.println("Послуги: " + room3.getServices());

                RoomDecorator d3 = (RoomDecorator) room3;
                System.out.println("Має Квадроцикли? " + d3.douhaveServise("Квадроцикли"));
                System.out.println("Має Сніданок? " + d3.douhaveServise("Сніданок"));
                System.out.println();


                System.out.println("Економ + Сніданок + Сніданок + СПА");
                // демонстрація подвійного декорування
                Room room4 = new Economy();
                room4 = new Breakfast(room4);
                room4 = new Breakfast(room4); // два сніданки :)
                room4 = new Spa(room4);

                System.out.println(room4.getDescription());
                System.out.println("Ціна: " + room4.getPrice());
                System.out.println("Послуги: " + room4.getServices());

                RoomDecorator d4 = (RoomDecorator) room4;
                System.out.println("Є СПА? " + d4.douhaveServise("СПА"));
                System.out.println("Є два сніданки? " + (room4.getServices().split("Сніданок").length - 1));
                System.out.println();


                System.out.println("5 різних номерів у списку");

                ArrayList<Room> orders = new ArrayList<>();

                Room order1 = new Standart();
                Room order2 = new Breakfast(new Economy());
                Room order3 = new Spa(new Lux());
                Room order4 = new QuadBike(new Standart());
                Room order5 = new Billiard(new Spa(new Lux()));

                orders.add(order1);
                orders.add(order2);
                orders.add(order3);
                orders.add(order4);
                orders.add(order5);

                int i = 1;
                for (Room r : orders) {

                    System.out.println("Замовлення #" + i++ + " ");
                    System.out.println(r.getDescription());
                    System.out.println("Ціна: " + r.getPrice());
                    System.out.println("Послуги: " + r.getServices());

                }


                System.out.println("\nПорівняння двох номерів");

                Room a = new Spa(new Lux());
                Room b = new Billiard(new Spa(new Lux()));

                System.out.println("Номер А: " + a.getDescription());
                System.out.println("Номер B: " + b.getDescription());

                if (a.getPrice() > b.getPrice())
                    System.out.println("A дорожчий");
                else if (b.getPrice() > a.getPrice())
                    System.out.println("B дорожчий");
                else
                    System.out.println("Однакова ціна");

                System.out.println();


                System.out.println("Великий комплекс декораторів");

                Room big = new Economy();
                big = new Breakfast(big);
                big = new Spa(big);
                big = new Billiard(big);
                big = new QuadBike(big);
                big = new Breakfast(big); // ще один сніданок
                big = new Spa(big);       // ще одне СПА

                System.out.println(big.getDescription());
                System.out.println("Ціна: " + big.getPrice());
                System.out.println("Послуги: " + big.getServices());

                RoomDecorator dMega = (RoomDecorator) big;

                System.out.println("Має більярд? " + dMega.douhaveServise("Більярд"));
                System.out.println("Сніданків: " + (big.getServices().split("Сніданок").length - 1));
                System.out.println("Квадроцикли доступні? " + dMega.douhaveServise("Квадроцикли"));
            }
        }