package u2;

import a40.z;
import b3.j0;
import kotlin.jvm.internal.n;
import ri.t1;
import y3.q;

public final class d {

    public i f14921a;

    public i f14922b;

    public n f14923c = new j0(this, 25);

    public z f14924d;

    public final java.lang.Object a(long r8, long r10, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.a(long, long, m00.c):java.lang.Object");
    }

    public final Object b(long j9, m00.c cVar) {
        c cVar2;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.C = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objD = cVar2.A;
        l00.a aVar = l00.a.A;
        int i11 = cVar2.C;
        if (i11 == 0) {
            t1.O(objD);
            i iVar = this.f14921a;
            i iVarC1 = iVar != null ? iVar.C1() : null;
            if (iVarC1 != null) {
                cVar2.C = 1;
                objD = iVarC1.D(j9, cVar2);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                j10 = 0;
            }
            return new q(j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(objD);
        j10 = ((q) objD).f16602a;
        return new q(j10);
    }

    public final z c() {
        z zVar = (z) this.f14923c.invoke();
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
