package v7;

import androidx.media3.common.l2;
import fh.b2;
import fh.g0;
import fh.t0;
import fh.y1;
import java.util.Objects;

public final class o extends n {
    public final boolean E;
    public final j F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final boolean Q;
    public final int R;
    public final boolean S;
    public final int T;
    public final boolean U;
    public final boolean V;
    public final int W;

    public o(int i10, l2 l2Var, int i11, j jVar, int i12, String str, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        int i14;
        int iU;
        int i15;
        int i16;
        androidx.media3.common.t tVar;
        int i17;
        int i18;
        int i19;
        androidx.media3.common.t tVar2;
        int i20;
        int i21;
        int i22;
        super(i10, l2Var, i11);
        this.F = jVar;
        boolean z13 = jVar.f15507x0;
        t0 t0Var = jVar.m;
        t0 t0Var2 = jVar.f1453o;
        int i23 = z13 ? 24 : 16;
        int i24 = 0;
        this.S = false;
        if (!z10 || (((i20 = (tVar2 = this.D).f1601u) != -1 && i20 > jVar.f1441a) || ((i21 = tVar2.f1602v) != -1 && i21 > jVar.f1442b))) {
            z11 = false;
        } else {
            float f3 = tVar2.f1605y;
            if ((f3 == -1.0f || f3 <= jVar.f1443c) && ((i22 = tVar2.f1592j) == -1 || i22 <= jVar.f1444d)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.E = z11;
        if (!z10 || (((i17 = (tVar = this.D).f1601u) != -1 && i17 < jVar.f1445e) || ((i18 = tVar.f1602v) != -1 && i18 < jVar.f1446f))) {
            z12 = false;
        } else {
            float f10 = tVar.f1605y;
            if ((f10 == -1.0f || f10 >= jVar.f1447g) && ((i19 = tVar.f1592j) == -1 || i19 >= jVar.f1448h)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.G = z12;
        this.H = i7.a.l(i12, false);
        androidx.media3.common.t tVar3 = this.D;
        float f11 = tVar3.f1605y;
        this.I = f11 != -1.0f && f11 >= 10.0f;
        this.J = tVar3.f1592j;
        int i25 = tVar3.f1601u;
        this.K = (i25 == -1 || (i16 = tVar3.f1602v) == -1) ? -1 : i25 * i16;
        int i26 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i26 >= t0Var2.size()) {
                iU = 0;
                i26 = Integer.MAX_VALUE;
                break;
            } else {
                iU = p.u(this.D, (String) t0Var2.get(i26), false);
                if (iU > 0) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        this.M = i26;
        this.N = iU;
        int i27 = this.D.f1588f;
        int i28 = jVar.f1454p;
        b2 b2Var = p.f15511k;
        this.O = (i27 == 0 || i27 != i28) ? Integer.bitCount(i27 & i28) : Integer.MAX_VALUE;
        int i29 = this.D.f1588f;
        this.Q = i29 == 0 || (i29 & 1) != 0;
        this.R = p.u(this.D, str, p.x(str) == null);
        for (int i30 = 0; i30 < t0Var.size(); i30++) {
            String str2 = this.D.f1594n;
            if (str2 != null && str2.equals(t0Var.get(i30))) {
                i14 = i30;
                break;
            }
        }
        this.L = i14;
        this.P = p.s(this.D, jVar.f1452n);
        this.U = (i12 & 384) == 128;
        this.V = (i12 & 64) == 64;
        androidx.media3.common.t tVar4 = this.D;
        String str3 = tVar4.f1594n;
        if (str3 != null) {
            i15 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i15 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i15 = 3;
                    break;
                case "video/avc":
                    i15 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i15 = 2;
                    break;
                default:
                    i15 = 0;
                    break;
            }
        } else {
            i15 = 0;
        }
        this.W = i15;
        boolean z14 = this.E;
        j jVar2 = this.F;
        if ((tVar4.f1588f & 16384) == 0 && i7.a.l(i12, jVar2.B0) && (z14 || jVar2.f15506w0)) {
            i24 = (!i7.a.l(i12, false) || !this.G || !z14 || tVar4.f1592j == -1 || jVar2.G || jVar2.F || (i23 & i12) == 0) ? 1 : 2;
        }
        this.T = i24;
    }

    public static int c(o oVar, o oVar2) {
        g0 g0VarC = g0.f5672a.c(oVar.H, oVar2.H);
        Integer numValueOf = Integer.valueOf(oVar.M);
        Integer numValueOf2 = Integer.valueOf(oVar2.M);
        y1 y1Var = y1.C;
        g0 g0VarB = g0VarC.b(numValueOf, numValueOf2, y1Var).a(oVar.N, oVar2.N).a(oVar.O, oVar2.O).b(Integer.valueOf(oVar.P), Integer.valueOf(oVar2.P), y1Var).c(oVar.Q, oVar2.Q).a(oVar.R, oVar2.R).c(oVar.I, oVar2.I).c(oVar.E, oVar2.E).c(oVar.G, oVar2.G).b(Integer.valueOf(oVar.L), Integer.valueOf(oVar2.L), y1Var);
        boolean z10 = oVar.U;
        g0 g0VarC2 = g0VarB.c(z10, oVar2.U);
        boolean z11 = oVar.V;
        g0 g0VarC3 = g0VarC2.c(z11, oVar2.V);
        if (z10 && z11) {
            g0VarC3 = g0VarC3.a(oVar.W, oVar2.W);
        }
        return g0VarC3.e();
    }

    @Override
    public final int a() {
        return this.T;
    }

    @Override
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.S && !Objects.equals(this.D.f1594n, oVar.D.f1594n)) {
            return false;
        }
        this.F.getClass();
        return this.U == oVar.U && this.V == oVar.V;
    }
}
