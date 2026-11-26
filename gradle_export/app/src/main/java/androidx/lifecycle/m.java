package androidx.lifecycle;

public final class m {
    public static o a(p pVar) {
        kotlin.jvm.internal.m.e(pVar, "state");
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 2) {
            return o.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return o.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return o.ON_PAUSE;
    }
}
