package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.util.Collections;
import java.util.List;

public final class k extends o20.l {
    public static final k g0;
    public static final a h0 = new a(3);
    public final o20.e B;
    public int C;
    public int D;
    public int E;
    public int F;
    public List G;
    public List H;
    public List I;
    public int J;
    public List K;
    public int L;
    public List M;
    public List N;
    public int O;
    public List P;
    public List Q;
    public List R;
    public List S;
    public List T;
    public List U;
    public int V;
    public int W;
    public u0 X;
    public int Y;
    public List Z;
    public a1 a0;
    public List b0;
    public h1 c0;
    public List d0;
    public byte e0;
    public int f0;

    static {
        k kVar = new k();
        g0 = kVar;
        kVar.n();
    }

    public k() {
        this.J = -1;
        this.L = -1;
        this.O = -1;
        this.V = -1;
        this.e0 = (byte) -1;
        this.f0 = -1;
        this.B = o20.e.A;
    }

    public k(i iVar) {
        super(iVar);
        this.J = -1;
        this.L = -1;
        this.O = -1;
        this.V = -1;
        this.e0 = (byte) -1;
        this.f0 = -1;
        this.B = iVar.A;
    }

    public k(o20.f r22, o20.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: i20.k.<init>(o20.f, o20.h):void");
    }

