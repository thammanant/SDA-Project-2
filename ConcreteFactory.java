public class ConcreteFactory extends CourseFactory {

    public Course createMeal(String CourseType) {
        if (CourseType.equals("Breakfast")) {
            return new Breakfast(this);
        } else if (CourseType.equals("Lunch")) {
            return new Lunch(this);
        } else if (CourseType.equals("Dinner")) {
            return new Dinner(this);
        } else {
            throw new IllegalArgumentException("Invalid Course Type");
        }
    }

    @Override
    Beverage createBeverage(String type) {
        if (type.equals("Coffee")) {
            return new Coffee();
        } else if (type.equals("Tea")) {
            return new Tea();
        }else {
            throw new IllegalArgumentException("Invalid Beverage Type");
        }
    }
}
