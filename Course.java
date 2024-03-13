public abstract class Course {
    CourseFactory courseFactory;
    TheMeal meal;
    Beverage beverage;

    abstract void prepare(String courseType, String options, String beverageType);
    abstract void constructMeal(String category, String options);

    public String toString() {
        return "Beverage: " + beverage;
    }
}
