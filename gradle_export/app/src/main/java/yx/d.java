package yx;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import u00.n;

public final class d implements n {
    public final int A;
    public final LinkedHashMap B;

    public d(LinkedHashMap linkedHashMap, int i) {
        this.A = i;
        this.B = linkedHashMap;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e60.a _scopedInstanceFactory = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(_scopedInstanceFactory, "$this$_scopedInstanceFactory");
                m.e(it, "it");
                return new c(this.B, _scopedInstanceFactory, 0);
            default:
                e60.a _scopedInstanceFactory2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(_scopedInstanceFactory2, "$this$_scopedInstanceFactory");
                m.e(it2, "it");
                return new c(this.B, _scopedInstanceFactory2, 1);
        }
    }
}
