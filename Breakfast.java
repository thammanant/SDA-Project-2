public class Breakfast extends Course{
    CourseFactory courseFactory;

    public Breakfast(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare() {
        meal = courseFactory.createMeal("Breakfast");
        beverage = courseFactory.createBeverage();
    }
}
