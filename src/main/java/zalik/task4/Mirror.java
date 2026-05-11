package zalik.task4;

public class Mirror extends Camera {

    private String lensType;

    public Mirror() { // Пустий конструктор
        super();
    }

    public Mirror(String name, int year, double weight, double display, // Перевантажений конструктор
                  int megapixels, int batteryLife, int zoom,
                  String videoResolution, String memoryType,
                  String lensType) { super(name, year, weight, "Дзеркальний",  display, megapixels, batteryLife, zoom, videoResolution, memoryType);

        this.lensType = lensType;
    }

    public String getLensType() {
        return lensType;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
}
