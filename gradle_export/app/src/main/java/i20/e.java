package i20;

import com.google.android.gms.internal.play_billing.q1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class e extends o20.o {
    public static final e P;
    public static final a Q = new a(2);
    public final o20.e A;
    public int B;
    public d C;
    public long D;
    public float E;
    public double F;
    public int G;
    public int H;
    public int I;
    public h J;
    public List K;
    public int L;
    public int M;
    public byte N;
    public int O;

    static {
        e eVar = new e();
        P = eVar;
        eVar.g();
    }

    public e() {
        this.N = (byte) -1;
        this.O = -1;
        this.A = o20.e.A;
    }

    public e(c cVar) {
        this.N = (byte) -1;
        this.O = -1;
        this.A = cVar.A;
    }

    public e(o20.f fVar, o20.h hVar) {
        g gVar;
        this.N = (byte) -1;
        this.O = -1;
        g();
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    switch (iO) {
                        case 0:
                            break;
                        case 8:
                            int iL = fVar.l();
                            d dVarA = d.a(iL);
                            if (dVarA == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.B |= 1;
                                this.C = dVarA;
                                continue;
                            }
                            break;
                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                            this.B |= 2;
                            long jM = fVar.m();
                            this.D = (-(jM & 1)) ^ (jM >>> 1);
                            continue;
                        case 29:
                            this.B |= 4;
                            this.E = Float.intBitsToFloat(fVar.j());
                            continue;
                        case 33:
                            this.B |= 8;
                            this.F = Double.longBitsToDouble(fVar.k());
                            continue;
                        case 40:
                            this.B |= 16;
                            this.G = fVar.l();
                            continue;
                        case 48:
                            this.B |= 32;
                            this.H = fVar.l();
                            continue;
                        case 56:
                            this.B |= 64;
                            this.I = fVar.l();
                            continue;
                        case 66:
                            if ((this.B & 128) == 128) {
                                h hVar2 = this.J;
                                hVar2.getClass();
                                gVar = new g(0);
                                gVar.D = Collections.EMPTY_LIST;
                                gVar.g(hVar2);
                            } else {
                                gVar = null;
                            }
                            h hVar3 = (h) fVar.h(h.H, hVar);
                            this.J = hVar3;
                            if (gVar != null) {
                                gVar.g(hVar3);
                                this.J = gVar.d();
                            }
                            this.B |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.K = new ArrayList();
                                c = 256;
                            }
                            this.K.add(fVar.h(Q, hVar));
                            continue;
                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                            this.B |= 512;
                            this.M = fVar.l();
                            continue;
                        case 88:
                            this.B |= 256;
                            this.L = fVar.l();
                            continue;
                        default:
                            if (!fVar.r(iO, q1VarJ)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 256) == 256) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    try {
                        q1VarJ.A();
                    } catch (IOException unused) {
                    } finally {
                        this.A = dVar.l();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.A = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.A = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((c & 256) == 256) {
            this.K = Collections.unmodifiableList(this.K);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.A = dVar.l();
        }
    }

    public static c h(e eVar) {
        c cVarE = c.e();
        cVarE.f(eVar);
        return cVarE;
    }

    @Override
    public final int a() {
        int i = this.O;
        if (i != -1) {
            return i;
        }
        int iM = (this.B & 1) == 1 ? q1.m(1, this.C.A) : 0;
        if ((this.B & 2) == 2) {
            long j = this.D;
            iM += q1.s((j >> 63) ^ (j << 1)) + q1.t(2);
        }
        if ((this.B & 4) == 4) {
            iM += q1.t(3) + 4;
        }
        if ((this.B & 8) == 8) {
            iM += q1.t(4) + 8;
        }
        if ((this.B & 16) == 16) {
            iM += q1.n(5, this.G);
        }
        if ((this.B & 32) == 32) {
            iM += q1.n(6, this.H);
        }
        if ((this.B & 64) == 64) {
            iM += q1.n(7, this.I);
        }
        if ((this.B & 128) == 128) {
            iM += q1.p(8, this.J);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            iM += q1.p(9, (o20.b) this.K.get(i2));
        }
        if ((this.B & 512) == 512) {
            iM += q1.n(10, this.M);
        }
        if ((this.B & 256) == 256) {
            iM += q1.n(11, this.L);
        }
        int size = this.A.size() + iM;
        this.O = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return c.e();
    }

    @Override
    public final o20.j c() {
        return h(this);
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.d0(1, this.C.A);
        }
        if ((this.B & 2) == 2) {
            long j = this.D;
            q1Var.p0(2, 0);
            q1Var.o0((j >> 63) ^ (j << 1));
        }
        if ((this.B & 4) == 4) {
            float f = this.E;
            q1Var.p0(3, 5);
            q1Var.l0(Float.floatToRawIntBits(f));
        }
        if ((this.B & 8) == 8) {
            double d = this.F;
            q1Var.p0(4, 1);
            q1Var.m0(Double.doubleToRawLongBits(d));
        }
        if ((this.B & 16) == 16) {
            q1Var.e0(5, this.G);
        }
        if ((this.B & 32) == 32) {
            q1Var.e0(6, this.H);
        }
        if ((this.B & 64) == 64) {
            q1Var.e0(7, this.I);
        }
        if ((this.B & 128) == 128) {
            q1Var.g0(8, this.J);
        }
        for (int i = 0; i < this.K.size(); i++) {
            q1Var.g0(9, (o20.b) this.K.get(i));
        }
        if ((this.B & 512) == 512) {
            q1Var.e0(10, this.M);
        }
        if ((this.B & 256) == 256) {
            q1Var.e0(11, this.L);
        }
        q1Var.j0(this.A);
    }

    public final void g() {
        this.C = d.BYTE;
        this.D = 0L;
        this.E = 0.0f;
        this.F = 0.0d;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = h.G;
        this.K = Collections.EMPTY_LIST;
        this.L = 0;
        this.M = 0;
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
        if ((this.B & 128) == 128 && !this.J.isInitialized()) {
            this.N = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.K.size(); i++) {
            if (!((e) this.K.get(i)).isInitialized()) {
                this.N = (byte) 0;
                return false;
            }
        }
        this.N = (byte) 1;
        return true;
    }
}
