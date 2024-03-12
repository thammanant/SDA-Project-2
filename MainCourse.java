import java.util.ArrayList;
public class MainCourse extends MealBuilder {
    private ArrayList<String> mainCourse;

    public MainCourse() {
        this.mainCourse = new ArrayList<>();
        // Add main course dishes to the list
        this.mainCourse.add("Steak");
        this.mainCourse.add("Chicken");
        this.mainCourse.add("Fish");
        
    }

    public void selectMainCourse(String selectedMainCourse) {
        if (this.mainCourse.contains(selectedMainCourse)) {
            // If the selected main course dish is in the list, build the dish
            buildDish(selectedMainCourse);
        } else {
            throw new IllegalArgumentException("Invalid main course selection");
        }
    }

    @Override
    public void buildDish(String dish) {
        // TODO Auto-generated method stub
        dinnerProduct.setDishes(dish);
    }

    
}