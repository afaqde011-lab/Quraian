package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class a1 extends o20.o {
    public static final a1 G;
    public static final a H = new a(21);
    public final o20.e A;
    public int B;
    public List C;
    public int D;
    public byte E;
    public int F;

    static {
        a1 a1Var = new a1();
        G = a1Var;
        a1Var.C = Collections.EMPTY_LIST;
        a1Var.D = -1;
    }

    public a1() {
        this.E = (byte) -1;
        this.F = -1;
        this.A = o20.e.A;
    }

    public a1(g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.A = gVar.A;
    }

    public a1(o20.f fVar, o20.h hVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.C = Collections.EMPTY_LIST;
        this.D = -1;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iO = fVar.o();
                        if (iO != 0) {
                            if (iO == 10) {
                                if (!z2) {
                                    this.C = new ArrayList();
                                    z2 = true;
                                }
                                this.C.add(fVar.h(u0.V, hVar));
                            } else if (iO == 16) {
                                this.B |= 1;
                                this.D = fVar.l();
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
                if (z2) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.A = dVar.l();
                }
                throw th;
            }
        }
        if (z2) {
            this.C = Collections.unmodifiableList(this.C);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.A = dVar.l();
        }
    }

    public static g g(a1 a1Var) {
        g gVarF = g.f();
        gVarF.h(a1Var);
        return gVarF;
    }

    @Override
    public final int a() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            iN += q1.p(1, (o20.b) this.C.get(i2));
        }
        if ((this.B & 1) == 1) {
            iN += q1.n(2, this.D);
        }
        int size = this.A.size() + iN;
        this.F = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return g.f();
    }

    @Override
    public final o20.j c() {
        return g(this);
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        for (int i = 0; i < this.C.size(); i++) {
            q1Var.g0(1, (o20.b) this.C.get(i));
        }
        if ((this.B & 1) == 1) {
            q1Var.e0(2, this.D);
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
        for (int i = 0; i < this.C.size(); i++) {
            if (!((u0) this.C.get(i)).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        this.E = (byte) 1;
        return true;
    }
}
