package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"R", "Lj40/a;", RuntimeVersion.SUFFIX, "owner", "Lkotlin/Function1;", RuntimeVersion.SUFFIX, "block", "withTryLock", "(Lj40/a;Ljava/lang/Object;Lu00/k;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MutexUtilsKt {
    public static final <R> R withTryLock(j40.a aVar, Object obj, k kVar) {
        m.e(aVar, "<this>");
        m.e(kVar, "block");
        boolean zA = aVar.a(obj);
        try {
            return (R) kVar.invoke(Boolean.valueOf(zA));
        } finally {
            if (zA) {
                aVar.i(obj);
            }
        }
    }

    public static Object withTryLock$default(j40.a aVar, Object obj, k kVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        m.e(aVar, "<this>");
        m.e(kVar, "block");
        boolean zA = aVar.a(obj);
        try {
            return kVar.invoke(Boolean.valueOf(zA));
        } finally {
            if (zA) {
                aVar.i(obj);
            }
        }
    }
}
