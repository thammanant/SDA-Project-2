public abstract class MealBuilder {
    
    BreakfastProduct breakfastProduct;
    DinnerProduct dinnerProduct;
    LunchProduct lunchProduct;


    public BreakfastProduct getBreakfastProduct(){
        return breakfastProduct;
    
    }

    public DinnerProduct getDinnerProduct(){
        return dinnerProduct;
    }

    public LunchProduct getLunchProduct(){
        return lunchProduct;
    }
    

    public void createNewMeal(){
        //implement later (input parts) must have condition statement for checking which one to create
    }

    public abstract void buildDish(String dish);

        
}
