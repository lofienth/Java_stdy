import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    //объявление полей класса
    private int id;
    private String name;
    private String courier;
    private LocalDateTime dateTime;
    private int type;

    // Конструктор
    public Order(int id, String name, String courier, LocalDateTime dateTime, int type) {
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.type = type;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourier() {
        return courier;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getType() {
        return type;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setType(int type) {
        this.type = type;
    }

    // Описание типа заказа
    public String getTypeDescription() {
        if (type == 1) return "Срочный заказ";
        if (type == 2) return "Обычный заказ";
        return "Неизвестный тип";
    }

    // Красивый вывод даты
    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return dateTime.format(formatter);
    }

    //переопределение метода toString()
    @Override //переопределяет метод, который уже есть в родительском классе
    public String toString() {
        return "===== Информация о заявке =====\n" +
                "ID: " + id + "\n" +
                "Товар: " + name + "\n" +
                "Курьер: " + courier + "\n" +
                "Дата и время: " + getFormattedDateTime() + "\n" +
                "Тип: " + getTypeDescription() + "\n" +
                "===============================";
    }
}
