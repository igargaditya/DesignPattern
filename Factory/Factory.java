public class Factory {
    public static void main(String[] args) {
        MealFactory outlet = new LaPinoz();
        outlet.createBurger("Standard").prepare();
        outlet.createBurger("Premium").prepare();
        outlet.createPizza("FarmHouse").prepare();
        outlet.createPizza("Corn").prepare();

        outlet = new PizzaHut();
        outlet.createBurger("Standard").prepare();
        outlet.createBurger("Premium").prepare();
        outlet.createPizza("FarmHouse").prepare();
        outlet.createPizza("Corn").prepare();

    }
}
