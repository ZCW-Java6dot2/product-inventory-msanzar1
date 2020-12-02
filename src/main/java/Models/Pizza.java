package Models;

public class Pizza {
    private Integer id;
    private String customer;
    private String topping;
    private String size;
    private Double price;

    public Pizza(Integer id, String customer, String topping, String size,Double price){
        this.id = id;
        this.customer = customer;
        this.topping = topping;
        this.size = size;
        this.price = price;
    }

    public Pizza(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
