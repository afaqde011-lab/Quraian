package c3;

import android.content.res.Resources;

public final class r extends kotlin.jvm.internal.j implements u00.o {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        z zVar = (z) ((kotlin.jvm.internal.c) this).receiver;
        Resources resources = zVar.getContext().getResources();
        return Boolean.valueOf(h0.f2674a.a(zVar, null, new e2.c(new y3.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((h2.e) obj2).f6558a, (u00.k) obj3)));
    }
}
