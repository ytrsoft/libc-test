package com.ytrsoft;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public final class LibcUtils {

    private LibcUtils() {
        throw new UnsupportedOperationException();
    }

    public static int[] getProcessIds() {
        PointerByReference ref = new PointerByReference();
        int count = Libc.INSTANCE.GetProcessIds(ref);
        Pointer pointer = ref.getValue();
        return pointer.getIntArray(0, count);
    }

    public static String getProcessName(int id) {
        return Libc.INSTANCE.GetProcessName(id);
    }

    public static String getProcessPath(int id) {
        return Libc.INSTANCE.GetProcessPath(id);
    }


    public static int ReadMemory(int pid, long address) {
        IntByReference value = new IntByReference();
        int result = Libc.INSTANCE.ReadMemory(pid, address, value);
        if (result != 0) {
            return value.getValue();
        }
        return 0;
    }

    public static int WriteMemory(int pid, long address, int value) {
        return Libc.INSTANCE.WriteMemory(pid, address, value);
    }

}
