package no;

import a40.z;
import g00.b0;

public final class m extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final n C;

    public m(n nVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = nVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m(this.C, cVar, 0);
            case 1:
                return new m(this.C, cVar, 1);
            case 2:
                return new m(this.C, cVar, 2);
            case 3:
                return new m(this.C, cVar, 3);
            case 4:
                return new m(this.C, cVar, 4);
            case 5:
                return new m(this.C, cVar, 5);
            default:
                return new m(this.C, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((m) create(zVar, cVar)).invokeSuspend(b0.a);
            case 1:
                return ((m) create(zVar, cVar)).invokeSuspend(b0.a);
            case 2:
                ((m) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
            case 3:
                ((m) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
            case 4:
                return ((m) create(zVar, cVar)).invokeSuspend(b0.a);
            case 5:
                ((m) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
            default:
                ((m) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: no.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
