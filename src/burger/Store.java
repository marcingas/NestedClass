package burger;



public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Jupitero","Ketchup","Mayo","Bacon","JAMAOOO");
        System.out.println(regularMeal);
        Meal usMeal = new Meal(0.68);
        System.out.println(usMeal);
    }
}
