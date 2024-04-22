package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Soy extends CondimentDecorator{
    protected Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "added Soy";
    }
}
