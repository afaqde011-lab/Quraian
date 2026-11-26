package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class c extends o20.j implements o20.u {
    public int B;
    public d C;
    public long D;
    public float E;
    public double F;
    public int G;
    public int H;
    public int I;
    public h J;
    public List K;
    public int L;
    public int M;

    public static c e() {
        c cVar = new c();
        cVar.C = d.BYTE;
        cVar.J = h.G;
        cVar.K = Collections.EMPTY_LIST;
        return cVar;
    }

    @Override
    public final o20.b a() {
        e eVarD = d();
        if (eVarD.isInitialized()) {
            return eVarD;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        e eVar = null;
        try {
            try {
                e.Q.getClass();
                f(new e(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                e eVar2 = (e) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar2;
                    if (eVar != null) {
                        f(eVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (eVar != null) {
                f(eVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((e) oVar);
        return this;
    }

    public final Object clone() {
        c cVarE = e();
        cVarE.f(d());
        return cVarE;
    }

    public final e d() {
        e eVar = new e(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        eVar.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        eVar.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        eVar.E = this.E;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        eVar.F = this.F;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        eVar.G = this.G;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        eVar.H = this.H;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        eVar.I = this.I;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        eVar.J = this.J;
        if ((i & 256) == 256) {
            this.K = Collections.unmodifiableList(this.K);
            this.B &= -257;
        }
        eVar.K = this.K;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        eVar.L = this.L;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        eVar.M = this.M;
        eVar.B = i2;
        return eVar;
    }

    public final void f(e eVar) {
        h hVar;
        if (eVar == e.P) {
            return;
        }
        if ((eVar.B & 1) == 1) {
            d dVar = eVar.C;
            dVar.getClass();
            this.B = 1 | this.B;
            this.C = dVar;
        }
        int i = eVar.B;
        if ((i & 2) == 2) {
            long j = eVar.D;
            this.B |= 2;
            this.D = j;
        }
        if ((i & 4) == 4) {
            float f = eVar.E;
            this.B = 4 | this.B;
            this.E = f;
        }
        if ((i & 8) == 8) {
            double d = eVar.F;
            this.B |= 8;
            this.F = d;
        }
        if ((i & 16) == 16) {
            int i2 = eVar.G;
            this.B = 16 | this.B;
            this.G = i2;
        }
        if ((i & 32) == 32) {
            int i3 = eVar.H;
            this.B = 32 | this.B;
            this.H = i3;
        }
        if ((i & 64) == 64) {
            int i4 = eVar.I;
            this.B = 64 | this.B;
            this.I = i4;
        }
        if ((i & 128) == 128) {
            h hVar2 = eVar.J;
            if ((this.B & 128) != 128 || (hVar = this.J) == h.G) {
                this.J = hVar2;
            } else {
                g gVar = new g(0);
                gVar.D = Collections.EMPTY_LIST;
                gVar.g(hVar);
                gVar.g(hVar2);
                this.J = gVar.d();
            }
            this.B |= 128;
        }
        if (!eVar.K.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = eVar.K;
                this.B &= -257;
            } else {
                if ((this.B & 256) != 256) {
                    this.K = new ArrayList(this.K);
                    this.B |= 256;
                }
                this.K.addAll(eVar.K);
            }
        }
        int i5 = eVar.B;
        if ((i5 & 256) == 256) {
            int i6 = eVar.L;
            this.B |= 512;
            this.L = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = eVar.M;
            this.B |= 1024;
            this.M = i7;
        }
        this.A = this.A.b(eVar.A);
    }
}
