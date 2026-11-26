package ta;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class z extends t {

    public int f14506g0;

    public t[] f14509j0;

    public ArrayList f14504e0 = new ArrayList();

    public boolean f14505f0 = true;

    public boolean f14507h0 = false;

    public int f14508i0 = 0;

    @Override
    public final void B(View view) {
        super.B(view);
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f14504e0.get(i10)).B(view);
        }
    }

    @Override
    public final void C() {
        this.X = 0L;
        int i10 = 0;
        y yVar = new y(this, i10);
        while (i10 < this.f14504e0.size()) {
            t tVar = (t) this.f14504e0.get(i10);
            tVar.a(yVar);
            tVar.C();
            long j9 = tVar.X;
            if (this.f14505f0) {
                this.X = Math.max(this.X, j9);
            } else {
                long j10 = this.X;
                tVar.Z = j10;
                this.X = j10 + j9;
            }
            i10++;
        }
    }

    @Override
    public final t D(r rVar) {
        super.D(rVar);
        return this;
    }

    @Override
    public final void E(View view) {
        for (int i10 = 0; i10 < this.f14504e0.size(); i10++) {
            ((t) this.f14504e0.get(i10)).E(view);
        }
        this.F.remove(view);
    }

    @Override
    public final void F(View view) {
        super.F(view);
        t[] tVarArr = this.f14509j0;
        this.f14509j0 = null;
        if (tVarArr == null) {
            tVarArr = new t[this.f14504e0.size()];
        }
        t[] tVarArr2 = (t[]) this.f14504e0.toArray(tVarArr);
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVarArr2[i10].F(view);
        }
        Arrays.fill(tVarArr2, (Object) null);
        this.f14509j0 = tVarArr2;
    }

    @Override
    public final void G() {
        if (this.f14504e0.isEmpty()) {
            O();
            o();
            return;
        }
        y yVar = new y();
        yVar.f14503b = this;
        Iterator it = this.f14504e0.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(yVar);
        }
        this.f14506g0 = this.f14504e0.size();
        if (this.f14505f0) {
            Iterator it2 = this.f14504e0.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).G();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f14504e0.size(); i10++) {
            ((t) this.f14504e0.get(i10 - 1)).a(new y((t) this.f14504e0.get(i10), 2));
        }
        t tVar = (t) this.f14504e0.get(0);
        if (tVar != null) {
            tVar.G();
        }
    }

    @Override
    public final void H(long j9, long j10) {
        long j11;
        long j12 = this.X;
        long j13 = 0;
        if (this.I != null) {
            if (j9 < 0 && j10 < 0) {
                return;
            }
            if (j9 > j12 && j10 > j12) {
                return;
            }
        }
        boolean z10 = j9 < j10;
        if ((j9 >= 0 && j10 < 0) || (j9 <= j12 && j10 > j12)) {
            this.R = false;
            A(this, s.f14488s, z10);
        }
        if (!this.f14505f0) {
            int size = 1;
            while (true) {
                if (size >= this.f14504e0.size()) {
                    size = this.f14504e0.size();
                    break;
                } else if (((t) this.f14504e0.get(size)).Z > j10) {
                    break;
                } else {
                    size++;
                }
            }
            int i10 = size - 1;
            if (j9 >= j10) {
                while (true) {
                    if (i10 < this.f14504e0.size()) {
                        t tVar = (t) this.f14504e0.get(i10);
                        long j14 = tVar.Z;
                        j11 = j13;
                        long j15 = j9 - j14;
                        if (j15 < j11) {
                            break;
                        }
                        tVar.H(j15, j10 - j14);
                        i10++;
                        j13 = j11;
                    }
                }
            } else {
                j11 = 0;
                while (i10 >= 0) {
                    t tVar2 = (t) this.f14504e0.get(i10);
                    long j16 = tVar2.Z;
                    long j17 = j9 - j16;
                    tVar2.H(j17, j10 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            if (this.I != null) {
                if ((j9 > j12 || j10 > j12) && (j9 >= 0 || j10 < j11)) {
                    return;
                }
                if (j9 > j12) {
                    this.R = true;
                }
                A(this, s.f14489t, z10);
            }
        }
        for (int i11 = 0; i11 < this.f14504e0.size(); i11++) {
            ((t) this.f14504e0.get(i11)).H(j9, j10);
        }
        j11 = j13;
        if (this.I != null) {
            if (j9 > j12) {
                return;
            } else {
                return;
            }
            if (j9 > j12) {
                this.R = true;
            }
            A(this, s.f14489t, z10);
        }
    }

    @Override
    public final void I(long j9) {
        ArrayList arrayList;
        this.C = j9;
        if (j9 < 0 || (arrayList = this.f14504e0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f14504e0.get(i10)).I(j9);
        }
    }

    @Override
    public final void J(w50.c cVar) {
        this.V = cVar;
        this.f14508i0 |= 8;
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f14504e0.get(i10)).J(cVar);
        }
    }

    @Override
    public final void K(TimeInterpolator timeInterpolator) {
        this.f14508i0 |= 1;
        ArrayList arrayList = this.f14504e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.f14504e0.get(i10)).K(timeInterpolator);
            }
        }
        this.D = timeInterpolator;
    }

    @Override
    public final void L(rp.m mVar) {
        super.L(mVar);
        this.f14508i0 |= 4;
        if (this.f14504e0 != null) {
            for (int i10 = 0; i10 < this.f14504e0.size(); i10++) {
                ((t) this.f14504e0.get(i10)).L(mVar);
            }
        }
    }

    @Override
    public final void M() {
        this.f14508i0 |= 2;
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f14504e0.get(i10)).M();
        }
    }

    @Override
    public final void N(long j9) {
        this.B = j9;
    }

    @Override
    public final String P(String str) {
        String strP = super.P(str);
        for (int i10 = 0; i10 < this.f14504e0.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strP);
            sb2.append("\n");
            sb2.append(((t) this.f14504e0.get(i10)).P(str + "  "));
            strP = sb2.toString();
        }
        return strP;
    }

    public final void Q(t tVar) {
        this.f14504e0.add(tVar);
        tVar.I = this;
        long j9 = this.C;
        if (j9 >= 0) {
            tVar.I(j9);
        }
        if ((this.f14508i0 & 1) != 0) {
            tVar.K(this.D);
        }
        if ((this.f14508i0 & 2) != 0) {
            tVar.M();
        }
        if ((this.f14508i0 & 4) != 0) {
            tVar.L(this.W);
        }
        if ((this.f14508i0 & 8) != 0) {
            tVar.J(this.V);
        }
    }

    public final t R(int i10) {
        if (i10 < 0 || i10 >= this.f14504e0.size()) {
            return null;
        }
        return (t) this.f14504e0.get(i10);
    }

    @Override
    public final void b(View view) {
        for (int i10 = 0; i10 < this.f14504e0.size(); i10++) {
            ((t) this.f14504e0.get(i10)).b(view);
        }
        this.F.add(view);
    }

    @Override
    public final void cancel() {
        super.cancel();
        t[] tVarArr = this.f14509j0;
        this.f14509j0 = null;
        if (tVarArr == null) {
            tVarArr = new t[this.f14504e0.size()];
        }
        t[] tVarArr2 = (t[]) this.f14504e0.toArray(tVarArr);
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVarArr2[i10].cancel();
        }
        Arrays.fill(tVarArr2, (Object) null);
        this.f14509j0 = tVarArr2;
    }

    @Override
    public final void d(a0 a0Var) {
        View view = a0Var.f14426b;
        if (y(view)) {
            for (t tVar : this.f14504e0) {
                if (tVar.y(view)) {
                    tVar.d(a0Var);
                    a0Var.f14427c.add(tVar);
                }
            }
        }
    }

    @Override
    public final void f(a0 a0Var) {
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f14504e0.get(i10)).f(a0Var);
        }
    }

    @Override
    public final void g(a0 a0Var) {
        View view = a0Var.f14426b;
        if (y(view)) {
            for (t tVar : this.f14504e0) {
                if (tVar.y(view)) {
                    tVar.g(a0Var);
                    a0Var.f14427c.add(tVar);
                }
            }
        }
    }

    @Override
    public final t clone() {
        z zVar = (z) super.clone();
        zVar.f14504e0 = new ArrayList();
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVarClone = ((t) this.f14504e0.get(i10)).clone();
            zVar.f14504e0.add(tVarClone);
            tVarClone.I = zVar;
        }
        return zVar;
    }

    @Override
    public final void n(ViewGroup viewGroup, p10.a aVar, p10.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j9 = this.B;
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f14504e0.get(i10);
            if (j9 > 0 && (this.f14505f0 || i10 == 0)) {
                long j10 = tVar.B;
                if (j10 > 0) {
                    tVar.N(j10 + j9);
                } else {
                    tVar.N(j9);
                }
            }
            tVar.n(viewGroup, aVar, aVar2, arrayList, arrayList2);
        }
    }

    @Override
    public final boolean v() {
        for (int i10 = 0; i10 < this.f14504e0.size(); i10++) {
            if (((t) this.f14504e0.get(i10)).v()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean w() {
        int size = this.f14504e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((t) this.f14504e0.get(i10)).w()) {
                return false;
            }
        }
        return true;
    }
}
