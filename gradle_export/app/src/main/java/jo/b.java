package jo;

import ri.t1;

public final class b {
    public final vn.f a;

    public b(vn.f fVar) {
        this.a = fVar;
    }

    public final Object a(ho.g gVar, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.C = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return ((g00.n) obj).A;
        }
        t1.O(obj);
        String str = gVar.h;
        if (str == null) {
            return t1.s(new IllegalStateException(g4.c.i("Episode ", gVar.a, " has no transcript")));
        }
        int i3 = gVar.m;
        aVar.C = 1;
        Object objD = this.a.d(str, i3, aVar);
        return objD == aVar2 ? aVar2 : objD;
    }
}
