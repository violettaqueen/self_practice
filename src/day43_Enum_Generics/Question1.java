package day43_Enum_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question1<E> {

    public static<E> void swapElements(E [] a, Integer c, Integer b){

        E temp =  a[c];

        a[c] = a[b];
        a[b] = temp;

        System.out.println(Arrays.toString(a));





    }

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swapElements(a,0,2);
        System.out.println(Arrays.toString(a));
    }
}
