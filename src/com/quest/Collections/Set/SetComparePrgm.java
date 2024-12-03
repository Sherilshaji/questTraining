package com.quest.Collections.Set;

import java.util.HashSet;

public class SetComparePrgm {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        boolean flag=false;
        for(int i=0;i<set.size();i++){
            if(set.containsAll(set2)){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Sets are equal");
        }else{
            System.out.println("Sets are not equal");
        }

    }

}
