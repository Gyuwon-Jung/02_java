package com.ohgiraffers.exception.array;

public class ArrayProcessor {
    public int getElementAtIndex(int[] arr, int index) throws ArrayLengthException {
        if ((arr.length-1) < index) {
            throw new ArrayLengthException("유효하지 않은 인덱스입니다. (범위: 0 ~ 2)");
        } else {
            System.out.println("인덱스" +  arr[index] + "의 값은 [배열의 " + index + "번 값]입니다.");
        }
        return arr[index];
    }
}
