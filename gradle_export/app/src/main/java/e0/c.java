package e0;

import ab.a0;
import d0.n2;
import j0.v;
import java.util.List;
import l0.p0;
import l1.i1;
import m0.q;
import m0.s;
import m0.w;
import qd.s0;
import ri.t1;

public final class c implements m {

    public final int f4943a = 0;

    public final n2 f4944b;

    public final Object f4945c;

    public c(v vVar, o oVar) {
        this.f4944b = vVar;
        this.f4945c = oVar;
    }

    public c(w wVar, c0.f fVar, s sVar) {
        this.f4944b = wVar;
        this.f4945c = fVar;
    }

    @Override
    public final float a(float f3, float f10) {
        switch (this.f4943a) {
            case 0:
                float fAbs = Math.abs(f10);
                j0.n nVarH = ((v) this.f4944b).h();
                int i10 = 0;
                if (!nVarH.f7781k.isEmpty()) {
                    ?? r12 = nVarH.f7781k;
                    int size = r12.size();
                    int size2 = r12.size();
                    int i11 = 0;
                    while (i10 < size2) {
                        i11 += ((j0.o) r12.get(i10)).f7799p;
                        i10++;
                    }
                    i10 = i11 / size;
                }
                float f11 = fAbs - i10;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                return Math.signum(f10) * f11;
            default:
                w wVar = (w) this.f4944b;
                int iM = wVar.m();
                i1 i1Var = wVar.m;
                int i12 = ((q) i1Var.getValue()).f10367c + iM;
                if (i12 == 0) {
                    return 0.0f;
                }
                int i13 = f3 < 0.0f ? wVar.f10389e + 1 : wVar.f10389e;
                int iY = a0.y(((int) (f10 / i12)) + i13, 0, wVar.l());
                wVar.m();
                int i14 = ((q) i1Var.getValue()).f10367c;
                long j9 = i13;
                long j10 = 1;
                long j11 = j9 - j10;
                if (j11 < 0) {
                    j11 = 0;
                }
                int i15 = (int) j11;
                long j12 = j9 + j10;
                if (j12 > 2147483647L) {
                    j12 = 2147483647L;
                }
                int iAbs = Math.abs((a0.y(a0.y(iY, i15, (int) j12), 0, wVar.l()) - i13) * i12) - i12;
                int i16 = iAbs >= 0 ? iAbs : 0;
                if (i16 == 0) {
                    return i16;
                }
                return Math.signum(f3) * i16;
        }
    }

    @Override
    public final float b(float f3) {
        switch (this.f4943a) {
            case 0:
                v vVar = (v) this.f4944b;
                ?? r4 = vVar.h().f7781k;
                o oVar = (o) this.f4945c;
                int size = r4.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                for (int i10 = 0; i10 < size; i10++) {
                    j0.o oVar2 = (j0.o) r4.get(i10);
                    j0.o oVar3 = oVar2 instanceof p0 ? oVar2 : null;
                    if (oVar3 == null || !oVar3.d()) {
                        int iZ = t1.z(vVar.h());
                        int i11 = -vVar.h().l;
                        int i12 = vVar.h().f7784p;
                        int i13 = oVar2.f7799p;
                        int i14 = oVar2.f7798o;
                        int i15 = vVar.h().f7782n;
                        float fB = i14 - oVar.b(iZ, i13, i11, i12);
                        if (fB <= 0.0f && fB > f10) {
                            f10 = fB;
                        }
                        if (fB >= 0.0f && fB < f11) {
                            f11 = fB;
                        }
                    }
                }
                char c10 = Math.abs(f3) >= ((j0.n) vVar.f7822f.getValue()).f7779i.A0(l.f4950a) ? f3 > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c10 == 0) {
                    if (Math.abs(f11) <= Math.abs(f10)) {
                        f10 = f11;
                    }
                } else if (c10 == 1) {
                    f10 = f11;
                } else if (c10 != 2) {
                    f10 = 0.0f;
                }
                if (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return f10;
            default:
                w wVar = (w) this.f4944b;
                o oVar4 = wVar.k().f10376n;
                List list = wVar.k().f10365a;
                int size2 = list.size();
                float f12 = Float.POSITIVE_INFINITY;
                float f13 = Float.NEGATIVE_INFINITY;
                for (int i16 = 0; i16 < size2; i16++) {
                    m0.f fVar = (m0.f) list.get(i16);
                    int iH0 = s0.h0(wVar.k());
                    int i17 = -wVar.k().f10370f;
                    int i18 = wVar.k().f10368d;
                    int i19 = wVar.k().f10366b;
                    int i20 = fVar.f10330j;
                    wVar.l();
                    float fB2 = i20 - oVar4.b(iH0, i19, i17, i18);
                    if (fB2 <= 0.0f && fB2 > f13) {
                        f13 = fB2;
                    }
                    if (fB2 >= 0.0f && fB2 < f12) {
                        f12 = fB2;
                    }
                }
                if (f13 == Float.NEGATIVE_INFINITY) {
                    f13 = f12;
                }
                if (f12 == Float.POSITIVE_INFINITY) {
                    f12 = f13;
                }
                if (!wVar.d()) {
                    if (va.a.P(wVar, f3)) {
                        f13 = 0.0f;
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!wVar.b()) {
                    f13 = 0.0f;
                    if (!va.a.P(wVar, f3)) {
                        f12 = 0.0f;
                    }
                }
                Float fValueOf = Float.valueOf(f13);
                Float fValueOf2 = Float.valueOf(f12);
                float fFloatValue = fValueOf.floatValue();
                float fFloatValue2 = fValueOf2.floatValue();
                float fFloatValue3 = ((Number) ((c0.f) this.f4945c).invoke(Float.valueOf(f3), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    g0.a.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return fFloatValue3;
        }
    }
}
