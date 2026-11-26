package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class p extends o20.o {
    public static final p E;
    public static final a F = new a(6);
    public final o20.e A;
    public List B;
    public byte C;
    public int D;

    static {
        p pVar = new p();
        E = pVar;
        pVar.B = Collections.EMPTY_LIST;
    }

    public p() {
        this.C = (byte) -1;
        this.D = -1;
        this.A = o20.e.A;
    }

    public p(o oVar) {
        this.C = (byte) -1;
        this.D = -1;
        this.A = oVar.A;
    }

    public p(o20.f fVar, o20.h hVar) {
        this.C = (byte) -1;
        this.D = -1;
        this.B = Collections.EMPTY_LIST;
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
                            if (!z2) {
                                this.B = new ArrayList();
                                z2 = true;
                            }
                            this.B.add(fVar.h(u.K, hVar));
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.B = Collections.unmodifiableList(this.B);
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
            this.B = Collections.unmodifiableList(this.B);
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
        int iP = 0;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            iP += q1.p(1, (o20.b) this.B.get(i2));
        }
        int size = this.A.size() + iP;
        this.D = size;
        return size;
    }

    @Override
    public final o20.j b() {
        o oVar = new o(0);
        oVar.D = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override
    public final o20.j c() {
        o oVar = new o(0);
        oVar.D = Collections.EMPTY_LIST;
        oVar.h(this);
        return oVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        for (int i = 0; i < this.B.size(); i++) {
            q1Var.g0(1, (o20.b) this.B.get(i));
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.B.size(); i++) {
            if (!((u) this.B.get(i)).isInitialized()) {
                this.C = (byte) 0;
                return false;
            }
        }
        this.C = (byte) 1;
        return true;
    }
}
