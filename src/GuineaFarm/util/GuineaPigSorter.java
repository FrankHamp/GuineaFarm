package GuineaFarm.util;

import GuineaFarm.GuineaAgeComparator;
import GuineaFarm.GuineaNameComparator;
import GuineaFarm.GuinneaWeightComparator;
import GuineaFarm.model.GuineaPig;


import java.util.ArrayList;
import java.util.Collections;

/*
 Utility class for sorting guinea pigs.

 STUDENT TASK:
 Implement sorting methods using Collections.sort().
*/

public class GuineaPigSorter {

    public static void sortByName(ArrayList<GuineaPig> pigs) {

        // STUDENT TASK
        Collections.sort(pigs, new GuineaNameComparator());

    }

    public static void sortByAge(ArrayList<GuineaPig> pigs) {
        Collections.sort(pigs, new GuineaAgeComparator());
        // STUDENT TASK

    }

    public static void sortByWeight(ArrayList<GuineaPig> pigs) {
        Collections.sort(pigs, new GuinneaWeightComparator());
        // STUDENT TASK

    }


}