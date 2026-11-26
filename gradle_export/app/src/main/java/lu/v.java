package lu;

import java.util.concurrent.CopyOnWriteArrayList;

public final class v implements androidx.lifecycle.u {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public v(Object obj, Object obj2, Object obj3, int i11) {
        this.A = i11;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    @Override
    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        androidx.lifecycle.o oVar2;
        switch (this.A) {
            case 0:
                String str = (String) this.B;
                z zVar = (z) this.C;
                e0 e0Var = (e0) this.D;
                if (str.equals("ambient_sounds")) {
                    if ((zVar != null ? zVar.f14124h : null) != null) {
                        int i11 = x.f14115a[oVar.ordinal()];
                        if (i11 == 1 || i11 == 2) {
                            e0Var.k(d.f14087a);
                            break;
                        } else if (i11 == 3) {
                            e0Var.k(e.f14088a);
                            break;
                        }
                    }
                }
                break;
            case 1:
                r6.c cVar = (r6.c) this.B;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) this.C;
                u00.k kVar = (u00.k) this.D;
                int i12 = r6.b.f18150a[oVar.ordinal()];
                if (i12 == 1) {
                    zVar2.A = kVar.invoke(cVar);
                    break;
                } else if (i12 == 2) {
                    e.d dVar = (e.d) zVar2.A;
                    if (dVar != null) {
                        dVar.a();
                    }
                    zVar2.A = null;
                    break;
                }
                break;
            default:
                z4.m mVar = (z4.m) this.B;
                androidx.lifecycle.p pVar = (androidx.lifecycle.p) this.C;
                z4.n nVar = (z4.n) this.D;
                mVar.getClass();
                Runnable runnable = mVar.f23979a;
                CopyOnWriteArrayList copyOnWriteArrayList = mVar.f23980b;
                androidx.lifecycle.o.Companion.getClass();
                int iOrdinal = pVar.ordinal();
                if (iOrdinal == 2) {
                    oVar2 = androidx.lifecycle.o.ON_CREATE;
                } else if (iOrdinal != 3) {
                    oVar2 = iOrdinal != 4 ? null : androidx.lifecycle.o.ON_RESUME;
                } else {
                    oVar2 = androidx.lifecycle.o.ON_START;
                }
                if (oVar == oVar2) {
                    copyOnWriteArrayList.add(nVar);
                    runnable.run();
                } else if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                    mVar.b(nVar);
                } else if (oVar == androidx.lifecycle.m.a(pVar)) {
                    copyOnWriteArrayList.remove(nVar);
                    runnable.run();
                }
                break;
        }
    }
}
