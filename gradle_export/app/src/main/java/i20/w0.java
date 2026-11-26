package i20;

import com.google.android.gms.internal.play_billing.q1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.events.EventsManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class w0 extends o20.l {
    public static final w0 P;
    public static final a Q = new a(19);
    public final o20.e B;
    public int C;
    public int D;
    public int E;
    public List F;
    public u0 G;
    public int H;
    public u0 I;
    public int J;
    public List K;
    public List L;
    public List M;
    public byte N;
    public int O;

    static {
        w0 w0Var = new w0();
        P = w0Var;
        w0Var.D = 6;
        w0Var.E = 0;
        List list = Collections.EMPTY_LIST;
        w0Var.F = list;
        u0 u0Var = u0.U;
        w0Var.G = u0Var;
        w0Var.H = 0;
        w0Var.I = u0Var;
        w0Var.J = 0;
        w0Var.K = list;
        w0Var.L = list;
        w0Var.M = list;
    }

    public w0() {
        this.N = (byte) -1;
        this.O = -1;
        this.B = o20.e.A;
    }

    public w0(v0 v0Var) {
        super(v0Var);
        this.N = (byte) -1;
        this.O = -1;
        this.B = v0Var.A;
    }

    public w0(o20.f fVar, o20.h hVar) {
        this.N = (byte) -1;
        this.O = -1;
        this.D = 6;
        boolean z = false;
        this.E = 0;
        List list = Collections.EMPTY_LIST;
        this.F = list;
        u0 u0Var = u0.U;
        this.G = u0Var;
        this.H = 0;
        this.I = u0Var;
        this.J = 0;
        this.K = list;
        this.L = list;
        this.M = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    t0 t0VarP = null;
                    switch (iO) {
                        case 0:
                            break;
                        case 8:
                            this.C |= 1;
                            this.D = fVar.l();
                            continue;
                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                            this.C |= 2;
                            this.E = fVar.l();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.F = new ArrayList();
                                i |= 4;
                            }
                            this.F.add(fVar.h(z0.O, hVar));
                            continue;
                        case 34:
                            if ((this.C & 4) == 4) {
                                u0 u0Var2 = this.G;
                                u0Var2.getClass();
                                t0VarP = u0.p(u0Var2);
                            }
                            u0 u0Var3 = (u0) fVar.h(u0.V, hVar);
                            this.G = u0Var3;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var3);
                                this.G = t0VarP.e();
                            }
                            this.C |= 4;
                            continue;
                        case 40:
                            this.C |= 8;
                            this.H = fVar.l();
                            continue;
                        case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                            if ((this.C & 16) == 16) {
                                u0 u0Var4 = this.I;
                                u0Var4.getClass();
                                t0VarP = u0.p(u0Var4);
                            }
                            u0 u0Var5 = (u0) fVar.h(u0.V, hVar);
                            this.I = u0Var5;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var5);
                                this.I = t0VarP.e();
                            }
                            this.C |= 16;
                            continue;
                        case 56:
                            this.C |= 32;
                            this.J = fVar.l();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.K = new ArrayList();
                                i |= 128;
                            }
                            this.K.add(fVar.h(h.H, hVar));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.L = new ArrayList();
                                i |= 256;
                            }
                            this.L.add(Integer.valueOf(fVar.l()));
                            continue;
                        case 250:
                            int iE = fVar.e(fVar.l());
                            if ((i & 256) != 256 && fVar.c() > 0) {
                                this.L = new ArrayList();
                                i |= 256;
                            }
                            while (fVar.c() > 0) {
                                this.L.add(Integer.valueOf(fVar.l()));
                            }
                            fVar.d(iE);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.M = new ArrayList();
                                i |= 512;
                            }
                            this.M.add(fVar.h(l.H, hVar));
                            continue;
                        default:
                            if (!l(fVar, q1VarJ, hVar, iO)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.A = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.A = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 4) == 4) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if ((i & 128) == 128) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                if ((i & 256) == 256) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if ((i & 512) == 512) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.B = dVar.l();
                }
                k();
                throw th;
            }
        }
        if ((i & 4) == 4) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if ((i & 128) == 128) {
            this.K = Collections.unmodifiableList(this.K);
        }
        if ((i & 256) == 256) {
            this.L = Collections.unmodifiableList(this.L);
        }
        if ((i & 512) == 512) {
            this.M = Collections.unmodifiableList(this.M);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.B = dVar.l();
        }
        k();
    }

    @Override
    public final int a() {
        int i = this.O;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 1) == 1 ? q1.n(1, this.D) : 0;
        if ((this.C & 2) == 2) {
            iN += q1.n(2, this.E);
        }
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iN += q1.p(3, (o20.b) this.F.get(i2));
        }
        if ((this.C & 4) == 4) {
            iN += q1.p(4, this.G);
        }
        if ((this.C & 8) == 8) {
            iN += q1.n(5, this.H);
        }
        if ((this.C & 16) == 16) {
            iN += q1.p(6, this.I);
        }
        if ((this.C & 32) == 32) {
            iN += q1.n(7, this.J);
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            iN += q1.p(8, (o20.b) this.K.get(i3));
        }
        int iO = 0;
        for (int i4 = 0; i4 < this.L.size(); i4++) {
            iO += q1.o(((Integer) this.L.get(i4)).intValue());
        }
        int size = (this.L.size() * 2) + iN + iO;
        for (int i5 = 0; i5 < this.M.size(); i5++) {
            size += q1.p(32, (o20.b) this.M.get(i5));
        }
        int size2 = this.B.size() + h() + size;
        this.O = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return v0.f();
    }

    @Override
    public final o20.j c() {
        v0 v0VarF = v0.f();
        v0VarF.g(this);
        return v0VarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 1) == 1) {
            q1Var.e0(1, this.D);
        }
        if ((this.C & 2) == 2) {
            q1Var.e0(2, this.E);
        }
        for (int i = 0; i < this.F.size(); i++) {
            q1Var.g0(3, (o20.b) this.F.get(i));
        }
        if ((this.C & 4) == 4) {
            q1Var.g0(4, this.G);
        }
        if ((this.C & 8) == 8) {
            q1Var.e0(5, this.H);
        }
        if ((this.C & 16) == 16) {
            q1Var.g0(6, this.I);
        }
        if ((this.C & 32) == 32) {
            q1Var.e0(7, this.J);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            q1Var.g0(8, (o20.b) this.K.get(i2));
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            q1Var.e0(31, ((Integer) this.L.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.M.size(); i4++) {
            q1Var.g0(32, (o20.b) this.M.get(i4));
        }
        bVar.C(200, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return P;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.N;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.C & 2) != 2) {
            this.N = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.F.size(); i++) {
            if (!((z0) this.F.get(i)).isInitialized()) {
                this.N = (byte) 0;
                return false;
            }
        }
        if ((this.C & 4) == 4 && !this.G.isInitialized()) {
            this.N = (byte) 0;
            return false;
        }
        if ((this.C & 16) == 16 && !this.I.isInitialized()) {
            this.N = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            if (!((h) this.K.get(i2)).isInitialized()) {
                this.N = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            if (!((l) this.M.get(i3)).isInitialized()) {
                this.N = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.N = (byte) 1;
            return true;
        }
        this.N = (byte) 0;
        return false;
    }
}
