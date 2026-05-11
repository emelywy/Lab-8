package zalik.task4;

public class Camera {

        private String name;  // Основні параметри
        private int year;
        private double weight;
        private String type;
        private double display;
        private int megapixels;
        private int batteryLife;
        private int zoom;
        private String videoResolution;
        private String memoryType;

        public  Camera() { //Пустий конструктор

        }

        public Camera(String name, int year, double weight, String type, // Конструктор повний
                      double display, int megapixels,
                      int batteryLife, int zoom,
                      String videoResolution, String memoryType) {

            this.name = name;
            this.year = year;
            this.weight = weight;
            this.type = type;
            this.display = display;
            this.megapixels = megapixels;
            this.batteryLife = batteryLife;
            this.zoom = zoom;
            this.videoResolution = videoResolution;
            this.memoryType = memoryType;
        }

        public String getName() { //гетери
            return name;
        }

        public int getYear() {
            return year;
        }

        public double getWeight() {
            return weight;
        }

        public String getType() {
            return type;
        }

        public double getDisplay() {
            return display;
        }

        public int getMegapixels() {
            return megapixels;
        }

        public int getBatteryLife() {
            return batteryLife;
        }

        public int getZoom() {
            return zoom;
        }

        public String getVideoResolution() {
            return videoResolution;
        }

        public String getMemoryType() {
            return memoryType;
        }

        public void setName(String name) { //сетери
            this.name = name;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setDisplay(double display) {
            this.display = display;
        }

        public void setMegapixels(int megapixels) {
            this.megapixels = megapixels;
        }

        public void setBatteryLife(int batteryLife) {
            this.batteryLife = batteryLife;
        }

        public void setZoom(int zoom) {
            this.zoom = zoom;
        }

        public void setVideoResolution(String videoResolution) {
            this.videoResolution = videoResolution;
        }

        public void setMemoryType(String memoryType) {
            this.memoryType = memoryType;
        }

        public void toPrint() {   //вивід інформації
            System.out.println(
                    "Назва: " + name +
                            ", Рік: " + year +
                            ", Вага: " + weight + " г" +
                            ", Тип: " + type +
                            ", Дисплей: " + display + "''" +
                            ", Мп: " + megapixels +
                            ", Батарея: " + batteryLife + " mAh" +
                            ", Зум: " + zoom + "x" +
                            ", Відео: " + videoResolution +
                            ", Пам'ять: " + memoryType
            );
        }
    }
