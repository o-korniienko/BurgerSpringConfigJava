package burgers;

import supplements.Supplements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BurgerMedium implements Burger {

   private List<Supplements> supplements;

    public BurgerMedium(Supplements ... s) {
        this.supplements = new ArrayList<Supplements>(Arrays.asList(s));

    }

    @Override
    public double price() {
        double result = 0;
        for (Supplements s : supplements) {
            result += s.getPrice();
        }
        return result;
    }
}
