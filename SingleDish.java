import java.util.ArrayList;
public class SingleDish extends MealBuilder{
    private ArrayList<String> singleDish;

    public SingleDish() {
        this.singleDish = new ArrayList<>();
        // Add single dish to the list
        this.singleDish.add("Pizza");
        this.singleDish.add("Burger");
        this.singleDish.add("Pasta");
        
    }

    public void selectSingleDish(String selectedSingleDish) {
        if (this.singleDish.contains(selectedSingleDish)) {
            // If the selected single dish is in the list, build the dish
            buildDish(selectedSingleDish);
        } else {
            throw new IllegalArgumentException("Invalid single dish selection");
        }
    }

    @Override
    public void buildDish(String dish) {
        lunchProduct.setDishes(dish);
    }
    
}
