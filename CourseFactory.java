import java.util.Observable;

public abstract class CourseFactory extends Observable {
    public abstract Course createMeal(String type);
    public abstract Beverage createBeverage(String type);

    public void setData(String CourseType, String BeverageType) {
        setChanged();
        notifyObservers(new CourseData(CourseType, BeverageType));
    }

    public class CourseData {
        private final String CourseType;
        private final String BeverageType;

        public CourseData(String CourseType, String BeverageType) {
            this.CourseType = CourseType;
            this.BeverageType = BeverageType;
        }

        public String getCourseType() {
            return CourseType;
        }

        public String getBeverageType() {
            return BeverageType;
        }
    }
}
