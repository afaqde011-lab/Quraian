package l20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;
import o20.u;

public final class f extends o20.j implements u {
    public int B;
    public int C;
    public int D;
    public Object E;
    public g F;
    public List G;
    public List H;

    public static f e() {
        f fVar = new f();
        fVar.C = 1;
        fVar.E = "";
        fVar.F = g.NONE;
        List list = Collections.EMPTY_LIST;
        fVar.G = list;
        fVar.H = list;
        return fVar;
    }

    @Override
    public final o20.b a() {
        h hVarD = d();
        hVarD.isInitialized();
        return hVarD;
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        h hVar2 = null;
        try {
            try {
                h.N.getClass();
                f(new h(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                h hVar3 = (h) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    hVar2 = hVar3;
                    if (hVar2 != null) {
                        f(hVar2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (hVar2 != null) {
                f(hVar2);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o oVar) {
        f((h) oVar);
        return this;
    }

    public final Object clone() {
        f fVarE = e();
        fVarE.f(d());
        return fVarE;
    }

    public final h d() {
        h hVar = new h(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        hVar.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        hVar.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        hVar.E = this.E;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        hVar.F = this.F;
        if ((i & 16) == 16) {
            this.G = Collections.unmodifiableList(this.G);
            this.B &= -17;
        }
        hVar.G = this.G;
        if ((this.B & 32) == 32) {
            this.H = Collections.unmodifiableList(this.H);
            this.B &= -33;
        }
        hVar.I = this.H;
        hVar.B = i2;
        return hVar;
    }

    public final void f(h hVar) {
        if (hVar == h.M) {
            return;
        }
        int i = hVar.B;
        if ((i & 1) == 1) {
            int i2 = hVar.C;
            this.B = 1 | this.B;
            this.C = i2;
        }
        if ((i & 2) == 2) {
            int i3 = hVar.D;
            this.B = 2 | this.B;
            this.D = i3;
        }
        if ((i & 4) == 4) {
            this.B |= 4;
            this.E = hVar.E;
        }
        if ((i & 8) == 8) {
            g gVar = hVar.F;
            gVar.getClass();
            this.B = 8 | this.B;
            this.F = gVar;
        }
        if (!hVar.G.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = hVar.G;
                this.B &= -17;
            } else {
                if ((this.B & 16) != 16) {
                    this.G = new ArrayList(this.G);
                    this.B |= 16;
                }
                this.G.addAll(hVar.G);
            }
        }
        if (!hVar.I.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = hVar.I;
                this.B &= -33;
            } else {
                if ((this.B & 32) != 32) {
                    this.H = new ArrayList(this.H);
                    this.B |= 32;
                }
                this.H.addAll(hVar.I);
            }
        }
        this.A = this.A.b(hVar.A);
    }
}
