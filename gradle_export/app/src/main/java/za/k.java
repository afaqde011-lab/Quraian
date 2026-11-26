package za;

public final class k {
    public static final k[] A;

    k EF5;

    static {
        k[] kVarArr = {new k("REPLACE", 0), new k("KEEP", 1), new k("UPDATE", 2), new k("CANCEL_AND_REENQUEUE", 3)};
        A = kVarArr;
        f50.c.v(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) A.clone();
    }
}
