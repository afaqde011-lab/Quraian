package i20;

import com.google.android.gms.internal.play_billing.q1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class j0 extends o20.l {
    public static final j0 e0;
    public static final a f0 = new a(13);
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
    public c1 P;
    public int Q;
    public int R;
    public List S;
    public List T;
    public List U;
    public List V;
    public List W;
    public List X;
    public List Y;
    public List Z;
    public p a0;
    public p b0;
    public byte c0;
    public int d0;

    static {
        j0 j0Var = new j0();
        e0 = j0Var;
        j0Var.n();
    }

    public j0() {
        this.N = -1;
        this.c0 = (byte) -1;
        this.d0 = -1;
        this.B = o20.e.A;
    }

    public j0(i0 i0Var) {
        super(i0Var);
        this.N = -1;
        this.c0 = (byte) -1;
        this.d0 = -1;
        this.B = i0Var.A;
    }

    public j0(o20.f fVar, o20.h hVar) throws Throwable {
        o oVar;
        o oVar2;
        this.N = -1;
        this.c0 = (byte) -1;
        this.d0 = -1;
        n();
        o20.d dVarL = o20.e.l();
        boolean z = true;
        q1 q1VarJ = q1.J(dVarL, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if ((i & 256) == 256) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if ((i & 512) == 512) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                if ((i & 65536) == 65536) {
                    this.U = Collections.unmodifiableList(this.U);
                }
                if ((i & 131072) == 131072) {
                    this.V = Collections.unmodifiableList(this.V);
                }
                if ((i & 262144) == 262144) {
                    this.W = Collections.unmodifiableList(this.W);
                }
                if ((i & 1024) == 1024) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if ((i & 16384) == 16384) {
                    this.S = Collections.unmodifiableList(this.S);
                }
                if ((i & 32768) == 32768) {
                    this.T = Collections.unmodifiableList(this.T);
                }
                if ((i & 524288) == 524288) {
                    this.X = Collections.unmodifiableList(this.X);
                }
                if ((i & 1048576) == 1048576) {
                    this.Y = Collections.unmodifiableList(this.Y);
                }
                if ((i & 2097152) == 2097152) {
                    this.Z = Collections.unmodifiableList(this.Z);
                }
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.B = dVarL.l();
                }
                k();
                return;
            }
            try {
                try {
                    int iO = fVar.o();
                    switch (iO) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.C |= 2;
                            this.E = fVar.g();
                            z = z3;
                            break;
                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                            this.C |= 4;
                            this.F = fVar.g();
                            z = z3;
                            break;
                        case 26:
                            t0 t0VarC = (this.C & 8) == 8 ? this.G.c() : null;
                            u0 u0Var = (u0) fVar.h(u0.V, hVar);
                            this.G = u0Var;
                            if (t0VarC != 0) {
                                t0VarC.g(u0Var);
                                this.G = t0VarC.e();
                            }
                            this.C |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.I = new ArrayList();
                                i |= 32;
                            }
                            this.I.add(fVar.h(z0.O, hVar));
                            z = z3;
                            break;
                        case 42:
                            t0 t0VarC2 = (this.C & 32) == 32 ? this.J.c() : null;
                            u0 u0Var2 = (u0) fVar.h(u0.V, hVar);
                            this.J = u0Var2;
                            if (t0VarC2 != 0) {
                                t0VarC2.g(u0Var2);
                                this.J = t0VarC2.e();
                            }
                            this.C |= 32;
                            z = z3;
                            break;
                        case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                            b1 b1VarN = (this.C & 128) == 128 ? this.P.n() : null;
                            c1 c1Var = (c1) fVar.h(c1.O, hVar);
                            this.P = c1Var;
                            if (b1VarN != 0) {
                                b1VarN.g(c1Var);
                                this.P = b1VarN.e();
                            }
                            this.C |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.C |= 256;
                            this.Q = fVar.g();
                            z = z3;
                            break;
                        case 64:
                            this.C |= 512;
                            this.R = fVar.g();
                            z = z3;
                            break;
                        case 72:
                            this.C |= 16;
                            this.H = fVar.g();
                            z = z3;
                            break;
                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                            this.C |= 64;
                            this.K = fVar.g();
                            z = z3;
                            break;
                        case 88:
                            this.C |= 1;
                            this.D = fVar.g();
                            z = z3;
                            break;
                        case 98:
                            if ((i & 256) != 256) {
                                this.L = new ArrayList();
                                i |= 256;
                            }
                            this.L.add(fVar.h(u0.V, hVar));
                            z = z3;
                            break;
                        case 104:
                            if ((i & 512) != 512) {
                                this.M = new ArrayList();
                                i |= 512;
                            }
                            this.M.add(Integer.valueOf(fVar.g()));
                            z = z3;
                            break;
                        case 106:
                            int iE = fVar.e(fVar.l());
                            if ((i & 512) != 512 && fVar.c() > 0) {
                                this.M = new ArrayList();
                                i |= 512;
                            }
                            while (fVar.c() > 0) {
                                this.M.add(Integer.valueOf(fVar.g()));
                            }
                            fVar.d(iE);
                            z = z3;
                            break;
                        case 114:
                            if ((i & 65536) != 65536) {
                                this.U = new ArrayList();
                                i |= 65536;
                            }
                            this.U.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.V = new ArrayList();
                                i |= 131072;
                            }
                            this.V.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.W = new ArrayList();
                                i |= 262144;
                            }
                            this.W.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 138:
                            if ((i & 1024) != 1024) {
                                this.O = new ArrayList();
                                i |= 1024;
                            }
                            this.O.add(fVar.h(c1.O, hVar));
                            z = z3;
                            break;
                        case 248:
                            if ((i & 16384) != 16384) {
                                this.S = new ArrayList();
                                i |= 16384;
                            }
                            this.S.add(Integer.valueOf(fVar.g()));
                            z = z3;
                            break;
                        case 250:
                            int iE2 = fVar.e(fVar.l());
                            if ((i & 16384) != 16384 && fVar.c() > 0) {
                                this.S = new ArrayList();
                                i |= 16384;
                            }
                            while (fVar.c() > 0) {
                                this.S.add(Integer.valueOf(fVar.g()));
                            }
                            fVar.d(iE2);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.T = new ArrayList();
                                i |= 32768;
                            }
                            this.T.add(fVar.h(l.H, hVar));
                            z = z3;
                            break;
                        case 266:
                            if ((i & 524288) != 524288) {
                                this.X = new ArrayList();
                                i |= 524288;
                            }
                            this.X.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.Y = new ArrayList();
                                i |= 1048576;
                            }
                            this.Y.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.Z = new ArrayList();
                                i |= 2097152;
                            }
                            this.Z.add(fVar.h(h.H, hVar));
                            z = z3;
                            break;
                        case 322:
                            if ((this.C & 1024) == 1024) {
                                p pVar = this.a0;
                                pVar.getClass();
                                oVar2 = new o(0);
                                oVar2.D = Collections.EMPTY_LIST;
                                oVar2.h(pVar);
                            } else {
                                oVar2 = null;
                            }
                            p pVar2 = (p) fVar.h(p.F, hVar);
                            this.a0 = pVar2;
                            if (oVar2 != null) {
                                oVar2.h(pVar2);
                                this.a0 = oVar2.d();
                            }
                            this.C |= 1024;
                            z = z3;
                            break;
                        case 330:
                            try {
                                if ((this.C & 2048) == 2048) {
                                    try {
                                        p pVar3 = this.b0;
                                        pVar3.getClass();
                                        oVar = new o(0);
                                        oVar.D = Collections.EMPTY_LIST;
                                        oVar.h(pVar3);
                                    } catch (InvalidProtocolBufferException e) {
                                        e = e;
                                        e.a(this);
                                        throw e;
                                    } catch (IOException e2) {
                                        e = e2;
                                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                        invalidProtocolBufferException.a(this);
                                        throw invalidProtocolBufferException;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i & 32) == 32) {
                                            this.I = Collections.unmodifiableList(this.I);
                                        }
                                        if ((i & 256) == 256) {
                                            this.L = Collections.unmodifiableList(this.L);
                                        }
                                        if ((i & 512) == 512) {
                                            this.M = Collections.unmodifiableList(this.M);
                                        }
                                        if ((i & 65536) == 65536) {
                                            this.U = Collections.unmodifiableList(this.U);
                                        }
                                        if ((i & 131072) == 131072) {
                                            this.V = Collections.unmodifiableList(this.V);
                                        }
                                        if ((i & 262144) == 262144) {
                                            this.W = Collections.unmodifiableList(this.W);
                                        }
                                        if ((i & 1024) == 1024) {
                                            this.O = Collections.unmodifiableList(this.O);
                                        }
                                        if ((i & 16384) == 16384) {
                                            this.S = Collections.unmodifiableList(this.S);
                                        }
                                        if ((i & 32768) == 32768) {
                                            this.T = Collections.unmodifiableList(this.T);
                                        }
                                        if ((i & 524288) == 524288) {
                                            this.X = Collections.unmodifiableList(this.X);
                                        }
                                        if ((i & 1048576) == 1048576) {
                                            this.Y = Collections.unmodifiableList(this.Y);
                                        }
                                        if ((i & 2097152) == 2097152) {
                                            this.Z = Collections.unmodifiableList(this.Z);
                                        }
                                        try {
                                            q1VarJ.A();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.B = dVarL.l();
                                        }
                                        k();
                                        throw th;
                                    }
                                } else {
                                    oVar = null;
                                }
                                p pVar4 = (p) fVar.h(p.F, hVar);
                                this.b0 = pVar4;
                                if (oVar != null) {
                                    oVar.h(pVar4);
                                    this.b0 = oVar.d();
                                }
                                this.C |= 2048;
                                z = z3;
                            } catch (InvalidProtocolBufferException e3) {
                                e = e3;
                            } catch (IOException e4) {
                                e = e4;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            break;
                        default:
                            if (!l(fVar, q1VarJ, hVar, iO)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (InvalidProtocolBufferException e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        }
    }

    @Override
    public final int a() {
        int i = this.d0;
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
        if ((this.C & 128) == 128) {
            iN += q1.p(6, this.P);
        }
        if ((this.C & 256) == 256) {
            iN += q1.n(7, this.Q);
        }
        if ((this.C & 512) == 512) {
            iN += q1.n(8, this.R);
        }
        if ((this.C & 16) == 16) {
            iN += q1.n(9, this.H);
        }
        if ((this.C & 64) == 64) {
            iN += q1.n(10, this.K);
        }
        if ((this.C & 1) == 1) {
            iN += q1.n(11, this.D);
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            iN += q1.p(12, (o20.b) this.L.get(i3));
        }
        int iO = 0;
        for (int i4 = 0; i4 < this.M.size(); i4++) {
            iO += q1.o(((Integer) this.M.get(i4)).intValue());
        }
        int iP = iN + iO;
        if (!this.M.isEmpty()) {
            iP = iP + 1 + q1.o(iO);
        }
        this.N = iO;
        for (int i5 = 0; i5 < this.U.size(); i5++) {
            iP += q1.p(14, (o20.b) this.U.get(i5));
        }
        for (int i6 = 0; i6 < this.V.size(); i6++) {
            iP += q1.p(15, (o20.b) this.V.get(i6));
        }
        for (int i7 = 0; i7 < this.W.size(); i7++) {
            iP += q1.p(16, (o20.b) this.W.get(i7));
        }
        for (int i8 = 0; i8 < this.O.size(); i8++) {
            iP += q1.p(17, (o20.b) this.O.get(i8));
        }
        int iO2 = 0;
        for (int i9 = 0; i9 < this.S.size(); i9++) {
            iO2 += q1.o(((Integer) this.S.get(i9)).intValue());
        }
        int size = (this.S.size() * 2) + iP + iO2;
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            size += q1.p(32, (o20.b) this.T.get(i11));
        }
        for (int i12 = 0; i12 < this.X.size(); i12++) {
            size += q1.p(33, (o20.b) this.X.get(i12));
        }
        for (int i13 = 0; i13 < this.Y.size(); i13++) {
            size += q1.p(34, (o20.b) this.Y.get(i13));
        }
        for (int i14 = 0; i14 < this.Z.size(); i14++) {
            size += q1.p(35, (o20.b) this.Z.get(i14));
        }
        if ((this.C & 1024) == 1024) {
            size += q1.p(40, this.a0);
        }
        if ((this.C & 2048) == 2048) {
            size += q1.p(41, this.b0);
        }
        int size2 = this.B.size() + h() + size;
        this.d0 = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return i0.f();
    }

    @Override
    public final o20.j c() {
        i0 i0VarF = i0.f();
        i0VarF.g(this);
        return i0VarF;
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
        if ((this.C & 128) == 128) {
            q1Var.g0(6, this.P);
        }
        if ((this.C & 256) == 256) {
            q1Var.e0(7, this.Q);
        }
        if ((this.C & 512) == 512) {
            q1Var.e0(8, this.R);
        }
        if ((this.C & 16) == 16) {
            q1Var.e0(9, this.H);
        }
        if ((this.C & 64) == 64) {
            q1Var.e0(10, this.K);
        }
        if ((this.C & 1) == 1) {
            q1Var.e0(11, this.D);
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            q1Var.g0(12, (o20.b) this.L.get(i2));
        }
        if (this.M.size() > 0) {
            q1Var.n0(106);
            q1Var.n0(this.N);
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            q1Var.f0(((Integer) this.M.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.U.size(); i4++) {
            q1Var.g0(14, (o20.b) this.U.get(i4));
        }
        for (int i5 = 0; i5 < this.V.size(); i5++) {
            q1Var.g0(15, (o20.b) this.V.get(i5));
        }
        for (int i6 = 0; i6 < this.W.size(); i6++) {
            q1Var.g0(16, (o20.b) this.W.get(i6));
        }
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            q1Var.g0(17, (o20.b) this.O.get(i7));
        }
        for (int i8 = 0; i8 < this.S.size(); i8++) {
            q1Var.e0(31, ((Integer) this.S.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.T.size(); i9++) {
            q1Var.g0(32, (o20.b) this.T.get(i9));
        }
        for (int i11 = 0; i11 < this.X.size(); i11++) {
            q1Var.g0(33, (o20.b) this.X.get(i11));
        }
        for (int i12 = 0; i12 < this.Y.size(); i12++) {
            q1Var.g0(34, (o20.b) this.Y.get(i12));
        }
        for (int i13 = 0; i13 < this.Z.size(); i13++) {
            q1Var.g0(35, (o20.b) this.Z.get(i13));
        }
        if ((this.C & 1024) == 1024) {
            q1Var.g0(40, this.a0);
        }
        if ((this.C & 2048) == 2048) {
            q1Var.g0(41, this.b0);
        }
        bVar.C(19000, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return e0;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.c0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.C;
        if ((i & 4) != 4) {
            this.c0 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.G.isInitialized()) {
            this.c0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            if (!((z0) this.I.get(i2)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        if ((this.C & 32) == 32 && !this.J.isInitialized()) {
            this.c0 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            if (!((u0) this.L.get(i3)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            if (!((c1) this.O.get(i4)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        if ((this.C & 128) == 128 && !this.P.isInitialized()) {
            this.c0 = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.T.size(); i5++) {
            if (!((l) this.T.get(i5)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.U.size(); i6++) {
            if (!((h) this.U.get(i6)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.V.size(); i7++) {
            if (!((h) this.V.get(i7)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.W.size(); i8++) {
            if (!((h) this.W.get(i8)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.X.size(); i9++) {
            if (!((h) this.X.get(i9)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.Y.size(); i11++) {
            if (!((h) this.Y.get(i11)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.Z.size(); i12++) {
            if (!((h) this.Z.get(i12)).isInitialized()) {
                this.c0 = (byte) 0;
                return false;
            }
        }
        if ((this.C & 1024) == 1024 && !this.a0.isInitialized()) {
            this.c0 = (byte) 0;
            return false;
        }
        if ((this.C & 2048) == 2048 && !this.b0.isInitialized()) {
            this.c0 = (byte) 0;
            return false;
        }
        if (g()) {
            this.c0 = (byte) 1;
            return true;
        }
        this.c0 = (byte) 0;
        return false;
    }

    public final void n() {
        this.D = 518;
        this.E = 2054;
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
        this.P = c1.N;
        this.Q = 0;
        this.R = 0;
        this.S = list;
        this.T = list;
        this.U = list;
        this.V = list;
        this.W = list;
        this.X = list;
        this.Y = list;
        this.Z = list;
        p pVar = p.E;
        this.a0 = pVar;
        this.b0 = pVar;
    }
}
