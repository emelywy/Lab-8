package zalik.task4;

public class Digital extends Camera{

    private String connectionType;

    public Digital() { // Пустий конструктор
        super();
    }

    public Digital(String name, int year, double weight, double display,     // Перевантажений конструктор
                   int megapixels, int batteryLife, int zoom,
                   String videoResolution, String memoryType,
                   String connectionType) { super(name, year, weight, "Цифровий", display, megapixels, batteryLife, zoom, videoResolution, memoryType);

        this.connectionType = connectionType;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
}