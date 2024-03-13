import java.util.List;

public class LunchBuilder extends MealBuilder{

    private String lunchDish;
    private final List<List<Object>> lunchMenu = menu.getLunchMenu();
    public void buildSingleDish(String dish){
        this.lunchDish = (String) ((List<Object>) lunchMenu.get(0).get(1)).get(Integer.parseInt(dish) - 1);
        buildDish(lunchDish);
    }

    public void buildAppetizer (String dish){
        this.lunchDish = (String) ((List<Object>) lunchMenu.get(1).get(1)).get(Integer.parseInt(dish) - 1);
        buildDish(lunchDish);
    }

    public void buildMainDish (String dish){
        this.lunchDish = this.lunchDish + (String) ((List<Object>) lunchMenu.get(1).get(2)).get(Integer.parseInt(dish) - 1);
        buildDish(lunchDish);
    }


    @Override
    public void buildDish(String dish) {
        lunchProduct.setDishes(dish);
    }
    
}
