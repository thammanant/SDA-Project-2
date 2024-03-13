public class Breakfast extends Course{
    CourseFactory courseFactory;

    TheMeal meal;

    BreakfastBuilder mealBuilder = new BreakfastBuilder();


    public TheMeal getMeal() {
        return mealBuilder.getBreakfastProduct();
    }

    public void constructMeal(String category, String options){
        mealBuilder.createNewMeal("1");

        if (category.equals("FullEnglish")) {
            mealBuilder.buildFullEnglish(options);
        } else if (category.equals("LightFare")) {
            mealBuilder.buildLightFare(options);
        }
    }

    public Breakfast(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String options, String beverageType) {
        constructMeal(courseType, options);
        meal = getMeal();
        System.out.println("Preparing " + meal);
        beverage = courseFactory.createBeverage(beverageType);
    }
}
