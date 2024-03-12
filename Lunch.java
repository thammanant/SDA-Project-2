public class Lunch extends Course{
    CourseFactory courseFactory;

    public Lunch(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare() {
        meal = courseFactory.createMeal("Lunch");
        beverage = courseFactory.createBeverage();
    }
}
