package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class p0 extends o20.o {
    public static final p0 E;
    public static final a F = new a(16);
    public final o20.e A;
    public o20.s B;
    public byte C;
    public int D;

    static {
        p0 p0Var = new p0();
        E = p0Var;
        p0Var.B = o20.r.B;
    }

    public p0() {
        this.C = (byte) -1;
        this.D = -1;
        this.A = o20.e.A;
    }

    public p0(o oVar) {
        this.C = (byte) -1;
        this.D = -1;
        this.A = oVar.A;
    }

    public p0(o20.f fVar) {
        this.C = (byte) -1;
        this.D = -1;
        this.B = o20.r.B;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 10) {
                            o20.t tVarF = fVar.f();
                            if (!z2) {
                                this.B = new o20.r();
                                z2 = true;
                            }
                            this.B.j(tVarF);
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.B = this.B.getUnmodifiableView();
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
        if (z2) {
            this.B = this.B.getUnmodifiableView();
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
        int i = this.D;
        if (i != -1) {
            return i;
        }
        int size = 0;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            o20.e byteString = this.B.getByteString(i2);
            size += byteString.size() + q1.r(byteString.size());
        }
        int size2 = this.A.size() + this.B.size() + size;
        this.D = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        o oVar = new o(3);
        oVar.D = o20.r.B;
        return oVar;
    }

    @Override
    public final o20.j c() {
        o oVar = new o(3);
        oVar.D = o20.r.B;
        oVar.k(this);
        return oVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        for (int i = 0; i < this.B.size(); i++) {
            o20.e byteString = this.B.getByteString(i);
            q1Var.p0(1, 2);
            q1Var.n0(byteString.size());
            q1Var.j0(byteString);
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        if (this.C == 1) {
            return true;
        }
        this.C = (byte) 1;
        return true;
    }
}
