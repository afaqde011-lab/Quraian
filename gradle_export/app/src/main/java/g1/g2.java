package g1;

import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;

public final class g2 implements u00.k {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public g2(int i10, Object obj, Object obj2, l1.z0 z0Var, Object obj3, int i11) {
        this.A = i11;
        this.B = i10;
        this.C = obj;
        this.D = obj2;
        this.E = z0Var;
        this.F = obj3;
    }

    public g2(x.b1 b1Var, x.b1 b1Var2, x.b1 b1Var3, int i10, x.b1 b1Var4) {
        this.A = 0;
        this.C = b1Var;
        this.D = b1Var2;
        this.E = b1Var3;
        this.B = i10;
        this.F = b1Var4;
    }

    public g2(z2.l1[] l1VarArr, h0.v vVar, int i10, z2.y0 y0Var, int[] iArr) {
        this.A = 2;
        this.C = l1VarArr;
        this.D = vVar;
        this.B = i10;
        this.E = y0Var;
        this.F = iArr;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                x.b1 b1Var = (x.b1) this.C;
                x.b1 b1Var2 = (x.b1) this.D;
                x.b1 b1Var3 = (x.b1) this.E;
                x.b1 b1Var4 = (x.b1) this.F;
                int i10 = ((i3) ((w.v) obj).c()).f5841a;
                int i11 = this.B;
                w.j0 j0VarD = i10 == 1 ? w.m.d(w.s0.j(new e6.c(21), b1Var).a(w.s0.c(b1Var2, 2)), w.s0.d(b1Var3, 2).a(w.s0.l(new s1(i11, 0), b1Var))) : w.m.d(w.s0.j(new s1(i11, 0), b1Var).a(w.s0.c(b1Var2, 2)), w.s0.l(new e6.c(21), b1Var).a(w.s0.d(b1Var3, 2)));
                j0VarD.f15779d = new w.c2(true, new a1.y1(b1Var4, 15));
                return j0VarD;
            case 1:
                l1.y0 y0Var = (l1.y0) this.C;
                l1.y0 y0Var2 = (l1.y0) this.D;
                l1.y0 y0Var3 = (l1.y0) this.E;
                l1.p2 p2Var = (l1.p2) this.F;
                kotlin.jvm.internal.m.e((y3.c) obj, "$this$offset");
                return new y3.j((((long) com.google.android.gms.internal.measurement.b5.B(((Number) p2Var.getValue()).floatValue(), (((l1.f1) y0Var).h() - ((l1.f1) y0Var2).h()) / 2, ((l1.f1) y0Var3).h() + this.B)) << 32) | (((long) 0) & 4294967295L));
            case 2:
                z2.l1[] l1VarArr = (z2.l1[]) this.C;
                h0.v vVar = (h0.v) this.D;
                z2.y0 y0Var4 = (z2.y0) this.E;
                int[] iArr = (int[]) this.F;
                z2.k1 k1Var = (z2.k1) obj;
                int length = l1VarArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    z2.l1 l1Var = l1VarArr[i12];
                    int i14 = i13 + 1;
                    kotlin.jvm.internal.m.b(l1Var);
                    Object objU = l1Var.U();
                    h0.s1 s1Var = objU instanceof h0.s1 ? (h0.s1) objU : null;
                    y3.m layoutDirection = y0Var4.getLayoutDirection();
                    h0.c cVar = s1Var != null ? s1Var.f6459c : null;
                    int i15 = this.B;
                    k1Var.h(l1Var, cVar != null ? cVar.k(i15, l1Var.A, layoutDirection) : vVar.f6471b.a(l1Var.A, i15, layoutDirection), iArr[i13], 0.0f);
                    i12++;
                    i13 = i14;
                }
                return g00.b0.a;
            case 3:
                u00.k kVar = (u00.k) this.C;
                l1.z0 z0Var = (l1.z0) this.D;
                l1.z0 z0Var2 = (l1.z0) this.E;
                l1.z0 z0Var3 = (l1.z0) this.F;
                g2.x xVar = (g2.x) obj;
                kotlin.jvm.internal.m.e(xVar, "state");
                boolean zA = ((g2.y) xVar).a();
                if (zA != ((Boolean) z0Var.getValue()).booleanValue()) {
                    z0Var.setValue(Boolean.valueOf(zA));
                    if (zA) {
                        z0Var2.setValue(mu.d.C(this.B));
                    } else {
                        int[] iArr2 = (int[]) z0Var2.getValue();
                        int iY = ab.a0.y(mu.d.D(iArr2), 60, 5999);
                        int i16 = iY / 60;
                        int i17 = iY % 60;
                        if (i16 <= 99) {
                            iArr2 = new int[]{i16 / 10, i16 % 10, i17 / 10, i17 % 10};
                        }
                        z0Var2.setValue(iArr2);
                        kVar.invoke(Integer.valueOf(iY));
                        z0Var3.setValue(RuntimeVersion.SUFFIX);
                    }
                }
                return g00.b0.a;
            default:
                u00.k kVar2 = (u00.k) this.C;
                a40.z zVar = (a40.z) this.D;
                l1.y0 y0Var5 = (l1.y0) this.E;
                x.b bVar = (x.b) this.F;
                tm.e eVar = (tm.e) obj;
                kotlin.jvm.internal.m.e(eVar, "$this$DampedDragAnimation");
                int iRound = Math.round(eVar.d());
                if (iRound < 0) {
                    iRound = 0;
                }
                int i18 = this.B;
                if (iRound > i18) {
                    iRound = i18;
                }
                l1.f1 f1Var = (l1.f1) y0Var5;
                int iH = f1Var.h();
                f1Var.i(iRound);
                eVar.a(iRound);
                if (iRound != iH) {
                    kVar2.invoke(Integer.valueOf(iRound));
                }
                ta.c0.M(zVar, null, null, null, new l4(bVar, null, 1), 31);
                return g00.b0.a;
        }
    }
}
