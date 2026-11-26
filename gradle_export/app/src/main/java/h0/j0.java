package h0;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;

public final class j0 implements r1 {

    public final e f6416a;

    public final h f6417b;

    public final float f6418c;

    public final y f6419d;

    public final float f6420e;

    public final h0 f6421f;

    public j0(e eVar, h hVar, float f3, y yVar, float f10, h0 h0Var) {
        this.f6416a = eVar;
        this.f6417b = hVar;
        this.f6418c = f3;
        this.f6419d = yVar;
        this.f6420e = f10;
        this.f6421f = h0Var;
    }

    public static int b(List list, int i10, int i11, int i12, h0 h0Var) {
        long jA = u.j.a(0, 0);
        if (!list.isEmpty()) {
            int i13 = Integer.MAX_VALUE;
            androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d(h0Var, y3.b.a(0, i10, 0, Integer.MAX_VALUE), i11, i12);
            z2.v0 v0Var = (z2.v0) h00.q.O0(0, list);
            int iF0 = v0Var != null ? v0Var.f0(i10) : 0;
            int iS = v0Var != null ? v0Var.s(iF0) : 0;
            boolean z10 = true;
            if (list.size() <= 1) {
                z10 = false;
            }
            int i14 = 0;
            if (dVar.b(z10, 0, u.j.a(i10, Integer.MAX_VALUE), v0Var == null ? null : new u.j(u.j.a(iS, iF0)), 0, 0, 0, false, false).f6397b) {
                h0Var.getClass();
                f0 f0Var = f0.A;
                jA = jA;
            } else {
                int size = list.size();
                int i15 = i10;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i18 < size) {
                    int i21 = i15 - iS;
                    i18++;
                    int iMax = Math.max(i17, iF0);
                    z2.v0 v0Var2 = (z2.v0) h00.q.O0(i18, list);
                    iF0 = v0Var2 != null ? v0Var2.f0(i10) : 0;
                    int iS2 = v0Var2 != null ? v0Var2.s(iF0) + i11 : 0;
                    int i22 = i18 - i20;
                    int i23 = i16;
                    int i24 = iS2;
                    d0 d0VarB = dVar.b(i18 + 2 < list.size() ? z10 : false, i22, u.j.a(i21, i13), v0Var2 == null ? null : new u.j(u.j.a(iS2, iF0)), i23, i14, iMax, false, false);
                    if (d0VarB.f6396a) {
                        int i25 = iMax + i12 + i14;
                        dVar.a(d0VarB, v0Var2 != null, i23, i25, i21, i22);
                        int i26 = i24 - i11;
                        i16 = i23 + 1;
                        if (d0VarB.f6397b) {
                            i19 = i18;
                            i14 = i25;
                            break;
                        }
                        i15 = i10;
                        i20 = i18;
                        iS = i26;
                        i14 = i25;
                        i17 = 0;
                    } else {
                        iS = i24;
                        i15 = i21;
                        i16 = i23;
                        i17 = iMax;
                    }
                    i19 = i18;
                    i13 = Integer.MAX_VALUE;
                    z10 = true;
                }
                jA = u.j.a(i14 - i12, i19);
            }
        }
        return (int) (jA >> 32);
    }

    @Override
    public final int a(z2.l1 l1Var) {
        return l1Var.j0();
    }

    @Override
    public final long c(int i10, int i11, int i12, boolean z10) {
        v1 v1Var = t1.f6464a;
        return !z10 ? y3.b.a(i10, i11, 0, i12) : g4.G(i10, i11, 0, i12);
    }

    @Override
    public final int e(z2.l1 l1Var) {
        return l1Var.i0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f6416a.equals(j0Var.f6416a) && this.f6417b.equals(j0Var.f6417b) && y3.f.b(this.f6418c, j0Var.f6418c) && this.f6419d.equals(j0Var.f6419d) && y3.f.b(this.f6420e, j0Var.f6420e) && kotlin.jvm.internal.m.a(this.f6421f, j0Var.f6421f);
    }

    @Override
    public final z2.x0 f(final z2.l1[] l1VarArr, z2.y0 y0Var, final int[] iArr, int i10, final int i11, final int[] iArr2, final int i12, final int i13, final int i14) {
        final y3.m mVar = y3.m.A;
        return y0Var.o0(i10, i11, h00.y.A, new u00.k() {
            public final Object invoke(Object obj) {
                c cVar;
                z2.k1 k1Var = (z2.k1) obj;
                int[] iArr3 = iArr2;
                int i15 = iArr3 != null ? iArr3[i12] : 0;
                int i16 = i13;
                for (int i17 = i16; i17 < i14; i17++) {
                    z2.l1 l1Var = l1VarArr[i17];
                    kotlin.jvm.internal.m.b(l1Var);
                    Object objU = l1Var.U();
                    s1 s1Var = objU instanceof s1 ? (s1) objU : null;
                    if (s1Var == null || (cVar = s1Var.f6459c) == null) {
                        cVar = this.f6419d;
                    }
                    k1Var.h(l1Var, iArr[i17 - i16], cVar.k(i11, l1Var.i0(), mVar) + i15, 0.0f);
                }
                return g00.b0.a;
            }
        });
    }

    @Override
    public final void h(int i10, int[] iArr, int[] iArr2, z2.y0 y0Var) {
        this.f6416a.c(y0Var, i10, iArr, y0Var.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return this.f6421f.hashCode() + w.c.d(Integer.MAX_VALUE, w.c.d(Integer.MAX_VALUE, w.c.c(this.f6420e, (this.f6419d.hashCode() + w.c.c(this.f6418c, (this.f6417b.hashCode() + ((this.f6416a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb2.append(this.f6416a);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f6417b);
        sb2.append(", mainAxisSpacing=");
        w.c.r(this.f6418c, sb2, ", crossAxisAlignment=");
        sb2.append(this.f6419d);
        sb2.append(", crossAxisArrangementSpacing=");
        w.c.r(this.f6420e, sb2, ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=");
        sb2.append(this.f6421f);
        sb2.append(')');
        return sb2.toString();
    }
}
