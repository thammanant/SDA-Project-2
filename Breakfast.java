public class Breakfast extends Course{
    CourseFactory courseFactory;

    public Breakfast(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String beverageType) {
        beverage = courseFactory.createBeverage(beverageType);
    }
}
