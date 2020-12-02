package Models;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {
    @Test
    public void ConstructorTest(){
        Integer id = 6;
        String customer = "Frank";
        String topping = "Pepperoni";
        String size = "18";
        Double price = 17.99;
        Pizza pizza = new Pizza(id, customer,topping,size,price);

        Integer actualID = pizza.getId();
        String actualCustomer = pizza.getCustomer();
        String actualTopping = pizza.getTopping();
        String actualSize = pizza.getSize();
        Double actualPrice = pizza.getPrice();

        assertEquals(id,actualID);
        assertEquals(customer,actualCustomer);
        assertEquals(topping,actualTopping);
        assertEquals(size,actualSize);
        assertEquals(price,actualPrice);

    }
    @Test
    public void setIdTest(){
        Pizza pizza = new Pizza();
        Integer id = 6;

        pizza.setId(id);
        Integer actual = pizza.getId();

        assertEquals(id,actual);


//    make new pizza
//    set value
//            another variable = pizza current value ex: gettopping
//                assert ()

    }

}
