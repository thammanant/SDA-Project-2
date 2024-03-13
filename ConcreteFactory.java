public class ConcreteFactory extends CourseFactory {

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
