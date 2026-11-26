package l20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;

public final class b extends o {
    public static final b G;
    public static final i20.a H = new i20.a(25);
    public final o20.e A;
    public int B;
    public int C;
    public int D;
    public byte E;
    public int F;

    static {
        b bVar = new b();
        G = bVar;
        bVar.C = 0;
        bVar.D = 0;
    }

    public b() {
        this.E = (byte) -1;
        this.F = -1;
        this.A = o20.e.A;
    }

    public b(a aVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.A = aVar.A;
    }

    public b(o20.f fVar) {
        this.E = (byte) -1;
        this.F = -1;
        boolean z = false;
        this.C = 0;
        this.D = 0;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.B |= 1;
                            this.C = fVar.l();
                        } else if (iO == 16) {
                            this.B |= 2;
                            this.D = fVar.l();
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
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
            iN += q1.n(2, this.D);
        }
        int size = this.A.size() + iN;
        this.F = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return new a(0);
    }

    @Override
    public final o20.j c() {
        a aVar = new a(0);
        aVar.f(this);
        return aVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.e0(1, this.C);
        }
        if ((this.B & 2) == 2) {
            q1Var.e0(2, this.D);
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        if (this.E == 1) {
            return true;
        }
        this.E = (byte) 1;
        return true;
    }
}
