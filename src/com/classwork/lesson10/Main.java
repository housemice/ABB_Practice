package com.classwork.lesson10;


public class Main {
    public static void main(String[] args) {
        int[]arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[]arr2 = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        try {
            TestCustomExcp.validate(arr);
        }catch (CustomExcption excption){
            System.out.println(excption);
        }

        try {
            TestCustomExcp.validate(arr2);
        }catch (CustomExcption excption){
            System.out.println(excption);
        }
        finally {
            System.out.println("Final ? ");
        }
    }


}

