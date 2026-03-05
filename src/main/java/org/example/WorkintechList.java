package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkintechList extends ArrayList {
    @Override
    public boolean add(Object object) {
        if (!this.contains(object)) {
            return super.add(object);
        }
        return false;
    }

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object object) {
        boolean removed = super.remove(object);
        sort();
        return removed;
    }
}
