package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class x extends o20.j implements o20.u {
    public int B;
    public int C;
    public int D;
    public y E;
    public u0 F;
    public int G;
    public List H;
    public List I;

    public static x e() {
        x xVar = new x();
        xVar.E = y.TRUE;
        xVar.F = u0.U;
        List list = Collections.EMPTY_LIST;
        xVar.H = list;
        xVar.I = list;
        return xVar;
    }

    @Override
    public final o20.b a() {
        z zVarD = d();
        if (zVarD.isInitialized()) {
            return zVarD;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        z zVar = null;
        try {
            try {
                z.M.getClass();
                f(new z(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                z zVar2 = (z) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zVar = zVar2;
                    if (zVar != null) {
                        f(zVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zVar != null) {
                f(zVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((z) oVar);
        return this;
    }

    public final Object clone() {
        x xVarE = e();
        xVarE.f(d());
        return xVarE;
    }

    public final z d() {
        z zVar = new z(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zVar.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zVar.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zVar.E = this.E;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zVar.F = this.F;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zVar.G = this.G;
        if ((i & 32) == 32) {
            this.H = Collections.unmodifiableList(this.H);
            this.B &= -33;
        }
        zVar.H = this.H;
        if ((this.B & 64) == 64) {
            this.I = Collections.unmodifiableList(this.I);
            this.B &= -65;
        }
        zVar.I = this.I;
        zVar.B = i2;
        return zVar;
    }

    public final void f(z zVar) {
        u0 u0Var;
        if (zVar == z.L) {
            return;
        }
        int i = zVar.B;
        if ((i & 1) == 1) {
            int i2 = zVar.C;
            this.B = 1 | this.B;
            this.C = i2;
        }
        if ((i & 2) == 2) {
            int i3 = zVar.D;
            this.B = 2 | this.B;
            this.D = i3;
        }
        if ((i & 4) == 4) {
            y yVar = zVar.E;
            yVar.getClass();
            this.B = 4 | this.B;
            this.E = yVar;
        }
        if ((zVar.B & 8) == 8) {
            u0 u0Var2 = zVar.F;
            if ((this.B & 8) != 8 || (u0Var = this.F) == u0.U) {
                this.F = u0Var2;
            } else {
                t0 t0VarP = u0.p(u0Var);
                t0VarP.g(u0Var2);
                this.F = t0VarP.e();
            }
            this.B |= 8;
        }
        if ((zVar.B & 16) == 16) {
            int i4 = zVar.G;
            this.B = 16 | this.B;
            this.G = i4;
        }
        if (!zVar.H.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = zVar.H;
                this.B &= -33;
            } else {
                if ((this.B & 32) != 32) {
                    this.H = new ArrayList(this.H);
                    this.B |= 32;
                }
                this.H.addAll(zVar.H);
            }
        }
        if (!zVar.I.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = zVar.I;
                this.B &= -65;
            } else {
                if ((this.B & 64) != 64) {
                    this.I = new ArrayList(this.I);
                    this.B |= 64;
                }
                this.I.addAll(zVar.I);
            }
        }
        this.A = this.A.b(zVar.A);
    }
}
