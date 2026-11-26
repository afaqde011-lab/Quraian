package j10;

public final class f0 implements u00.k {
    public final int A;
    public final n20.c B;

    public f0(n20.c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                n20.c it = (n20.c) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.valueOf(!it.a.c() && it.b().equals(this.B));
            default:
                k10.h it2 = (k10.h) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f(this.B);
        }
    }
}
