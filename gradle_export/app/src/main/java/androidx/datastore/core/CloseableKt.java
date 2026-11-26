package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.s0;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/Closeable;", "T", "R", "Lkotlin/Function1;", "block", "use", "(Landroidx/datastore/core/Closeable;Lu00/k;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t4, k kVar) throws Throwable {
        m.e(t4, "<this>");
        m.e(kVar, "block");
        try {
            R r4 = (R) kVar.invoke(t4);
            try {
                t4.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                return r4;
            }
            throw th;
        } catch (Throwable th3) {
            try {
                t4.close();
            } catch (Throwable th4) {
                s0.V(th3, th4);
            }
            throw th3;
        }
    }
}
