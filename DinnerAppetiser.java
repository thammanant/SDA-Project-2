import java.util.ArrayList;
import java.util.List;

public class DinnerAppetiser extends MealBuilder{

    private List<String> appetisers;

    public DinnerAppetiser() {
        this.appetisers = new ArrayList<>();
        // Add appetisers to the list
        this.appetisers.add("Appetiser 1");
        this.appetisers.add("Appetiser 2");
        this.appetisers.add("Appetiser 3");
        // Add more appetisers as needed
    }

    public void selectAppetiser(String selectedAppetiser) {
        if (this.appetisers.contains(selectedAppetiser)) {
            // If the selected appetiser is in the list, build the dish
            buildDish(selectedAppetiser);
        } else {
            throw new IllegalArgumentException("Invalid appetiser selection");
        }
    }

    @Override
    public void buildDish(String dish) {
        dinnerProduct.setDishes(dish);
        // Implement the method to build the DinnerAppetiser dish
        // based on the dish parameter
    }
    
}
