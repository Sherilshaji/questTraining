package com.quest.Map;

import java.util.Comparator;
import java.util.Map;

public class MapEntryComparator implements Comparator<Map.Entry<Employee,Double>> {


    @Override
    public int compare(Map.Entry<Employee,Double> o1, Map.Entry<Employee,Double> o2) {
        Double d1 = o1.getValue();
        Double d2 = o2.getValue();
        if(d1 > d2){
            return 1;
        } else if (d1 < d2) {
            return -1;
        }
        return 0;
    }
}
