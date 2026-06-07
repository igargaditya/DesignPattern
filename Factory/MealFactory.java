interface Pizza {
    public void prepare();
}

class FarmhousePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Farmhouse Pizza --> Jalapeno, Onions, Olives, Paneer, Corn");
    }
}

class CornPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Corn Pizza --> Onion, Corn");
    }
}

interface Burger {
    public void prepare();
}

class BurgerStandard implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Burger");
    }
}

class BurgerPremium implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Burger");
    }
}

class BurgerWheatStandard implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Wheat Burger");
    }
}

class BurgerWheatPremium implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Wheat Burger");
    }
}

public interface MealFactory {
    Burger createBurger(String burger);

    Pizza createPizza(String pizza);
}

class PizzaHut implements MealFactory {

    @Override
    public Burger createBurger(String burger) {
        if (burger == "Standard") {
            return new BurgerStandard();
        } else if (burger == "Premium") {
            return new BurgerPremium();
        }
        return null;
    }

    @Override
    public Pizza createPizza(String pizza) {
        if (pizza == "FarmHouse") {
            return new FarmhousePizza();
        } else if (pizza == "Corn") {
            return new CornPizza();
        }
        return null;
    }

}

class LaPinoz implements MealFactory {

    @Override
    public Burger createBurger(String burger) {
        if (burger == "Standard") {
            return new BurgerWheatStandard();
        } else if (burger == "Premium") {
            return new BurgerWheatPremium();
        }
        return null;
    }

    @Override
    public Pizza createPizza(String pizza) {
        if (pizza == "FarmHouse") {
            return new FarmhousePizza();
        } else if (pizza == "Corn") {
            return new CornPizza();
        }
        return null;
    }

}
