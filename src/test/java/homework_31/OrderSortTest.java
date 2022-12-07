package homework_31;

import homework_29.Dish;
import homework_29.Drink;
import homework_29.InternetOrder;
import homework_29.Item;
import org.junit.Assert;
import org.junit.Test;

public class OrderSortTest {

    @Test
    public void sorting_test(){
        Dish dish1 = new Dish(1, "Борщ", "Описание1");
        Dish dish2 = new Dish(3, "Цезарь", "Описание2");
        Drink drink1 = new Drink(5, "Вино красное", "Описание3");
        Item[] arr1 = {dish1, drink1, dish2};
        InternetOrder internetOrder = new InternetOrder(arr1);
        Item[] sotred = internetOrder.sort();
        Item[] expected = {drink1, dish2, dish1};
            Assert.assertArrayEquals(sotred,expected);
    }
}
