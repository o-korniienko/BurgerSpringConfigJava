package burgers;

import supplements.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BurgerBig implements Burger {

    private List<Supplements> supplements;

    public BurgerBig(Supplements ... s) {
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
