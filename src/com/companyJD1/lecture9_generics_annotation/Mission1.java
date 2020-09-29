package com.companyJD1.lecture9_generics_annotation;

public class Mission1 {
    class Pair<K,V>{
        private K k;
        private V v;

        Pair(K k, V v){
            this.k=k;
            this.v=v;
        }

        public K getK(){return k;}
        public V getV(){return v;}
        public void setV(V v){this.v = v;}
        public void setK(K k){this.k = k;}
    }
}
