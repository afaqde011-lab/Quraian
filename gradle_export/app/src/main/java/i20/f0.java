package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class f0 extends o20.l {
    public static final f0 K;
    public static final a L = new a(11);
    public final o20.e B;
    public int C;
    public List D;
    public List E;
    public List F;
    public a1 G;
    public h1 H;
    public byte I;
    public int J;

    static {
        f0 f0Var = new f0();
        K = f0Var;
        List list = Collections.EMPTY_LIST;
        f0Var.D = list;
        f0Var.E = list;
        f0Var.F = list;
        f0Var.G = a1.G;
        f0Var.H = h1.E;
    }

    public f0() {
        this.I = (byte) -1;
        this.J = -1;
        this.B = o20.e.A;
    }

    public f0(e0 e0Var) {
        super(e0Var);
        this.I = (byte) -1;
        this.J = -1;
        this.B = e0Var.A;
    }

    public f0(o20.f fVar, o20.h hVar) {
        this.I = (byte) -1;
        this.J = -1;
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = list;
        this.F = list;
        this.G = a1.G;
        this.H = h1.E;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.D = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.D.add(fVar.h(b0.Z, hVar));
                        } else if (iO == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.E = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.E.add(fVar.h(j0.f0, hVar));
                        } else if (iO != 42) {
                            o oVar = null;
                            g gVarG = null;
                            if (iO == 242) {
                                if ((this.C & 1) == 1) {
                                    a1 a1Var = this.G;
                                    a1Var.getClass();
                                    gVarG = a1.g(a1Var);
                                }
                                a1 a1Var2 = (a1) fVar.h(a1.H, hVar);
                                this.G = a1Var2;
                                if (gVarG != null) {
                                    gVarG.h(a1Var2);
                                    this.G = gVarG.e();
                                }
                                this.C |= 1;
                            } else if (iO == 258) {
                                if ((this.C & 2) == 2) {
                                    h1 h1Var = this.H;
                                    h1Var.getClass();
                                    oVar = new o(2);
                                    oVar.D = Collections.EMPTY_LIST;
                                    oVar.m(h1Var);
                                }
                                h1 h1Var2 = (h1) fVar.h(h1.F, hVar);
                                this.H = h1Var2;
                                if (oVar != null) {
                                    oVar.m(h1Var2);
                                    this.H = oVar.g();
                                }
                                this.C |= 2;
                            } else if (!l(fVar, q1VarJ, hVar, iO)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.F = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.F.add(fVar.h(w0.Q, hVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
                        this.F = Collections.unmodifiableList(this.F);
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
            } catch (InvalidProtocolBufferException e) {
                e.A = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.A = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.F = Collections.unmodifiableList(this.F);
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
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int iP = 0;
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            iP += q1.p(3, (o20.b) this.D.get(i2));
        }
        for (int i3 = 0; i3 < this.E.size(); i3++) {
            iP += q1.p(4, (o20.b) this.E.get(i3));
        }
        for (int i4 = 0; i4 < this.F.size(); i4++) {
            iP += q1.p(5, (o20.b) this.F.get(i4));
        }
        if ((this.C & 1) == 1) {
            iP += q1.p(30, this.G);
        }
        if ((this.C & 2) == 2) {
            iP += q1.p(32, this.H);
        }
        int size = this.B.size() + h() + iP;
        this.J = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return e0.f();
    }

    @Override
    public final o20.j c() {
        e0 e0VarF = e0.f();
        e0VarF.g(this);
        return e0VarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        for (int i = 0; i < this.D.size(); i++) {
            q1Var.g0(3, (o20.b) this.D.get(i));
        }
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            q1Var.g0(4, (o20.b) this.E.get(i2));
        }
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            q1Var.g0(5, (o20.b) this.F.get(i3));
        }
        if ((this.C & 1) == 1) {
            q1Var.g0(30, this.G);
        }
        if ((this.C & 2) == 2) {
            q1Var.g0(32, this.H);
        }
        bVar.C(200, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return K;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.D.size(); i++) {
            if (!((b0) this.D.get(i)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            if (!((j0) this.E.get(i2)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            if (!((w0) this.F.get(i3)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.C & 1) == 1 && !this.G.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        if (g()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }
}
