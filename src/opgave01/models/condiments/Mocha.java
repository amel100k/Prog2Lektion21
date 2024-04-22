package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }
}
