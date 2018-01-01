package com.phatdroid.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Administrator on 1/1/2018.
 */

public class Model extends Observable {
    private List<Integer> mList;

    public Model(){
        mList = new ArrayList<>(3);
    }
    public int getValueIndex(final int the_index){
        return mList.get(the_index);
    }
    public void setValueIndex(final int the_index){
        mList.set(the_index,mList.get(the_index)+1);
        setChanged();
        notifyObservers();
    }
}
