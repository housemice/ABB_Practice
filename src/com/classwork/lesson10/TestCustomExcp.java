package com.classwork.lesson10;

public class TestCustomExcp {

    static void validate (int[] arr) throws CustomExcption{
    if(arr.length>10){
        throw new CustomExcption("size is bigger than 10");
    }
    else {
        System.out.println("ok");
    }

}
}
