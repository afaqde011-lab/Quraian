package h6;

import b6.l;
import j6.m;
import j6.s;
import u00.n;

public final class a implements n {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public final int A;

    public a(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l lVar = (l) obj2;
                return lVar instanceof s ? lVar : obj;
            default:
                l lVar2 = (l) obj2;
                return lVar2 instanceof m ? lVar2 : obj;
        }
    }
}
