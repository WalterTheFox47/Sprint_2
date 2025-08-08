import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] products = { meat, redApple, greenApple };

        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма без скидки: %.2f%n", cart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f%n", cart.getTotalWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n", cart.getVegetarianTotalWithoutDiscount());
    }
}
