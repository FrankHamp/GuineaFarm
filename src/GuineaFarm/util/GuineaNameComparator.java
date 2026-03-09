package GuineaFarm.util;
import GuineaFarm.model.GuineaPig;

import java.util.*;

// Comparator til at sortere efter titel (alfabetisk)
public class GuineaNameComparator implements Comparator<GuineaPig> {
    @Override
    public int compare(GuineaPig m1, GuineaPig m2) {
        return m1.getName().compareToIgnoreCase(m2.getName());
    }
}

