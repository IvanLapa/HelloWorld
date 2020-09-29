package com.companyJD1.lecture9_generics_annotation;

public class Mission3 {
    class Solution<T extends ClassForGenerics & InterfaceForGenerics>{
    }
    class ClassForGenerics{
    }
    public interface InterfaceForGenerics {
    }
}
