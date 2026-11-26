package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class l extends o20.o {
    public static final l G;
    public static final a H = new a(4);
    public final o20.e A;
    public int B;
    public int C;
    public o20.t D;
    public byte E;
    public int F;

    static {
        l lVar = new l();
        G = lVar;
        lVar.C = 0;
        lVar.D = o20.e.A;
    }

    public l() {
        this.E = (byte) -1;
        this.F = -1;
        this.A = o20.e.A;
    }

    public l(b bVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.A = bVar.A;
    }

    public l(o20.f fVar) {
        this.E = (byte) -1;
        this.F = -1;
        boolean z = false;
        this.C = 0;
        this.D = o20.e.A;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iO = fVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.B |= 1;
                                this.C = fVar.l();
                            } else if (iO == 18) {
                                this.B |= 2;
                                this.D = fVar.f();
                            } else if (!fVar.r(iO, q1VarJ)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.A = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.A = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.A = dVar.l();
                }
                throw th;
            }
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.A = dVar.l();
        }
    }

    @Override
    public final int a() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int iN = (this.B & 1) == 1 ? q1.n(1, this.C) : 0;
        if ((this.B & 2) == 2) {
            o20.t tVar = this.D;
            iN += tVar.size() + q1.r(tVar.size()) + q1.t(2);
        }
        int size = this.A.size() + iN;
        this.F = size;
        return size;
    }

    @Override
    public final o20.j b() {
        b bVar = new b(1);
        bVar.E = o20.e.A;
        return bVar;
    }

    @Override
    public final o20.j c() {
        b bVar = new b(1);
        bVar.E = o20.e.A;
        bVar.g(this);
        return bVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.e0(1, this.C);
        }
        if ((this.B & 2) == 2) {
            o20.t tVar = this.D;
            q1Var.p0(2, 2);
            q1Var.n0(tVar.size());
            q1Var.j0(tVar);
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.B;
        if ((i & 1) != 1) {
            this.E = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }
}
