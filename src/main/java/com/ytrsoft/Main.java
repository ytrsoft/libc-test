package com.ytrsoft;

public class Main {
    public static void main(String[] args) {
        int pid = 22240;
        System.out.println(LibcUtils.getProcessPathById(pid));
    }
}
