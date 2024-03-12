public class ConcreteFactory extends CourseFactory {

    @Override
    public Course createMeal(String CourseType) {
        switch (CourseType) {
            case "Breakfast":
                return new Breakfast(this);
            case "Lunch":
                return new Lunch(this);
            case "Dinner":
                return new Dinner(this);
            default:
                throw new IllegalArgumentException("Invalid Course Type");
        }
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
