package gc;

import android.content.Context;
import d0.q0;
import g00.b0;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import l1.y0;
import l1.z0;
import lu.z;
import os.x;
import ut.p;

public final class n extends m00.i implements u00.n {
    public final int A;
    public int B;
    public int C;
    public final Object D;
    public Object E;
    public Object F;
    public Object G;
    public final Object H;

    public n(q0 q0Var, Context context, k kVar, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.F = q0Var;
        this.G = context;
        this.H = kVar;
        this.D = z0Var;
    }

    public n(Object obj, Serializable serializable, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.H = obj;
        this.D = serializable;
    }

    public n(List list, ns.k kVar, ns.j jVar, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.G = list;
        this.H = kVar;
        this.D = jVar;
    }

    public n(m0.b bVar, z zVar, z0 z0Var, z0 z0Var2, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.E = bVar;
        this.F = zVar;
        this.D = z0Var;
        this.G = z0Var2;
        this.H = y0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new n((q0) this.F, (Context) this.G, (k) this.H, (z0) this.D, cVar);
            case 1:
                return new n((m0.b) this.E, (z) this.F, (z0) this.D, (z0) this.G, (y0) this.H, cVar);
            case 2:
                return new n((List) this.G, (ns.k) this.H, (ns.j) this.D, cVar);
            case 3:
                return new n((x) this.H, (Instant) this.D, cVar, 3);
            default:
                return new n((p) this.H, (ArrayList) this.D, cVar, 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        throw new UnsupportedOperationException("Method not decompiled: gc.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
