package com.companyJD1.lecture9;

public class Mission4 {

}
class Calculator<T extends Number> {
    private T first_arg;
    private T second_arg;

    public T getFirst_arg() {
        return first_arg;
    }

    public T getSecond_arg() {
        return second_arg;
    }

    public void setFirst_arg(T first_arg) {
        this.first_arg = first_arg;
    }

    public void setSecond_arg(T second_arg) {
        this.second_arg = second_arg;
    }

    public <T extends Number> Number calculator(T first_arg, T second_arg) {
        Number sum=0;
        if (first_arg instanceof Integer && second_arg instanceof Integer) {
            sum = (Integer)(first_arg.intValue()+second_arg.intValue());
        } else if (first_arg instanceof Double && second_arg instanceof Double){
            sum = (Double) (second_arg.doubleValue() + first_arg.doubleValue());
        }
        return sum;
    }
}


