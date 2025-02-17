package com.ytrsoft;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
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

}
