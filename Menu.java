import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Menu {
    // Breakfast
    private final List<String> fullEnglishOptions = Arrays.asList("Sunshine Scramble: Fluffy scrambled eggs with vibrant chopped peppers, melty cheddar cheese, and a dollop of cool sour cream.",
            "Smoked Salmon Stack: Layers of toasted rye bread piled high with silky smoked salmon, creamy ricotta cheese, and a sprinkle of fresh dill.",
            "Mediterranean Veggie Frittata: A baked egg dish packed with sun-dried tomatoes, sautéed spinach, crumbled feta cheese, and fragrant oregano.");

    private final List<String> lightFareOptions = Arrays.asList("Berry Burst Yogurt Parfait: Layers of creamy Greek yogurt, fresh seasonal berries, and a sprinkle of crunchy granola. Topped with a drizzle of honey for a touch of sweetness.",
            "Tropical Smoothie Bowl: A refreshing blend of frozen mango, pineapple, and coconut milk poured into a bowl. Topped with sliced banana, chia seeds, and a sprinkle of toasted coconut flakes.",
            "Open-Faced Avocado Toast: Smashed ripe avocado on toasted whole-wheat bread drizzled with lemon juice. Topped with a sprinkle of crumbled feta cheese, a chiffonade of fresh herbs (like basil or chives), and a sprinkle of red pepper flakes for a touch of heat.");

    private final List<Object> fullEnglish = Arrays.asList("FullEnglish", fullEnglishOptions);
    private final List<Object> lightFare = Arrays.asList("LightFare", lightFareOptions);

    private final List<List<Object>> breakfastMenu = Arrays.asList(fullEnglish, lightFare);

    // Lunch
    private final List<String> singleDishOptions = Arrays.asList("Curried Chickpea Salad: A protein-packed bowl filled with fluffy chickpeas tossed in a creamy curry sauce with chopped vegetables like red bell pepper, cucumber, and red onion. Served on a bed of mixed greens with a drizzle of tangy yogurt dressing.",
            "Tuscan White Bean Soup: A hearty and flavorful soup simmered with cannellini beans, kale, diced tomatoes, and Italian sausage. Finished with a drizzle of olive oil and a sprinkle of freshly grated Parmesan cheese.",
            "Salmon Nicoise Salad: Seared salmon fillet served on a bed of mixed greens with sliced hard-boiled egg, Nicoise olives, cherry tomatoes, and a wedge of lemon. Dressed with a light and lemony vinaigrette.");

    private final List<String> lunchAppetizers = Arrays.asList("Caprese Skewers with Balsamic Glaze: Bite-sized mozzarella balls, cherry tomatoes, and fresh basil leaves  skewered together and drizzled with a sweet and tangy balsamic glaze. Light and refreshing to start your lunch.",
            "Mediterranean Hummus with Crudités: Creamy hummus flavored with olive oil, lemon juice, and tahini served with an assortment of colorful vegetables like baby carrots, cucumber slices, and bell pepper strips for dipping.",
            "Roasted Edamame with Chili Flakes and Sea Salt: Edamame pods roasted until crispy and lightly seasoned with chili flakes and sea salt. A simple and flavorful snack that's perfect for sharing.");

    private final List<String> lunchMainDishes = Arrays.asList("Lemon Garlic Shrimp with Zucchini Noodles:  Juicy shrimp sautéed in a fragrant lemon garlic sauce served over a bed of zucchini noodles. A healthy and flavorful combination perfect for a light lunch.",
            "Chicken Caesar Wrap: Grilled chicken breast strips tossed in a light Caesar dressing with crisp romaine lettuce, Parmesan cheese, and crunchy croutons all wrapped up in a whole wheat tortilla. A classic and satisfying lunch option.",
            "Lentil Soup with a Crusty Roll: A hearty and comforting soup simmered with lentils, vegetables, and herbs. Served with a crusty roll for dipping. A vegetarian option packed with protein and fiber.");

    private final List<Object> singleDish = Arrays.asList("SingleDish", singleDishOptions);
    private final List<Object> twoCourse = Arrays.asList("TwoCourse", lunchAppetizers, lunchMainDishes);

    private final List<List<Object>> lunchMenu = Arrays.asList(singleDish, twoCourse);

    // Dinner
    private final List<String> dinnerAppetizers = Arrays.asList("Pan-Seared Scallops with Mango Salsa:  Seared scallops cooked to perfection and drizzled with a vibrant mango salsa bursting with fresh flavors. A light and elegant way to begin your dinner.",
            "Miniature Crab Cakes with Remoulade Sauce: Bite-sized crab cakes packed with fresh crabmeat and seasoned to perfection. Served with a creamy remoulade sauce for dipping. A delightful and flavorful starter.",
            "Grilled Portobello Mushrooms with Goat Cheese and Caramelized Onions: Marinated portobello mushrooms grilled until tender and topped with creamy goat cheese and caramelized onions for a sweet and savory combination.");

    private final List<String> dinnerMainDishes = Arrays.asList("Herb-Crusted Rack of Lamb with Roasted Root Vegetables: A tender rack of lamb seasoned with a fragrant herb crust and roasted alongside colorful root vegetables like carrots, parsnips, and potatoes. A satisfying and flavorful main course.",
            "Pan-Seared Salmon with Lemon Risotto and Asparagus: Pan-seared salmon fillet cooked with a crispy skin and served over a bed of creamy lemon risotto. Accompanied by tender asparagus spears for a complete and delicious meal.",
            "Chicken Marsala with Pappardelle Pasta: Tender chicken breast cooked in a rich Marsala wine sauce with mushrooms and served over wide pappardelle pasta. A classic Italian dish with a comforting flavor.");

    private final List<String> dinnerDesserts = Arrays.asList("Decadent Dark Chocolate Mousse: A rich and luxurious dark chocolate mousse, perfect for satisfying your sweet tooth after the savory meal.",
            "Light and Luscious Lemon Ricotta Cheesecake: A refreshing cheesecake with a creamy ricotta filling and a bright lemon flavor. A perfect ending to a lighter dinner.",
            "Spiced Pear Crumble with Vanilla Ice Cream: Warm and comforting spiced pear crumble with a buttery crumble topping. Served with a scoop of vanilla ice cream for a delightful and seasonal dessert. ");

    private final List<Object> dinner = Arrays.asList("Dinner", dinnerAppetizers, dinnerMainDishes, dinnerDesserts);

    private final List<List<Object>> dinnerMenu = Collections.singletonList(dinner);

    // all courses
    private final List<List<List<Object>>> allCourses = Arrays.asList(breakfastMenu, lunchMenu, dinnerMenu);

    public List<List<Object>> getBreakfastMenu() {
        return breakfastMenu;
    }

    public List<List<Object>> getLunchMenu() {
        return lunchMenu;
    }

    public List<List<Object>> getDinnerMenu() {
        return dinnerMenu;
    }

    public List<List<List<Object>>> getAllCourses() {
        return allCourses;
    }
}
