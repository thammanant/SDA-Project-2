import java.util.List;

public class DinnerBuilder extends MealBuilder{
    private String dinnerDish;
    private final List<List<Object>> dinnerMenu = menu.getDinnerMenu();

    public void buildAppetizer(String dish){
        this.dinnerDish = (String) ((List<Object>) dinnerMenu.get(0).get(1)).get(Integer.parseInt(dish) - 1);
        buildDish(dinnerDish);
    }

    public void buildMainDish(String dish){
        this.dinnerDish = this.dinnerDish + (String) ((List<Object>) dinnerMenu.get(0).get(2)).get(Integer.parseInt(dish) - 1);
        buildDish(dinnerDish);
    }

    public void buildDessert(String dish){
        this.dinnerDish = this.dinnerDish + (String) ((List<Object>) dinnerMenu.get(0).get(3)).get(Integer.parseInt(dish) - 1);
        buildDish(dinnerDish);
    }

    @Override
    public void buildDish(String dish) {
        dinnerProduct.setDishes(dish);
    }
}
