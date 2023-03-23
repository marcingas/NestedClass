package burger;

public class Meal {
    private double base = 5.0;
    private Item burger;
    private Item drink;
    private Item side;

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, price);
        }
    }
}
