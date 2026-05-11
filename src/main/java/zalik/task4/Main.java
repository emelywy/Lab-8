package zalik.task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //створюємо об'єкти
        Camera nikon1 = new Digital("Nikon D3500", 2022, 450, 3.2,  24, 3000, 5, "4K", "SD", "Wi-Fi");
        Camera nikon2 = new Digital("Nikon Z50", 2023, 400, 3.0, 20, 3100, 4, "4K", "SD", "Bluetooth");

        Camera canon1 = new Mirror("Canon EOS 90D", 2021, 520, 3.0, 32, 3200, 10, "Full HD", "SD", "EF");
        Camera canon2 = new Mirror("Canon EOS 6D", 2020, 550, 3.2, 26, 3300, 12, "Full HD", "SD", "EF-S");

        Camera film1 = new Film("Zenit E", 1985, 800, 2.5, 0, 0, 0, "N/A", "35mm", "Color");
        Camera film2 = new Film("Canon AE-1", 1976, 750, 2.8, 0, 0, 0, "N/A", "35mm", "Black & White");

        ArrayList<Camera> cameras = new ArrayList<>(); // динамічна колекція

        cameras.add(nikon1);
        cameras.add(nikon2);
        cameras.add(canon1);
        cameras.add(canon2);
        cameras.add(film1);
        cameras.add(film2);

        System.out.println("Колекція фотоапаратів:"); //виводимо інформацію
        for (Camera c : cameras) {
            c.toPrint();
        }
    }
}
