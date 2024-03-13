import java.util.Observable;

public abstract class CourseFactory extends Observable {
    public abstract Beverage createBeverage(String type);

    public void setData(String CourseType, String Options, String BeverageType) {
        setChanged();
        notifyObservers(new CourseData(CourseType, Options, BeverageType));
    }

    public static class CourseData {
        private final String CourseType;
        private final String Options;
        private final String BeverageType;

        public CourseData(String CourseType, String Options, String BeverageType) {
            this.CourseType = CourseType;
            this.Options = Options;
            this.BeverageType = BeverageType;
        }

        public String getCourseType() {
            return CourseType;
        }

        public String getBeverageType() { return BeverageType; }

        public String getOptions() { return Options; }
    }
}
