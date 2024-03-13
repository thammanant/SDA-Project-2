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
    

    public void createNewMeal(String mealType){
        switch (mealType) {
            case "1":
                breakfastProduct = new BreakfastProduct();
                break;
            case "2":
                lunchProduct = new LunchProduct();
                break;
            case "3":
                dinnerProduct = new DinnerProduct();
                break;
            default:
                break;
        }
    }

    public abstract void buildDish(String dish);
}
