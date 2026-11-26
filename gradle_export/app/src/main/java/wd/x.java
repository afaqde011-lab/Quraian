package wd;

public final class x {
    public static final x A;
    public static final x[] B;

    x EF0;

    static {
        x xVar = new x("UNKNOWN", 0);
        x xVar2 = new x("ANDROID_FIREBASE", 1);
        A = xVar2;
        B = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) B.clone();
    }
}
