package com.sekong.exception.number;

public class NumberProcess {
    public NumberProcess() {
    }
    public boolean checkDouble(int a, int b) throws NumberRangeException {
        if(a>100 || a<1 || b>100 || b<1){
            throw new NumberRangeException("1부터 100사이 값이 아닙니다.");
        }
        if(a%b!=0){
            System.out.println(a+"는 "+b+"의 베수가 아닙니다.");
            return false;
        }

        System.out.println(a+"는 "+b+"의 베수입니다.");
        return true;
    }
}
