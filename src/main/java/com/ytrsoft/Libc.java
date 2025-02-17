package com.ytrsoft;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface Libc extends StdCallLibrary {

    Libc INSTANCE = Native.load("libc", Libc.class);

}
