package gl;

import c3.p1;
import c3.t2;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import java.util.Iterator;
import jp.e0;
import lo.a0;
import lo.r;
import lo.v;
import u00.k;

public final class a implements u00.a {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;

    public a(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.B = z;
        this.C = obj;
        this.D = obj2;
    }

    public a(u00.a aVar, boolean z, q2.a aVar2) {
        this.A = 0;
        this.C = aVar;
        this.B = z;
        this.D = aVar2;
    }

    public a(u30.b bVar, Object obj, boolean z, int i) {
        this.A = i;
        this.C = bVar;
        this.D = obj;
        this.B = z;
    }

    public a(boolean z, v vVar, u00.a aVar) {
        this.A = 4;
        this.B = z;
        this.D = vVar;
        this.C = aVar;
    }

    @Override
    public final Object invoke() {
        u30.b bVar;
        switch (this.A) {
            case 0:
                u00.a aVar = (u00.a) this.C;
                q2.c cVar = (q2.a) this.D;
                aVar.invoke();
                if (this.B) {
                    cVar.a(6);
                }
                return b0.a;
            case 1:
                k kVar = (k) this.C;
                Integer num = (Integer) this.D;
                if (this.B) {
                    kVar.invoke(num);
                }
                return b0.a;
            case 2:
                p1 p1Var = (t2) this.C;
                e0 e0Var = (e0) this.D;
                if (!this.B) {
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    e0Var.l(jp.a.a);
                }
                return b0.a;
            case 3:
                k kVar2 = (k) this.C;
                r rVar = (r) this.D;
                if (!this.B) {
                    kVar2.invoke(rVar.a);
                }
                return b0.a;
            case 4:
                v vVar = (v) this.D;
                u00.a aVar2 = (u00.a) this.C;
                int i = 0;
                if (this.B && ((bVar = vVar.b) == null || !bVar.isEmpty())) {
                    Iterator<E> it = bVar.iterator();
                    while (it.hasNext()) {
                        if (((a0) it.next()).b <= ((Number) aVar2.invoke()).longValue() && (i = i + 1) < 0) {
                            va.a.j0();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i);
            case 5:
                return Boolean.valueOf(((u30.b) this.C).contains(Integer.valueOf(((bx.c) this.D).a)) || this.B);
            default:
                return Boolean.valueOf(((u30.b) this.C).contains(Long.valueOf(((PlayerItem) this.D).getSurahId())) || this.B);
        }
    }
}
