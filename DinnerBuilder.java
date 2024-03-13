public class DinnerBuilder extends MealBuilder{
    private String dinnerDish;

    public void buildAppetizer(String dish){
        switch (dish) {
            case "1":
                this.dinnerDish = "Pan-Seared Scallops with Mango Salsa -  Seared scallops cooked to perfection and drizzled with a vibrant mango salsa bursting with fresh flavors. A light and elegant way to begin your dinner.\n";
                break;
            case "2":
                this.dinnerDish = "Miniature Crab Cakes with Remoulade Sauce - Bite-sized crab cakes packed with fresh crabmeat and seasoned to perfection. Served with a creamy remoulade sauce for dipping. A delightful and flavorful starter.\n";
                break;
            case "3":
                this.dinnerDish = "Grilled Portobello Mushrooms with Goat Cheese and Caramelized Onions - Marinated portobello mushrooms grilled until tender and topped with creamy goat cheese and caramelized onions for a sweet and savory combination.\n";
                
                break;
            default:
                throw new IllegalArgumentException("Invalid dinner dish");
        }
        buildDish(dinnerDish);
    }

    public void buildMainDish(String dish){
        switch (dish) {
            case "1":
                this.dinnerDish = this.dinnerDish + "Herb-Crusted Rack of Lamb with Roasted Root Vegetables - A tender rack of lamb seasoned with a fragrant herb crust and roasted alongside colorful root vegetables like carrots, parsnips, and potatoes. A satisfying and flavorful main course.\n";
                break;
            case "2":
                this.dinnerDish = this.dinnerDish + "Pan-Seared Salmon with Lemon Risotto and Asparagus - Pan-seared salmon fillet cooked with a crispy skin and served over a bed of creamy lemon risotto. Accompanied by tender asparagus spears for a complete and delicious meal.\n";
                break;
            case "3":
                this.dinnerDish = this.dinnerDish + "Chicken Marsala with Pappardelle Pasta - Tender chicken breast cooked in a rich Marsala wine sauce with mushrooms and served over wide pappardelle pasta. A classic Italian dish with a comforting flavor.\n";
                break;
            default:
                throw new IllegalArgumentException("Invalid dinner dish");
        }
        buildDish(dinnerDish);
    }

    public void buildDessert(String dish){
        switch (dish) {
            case "1":
                this.dinnerDish = this.dinnerDish + "Decadent Dark Chocolate Mousse - A rich and luxurious dark chocolate mousse, perfect for satisfying your sweet tooth after the savory meal.";
                break;
            case "2":
                this.dinnerDish = this.dinnerDish + "Light and Luscious Lemon Ricotta Cheesecake - A refreshing cheesecake with a creamy ricotta filling and a bright lemon flavor. A perfect ending to a lighter dinner.";
                break;
            case "3":
                this.dinnerDish = this.dinnerDish + "Spiced Pear Crumble with Vanilla Ice Cream - Warm and comforting spiced pear crumble with a buttery crumble topping. Served with a scoop of vanilla ice cream for a delightful and seasonal dessert. ";
                break;
            default:
                throw new IllegalArgumentException("Invalid dinner dish");
        }
        buildDish(dinnerDish);
    }

    @Override
    public void buildDish(String dish) {
        dinnerProduct.setDishes(dish);
    }
}
