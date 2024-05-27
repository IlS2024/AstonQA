public class Park {
// Внутренний класс для хранения информации об аттракционах
    public static class Attractions {
    private String name;    // Название аттракциона
    private String time;    // Время работы аттракциона
    private double cost;    // Стоимость посещения аттракциона

    public Attractions(String name, String time, double cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
        }

    public String getName() {
        return name;
        }
    public void setName(String name) {
        this.name = name;
        }
    public String getTime() {
        return time;
        }
    public void setTime(String time) {
        this.time = time;
        }
    public double getCost() {
         return cost;
        }
    public void setCost(double cost) {
         this.cost = cost;
        }
    }
}