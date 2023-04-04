package com.zhu.pt02;

public class CatComparetor implements Comparetor<Cat>{
    @Override
    public int compareTo(Cat t1, Cat t2) {
        return t1.weight - t2.weight;
    }
}
