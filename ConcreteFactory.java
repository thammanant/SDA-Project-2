public class ConcreteFactory extends CourseFactory {

    @Override
    public MealBuilder createMealBuilder(String CourseType) {
        switch (CourseType) {
            case "FullEnglish":
                return new FullEnglish();
            case "LightFare":
                return new LightFare();
            case "SingleDish":
                return new SingleDish();
            case "TwoCourse":
                return new TwoCourse();
            case "DinnerAppetiser":
                return new DinnerAppetiser();
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
