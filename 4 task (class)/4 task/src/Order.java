import java.time.LocalDateTime;

public class Order {
    //свойства класса
    private int id; //идентификатор заявки
    private String name; //название товара
    private String courier; //курьер
    private LocalDateTime dateTime; //дата и время
    private int type; //тип заказа: 1 - срочный заказ, 2 - обычный заказ

    //конструктор
    public Order(int id, String name, String courier, LocalDateTime dateTime, int type) {
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.type = type;
    }

    //геттеры
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

    //сеттеры
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

    //дополнительный метод для красивого вывода типа заказа
    public String getTypeDescription() {
        if(type == 1){
            return "Срочный заказ";
        }else if(type == 2){
            return "Обычный заказ";
        }else{
            return "Неизвестный тип";
        }
    }

    //переопределение метода toString()
    @Override //переопределяет метод, который уже есть в родительском классе
    public String toString() {
        return "===== Информация о заявке =====\n" +
                "ID заявки: " + id + "\n" +
                "Название товара: " + name + "\n" +
                "Курьер: " + courier + "\n" +
                "Дата и время: " + dateTime + "\n" +
                "Тип заказа: " + getTypeDescription() + "\n" +
                "===============================";
    }
}
