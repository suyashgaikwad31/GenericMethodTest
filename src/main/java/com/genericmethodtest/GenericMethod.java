package com.genericmethodtest;

public class GenericMethod {
    public Integer testMaximum(Integer x,Integer y,Integer z) {
        int max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0 )
            max = z;
        return max;
    }

    public Float testMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0 )
            max = z;
        return max;
    }

    
}
