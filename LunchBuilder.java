public class LunchBuilder extends MealBuilder{

    private String lunchDish;
    public void buildSingleDish(String dish){
        switch (dish) {
            case "1":
                this.lunchDish = "Curried Chickpea Salad: A protein-packed bowl filled with fluffy chickpeas tossed in a creamy curry sauce with chopped vegetables like red bell pepper, cucumber, and red onion. Served on a bed of mixed greens with a drizzle of tangy yogurt dressing.";
                break;

            case "2":
                this.lunchDish = "Tuscan White Bean Soup: A hearty and flavorful soup simmered with cannellini beans, kale, diced tomatoes, and Italian sausage. Finished with a drizzle of olive oil and a sprinkle of freshly grated Parmesan cheese.";
                break;

            case "3":
                this.lunchDish = "Salmon Nicoise Salad:** Seared salmon fillet served on a bed of mixed greens with sliced hard-boiled egg, Nicoise olives, cherry tomatoes, and a wedge of lemon. Dressed with a light and lemony vinaigrette.";
                break;
        
            default:
                throw new IllegalArgumentException("Invalid lunch dish");
        }
        buildDish(lunchDish);
    }

    //two course part
    public void buildAppetizer (String dish){
        switch (dish) {
            case "1":
                this.lunchDish = "Caprese Skewers with Balsamic Glaze- Bite-sized mozzarella balls, cherry tomatoes, and fresh basil leaves  skewered together and drizzled with a sweet and tangy balsamic glaze. Light and refreshing to start your lunch.\n";
                break;
            case "2":
                this.lunchDish = "Mediterranean Hummus with Crudités - Creamy hummus flavored with olive oil, lemon juice, and tahini served with an assortment of colorful vegetables like baby carrots, cucumber slices, and bell pepper strips for dipping\n";
                break;
            case "3":
                this.lunchDish = "Roasted Edamame with Chili Flakes and Sea Salt - Edamame pods roasted until crispy and lightly seasoned with chili flakes and sea salt. A simple and flavorful snack that's perfect for sharing.\n";
                break;

        
            default:
                throw new IllegalArgumentException("Invalid lunch dish");
        }
        buildDish(lunchDish);
    }

    public void buildMainDish (String dish){
        switch (dish) {
            case "1":
                this.lunchDish = this.lunchDish + "Lemon Garlic Shrimp with Zucchini Noodles-  Juicy shrimp sautéed in a fragrant lemon garlic sauce served over a bed of zucchini noodles. A healthy and flavorful combination perfect for a light lunch.";
                break;
            case "2":
                this.lunchDish =  this.lunchDish + "Chicken Caesar Wrap- Grilled chicken breast strips tossed in a light Caesar dressing with crisp romaine lettuce, Parmesan cheese, and crunchy croutons all wrapped up in a whole wheat tortilla. A classic and satisfying lunch option.";
                break;
            case "3":
                this.lunchDish =  this.lunchDish + "Lentil Soup with a Crusty Roll** - A hearty and comforting soup simmered with lentils, vegetables, and herbs. Served with a crusty roll for dipping. A vegetarian option packed with protein and fiber.";
                break;
        
            default:
                throw new IllegalArgumentException("Invalid lunch dish");
        }
        buildDish(lunchDish);
    }


    @Override
    public void buildDish(String dish) {
        lunchProduct.setDishes(dish);
    }
    
}
