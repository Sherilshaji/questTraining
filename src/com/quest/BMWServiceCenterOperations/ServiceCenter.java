package com.quest.BMWServiceCenterOperations;

import java.util.HashSet;
import java.util.Set;

public class ServiceCenter<T> {
    T object;
    private Set<T> set=new HashSet<>();


    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void addServicedVehicle(T vehicle){
        set.add(vehicle);
    }

    public Set<T> getAllServicedVehicles(){
        return set;
    }
}
