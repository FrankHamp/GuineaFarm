package GuineaFarm;

import GuineaFarm.model.GuineaPig;

import java.util.Comparator;

// Comparator til at sortere efter genre (alfabetisk)
public class GuinneaWeightComparator implements Comparator<GuineaPig> {
    @Override
    public int compare(GuineaPig m1, GuineaPig m2) {
        return Integer.compare((int) m1.getWeight(), (int) m2.getWeight());
    }
}
