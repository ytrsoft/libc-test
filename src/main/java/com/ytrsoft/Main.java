package com.ytrsoft;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids = LibcUtils.getProcessIds();
        System.out.println(Arrays.toString(ids));
    }
}
