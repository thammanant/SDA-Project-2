public class BreakfastBuilder extends MealBuilder {

    private String breakfastDish;

   public void buildFullEnglish(String dish){
        switch (dish) {
            case "1":
                this.breakfastDish = "Sunshine Scramble: Fluffy scrambled eggs with vibrant chopped peppers, melty cheddar cheese, and a dollop of cool sour cream.";
                break;
            case "2":
                this.breakfastDish = "Smoked Salmon Stack: Layers of toasted rye bread piled high with silky smoked salmon, creamy ricotta cheese, and a sprinkle of fresh dill.";
                break;
            case "3":
                this.breakfastDish = "Mediterranean Veggie Frittata:** A baked egg dish packed with sun-dried tomatoes, sautéed spinach, crumbled feta cheese, and fragrant oregano.";
                break;
            default:
                throw new IllegalArgumentException("Invalid breakfast dish");
        }
        buildDish(breakfastDish);

   }

   public void buildLightFare(String dish){
    switch (dish) {
        case "1":
            this.breakfastDish = "Berry Burst Yogurt Parfait:Layers of creamy Greek yogurt, fresh seasonal berries, and a sprinkle of crunchy granola. Topped with a drizzle of honey for a touch of sweetness.";
            break;
        
        case "2":
            this.breakfastDish = "Tropical Smoothie Bowl: A refreshing blend of frozen mango, pineapple, and coconut milk poured into a bowl. Topped with sliced banana, chia seeds, and a sprinkle of toasted coconut flakes.";
            break;
        
        case "3":
            this.breakfastDish = "**Open-Faced Avocado Toast:** Smashed ripe avocado on toasted whole-wheat bread drizzled with lemon juice. Topped with a sprinkle of crumbled feta cheese, a chiffonade of fresh herbs (like basil or chives), and a sprinkle of red pepper flakes for a touch of heat";
    
        default:
            throw new IllegalArgumentException("Invalid breakfast dish");
    }

    buildDish(breakfastDish);
   }





    @Override
    public void buildDish(String dish) {
        breakfastProduct.setDishes(dish);
    }
    
}
