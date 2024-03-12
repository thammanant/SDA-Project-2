import java.util.Observable;

public abstract class CourseFactory extends Observable {
    public abstract Course createMeal(String type);
    public abstract Beverage createBeverage(String type);
}
