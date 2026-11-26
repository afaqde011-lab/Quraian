package z;

import android.view.KeyEvent;
import c3.c3;
import d0.f3;
import d0.g3;
import java.util.ArrayList;

public class v extends h {

    public v2.s f16969l0;

    public s2.b f16970m0;

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        super.A(kVar, lVar, j9);
        if (lVar != v2.l.B) {
            if (lVar != v2.l.C || this.f16969l0 == null) {
                return;
            }
            ?? r7 = kVar.f15387a;
            int size = r7.size();
            for (int i10 = 0; i10 < size; i10++) {
                v2.s sVar = (v2.s) r7.get(i10);
                if (sVar.b() && !sVar.equals(this.f16969l0)) {
                    Q1(false);
                    return;
                }
            }
            return;
        }
        if (this.f16969l0 == null) {
            if (f3.e(kVar, true)) {
                v2.s sVar2 = (v2.s) kVar.f15387a.get(0);
                sVar2.a();
                this.f16969l0 = sVar2;
                if (this.V) {
                    K1(sVar2);
                    return;
                }
                return;
            }
            return;
        }
        ?? r10 = kVar.f15387a;
        int size2 = r10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (!v2.r.c((v2.s) r10.get(i11))) {
                long jG1 = G1(j9);
                int size3 = r10.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    v2.s sVar3 = (v2.s) r10.get(i12);
                    if (sVar3.b() || v2.r.f(sVar3, j9, jG1)) {
                        Q1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((v2.s) r10.get(0)).a();
        if (this.V) {
            v2.s sVar4 = this.f16969l0;
            kotlin.jvm.internal.m.b(sVar4);
            I1(false, sVar4.f15401c);
            this.W.invoke();
        }
        this.f16969l0 = null;
    }

    @Override
    public final void C0() {
        Q1(true);
    }

    @Override
    public final boolean N1(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final void O1(KeyEvent keyEvent) {
        this.W.invoke();
    }

    public final void Q1(boolean z10) {
        if (z10) {
            this.f16970m0 = null;
        } else {
            this.f16969l0 = null;
        }
        H1(z10);
    }

    @Override
    public final void U(c50.h hVar, v2.l lVar) {
        ArrayList arrayList = (ArrayList) hVar.C;
        L1();
        if (this.V && this.Z == null) {
            j0 j0Var = new j0(this);
            B1(j0Var);
            this.Z = j0Var;
        }
        if (lVar != v2.l.B) {
            if (lVar != v2.l.C || this.f16970m0 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                s2.b bVar = (s2.b) arrayList.get(i10);
                if (bVar.f13634i && !bVar.equals(this.f16970m0)) {
                    Q1(true);
                    return;
                }
            }
            return;
        }
        if (this.f16970m0 == null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (g3.f((s2.b) arrayList.get(i11))) {
                    s2.b bVar2 = (s2.b) arrayList.get(0);
                    bVar2.f13634i = true;
                    this.f16970m0 = bVar2;
                    if (this.V) {
                        J1(bVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            s2.b bVar3 = (s2.b) arrayList.get(i12);
            if (bVar3.f13634i || !bVar3.f13633h || bVar3.f13629d) {
                float fG = ((c3) b3.m.h(this, c3.o1.f2744t)).g();
                int size4 = arrayList.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    s2.b bVar4 = (s2.b) arrayList.get(i13);
                    long j9 = bVar4.f13628c;
                    s2.b bVar5 = this.f16970m0;
                    kotlin.jvm.internal.m.b(bVar5);
                    boolean z10 = Math.abs(h2.b.c(h2.b.e(j9, bVar5.f13628c))) > fG;
                    if (bVar4.f13634i || z10) {
                        Q1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((s2.b) arrayList.get(0)).f13634i = true;
        if (this.V) {
            s2.b bVar6 = this.f16970m0;
            kotlin.jvm.internal.m.b(bVar6);
            I1(true, bVar6.f13628c);
            this.W.invoke();
        }
        this.f16970m0 = null;
    }

    @Override
    public final void X() {
        super.X();
        Q1(false);
    }
}
