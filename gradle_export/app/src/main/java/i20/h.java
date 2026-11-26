package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class h extends o20.o {
    public static final h G;
    public static final a H = new a(0);
    public final o20.e A;
    public int B;
    public int C;
    public List D;
    public byte E;
    public int F;

    static {
        h hVar = new h();
        G = hVar;
        hVar.C = 0;
        hVar.D = Collections.EMPTY_LIST;
    }

    public h() {
        this.E = (byte) -1;
        this.F = -1;
        this.A = o20.e.A;
    }

    public h(g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.A = gVar.A;
    }

    public h(o20.f fVar, o20.h hVar) {
        this.E = (byte) -1;
        this.F = -1;
        boolean z = false;
        this.C = 0;
        this.D = Collections.EMPTY_LIST;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.B |= 1;
                            this.C = fVar.l();
                        } else if (iO == 18) {
                            if ((c & 2) != 2) {
                                this.D = new ArrayList();
                                c = 2;
                            }
                            this.D.add(fVar.h(f.H, hVar));
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
                if ((c & 2) == 2) {
                    this.D = Collections.unmodifiableList(this.D);
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
        if ((c & 2) == 2) {
            this.D = Collections.unmodifiableList(this.D);
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
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            iN += q1.p(2, (o20.b) this.D.get(i2));
        }
        int size = this.A.size() + iN;
        this.F = size;
        return size;
    }

    @Override
    public final o20.j b() {
        g gVar = new g(0);
        gVar.D = Collections.EMPTY_LIST;
        return gVar;
    }

    @Override
    public final o20.j c() {
        g gVar = new g(0);
        gVar.D = Collections.EMPTY_LIST;
        gVar.g(this);
        return gVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.e0(1, this.C);
        }
        for (int i = 0; i < this.D.size(); i++) {
            q1Var.g0(2, (o20.b) this.D.get(i));
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
        if ((this.B & 1) != 1) {
            this.E = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.D.size(); i++) {
            if (!((f) this.D.get(i)).isInitialized()) {
                this.E = (byte) 0;
                return false;
            }
        }
        this.E = (byte) 1;
        return true;
    }
}
