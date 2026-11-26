package wd;

import android.util.SparseArray;

public final class z {
    public static final z A;
    public static final z[] B;

    z EF0;

    static {
        z zVar = new z("NOT_SET", 0);
        z zVar2 = new z("EVENT_OVERRIDE", 1);
        A = zVar2;
        B = new z[]{zVar, zVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) B.clone();
    }
}
