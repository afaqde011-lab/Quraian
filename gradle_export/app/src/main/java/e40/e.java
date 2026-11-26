package e40;

import a40.c0;
import d0.i2;
import g00.b0;

public abstract class e extends d {
    public final d40.i D;

    public e(int i, c40.a aVar, d40.i iVar, k00.i iVar2) {
        super(iVar2, i, aVar);
        this.D = iVar;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) {
        Object objCollect;
        if (this.B == -3) {
            k00.i context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            a40.t tVar = new a40.t(0, (byte) 0);
            k00.i iVar = this.A;
            k00.i iVarPlus = !((Boolean) iVar.fold(bool, tVar)).booleanValue() ? context.plus(iVar) : c0.n(context, iVar, false);
            if (kotlin.jvm.internal.m.a(iVarPlus, context)) {
                Object objI = i(jVar, cVar);
                if (objI == l00.a.A) {
                    return objI;
                }
            } else {
                k00.d dVar = k00.d.A;
                if (kotlin.jvm.internal.m.a(iVarPlus.get(dVar), context.get(dVar))) {
                    k00.i context2 = cVar.getContext();
                    if (!(jVar instanceof s) && !(jVar instanceof o)) {
                        jVar = new d40.g(jVar, context2);
                    }
                    Object objC = b.c(iVarPlus, jVar, f40.a.m(iVarPlus), new i2(this, (k00.c) null, 15), cVar);
                    if (objC == l00.a.A) {
                        return objC;
                    }
                } else {
                    objCollect = super.collect(jVar, cVar);
                    if (objCollect == l00.a.A) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(jVar, cVar);
            if (objCollect == l00.a.A) {
                return objCollect;
            }
        }
        return b0.a;
    }

    @Override
    public final Object d(c40.t tVar, k00.c cVar) {
        Object objI = i(new s(tVar), cVar);
        return objI == l00.a.A ? objI : b0.a;
    }

    public abstract Object i(d40.j jVar, k00.c cVar);

    @Override
    public final String toString() {
        return this.D + " -> " + super.toString();
    }
}
