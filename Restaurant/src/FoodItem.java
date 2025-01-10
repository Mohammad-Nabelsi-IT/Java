public class FoodItem extends MenuItem{
    private String ingredients;

    public FoodItem(int itemId, String name, double price, String category) {
        super(itemId, name, price, category);
    }

    public FoodItem(int itemId, String name, double price, String category, String ingredients) {
        super(itemId, name, price, category);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ingredients='" + ingredients + '\'' +
                '}';
    }
}
