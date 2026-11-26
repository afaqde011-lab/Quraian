package androidx.media3.cast;

import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import g00.b0;
import l1.g0;
import m0.r;
import qo.z;

public final class e implements u00.n {
    public final int A;
    public final int B;
    public final Object C;

    public e(int i10, Integer num, int i11) {
        this.A = 6;
        this.B = i10;
        this.C = num;
    }

    public e(Object obj, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return MediaRouteButtonKt.MediaRouteButtonContainer$lambda$17((u00.o) this.C, this.B, (l1.j) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).intValue();
                iv.a.g((su.e) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                return b0.a;
            case 2:
                j0.i iVar = (j0.i) this.C;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c50.h hVar = iVar.f7757b.f7754c;
                    int i10 = this.B;
                    l0.k kVarK = hVar.k(i10);
                    ((j0.e) kVarK.f9776c).f7753c.invoke(iVar.f7758c, Integer.valueOf(i10 - kVarK.f9774a), jVar, 0);
                } else {
                    g0Var.V();
                }
                return b0.a;
            case 3:
                ((Integer) obj2).intValue();
                f50.k.f((TopRecitersLauncher) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                return b0.a;
            case 4:
                k0.j jVar2 = (k0.j) this.C;
                l1.j jVar3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var2 = (g0) jVar3;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c50.h hVar2 = jVar2.f8474b.f8471d;
                    int i11 = this.B;
                    l0.k kVarK2 = hVar2.k(i11);
                    ((k0.h) kVarK2.f9776c).f8468d.invoke(k0.k.f8476a, Integer.valueOf(i11 - kVarK2.f9774a), jVar3, 6);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 5:
                m0.o oVar = (m0.o) this.C;
                l1.j jVar4 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var3 = (g0) jVar4;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c50.h hVarK = oVar.f10354b.k();
                    int i12 = this.B;
                    l0.k kVarK3 = hVarK.k(i12);
                    ((m0.k) kVarK3.f9776c).f10351b.invoke(r.f10384a, Integer.valueOf(i12 - kVarK3.f9774a), jVar4, 0);
                } else {
                    g0Var3.V();
                }
                return b0.a;
            case 6:
                ((Integer) obj2).getClass();
                z.a(this.B, (Integer) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 7:
                ((Integer) obj2).intValue();
                p30.f.S((SearchReciterLauncher) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                return b0.a;
            case 8:
                ((Integer) obj2).intValue();
                ro.f.p((lo.l) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                return b0.a;
            default:
                ((Integer) obj2).intValue();
                wr.k.j((qr.b) this.C, (l1.j) obj, l1.q.K(this.B | 1));
                return b0.a;
        }
    }
}
