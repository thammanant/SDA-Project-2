import java.util.ArrayList;

public abstract class TheMeal {
    private ArrayList<String> dishes = new ArrayList<>();


    
    public abstract void setDishes(ArrayList<String> dishes);

    public void toStrings() {
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
     
}
