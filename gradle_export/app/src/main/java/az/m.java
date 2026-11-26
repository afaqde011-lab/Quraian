package az;

import e30.w;
import g00.b0;

public final class m implements u00.k {
    public final int A;
    public final u00.k B;

    public m(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        long j;
        switch (this.A) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.B.invoke(new e(it));
                return b0.a;
            case 1:
                u00.k kVar = this.B;
                w wVar = (w) obj;
                kotlin.jvm.internal.m.b(wVar);
                return kVar.invoke(wVar).toString();
            case 2:
                return this.B.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 3:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                this.B.invoke(new pz.e(it2));
                return b0.a;
            default:
                z1.j jVar = (z1.j) obj;
                synchronized (z1.l.c) {
                    j = z1.l.e;
                    z1.l.e = ((long) 1) + j;
                }
                return new z1.e(j, jVar, this.B);
        }
    }
}
