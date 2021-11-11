package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Object object = 1;
        Number number = 1;
        Integer integer = 1;

        List<Number> genericNumberList = new ArrayList<>();
        List<? extends Number> genericExtendsNumberList = new ArrayList<>();
        List<? super Number> genericSuperNumberList = new ArrayList<>();


//        genericNumberList.add(object); // 1
//        genericNumberList.add(number); // 2
//        genericNumberList.add(integer); // 3
//
//        genericNumberList = objectList; // 4
//        genericNumberList = numberList; // 5
//        genericNumberList = integerList; // 6
//
//        genericExtendsNumberList.add(object); // 7
//        genericExtendsNumberList.add(number); // 8
//        genericExtendsNumberList.add(integer); // 8
//        genericExtendsNumberList.add(null); // 9
//
//        genericExtendsNumberList = objectList; // 10
//        genericExtendsNumberList = numberList; // 11
//        genericExtendsNumberList = integerList; // 12
//
//        genericSuperNumberList.add(object); // 13
//        genericSuperNumberList.add(number); // 14
//        genericSuperNumberList.add(integer); // 15
//
//        genericSuperNumberList = objectList; // 16
//        genericSuperNumberList = numberList; // 17
//        genericSuperNumberList = integerList; // 18
    }
}
