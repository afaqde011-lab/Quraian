package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.util.Collections;
import java.util.List;

public final class b0 extends o20.l {
    public static final b0 Y;
    public static final a Z = new a(10);
    public final o20.e B;
    public int C;
    public int D;
    public int E;
    public int F;
    public u0 G;
    public int H;
    public List I;
    public u0 J;
    public int K;
    public List L;
    public List M;
    public int N;
    public List O;
    public List P;
    public a1 Q;
    public List R;
    public p S;
    public List T;
    public List U;
    public List V;
    public byte W;
    public int X;

    static {
        b0 b0Var = new b0();
        Y = b0Var;
        b0Var.n();
    }

    public b0() {
        this.N = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.B = o20.e.A;
    }

    public b0(a0 a0Var) {
        super(a0Var);
        this.N = -1;
        this.W = (byte) -1;
        this.X = -1;
        this.B = a0Var.A;
    }

    public b0(o20.f r22, o20.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: i20.b0.<init>(o20.f, o20.h):void");
    }

    @Override
    public final int a() {
        int i = this.X;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 2) == 2 ? q1.n(1, this.E) : 0;
        if ((this.C & 4) == 4) {
            iN += q1.n(2, this.F);
        }
        if ((this.C & 8) == 8) {
            iN += q1.p(3, this.G);
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            iN += q1.p(4, (o20.b) this.I.get(i2));
        }
        if ((this.C & 32) == 32) {
            iN += q1.p(5, this.J);
        }
        for (int i3 = 0; i3 < this.P.size(); i3++) {
            iN += q1.p(6, (o20.b) this.P.get(i3));
        }
        if ((this.C & 16) == 16) {
            iN += q1.n(7, this.H);
        }
        if ((this.C & 64) == 64) {
            iN += q1.n(8, this.K);
        }
        if ((this.C & 1) == 1) {
            iN += q1.n(9, this.D);
        }
        for (int i4 = 0; i4 < this.L.size(); i4++) {
            iN += q1.p(10, (o20.b) this.L.get(i4));
        }
        int iO = 0;
        for (int i5 = 0; i5 < this.M.size(); i5++) {
            iO += q1.o(((Integer) this.M.get(i5)).intValue());
        }
        int iP = iN + iO;
        if (!this.M.isEmpty()) {
            iP = iP + 1 + q1.o(iO);
        }
        this.N = iO;
        for (int i6 = 0; i6 < this.U.size(); i6++) {
            iP += q1.p(12, (o20.b) this.U.get(i6));
        }
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            iP += q1.p(13, (o20.b) this.O.get(i7));
        }
        if ((this.C & 128) == 128) {
            iP += q1.p(30, this.Q);
        }
        int iO2 = 0;
        for (int i8 = 0; i8 < this.R.size(); i8++) {
            iO2 += q1.o(((Integer) this.R.get(i8)).intValue());
        }
        int size = (this.R.size() * 2) + iP + iO2;
        if ((this.C & 256) == 256) {
            size += q1.p(32, this.S);
        }
        for (int i9 = 0; i9 < this.T.size(); i9++) {
            size += q1.p(33, (o20.b) this.T.get(i9));
        }
        for (int i11 = 0; i11 < this.V.size(); i11++) {
            size += q1.p(34, (o20.b) this.V.get(i11));
        }
        int size2 = this.B.size() + h() + size;
        this.X = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return a0.f();
    }

    @Override
    public final o20.j c() {
        a0 a0VarF = a0.f();
        a0VarF.g(this);
        return a0VarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 2) == 2) {
            q1Var.e0(1, this.E);
        }
        if ((this.C & 4) == 4) {
            q1Var.e0(2, this.F);
        }
        if ((this.C & 8) == 8) {
            q1Var.g0(3, this.G);
        }
        for (int i = 0; i < this.I.size(); i++) {
            q1Var.g0(4, (o20.b) this.I.get(i));
        }
        if ((this.C & 32) == 32) {
            q1Var.g0(5, this.J);
        }
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            q1Var.g0(6, (o20.b) this.P.get(i2));
        }
        if ((this.C & 16) == 16) {
            q1Var.e0(7, this.H);
        }
        if ((this.C & 64) == 64) {
            q1Var.e0(8, this.K);
        }
        if ((this.C & 1) == 1) {
            q1Var.e0(9, this.D);
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            q1Var.g0(10, (o20.b) this.L.get(i3));
        }
        if (this.M.size() > 0) {
            q1Var.n0(90);
            q1Var.n0(this.N);
        }
        for (int i4 = 0; i4 < this.M.size(); i4++) {
            q1Var.f0(((Integer) this.M.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.U.size(); i5++) {
            q1Var.g0(12, (o20.b) this.U.get(i5));
        }
        for (int i6 = 0; i6 < this.O.size(); i6++) {
            q1Var.g0(13, (o20.b) this.O.get(i6));
        }
        if ((this.C & 128) == 128) {
            q1Var.g0(30, this.Q);
        }
        for (int i7 = 0; i7 < this.R.size(); i7++) {
            q1Var.e0(31, ((Integer) this.R.get(i7)).intValue());
        }
        if ((this.C & 256) == 256) {
            q1Var.g0(32, this.S);
        }
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            q1Var.g0(33, (o20.b) this.T.get(i8));
        }
        for (int i9 = 0; i9 < this.V.size(); i9++) {
            q1Var.g0(34, (o20.b) this.V.get(i9));
        }
        bVar.C(19000, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return Y;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.W;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.C;
        if ((i & 4) != 4) {
            this.W = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.G.isInitialized()) {
            this.W = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            if (!((z0) this.I.get(i2)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        if ((this.C & 32) == 32 && !this.J.isInitialized()) {
            this.W = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            if (!((u0) this.L.get(i3)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            if (!((c1) this.O.get(i4)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.P.size(); i5++) {
            if (!((c1) this.P.get(i5)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        if ((this.C & 128) == 128 && !this.Q.isInitialized()) {
            this.W = (byte) 0;
            return false;
        }
        if ((this.C & 256) == 256 && !this.S.isInitialized()) {
            this.W = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.T.size(); i6++) {
            if (!((l) this.T.get(i6)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.U.size(); i7++) {
            if (!((h) this.U.get(i7)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.V.size(); i8++) {
            if (!((h) this.V.get(i8)).isInitialized()) {
                this.W = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.W = (byte) 1;
            return true;
        }
        this.W = (byte) 0;
        return false;
    }

    public final void n() {
        this.D = 6;
        this.E = 6;
        this.F = 0;
        u0 u0Var = u0.U;
        this.G = u0Var;
        this.H = 0;
        List list = Collections.EMPTY_LIST;
        this.I = list;
        this.J = u0Var;
        this.K = 0;
        this.L = list;
        this.M = list;
        this.O = list;
        this.P = list;
        this.Q = a1.G;
        this.R = list;
        this.S = p.E;
        this.T = list;
        this.U = list;
        this.V = list;
    }
}
