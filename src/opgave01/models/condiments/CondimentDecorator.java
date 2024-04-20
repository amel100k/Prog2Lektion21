package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public abstract String getDescription();
}
