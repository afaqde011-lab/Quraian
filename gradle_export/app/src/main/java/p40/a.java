package p40;

import java.util.Iterator;

public abstract class a implements l40.a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override
    public Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return e(decoder);
    }

    public final Object e(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        o40.a aVarC = decoder.c(getDescriptor());
        while (true) {
            int iL = aVarC.l(getDescriptor());
            if (iL == -1) {
                aVarC.a(getDescriptor());
                return h(objA);
            }
            f(aVarC, iL + iB, objA);
        }
    }

    public abstract void f(o40.a aVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
