package uu;

import a40.z;
import g00.b0;

public final class h extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final w C;

    public h(w wVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = wVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new h(this.C, cVar, 0);
            case 1:
                return new h(this.C, cVar, 1);
            case 2:
                return new h(this.C, cVar, 2);
            case 3:
                return new h(this.C, cVar, 3);
            case 4:
                return new h(this.C, cVar, 4);
            case 5:
                return new h(this.C, cVar, 5);
            case 6:
                return new h(this.C, cVar, 6);
            case 7:
                return new h(this.C, cVar, 7);
            case 8:
                return new h(this.C, cVar, 8);
            default:
                return new h(this.C, cVar, 9);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.A) {
            case 0:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 2:
                ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
                return l00.a.A;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((h) create(bool, (k00.c) obj2)).invokeSuspend(b0.a);
            case 4:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 5:
                ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
                return l00.a.A;
            case 6:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 7:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 8:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: uu.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
