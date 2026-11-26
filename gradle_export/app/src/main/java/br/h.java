package br;

import a40.z;
import d0.s0;
import fy.c0;
import g00.b0;
import u00.n;

public final class h extends m00.i implements n {
    public final int A = 3;
    public int B;
    public long C;
    public Object D;
    public final Object E;

    public h(long j, c0 c0Var, String str, k00.c cVar) {
        super(2, cVar);
        this.C = j;
        this.D = c0Var;
        this.E = str;
    }

    public h(i iVar, String str, long j, k00.c cVar) {
        super(2, cVar);
        this.D = iVar;
        this.E = str;
        this.C = j;
    }

    public h(s0 s0Var, long j, k00.c cVar) {
        super(2, cVar);
        this.E = s0Var;
        this.C = j;
    }

    public h(Long l, n nVar, k00.c cVar) {
        super(2, cVar);
        this.D = l;
        this.E = nVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new h((i) this.D, (String) this.E, this.C, cVar);
            case 1:
                h hVar = new h((s0) this.E, this.C, cVar);
                hVar.D = obj;
                return hVar;
            case 2:
                h hVar2 = new h((Long) this.D, (n) this.E, cVar);
                hVar2.C = ((Number) obj).longValue();
                return hVar2;
            default:
                return new h(this.C, (c0) this.D, (String) this.E, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 2:
                return ((h) create(Long.valueOf(((Number) obj).longValue()), (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: br.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