    @Override
    public final int a() {
        int i = this.f0;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 1) == 1 ? q1.n(1, this.D) : 0;
        int iO = 0;
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            iO += q1.o(((Integer) this.I.get(i2)).intValue());
        }
        int iP = iN + iO;
        if (!this.I.isEmpty()) {
            iP = iP + 1 + q1.o(iO);
        }
        this.J = iO;
        if ((this.C & 2) == 2) {
            iP += q1.n(3, this.E);
        }
        if ((this.C & 4) == 4) {
            iP += q1.n(4, this.F);
        }
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            iP += q1.p(5, (o20.b) this.G.get(i3));
        }
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            iP += q1.p(6, (o20.b) this.H.get(i4));
        }
        int iO2 = 0;
        for (int i5 = 0; i5 < this.K.size(); i5++) {
            iO2 += q1.o(((Integer) this.K.get(i5)).intValue());
        }
        int iP2 = iP + iO2;
        if (!this.K.isEmpty()) {
            iP2 = iP2 + 1 + q1.o(iO2);
        }
        this.L = iO2;
        for (int i6 = 0; i6 < this.P.size(); i6++) {
            iP2 += q1.p(8, (o20.b) this.P.get(i6));
        }
        for (int i7 = 0; i7 < this.Q.size(); i7++) {
            iP2 += q1.p(9, (o20.b) this.Q.get(i7));
        }
        for (int i8 = 0; i8 < this.R.size(); i8++) {
            iP2 += q1.p(10, (o20.b) this.R.get(i8));
        }
        for (int i9 = 0; i9 < this.S.size(); i9++) {
            iP2 += q1.p(11, (o20.b) this.S.get(i9));
        }
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            iP2 += q1.p(13, (o20.b) this.T.get(i11));
        }
        int iO3 = 0;
        for (int i12 = 0; i12 < this.U.size(); i12++) {
            iO3 += q1.o(((Integer) this.U.get(i12)).intValue());
        }
        int iP3 = iP2 + iO3;
        if (!this.U.isEmpty()) {
            iP3 = iP3 + 2 + q1.o(iO3);
        }
        this.V = iO3;
        if ((this.C & 8) == 8) {
            iP3 += q1.n(17, this.W);
        }
        if ((this.C & 16) == 16) {
            iP3 += q1.p(18, this.X);
        }
        if ((this.C & 32) == 32) {
            iP3 += q1.n(19, this.Y);
        }
        for (int i13 = 0; i13 < this.M.size(); i13++) {
            iP3 += q1.p(20, (o20.b) this.M.get(i13));
        }
        int iO4 = 0;
        for (int i14 = 0; i14 < this.N.size(); i14++) {
            iO4 += q1.o(((Integer) this.N.get(i14)).intValue());
        }
        int iP4 = iP3 + iO4;
        if (!this.N.isEmpty()) {
            iP4 = iP4 + 2 + q1.o(iO4);
        }
        this.O = iO4;
        for (int i15 = 0; i15 < this.Z.size(); i15++) {
            iP4 += q1.p(25, (o20.b) this.Z.get(i15));
        }
        if ((this.C & 64) == 64) {
            iP4 += q1.p(30, this.a0);
        }
        int iO5 = 0;
        for (int i16 = 0; i16 < this.b0.size(); i16++) {
            iO5 += q1.o(((Integer) this.b0.get(i16)).intValue());
        }
        int size = (this.b0.size() * 2) + iP4 + iO5;
        if ((this.C & 128) == 128) {
            size += q1.p(32, this.c0);
        }
        for (int i17 = 0; i17 < this.d0.size(); i17++) {
            size += q1.p(33, (o20.b) this.d0.get(i17));
        }
        int size2 = this.B.size() + h() + size;
        this.f0 = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return i.f();
    }

    @Override
    public final o20.j c() {
        i iVarF = i.f();
        iVarF.g(this);
        return iVarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 1) == 1) {
            q1Var.e0(1, this.D);
        }
        if (this.I.size() > 0) {
            q1Var.n0(18);
            q1Var.n0(this.J);
        }
        for (int i = 0; i < this.I.size(); i++) {
            q1Var.f0(((Integer) this.I.get(i)).intValue());
        }
        if ((this.C & 2) == 2) {
            q1Var.e0(3, this.E);
        }
        if ((this.C & 4) == 4) {
            q1Var.e0(4, this.F);
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            q1Var.g0(5, (o20.b) this.G.get(i2));
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            q1Var.g0(6, (o20.b) this.H.get(i3));
        }
        if (this.K.size() > 0) {
            q1Var.n0(58);
            q1Var.n0(this.L);
        }
        for (int i4 = 0; i4 < this.K.size(); i4++) {
            q1Var.f0(((Integer) this.K.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.P.size(); i5++) {
            q1Var.g0(8, (o20.b) this.P.get(i5));
        }
        for (int i6 = 0; i6 < this.Q.size(); i6++) {
            q1Var.g0(9, (o20.b) this.Q.get(i6));
        }
        for (int i7 = 0; i7 < this.R.size(); i7++) {
            q1Var.g0(10, (o20.b) this.R.get(i7));
        }
        for (int i8 = 0; i8 < this.S.size(); i8++) {
            q1Var.g0(11, (o20.b) this.S.get(i8));
        }
        for (int i9 = 0; i9 < this.T.size(); i9++) {
            q1Var.g0(13, (o20.b) this.T.get(i9));
        }
        if (this.U.size() > 0) {
            q1Var.n0(130);
            q1Var.n0(this.V);
        }
        for (int i11 = 0; i11 < this.U.size(); i11++) {
            q1Var.f0(((Integer) this.U.get(i11)).intValue());
        }
        if ((this.C & 8) == 8) {
            q1Var.e0(17, this.W);
        }
        if ((this.C & 16) == 16) {
            q1Var.g0(18, this.X);
        }
        if ((this.C & 32) == 32) {
            q1Var.e0(19, this.Y);
        }
        for (int i12 = 0; i12 < this.M.size(); i12++) {
            q1Var.g0(20, (o20.b) this.M.get(i12));
        }
        if (this.N.size() > 0) {
            q1Var.n0(170);
            q1Var.n0(this.O);
        }
        for (int i13 = 0; i13 < this.N.size(); i13++) {
            q1Var.f0(((Integer) this.N.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.Z.size(); i14++) {
            q1Var.g0(25, (o20.b) this.Z.get(i14));
        }
        if ((this.C & 64) == 64) {
            q1Var.g0(30, this.a0);
        }
        for (int i15 = 0; i15 < this.b0.size(); i15++) {
            q1Var.e0(31, ((Integer) this.b0.get(i15)).intValue());
        }
        if ((this.C & 128) == 128) {
            q1Var.g0(32, this.c0);
        }
        for (int i16 = 0; i16 < this.d0.size(); i16++) {
            q1Var.g0(33, (o20.b) this.d0.get(i16));
        }
        bVar.C(19000, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return g0;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.e0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.C & 2) != 2) {
            this.e0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.G.size(); i++) {
            if (!((z0) this.G.get(i)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            if (!((u0) this.H.get(i2)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            if (!((u0) this.M.get(i3)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.P.size(); i4++) {
            if (!((n) this.P.get(i4)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.Q.size(); i5++) {
            if (!((b0) this.Q.get(i5)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            if (!((j0) this.R.get(i6)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.S.size(); i7++) {
            if (!((w0) this.S.get(i7)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            if (!((w) this.T.get(i8)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        if ((this.C & 16) == 16 && !this.X.isInitialized()) {
            this.e0 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.Z.size(); i9++) {
            if (!((h) this.Z.get(i9)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        if ((this.C & 64) == 64 && !this.a0.isInitialized()) {
            this.e0 = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.d0.size(); i11++) {
            if (!((l) this.d0.get(i11)).isInitialized()) {
                this.e0 = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.e0 = (byte) 1;
            return true;
        }
        this.e0 = (byte) 0;
        return false;
    }

    public final void n() {
        this.D = 6;
        this.E = 0;
        this.F = 0;
        List list = Collections.EMPTY_LIST;
        this.G = list;
        this.H = list;
        this.I = list;
        this.K = list;
        this.M = list;
        this.N = list;
        this.P = list;
        this.Q = list;
        this.R = list;
        this.S = list;
        this.T = list;
        this.U = list;
        this.W = 0;
        this.X = u0.U;
        this.Y = 0;
        this.Z = list;
        this.a0 = a1.G;
        this.b0 = list;
        this.c0 = h1.E;
        this.d0 = list;
    }
}
