package com.ytrsoft;

import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

public interface Libc extends StdCallLibrary {

    Libc INSTANCE = Native.load("libc", Libc.class);

    int GetProcessIds(PointerByReference ids);

    String GetProcessName(int id);

    String GetProcessPath(int id);

    int ReadMemory(int pid, long address, IntByReference value);

    int WriteMemory(int pid, long address, int value);

}
