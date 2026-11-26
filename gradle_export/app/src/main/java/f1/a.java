package f1;

import a1.z;
import a40.c0;
import ab.a0;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b2.q;
import b3.j;
import b3.o;
import b3.x;
import c3.o0;
import com.google.android.gms.internal.measurement.x5;
import d0.i2;
import f0.i;
import f0.k;
import f0.l;
import f0.m;
import g1.f3;
import g1.g3;
import i2.s;
import i2.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kh.n;
import l9.f0;
import u.d0;

public final class a extends q implements j, o, x {
    public final i O;
    public final boolean P;
    public final float Q;
    public final g3 R;
    public final f3 S;
    public b50.e T;
    public float U;
    public boolean W;
    public d Y;
    public e Z;
    public long V = 0;
    public final d0 X = new d0();

    public a(i iVar, boolean z10, float f3, g3 g3Var, f3 f3Var) {
        this.O = iVar;
        this.P = z10;
        this.Q = f3;
        this.R = g3Var;
        this.S = f3Var;
    }

    public final void B1(m mVar) {
        e eVar;
        if (!(mVar instanceof k)) {
            if (mVar instanceof l) {
                e eVar2 = this.Z;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(mVar instanceof f0.j) || (eVar = this.Z) == null) {
                return;
            }
            eVar.d();
            return;
        }
        k kVar = (k) mVar;
        long j9 = this.V;
        float f3 = this.U;
        d dVar = this.Y;
        if (dVar == null) {
            Object obj = (View) b3.m.h(this, o0.f2726f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(x5.l(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i10++;
                }
            }
            this.Y = dVar;
        }
        ArrayList arrayList = dVar.B;
        f0 f0Var = dVar.D;
        LinkedHashMap linkedHashMap = (LinkedHashMap) f0Var.B;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) f0Var.B;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) f0Var.C;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.C;
            kotlin.jvm.internal.m.e(arrayList2, "<this>");
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.E > va.a.M(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.E);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.Z = null;
                        b3.m.m(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i11 = dVar.E;
                if (i11 < dVar.A - 1) {
                    dVar.E = i11 + 1;
                } else {
                    dVar.E = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int iF = w00.a.F(f3);
        long jA = this.R.a();
        this.S.invoke();
        eVar5.b(kVar, this.P, j9, iF, jA, new z(this, 29));
        this.Z = eVar5;
        b3.m.m(this);
    }

    @Override
    public final void d(long j9) {
        float fA0;
        this.W = true;
        y3.c cVar = b3.m.y(this).Z;
        this.V = n.m0(j9);
        float f3 = this.Q;
        if (Float.isNaN(f3)) {
            long j10 = this.V;
            float f10 = c.f5480a;
            fA0 = h2.b.c(a0.d(h2.e.e(j10), h2.e.b(j10))) / 2.0f;
            if (this.P) {
                fA0 += cVar.A0(c.f5480a);
            }
        } else {
            fA0 = cVar.A0(f3);
        }
        this.U = fA0;
        d0 d0Var = this.X;
        Object[] objArr = d0Var.f14837a;
        int i10 = d0Var.f14838b;
        for (int i11 = 0; i11 < i10; i11++) {
            B1((m) objArr[i11]);
        }
        d0Var.d();
    }

    @Override
    public final void i(b3.o0 o0Var) {
        k2.b bVar = o0Var.A;
        o0Var.a();
        b50.e eVar = this.T;
        if (eVar != null) {
            float f3 = this.U;
            long jA = this.R.a();
            float fFloatValue = ((Number) ((x.b) eVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = t.b(fFloatValue, jA);
                if (eVar.a) {
                    float fE = h2.e.e(bVar.b());
                    float fB = h2.e.b(bVar.b());
                    a1.i iVar = bVar.B;
                    long jQ = iVar.q();
                    iVar.n().i();
                    try {
                        ((hf.c) iVar.B).y(0.0f, 0.0f, fE, fB, 1);
                        k2.d.M(o0Var, jB, f3, 0L, 0, 124);
                        w.c.t(iVar, jQ);
                    } catch (Throwable th2) {
                        w.c.t(iVar, jQ);
                        throw th2;
                    }
                } else {
                    k2.d.M(o0Var, jB, f3, 0L, 0, 124);
                }
            }
        }
        s sVarN = bVar.B.n();
        e eVar2 = this.Z;
        if (eVar2 != null) {
            long j9 = this.V;
            int iF = w00.a.F(this.U);
            long jA2 = this.R.a();
            this.S.invoke();
            eVar2.e(iF, j9, jA2);
            eVar2.draw(i2.b.a(sVarN));
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        c0.y(p1(), (k00.i) null, (a40.a0) null, new i2(this, (k00.c) null, 22), 3);
    }

    @Override
    public final void u1() {
        d dVar = this.Y;
        if (dVar != null) {
            this.Z = null;
            b3.m.m(this);
            f0 f0Var = dVar.D;
            e eVar = (e) ((LinkedHashMap) f0Var.B).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) f0Var.B;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.C.add(eVar);
            }
        }
    }
}
