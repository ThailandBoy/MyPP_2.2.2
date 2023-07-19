package web.model;

public class Car {

    private long id;
    private String model;
    private int number;

    public Car(long id, String model, int number) {
        this.id = id;
        this.model = model;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + ' ' +
                ", number=" + number +
                '}';
    }
}
