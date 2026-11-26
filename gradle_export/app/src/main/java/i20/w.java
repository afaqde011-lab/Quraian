package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class w extends o20.l {
    public static final w H;
    public static final a I = new a(8);
    public final o20.e B;
    public int C;
    public int D;
    public List E;
    public byte F;
    public int G;

    static {
        w wVar = new w();
        H = wVar;
        wVar.D = 0;
        wVar.E = Collections.EMPTY_LIST;
    }

    public w() {
        this.F = (byte) -1;
        this.G = -1;
        this.B = o20.e.A;
    }

    public w(v vVar) {
        super(vVar);
        this.F = (byte) -1;
        this.G = -1;
        this.B = vVar.A;
    }

    public w(o20.f fVar, o20.h hVar) {
        this.F = (byte) -1;
        this.G = -1;
        boolean z = false;
        this.D = 0;
        this.E = Collections.EMPTY_LIST;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.C |= 1;
                            this.D = fVar.l();
                        } else if (iO == 18) {
                            if ((c & 2) != 2) {
                                this.E = new ArrayList();
                                c = 2;
                            }
                            this.E.add(fVar.h(h.H, hVar));
                        } else if (!l(fVar, q1VarJ, hVar, iO)) {
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
                    this.E = Collections.unmodifiableList(this.E);
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
        if ((c & 2) == 2) {
            this.E = Collections.unmodifiableList(this.E);
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
        int i = this.G;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 1) == 1 ? q1.n(1, this.D) : 0;
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            iN += q1.p(2, (o20.b) this.E.get(i2));
        }
        int size = this.B.size() + h() + iN;
        this.G = size;
        return size;
    }

    @Override
    public final o20.j b() {
        v vVar = new v();
        vVar.F = Collections.EMPTY_LIST;
        return vVar;
    }

    @Override
    public final o20.j c() {
        v vVar = new v();
        vVar.F = Collections.EMPTY_LIST;
        vVar.f(this);
        return vVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 1) == 1) {
            q1Var.e0(1, this.D);
        }
        for (int i = 0; i < this.E.size(); i++) {
            q1Var.g0(2, (o20.b) this.E.get(i));
        }
        bVar.C(200, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return H;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.E.size(); i++) {
            if (!((h) this.E.get(i)).isInitialized()) {
                this.F = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.F = (byte) 1;
            return true;
        }
        this.F = (byte) 0;
        return false;
    }
}
