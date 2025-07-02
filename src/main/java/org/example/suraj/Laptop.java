package org.example.suraj;



import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="laptop")

public class Laptop {
    @Id
    private int id;
    private String model_name;
    private int price;

  @OneToOne(cascade = CascadeType.ALL)

  private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model_name='" + model_name + '\'' +
                ", price=" + price +
                '}';
    }
}

