import java.util.ArrayList;

public class Dessert extends MealBuilder{
    private ArrayList<String> desserts;

    public Dessert() {
        this.desserts = new ArrayList<>();
        // Add desserts to the list
        this.desserts.add("Cake");
        this.desserts.add("Ice Cream");
        this.desserts.add("Pudding");
        // Add more desserts as needed
    }

    public void selectDessert(String selectedDessert) {
        if (this.desserts.contains(selectedDessert)) {
            // If the selected dessert is in the list, build the dish
            buildDish(selectedDessert);
        } else {
            throw new IllegalArgumentException("Invalid dessert selection");
        }
    }

    @Override
    public void buildDish(String dish) {
        dinnerProduct.setDishes(dish);
       
    }
    
}
