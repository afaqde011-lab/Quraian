package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class n extends o20.l {
    public static final n K;
    public static final a L = new a(5);
    public final o20.e B;
    public int C;
    public int D;
    public List E;
    public List F;
    public List G;
    public List H;
    public byte I;
    public int J;

    static {
        n nVar = new n();
        K = nVar;
        nVar.D = 6;
        List list = Collections.EMPTY_LIST;
        nVar.E = list;
        nVar.F = list;
        nVar.G = list;
        nVar.H = list;
    }

    public n() {
        this.I = (byte) -1;
        this.J = -1;
        this.B = o20.e.A;
    }

    public n(m mVar) {
        super(mVar);
        this.I = (byte) -1;
        this.J = -1;
        this.B = mVar.A;
    }

    public n(o20.f fVar, o20.h hVar) {
        this.I = (byte) -1;
        this.J = -1;
        this.D = 6;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = list;
        this.G = list;
        this.H = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.C |= 1;
                            this.D = fVar.l();
                        } else if (iO == 18) {
                            if ((i & 2) != 2) {
                                this.E = new ArrayList();
                                i |= 2;
                            }
                            this.E.add(fVar.h(c1.O, hVar));
                        } else if (iO == 26) {
                            if ((i & 16) != 16) {
                                this.H = new ArrayList();
                                i |= 16;
                            }
                            this.H.add(fVar.h(h.H, hVar));
                        } else if (iO == 248) {
                            if ((i & 4) != 4) {
                                this.F = new ArrayList();
                                i |= 4;
                            }
                            this.F.add(Integer.valueOf(fVar.l()));
                        } else if (iO == 250) {
                            int iE = fVar.e(fVar.l());
                            if ((i & 4) != 4 && fVar.c() > 0) {
                                this.F = new ArrayList();
                                i |= 4;
                            }
                            while (fVar.c() > 0) {
                                this.F.add(Integer.valueOf(fVar.l()));
                            }
                            fVar.d(iE);
                        } else if (iO == 258) {
                            if ((i & 8) != 8) {
                                this.G = new ArrayList();
                                i |= 8;
                            }
                            this.G.add(fVar.h(l.H, hVar));
                        } else if (!l(fVar, q1VarJ, hVar, iO)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if ((i & 16) == 16) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if ((i & 4) == 4) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    if ((i & 8) == 8) {
                        this.G = Collections.unmodifiableList(this.G);
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
        if ((i & 2) == 2) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if ((i & 16) == 16) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if ((i & 4) == 4) {
            this.F = Collections.unmodifiableList(this.F);
        }
        if ((i & 8) == 8) {
            this.G = Collections.unmodifiableList(this.G);
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
        int iN = (this.C & 1) == 1 ? q1.n(1, this.D) : 0;
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            iN += q1.p(2, (o20.b) this.E.get(i2));
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            iN += q1.p(3, (o20.b) this.H.get(i3));
        }
        int iO = 0;
        for (int i4 = 0; i4 < this.F.size(); i4++) {
            iO += q1.o(((Integer) this.F.get(i4)).intValue());
        }
        int size = (this.F.size() * 2) + iN + iO;
        for (int i5 = 0; i5 < this.G.size(); i5++) {
            size += q1.p(32, (o20.b) this.G.get(i5));
        }
        int size2 = this.B.size() + h() + size;
        this.J = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return m.f();
    }

    @Override
    public final o20.j c() {
        m mVarF = m.f();
        mVarF.g(this);
        return mVarF;
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
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            q1Var.g0(3, (o20.b) this.H.get(i2));
        }
        for (int i3 = 0; i3 < this.F.size(); i3++) {
            q1Var.e0(31, ((Integer) this.F.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.G.size(); i4++) {
            q1Var.g0(32, (o20.b) this.G.get(i4));
        }
        bVar.C(19000, q1Var);
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
        for (int i = 0; i < this.E.size(); i++) {
            if (!((c1) this.E.get(i)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            if (!((l) this.G.get(i2)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            if (!((h) this.H.get(i3)).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }
}
