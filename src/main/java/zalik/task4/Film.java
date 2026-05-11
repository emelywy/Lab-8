package zalik.task4;

public class Film extends Camera{

    private String filmType;

    public Film() { // Пустий конструктор
        super();
    }

    public Film(String name, int year, double weight, double display, // Перевантажений конструктор
                int megapixels, int batteryLife, int zoom,
                String videoResolution, String memoryType,
                String filmType) { super(name, year, weight, "Плівковий",  display, megapixels,  batteryLife, zoom, videoResolution, memoryType);

        this.filmType = filmType;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }
}
