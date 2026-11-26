package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class m extends o20.k {
    public int D;
    public int E;
    public List F;
    public List G;
    public List H;
    public List I;

    public static m f() {
        m mVar = new m();
        mVar.E = 6;
        List list = Collections.EMPTY_LIST;
        mVar.F = list;
        mVar.G = list;
        mVar.H = list;
        mVar.I = list;
        return mVar;
    }

    @Override
    public final o20.b a() {
        n nVarE = e();
        if (nVarE.isInitialized()) {
            return nVarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        n nVar = null;
        try {
            try {
                n.L.getClass();
                g(new n(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                n nVar2 = (n) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    nVar = nVar2;
                    if (nVar != null) {
                        g(nVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (nVar != null) {
                g(nVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((n) oVar);
        return this;
    }

    public final Object clone() {
        m mVarF = f();
        mVarF.g(e());
        return mVarF;
    }

    public final n e() {
        n nVar = new n(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        nVar.D = this.E;
        if ((i & 2) == 2) {
            this.F = Collections.unmodifiableList(this.F);
            this.D &= -3;
        }
        nVar.E = this.F;
        if ((this.D & 4) == 4) {
            this.G = Collections.unmodifiableList(this.G);
            this.D &= -5;
        }
        nVar.F = this.G;
        if ((this.D & 8) == 8) {
            this.H = Collections.unmodifiableList(this.H);
            this.D &= -9;
        }
        nVar.G = this.H;
        if ((this.D & 16) == 16) {
            this.I = Collections.unmodifiableList(this.I);
            this.D &= -17;
        }
        nVar.H = this.I;
        nVar.C = i2;
        return nVar;
    }

    public final void g(n nVar) {
        if (nVar == n.K) {
            return;
        }
        if ((nVar.C & 1) == 1) {
            int i = nVar.D;
            this.D = 1 | this.D;
            this.E = i;
        }
        if (!nVar.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = nVar.E;
                this.D &= -3;
            } else {
                if ((this.D & 2) != 2) {
                    this.F = new ArrayList(this.F);
                    this.D |= 2;
                }
                this.F.addAll(nVar.E);
            }
        }
        if (!nVar.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = nVar.F;
                this.D &= -5;
            } else {
                if ((this.D & 4) != 4) {
                    this.G = new ArrayList(this.G);
                    this.D |= 4;
                }
                this.G.addAll(nVar.F);
            }
        }
        if (!nVar.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = nVar.G;
                this.D &= -9;
            } else {
                if ((this.D & 8) != 8) {
                    this.H = new ArrayList(this.H);
                    this.D |= 8;
                }
                this.H.addAll(nVar.G);
            }
        }
        if (!nVar.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = nVar.H;
                this.D &= -17;
            } else {
                if ((this.D & 16) != 16) {
                    this.I = new ArrayList(this.I);
                    this.D |= 16;
                }
                this.I.addAll(nVar.H);
            }
        }
        d(nVar);
        this.A = this.A.b(nVar.B);
    }
}
