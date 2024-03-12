public abstract class Course {
    MealBuilder mealBuilder;
    Beverage beverage;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    abstract void prepare(String courseType, String beverageType);

    public String toString() {
        return "Beverage: " + beverage;
    }
}
