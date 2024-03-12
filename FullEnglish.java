import java.util.ArrayList;

public class FullEnglish extends MealBuilder {
    private ArrayList<String> fullEnglish;

    public FullEnglish() {
        this.fullEnglish = new ArrayList<>();
        // Add full English dishes to the list
        this.fullEnglish.add("Bacon");
        this.fullEnglish.add("Eggs");
        this.fullEnglish.add("Sausage");
        
    }

    public void selectFullEnglish(String selectedFullEnglish) {
        if (this.fullEnglish.contains(selectedFullEnglish)) {
            // If the selected full English dish is in the list, build the dish
            buildDish(selectedFullEnglish);
        } else {
            throw new IllegalArgumentException("Invalid full English selection");
        }
    }



    @Override
    public void buildDish(String dish) {
        breakfastProduct.setDishes(dish);
    }
    
}
