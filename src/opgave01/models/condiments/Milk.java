package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Milk extends CondimentDecorator{
    protected Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "added Milk";
    }
}
