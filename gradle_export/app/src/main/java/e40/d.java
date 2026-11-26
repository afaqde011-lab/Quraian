package e40;

import a1.e2;
import a40.a0;
import a40.c0;
import a40.z;
import c40.v;
import d0.i2;
import g00.b0;
import java.util.ArrayList;
import ri.t1;

public abstract class d implements m {
    public final k00.i A;
    public final int B;
    public final c40.a C;

    public d(k00.i iVar, int i, c40.a aVar) {
        this.A = iVar;
        this.B = i;
        this.C = aVar;
    }

    @Override
    public final d40.i b(k00.i iVar, int i, c40.a aVar) {
        k00.i iVar2 = this.A;
        k00.i iVarPlus = iVar.plus(iVar2);
        c40.a aVar2 = c40.a.A;
        c40.a aVar3 = this.C;
        int i2 = this.B;
        if (aVar == aVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.m.a(iVarPlus, iVar2) && i == i2 && aVar == aVar3) ? this : e(iVarPlus, i, aVar);
    }

    public String c() {
        return null;
    }

    @Override
    public Object collect(d40.j jVar, k00.c cVar) {
        Object objK = c0.k(new e2(jVar, this, (k00.c) null, 26), cVar);
        return objK == l00.a.A ? objK : b0.a;
    }

    public abstract Object d(c40.t tVar, k00.c cVar);

    public abstract d e(k00.i iVar, int i, c40.a aVar);

    public d40.i g() {
        return null;
    }

    public v h(z zVar) {
        int i = this.B;
        if (i == -3) {
            i = -2;
        }
        a0 a0Var = a0.C;
        u00.n i2Var = new i2(this, (k00.c) null, 14);
        c40.s sVar = new c40.s(c0.z(zVar, this.A), t1.b(i, 4, this.C));
        sVar.j0(a0Var, sVar, i2Var);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        k00.j jVar = k00.j.A;
        k00.i iVar = this.A;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i = this.B;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        c40.a aVar = c40.a.A;
        c40.a aVar2 = this.C;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return g4.c.k(sb, h00.q.R0(arrayList, ", ", null, null, null, 62), ']');
    }
}
