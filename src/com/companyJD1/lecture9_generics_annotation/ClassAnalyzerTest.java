package com.companyJD1.lecture9_generics_annotation;

public class ClassAnalyzerTest {
    public static void main(String[] args) {
        ClassAnalyzer classAnalyzer = new ClassAnalyzer();
        classAnalyzer.analyze(ClassForTest.class);
    }
}
