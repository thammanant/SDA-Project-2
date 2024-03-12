public abstract class Course {
    private MealBuilder mealBuilder;
    private Beverage beverage;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    abstract void prepare();
}
