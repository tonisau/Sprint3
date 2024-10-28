package tasca2.n1.builders;

import tasca2.n1.Dough;
import tasca2.n1.Pizza;
import tasca2.n1.Size;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiianBuilder implements PizzaBuilder {
    private final Pizza pizza;
    private final List<String> toppings = new ArrayList<String>(List.of("tomate", "queso", "jamón", "piña"));

    public PizzaHawaiianBuilder() {
        pizza = new Pizza();
    }

    @Override
    public PizzaHawaiianBuilder setSize(Size size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaHawaiianBuilder setDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaHawaiianBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        pizza.setToppings(toppings);
        return pizza;
    }
}
