package ca;

import a40.g1;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class g {

    public final t f3038a;

    public final l0 f3039b;

    public final LinkedHashMap f3040c;

    public final ReentrantLock f3041d;

    public final a2.f f3042e;

    public final f f3043f;

    public final Object f3044g;

    public g(t tVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f3038a = tVar;
        l0 l0Var = new l0(tVar, linkedHashMap, linkedHashMap2, strArr, tVar.f3100k, new g1(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 21));
        this.f3039b = l0Var;
        this.f3040c = new LinkedHashMap();
        this.f3041d = new ReentrantLock();
        this.f3042e = new a2.f(this, 12);
        final int i10 = 0;
        this.f3043f = new u00.a(this) {
            public final g B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i10) {
                    case 0:
                        this.B.getClass();
                        return g00.b0.a;
                    default:
                        g gVar = this.B;
                        return Boolean.valueOf(!gVar.f3038a.k() || gVar.f3038a.n());
                }
            }
        };
        kotlin.jvm.internal.m.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f3044g = new Object();
        final int i11 = 1;
        l0Var.f3063k = new u00.a(this) {
            public final g B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i11) {
                    case 0:
                        this.B.getClass();
                        return g00.b0.a;
                    default:
                        g gVar = this.B;
                        return Boolean.valueOf(!gVar.f3038a.k() || gVar.f3038a.n());
                }
            }
        };
    }
}
