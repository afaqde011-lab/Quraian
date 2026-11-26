package l20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;
import o20.t;

public final class h extends o {
    public static final h M;
    public static final i20.a N = new i20.a(29);
    public final o20.e A;
    public int B;
    public int C;
    public int D;
    public Object E;
    public g F;
    public List G;
    public int H;
    public List I;
    public int J;
    public byte K;
    public int L;

    static {
        h hVar = new h();
        M = hVar;
        hVar.C = 1;
        hVar.D = 0;
        hVar.E = "";
        hVar.F = g.NONE;
        List list = Collections.EMPTY_LIST;
        hVar.G = list;
        hVar.I = list;
    }

    public h() {
        this.H = -1;
        this.J = -1;
        this.K = (byte) -1;
        this.L = -1;
        this.A = o20.e.A;
    }

    public h(f fVar) {
        this.H = -1;
        this.J = -1;
        this.K = (byte) -1;
        this.L = -1;
        this.A = fVar.A;
    }

    public h(o20.f fVar) {
        this.H = -1;
        this.J = -1;
        this.K = (byte) -1;
        this.L = -1;
        this.C = 1;
        boolean z = false;
        this.D = 0;
        this.E = "";
        g gVar = g.NONE;
        this.F = gVar;
        List list = Collections.EMPTY_LIST;
        this.G = list;
        this.I = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        int i = 0;
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
                        } else if (iO == 24) {
                            int iL = fVar.l();
                            g gVar2 = iL != 0 ? iL != 1 ? iL != 2 ? null : g.DESC_TO_CLASS_ID : g.INTERNAL_TO_CLASS_ID : gVar;
                            if (gVar2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.B |= 8;
                                this.F = gVar2;
                            }
                        } else if (iO == 32) {
                            if ((i & 16) != 16) {
                                this.G = new ArrayList();
                                i |= 16;
                            }
                            this.G.add(Integer.valueOf(fVar.l()));
                        } else if (iO == 34) {
                            int iE = fVar.e(fVar.l());
                            if ((i & 16) != 16 && fVar.c() > 0) {
                                this.G = new ArrayList();
                                i |= 16;
                            }
                            while (fVar.c() > 0) {
                                this.G.add(Integer.valueOf(fVar.l()));
                            }
                            fVar.d(iE);
                        } else if (iO == 40) {
                            if ((i & 32) != 32) {
                                this.I = new ArrayList();
                                i |= 32;
                            }
                            this.I.add(Integer.valueOf(fVar.l()));
                        } else if (iO == 42) {
                            int iE2 = fVar.e(fVar.l());
                            if ((i & 32) != 32 && fVar.c() > 0) {
                                this.I = new ArrayList();
                                i |= 32;
                            }
                            while (fVar.c() > 0) {
                                this.I.add(Integer.valueOf(fVar.l()));
                            }
                            fVar.d(iE2);
                        } else if (iO == 50) {
                            t tVarF = fVar.f();
                            this.B |= 4;
                            this.E = tVarF;
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    if ((i & 32) == 32) {
                        this.I = Collections.unmodifiableList(this.I);
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
        if ((i & 16) == 16) {
            this.G = Collections.unmodifiableList(this.G);
        }
        if ((i & 32) == 32) {
            this.I = Collections.unmodifiableList(this.I);
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
        o20.e tVar;
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int iN = (this.B & 1) == 1 ? q1.n(1, this.C) : 0;
        if ((this.B & 2) == 2) {
            iN += q1.n(2, this.D);
        }
        if ((this.B & 8) == 8) {
            iN += q1.m(3, this.F.A);
        }
        int iO = 0;
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            iO += q1.o(((Integer) this.G.get(i2)).intValue());
        }
        int iO2 = iN + iO;
        if (!this.G.isEmpty()) {
            iO2 = iO2 + 1 + q1.o(iO);
        }
        this.H = iO;
        int iO3 = 0;
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iO3 += q1.o(((Integer) this.I.get(i3)).intValue());
        }
        int size = iO2 + iO3;
        if (!this.I.isEmpty()) {
            size = size + 1 + q1.o(iO3);
        }
        this.J = iO3;
        if ((this.B & 4) == 4) {
            Object obj = this.E;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.E = tVar;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                tVar = (o20.e) obj;
            }
            size += tVar.size() + q1.r(tVar.size()) + q1.t(6);
        }
        int size2 = this.A.size() + size;
        this.L = size2;
        return size2;
    }

    @Override
    public final o20.j b() {
        return f.e();
    }

    @Override
    public final o20.j c() {
        f fVarE = f.e();
        fVarE.f(this);
        return fVarE;
    }

    @Override
    public final void d(q1 q1Var) {
        o20.e tVar;
        a();
        if ((this.B & 1) == 1) {
            q1Var.e0(1, this.C);
        }
        if ((this.B & 2) == 2) {
            q1Var.e0(2, this.D);
        }
        if ((this.B & 8) == 8) {
            q1Var.d0(3, this.F.A);
        }
        if (this.G.size() > 0) {
            q1Var.n0(34);
            q1Var.n0(this.H);
        }
        for (int i = 0; i < this.G.size(); i++) {
            q1Var.f0(((Integer) this.G.get(i)).intValue());
        }
        if (this.I.size() > 0) {
            q1Var.n0(42);
            q1Var.n0(this.J);
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            q1Var.f0(((Integer) this.I.get(i2)).intValue());
        }
        if ((this.B & 4) == 4) {
            Object obj = this.E;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.E = tVar;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                tVar = (o20.e) obj;
            }
            q1Var.p0(6, 2);
            q1Var.n0(tVar.size());
            q1Var.j0(tVar);
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        if (this.K == 1) {
            return true;
        }
        this.K = (byte) 1;
        return true;
    }
}
