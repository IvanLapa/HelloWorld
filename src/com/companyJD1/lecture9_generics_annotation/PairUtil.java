package com.companyJD1.lecture9_generics_annotation;

public class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> obj) {
        return new Pair<>(obj.getPairV(), obj.getPairK());
    }
}
