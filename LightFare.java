import java.util.ArrayList;
public class LightFare extends MealBuilder{
    private ArrayList<String> lightFare;

    public LightFare() {
        this.lightFare = new ArrayList<>();
        // Add light fare dishes to the list
        this.lightFare.add("Salad");
        this.lightFare.add("Soup");
        this.lightFare.add("Sandwich");
        
    }

    public void selectLightFare(String selectedLightFare) {
        if (this.lightFare.contains(selectedLightFare)) {
            // If the selected light fare dish is in the list, build the dish
            buildDish(selectedLightFare);
        } else {
            throw new IllegalArgumentException("Invalid light fare selection");
        }
    }


    @Override
    public void buildDish(String dish) {
        breakfastProduct.setDishes(dish);
    }
    
}
