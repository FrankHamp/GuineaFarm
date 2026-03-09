package GuineaFarm;

import GuineaFarm.model.GuineaPig;

import java.util.Comparator;

// Comparator til at sortere efter releaseYear (stigende)
public class GuineaAgeComparator implements Comparator<GuineaPig> {
    @Override
    public int compare(GuineaPig m1, GuineaPig m2) {return Integer.compare(m1.getAge(), m2.getAge());
    }
}
