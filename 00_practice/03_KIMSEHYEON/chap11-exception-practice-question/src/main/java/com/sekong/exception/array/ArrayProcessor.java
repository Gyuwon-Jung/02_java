package com.sekong.exception.array;

public class ArrayProcessor {
    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException{
        if(index>=arr.length||index<0){
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~ [최대 인덱스])");
        }
        return arr[index];
    }
}
