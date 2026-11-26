package a1;

import c3.c3;
import g1.a3;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class a implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public a(d0 d0Var, r3.p pVar, r3.w wVar, q0.j1 j1Var, i2.q qVar) {
        this.A = 5;
        this.C = d0Var;
        this.D = pVar;
        this.B = wVar;
        this.E = j1Var;
        this.F = qVar;
    }

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.B;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        switch (i10) {
            case 0:
                b1 b1Var = (b1) obj;
                w0 w0Var = ((h) obj6).f49a;
                b1Var.f23h = (r3.w) obj2;
                b1Var.f24i = (r3.j) obj5;
                b1Var.f18c = (q0.t1) obj4;
                b1Var.f19d = (u00.k) obj3;
                b1Var.f20e = w0Var != null ? w0Var.P : null;
                b1Var.f21f = w0Var != null ? w0Var.Q : null;
                b1Var.f22g = w0Var != null ? (c3) b3.m.h(w0Var, c3.o1.f2744t) : null;
                return b0Var;
            case 1:
                d0.m1 m1Var = (d0.m1) obj2;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj6;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj5;
                d0.u2 u2Var = (d0.u2) obj4;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                d0.i1 i1VarG = d0.m1.g(m1Var.f4448g);
                if (i1VarG != null) {
                    l9.f0 f0Var = m1Var.f4491e;
                    long j9 = i1VarG.f4435b;
                    long j10 = i1VarG.f4434a;
                    ((w2.c) f0Var.B).a(Float.intBitsToFloat((int) (j10 >> 32)), j9);
                    ((w2.c) f0Var.C).a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j9);
                    d0.i1 i1VarA = ((d0.i1) zVar.A).a(i1VarG);
                    zVar.A = i1VarA;
                    float fI = u2Var.i(u2Var.e(i1VarA.f4434a));
                    wVar.A = fI;
                    vVar.A = !d0.n1.a(fI - fFloatValue);
                }
                return Boolean.valueOf(i1VarG != null);
            case 2:
                e.a aVar = (e.a) obj2;
                aVar.f4929a = ((h.i) obj6).d((String) obj5, (androidx.fragment.app.d1) obj4, new ab.r((l1.z0) obj3, 11));
                return new c3.k1(aVar, 5);
            case 3:
                l1.z0 z0Var = (l1.z0) obj6;
                int iIntValue = ((Integer) obj).intValue();
                float f3 = a3.f5709a;
                z0Var.setValue(Boolean.valueOf(!((Boolean) z0Var.getValue()).booleanValue()));
                a40.c0.y((a40.z) obj2, (k00.i) null, (a40.a0) null, new d6.e((j0.v) obj5, iIntValue, (z00.e) obj4, (h1.w) obj3, null, 4), 3);
                return b0Var;
            case 4:
                return new p9.a(this.B, (Set) obj6, (Set) obj5, (l1.z0) obj4, (l1.z0) obj3);
            case 5:
                r3.p pVar = (r3.p) obj5;
                r3.w wVar2 = (r3.w) obj2;
                q0.j1 j1Var = (q0.j1) obj4;
                i2.q qVar = (i2.q) obj3;
                b3.o0 o0Var = (b3.o0) obj;
                o0Var.a();
                float fH = ((d0) obj6).f32c.h();
                if (fH != 0.0f) {
                    long j11 = wVar2.f13100b;
                    int i11 = m3.q0.f10519c;
                    int iZ = pVar.z((int) (j11 >> 32));
                    q0.e2 e2VarD = j1Var.d();
                    h2.c cVarC = e2VarD != null ? e2VarD.f12608a.c(iZ) : new h2.c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(o0Var.A0(q0.s1.f12700a));
                    float f10 = fFloor >= 1.0f ? fFloor : 1.0f;
                    float f11 = f10 / 2;
                    float f12 = cVarC.f6546a + f11;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (o0Var.A.b() >> 32)) - f11;
                    if (f12 > fIntBitsToFloat) {
                        f12 = fIntBitsToFloat;
                    }
                    if (f12 >= f11) {
                        f11 = f12;
                    }
                    float fFloor2 = ((int) f10) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
                    o0Var.A.e(qVar, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f6547b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f6549d)) & 4294967295L), f10, fH);
                }
                return b0Var;
            default:
                l2.b bVar = (l2.b) obj2;
                l2.b bVar2 = (l2.b) obj6;
                x.b bVar3 = (x.b) obj5;
                l1.z0 z0Var2 = (l1.z0) obj4;
                l1.z0 z0Var3 = (l1.z0) obj3;
                b3.o0 o0Var2 = (b3.o0) obj;
                kotlin.jvm.internal.m.e(o0Var2, "$this$drawWithContent");
                l2.b bVar4 = ((Boolean) z0Var2.getValue()).booleanValue() ? bVar : bVar2;
                if (((Boolean) z0Var2.getValue()).booleanValue()) {
                    bVar = bVar2;
                }
                k2.d.Z(o0Var2, bVar4, new d00.k0(o0Var2, 2));
                if (((Boolean) z0Var3.getValue()).booleanValue()) {
                    bVar.f(1.0f - ((Number) bVar3.d()).floatValue());
                    rd.a.x(o0Var2, bVar);
                    bVar4.f(((Number) bVar3.d()).floatValue());
                } else {
                    bVar4.f(1.0f);
                }
                rd.a.x(o0Var2, bVar4);
                return b0Var;
        }
    }
}
