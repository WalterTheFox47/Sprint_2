package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getAmount() * item.getPrice();
        }
        return sum;
    }

    public double getTotalWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            double price = item.getPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            double finalPrice = price * (1 - discount / 100);
            sum += finalPrice * item.getAmount();
        }
        return sum;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getAmount() * item.getPrice();
            }
        }
        return sum;
    }
}
