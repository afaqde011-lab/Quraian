package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class v extends o20.k {
    public int D;
    public int E;
    public List F;

    @Override
    public final o20.b a() {
        w wVarE = e();
        if (wVarE.isInitialized()) {
            return wVarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        w wVar = null;
        try {
            try {
                w.I.getClass();
                f(new w(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                w wVar2 = (w) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        f(wVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (wVar != null) {
                f(wVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((w) oVar);
        return this;
    }

    public final Object clone() {
        v vVar = new v();
        vVar.F = Collections.EMPTY_LIST;
        vVar.f(e());
        return vVar;
    }

    public final w e() {
        w wVar = new w(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wVar.D = this.E;
        if ((i & 2) == 2) {
            this.F = Collections.unmodifiableList(this.F);
            this.D &= -3;
        }
        wVar.E = this.F;
        wVar.C = i2;
        return wVar;
    }

    public final void f(w wVar) {
        if (wVar == w.H) {
            return;
        }
        if ((wVar.C & 1) == 1) {
            int i = wVar.D;
            this.D = 1 | this.D;
            this.E = i;
        }
        if (!wVar.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = wVar.E;
                this.D &= -3;
            } else {
                if ((this.D & 2) != 2) {
                    this.F = new ArrayList(this.F);
                    this.D |= 2;
                }
                this.F.addAll(wVar.E);
            }
        }
        d(wVar);
        this.A = this.A.b(wVar.B);
    }
}
