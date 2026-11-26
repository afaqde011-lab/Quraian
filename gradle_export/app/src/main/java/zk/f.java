package zk;

import ri.t1;
import v2.i0;
import v2.s;

public abstract class f {
    public static final float a = 100;

    public static final Object a(i0 i0Var, s sVar, m00.a aVar) {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.B = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object objJ = bVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = bVar.B;
        if (i2 == 0) {
            t1.O(objJ);
            float fG = i0Var.f().g();
            long jB = i0Var.f().b();
            c cVar = new c(sVar, fG, null);
            bVar.B = 1;
            objJ = i0Var.j(jB, cVar, bVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        Boolean bool = (Boolean) objJ;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
