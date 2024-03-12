public class Dinner extends Course{
    CourseFactory courseFactory;

    public Dinner(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare() {
        meal = courseFactory.createMeal("Dinner");
        beverage = courseFactory.createBeverage();
    }
}
