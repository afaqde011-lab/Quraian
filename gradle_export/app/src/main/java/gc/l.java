package gc;

import ri.t1;

public final class l implements cc.k {

    public final int f6287a;

    public final a40.k f6288b;

    public l(a40.k kVar, int i10) {
        this.f6287a = i10;
        this.f6288b = kVar;
    }

    @Override
    public final void onResult(Object obj) {
        switch (this.f6287a) {
            case 0:
                a40.k kVar = this.f6288b;
                if (!kVar.x()) {
                    kVar.resumeWith(obj);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                a40.k kVar2 = this.f6288b;
                if (!kVar2.x()) {
                    kotlin.jvm.internal.m.d(th2, "e");
                    kVar2.resumeWith(t1.s(th2));
                }
                break;
        }
    }
}
