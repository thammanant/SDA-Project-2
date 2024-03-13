import java.util.List;

public class BreakfastBuilder extends MealBuilder {

    private String breakfastDish;
    private final List<List<Object>> breakfastMenu = menu.getBreakfastMenu();

    public void buildFullEnglish(String dish){
        this.breakfastDish = (String) ((List<Object>) breakfastMenu.get(0).get(1)).get(Integer.parseInt(dish) - 1);
        buildDish(breakfastDish);
    }

    public void buildLightFare(String dish){
        this.breakfastDish = (String) ((List<Object>) breakfastMenu.get(1).get(1)).get(Integer.parseInt(dish) - 1);
        buildDish(breakfastDish);
    }

    @Override
    public void buildDish(String dish) {
        breakfastProduct.setDishes(dish);
    }
    
}
