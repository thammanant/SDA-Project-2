public class ConcreteFactory extends CourseFactory {

    @Override
    public MealBuilder createMealBuilder(String CourseType) {
        switch (CourseType) {
            case "BreakfastBuilder":
                return new BreakfastBuilder();
            case "LunchBuilder":
                return new LunchBuilder();
            case "DinnerBuilder":
                return new DinnerBuilder();
            default:
                throw new IllegalArgumentException("Invalid Course Type");
        }
        // TODO: Think about Dinner
    }

    @Override
    public Beverage createBeverage(String type) {
        if (type.equals("Coffee")) {
            return new Coffee();
        } else if (type.equals("Tea")) {
            return new Tea();
        }else {
            throw new IllegalArgumentException("Invalid Beverage Type");
        }
    }
}
