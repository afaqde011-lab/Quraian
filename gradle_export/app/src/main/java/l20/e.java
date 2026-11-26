package l20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;
import o20.u;

public final class e extends o20.j implements u {
    public int B;
    public List C;
    public List D;

    @Override
    public final o20.b a() {
        i iVarD = d();
        iVarD.isInitialized();
        return iVarD;
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        i iVar = null;
        try {
            try {
                i.H.getClass();
                e(new i(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                i iVar2 = (i) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        e(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
                e(iVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o oVar) {
        e((i) oVar);
        return this;
    }

    public final Object clone() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.C = list;
        eVar.D = list;
        eVar.e(d());
        return eVar;
    }

    public final i d() {
        i iVar = new i(this);
        if ((this.B & 1) == 1) {
            this.C = Collections.unmodifiableList(this.C);
            this.B &= -2;
        }
        iVar.B = this.C;
        if ((this.B & 2) == 2) {
            this.D = Collections.unmodifiableList(this.D);
            this.B &= -3;
        }
        iVar.C = this.D;
        return iVar;
    }

    public final void e(i iVar) {
        if (iVar == i.G) {
            return;
        }
        if (!iVar.B.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = iVar.B;
                this.B &= -2;
            } else {
                if ((this.B & 1) != 1) {
                    this.C = new ArrayList(this.C);
                    this.B |= 1;
                }
                this.C.addAll(iVar.B);
            }
        }
        if (!iVar.C.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = iVar.C;
                this.B &= -3;
            } else {
                if ((this.B & 2) != 2) {
                    this.D = new ArrayList(this.D);
                    this.B |= 2;
                }
                this.D.addAll(iVar.C);
            }
        }
        this.A = this.A.b(iVar.A);
    }
}
