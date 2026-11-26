package de;

public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c[] D;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        A = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        B = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        C = cVar3;
        D = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) D.clone();
    }
}
