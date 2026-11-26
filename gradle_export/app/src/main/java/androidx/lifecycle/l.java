package androidx.lifecycle;

import bt.j2;
import d40.p1;
import gz.m1;
import ur.r1;

public final class l implements u {
    public final int A;
    public final Object B;

    public l(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void a(w wVar, o oVar) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                ((p1) obj).k((Object) null, oVar.a());
                break;
            case 1:
                j2 j2Var = (j2) obj;
                if (oVar == o.ON_RESUME) {
                    j2Var.n(bt.s.a);
                }
                break;
            case 2:
                ct.b bVar = (ct.b) obj;
                int i11 = ct.d.a[oVar.ordinal()];
                if (i11 == 1) {
                    bVar.c = true;
                    i7.z zVar = bVar.a;
                    if (!bVar.b) {
                        zVar.pause();
                    } else {
                        zVar.play();
                    }
                    break;
                } else if (i11 == 2) {
                    bVar.c = false;
                    bVar.a.pause();
                    break;
                }
                break;
            case 3:
                i7.z zVar2 = ((b00.c) obj).f;
                int i12 = gv.o.a[oVar.ordinal()];
                if (i12 == 1) {
                    zVar2.setPlayWhenReady(true);
                    zVar2.play();
                    break;
                } else if (i12 == 2) {
                    zVar2.pause();
                    break;
                }
                break;
            case 4:
                m1 m1Var = (m1) obj;
                if (oVar == o.ON_RESUME) {
                    m1Var.l(gz.f0.a);
                }
                break;
            case 5:
                ((u00.k) obj).invoke(oVar);
                break;
            case 6:
                androidx.media3.common.h0 h0Var = (androidx.media3.common.h0) obj;
                if (oVar == o.ON_START) {
                    h0Var.f1221c = true;
                } else if (oVar == o.ON_STOP) {
                    h0Var.f1221c = false;
                }
                break;
            case 7:
                r6.a aVar = (r6.a) obj;
                aVar.getClass();
                aVar.B = oVar.a();
                aVar.a();
                break;
            default:
                r1 r1Var = (r1) obj;
                if (oVar == o.ON_RESUME) {
                    r1Var.l(ur.g0.a);
                }
                break;
        }
    }
}
