package homework_31;

import homework_29.*;
import org.junit.Test;

public class ExceptionTest {
    @Test(expected = OrderAlreadyAddedException.class) //тест пройден если выкинуто исключение
    public void  test() throws OrderAlreadyAddedException{
        Dish dish1 = new Dish(1, "Борщ", "Описание1");
        Dish dish2 = new Dish(3, "Цезарь", "Описание2");
        Dish dish3 = new Dish(3, "Суп грибной", "Описание3");
        Drink dish4 = new Drink(3, "Сок гранатовый", "Описание4");
        Drink dish5 = new Drink(3, "Лимонад натахтари", "Описание5");

        Item[] arr1 = {dish1};
        Item[] arr2 = {dish2};
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder(arr1);
        InternetOrder internetOrder = new InternetOrder(arr2);
        orderManager.addOrder("2", restaurantOrder); //делаем 2 заказа по одинаковому адресу 😈
        orderManager.addOrder("2", internetOrder);
    }
}
