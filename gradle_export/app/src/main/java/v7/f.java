package v7;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.l2;
import androidx.media3.common.o2;
import e7.i0;
import fh.b2;
import fh.g0;
import fh.t0;
import fh.y1;
import java.util.Objects;

public final class f extends n implements Comparable {
    public final int E;
    public final boolean F;
    public final String G;
    public final j H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;

    public f(int i10, l2 l2Var, int i11, j jVar, int i12, boolean z10, e eVar, int i13) {
        int i14;
        int iU;
        boolean z11;
        int iU2;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, l2Var, i11);
        this.H = jVar;
        boolean z15 = jVar.f15509z0;
        t0 t0Var = jVar.f1460v;
        t0 t0Var2 = jVar.f1455q;
        int i15 = z15 ? 24 : 16;
        int i16 = 0;
        this.N = false;
        this.G = p.x(this.D.f1586d);
        this.I = i7.a.l(i12, false);
        int i17 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i17 >= t0Var2.size()) {
                iU = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iU = p.u(this.D, (String) t0Var2.get(i17), false);
                if (iU > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.K = i17;
        this.J = iU;
        int i18 = this.D.f1588f;
        int i19 = jVar.f1457s;
        this.L = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.M = p.s(this.D, jVar.f1456r);
        androidx.media3.common.t tVar = this.D;
        int i20 = tVar.f1588f;
        this.O = i20 == 0 || (i20 & 1) != 0;
        this.R = (tVar.f1587e & 1) != 0;
        String str = tVar.f1594n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z11 = true;
                    break;
                default:
                    z11 = false;
                    break;
            }
        } else {
            z11 = false;
        }
        this.Y = z11;
        int i21 = tVar.F;
        this.S = i21;
        this.T = tVar.G;
        int i22 = tVar.f1592j;
        this.U = i22;
        this.F = (i22 == -1 || i22 <= jVar.f1459u) && (i21 == -1 || i21 <= jVar.f1458t) && eVar.apply(tVar);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i23 = 0; i23 < strArrSplit.length; i23++) {
            strArrSplit[i23] = i0.I(strArrSplit[i23]);
        }
        int i24 = 0;
        while (true) {
            if (i24 < strArrSplit.length) {
                iU2 = p.u(this.D, strArrSplit[i24], false);
                if (iU2 <= 0) {
                    i24++;
                }
            } else {
                iU2 = 0;
                i24 = Integer.MAX_VALUE;
            }
        }
        this.P = i24;
        this.Q = iU2;
        for (int i25 = 0; i25 < t0Var.size(); i25++) {
            String str2 = this.D.f1594n;
            if (str2 != null && str2.equals(t0Var.get(i25))) {
                i14 = i25;
                this.V = i14;
                if ((i12 & 384) == 128) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.W = z12;
                if ((i12 & 64) == 64) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.X = z13;
                androidx.media3.common.t tVar2 = this.D;
                boolean z16 = this.F;
                j jVar2 = this.H;
                z14 = jVar2.B0;
                o2 o2Var = jVar2.f1461w;
                if (i7.a.l(i12, z14) && ((z16 || jVar2.f15508y0) && (o2Var.f1369a != 2 || p.y(jVar2, i12, tVar2)))) {
                    if (i7.a.l(i12, false) || !z16 || tVar2.f1592j == -1 || jVar2.G || jVar2.F || ((!jVar2.C0 && z10) || o2Var.f1369a == 2 || (i15 & i12) == 0)) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                }
                this.E = i16;
            }
        }
        this.V = i14;
        if ((i12 & 384) == 128) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.W = z12;
        if ((i12 & 64) == 64) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.X = z13;
        androidx.media3.common.t tVar3 = this.D;
        boolean z17 = this.F;
        j jVar3 = this.H;
        z14 = jVar3.B0;
        o2 o2Var2 = jVar3.f1461w;
        if (i7.a.l(i12, z14)) {
            if (i7.a.l(i12, false)) {
                i16 = 1;
            } else {
                i16 = 1;
            }
        }
        this.E = i16;
    }

    @Override
    public final int a() {
        return this.E;
    }

    @Override
    public final boolean b(n nVar) {
        int i10;
        String str;
        f fVar = (f) nVar;
        androidx.media3.common.t tVar = fVar.D;
        this.H.getClass();
        androidx.media3.common.t tVar2 = this.D;
        int i11 = tVar2.F;
        if (i11 == -1 || i11 != tVar.F) {
            return false;
        }
        return (this.N || ((str = tVar2.f1594n) != null && TextUtils.equals(str, tVar.f1594n))) && (i10 = tVar2.G) != -1 && i10 == tVar.G && this.W == fVar.W && this.X == fVar.X;
    }

    @Override
    public final int compareTo(f fVar) {
        boolean z10 = this.I;
        boolean z11 = this.F;
        b2 b2VarA = (z11 && z10) ? p.f15511k : p.f15511k.a();
        boolean z12 = fVar.I;
        int i10 = fVar.U;
        g0 g0VarC = g0.f5672a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.K);
        Integer numValueOf2 = Integer.valueOf(fVar.K);
        y1 y1Var = y1.C;
        g0 g0VarB = g0VarC.b(numValueOf, numValueOf2, y1Var).a(this.J, fVar.J).a(this.L, fVar.L).b(Integer.valueOf(this.M), Integer.valueOf(fVar.M), y1Var).c(this.R, fVar.R).c(this.O, fVar.O).b(Integer.valueOf(this.P), Integer.valueOf(fVar.P), y1Var).a(this.Q, fVar.Q).c(z11, fVar.F).b(Integer.valueOf(this.V), Integer.valueOf(fVar.V), y1Var);
        boolean z13 = this.H.F;
        int i11 = this.U;
        if (z13) {
            g0VarB = g0VarB.b(Integer.valueOf(i11), Integer.valueOf(i10), p.f15511k.a());
        }
        g0 g0VarB2 = g0VarB.c(this.W, fVar.W).c(this.X, fVar.X).c(this.Y, fVar.Y).b(Integer.valueOf(this.S), Integer.valueOf(fVar.S), b2VarA).b(Integer.valueOf(this.T), Integer.valueOf(fVar.T), b2VarA);
        if (Objects.equals(this.G, fVar.G)) {
            g0VarB2 = g0VarB2.b(Integer.valueOf(i11), Integer.valueOf(i10), b2VarA);
        }
        return g0VarB2.e();
    }
}
