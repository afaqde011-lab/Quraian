package l20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;

public final class i extends o {
    public static final i G;
    public static final i20.a H = new i20.a(28);
    public final o20.e A;
    public List B;
    public List C;
    public int D;
    public byte E;
    public int F;

    static {
        i iVar = new i();
        G = iVar;
        List list = Collections.EMPTY_LIST;
        iVar.B = list;
        iVar.C = list;
    }

    public i() {
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.A = o20.e.A;
    }

    public i(e eVar) {
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.A = eVar.A;
    }

    public i(o20.f fVar, o20.h hVar) {
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        List list = Collections.EMPTY_LIST;
        this.B = list;
        this.C = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iO = fVar.o();
                        if (iO != 0) {
                            if (iO == 10) {
                                if ((i & 1) != 1) {
                                    this.B = new ArrayList();
                                    i |= 1;
                                }
                                this.B.add(fVar.h(h.N, hVar));
                            } else if (iO == 40) {
                                if ((i & 2) != 2) {
                                    this.C = new ArrayList();
                                    i |= 2;
                                }
                                this.C.add(Integer.valueOf(fVar.l()));
                            } else if (iO == 42) {
                                int iE = fVar.e(fVar.l());
                                if ((i & 2) != 2 && fVar.c() > 0) {
                                    this.C = new ArrayList();
                                    i |= 2;
                                }
                                while (fVar.c() > 0) {
                                    this.C.add(Integer.valueOf(fVar.l()));
                                }
                                fVar.d(iE);
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
                if ((i & 1) == 1) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i & 2) == 2) {
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
        if ((i & 1) == 1) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if ((i & 2) == 2) {
            this.C = Collections.unmodifiableList(this.C);
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
        int iP = 0;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            iP += q1.p(1, (o20.b) this.B.get(i2));
        }
        int iO = 0;
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            iO += q1.o(((Integer) this.C.get(i3)).intValue());
        }
        int iO2 = iP + iO;
        if (!this.C.isEmpty()) {
            iO2 = iO2 + 1 + q1.o(iO);
        }
        this.D = iO;
        int size = this.A.size() + iO2;
        this.F = size;
        return size;
    }

    @Override
    public final o20.j b() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.C = list;
        eVar.D = list;
        return eVar;
    }

    @Override
    public final o20.j c() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.C = list;
        eVar.D = list;
        eVar.e(this);
        return eVar;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        for (int i = 0; i < this.B.size(); i++) {
            q1Var.g0(1, (o20.b) this.B.get(i));
        }
        if (this.C.size() > 0) {
            q1Var.n0(42);
            q1Var.n0(this.D);
        }
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            q1Var.f0(((Integer) this.C.get(i2)).intValue());
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
