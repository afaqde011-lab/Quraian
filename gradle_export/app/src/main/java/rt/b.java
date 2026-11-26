package rt;

import g00.b0;
import h00.y;
import ht.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import ot.o;
import ri.t1;

public final class b {
    public final k a;
    public final h b;
    public String d;
    public Integer e;
    public String f;
    public String h;
    public Map c = y.A;
    public boolean g = true;

    public b(k kVar, h hVar) {
        this.a = kVar;
        this.b = hVar;
    }

    public final Object a(String str, m00.c cVar, boolean z) {
        a aVar;
        Object next;
        String str2;
        boolean z2;
        o oVar;
        b bVar;
        String str3;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.H;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.H = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objC = aVar.F;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.H;
        y yVar = y.A;
        k kVar = this.a;
        b0 b0Var = b0.a;
        try {
            if (i2 == 0) {
                t1.O(objC);
                if (!z) {
                    this.c = yVar;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.g = true;
                    return b0Var;
                }
                this.g = false;
                aVar.B = str;
                aVar.A = z;
                aVar.H = 1;
                objC = kVar.c(aVar);
                if (objC == aVar2) {
                }
                return aVar2;
            }
            if (i2 == 1) {
                z = aVar.A;
                str = aVar.B;
                t1.O(objC);
            } else {
                if (i2 == 2) {
                    z2 = aVar.A;
                    oVar = aVar.D;
                    str2 = aVar.C;
                    t1.O(objC);
                    aVar.B = null;
                    aVar.C = str2;
                    aVar.D = oVar;
                    aVar.E = this;
                    aVar.A = z2;
                    aVar.H = 3;
                    objC = kVar.e(oVar, aVar);
                    if (objC != aVar2) {
                        bVar = this;
                        str3 = str2;
                    }
                    return aVar2;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = aVar.E;
                oVar = aVar.D;
                str3 = aVar.C;
                t1.O(objC);
            }
            bVar.c = (Map) objC;
            this.d = str3;
            this.e = new Integer(oVar.i);
            this.f = oVar.b;
            this.g = true;
            return b0Var;
            List list = (List) objC;
            if (list.isEmpty()) {
                this.c = yVar;
                this.d = null;
                this.e = null;
                this.f = null;
                this.h = null;
                this.g = true;
                return b0Var;
            }
            String strB = this.b.b(str, list);
            this.h = strB;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!m.a(((o) next).a, strB));
            o oVar2 = (o) next;
            if (oVar2 == null) {
                this.c = yVar;
                this.d = null;
                this.e = null;
                this.f = null;
                this.h = null;
                this.g = true;
                return b0Var;
            }
            if (m.a(this.d, strB)) {
                Integer num = this.e;
                int i3 = oVar2.i;
                if (num != null && num.intValue() == i3 && !this.c.isEmpty()) {
                    this.g = true;
                    return b0Var;
                }
            }
            aVar.B = null;
            aVar.C = strB;
            aVar.D = oVar2;
            aVar.A = z;
            aVar.H = 2;
            if (kVar.b(oVar2, aVar) != aVar2) {
                str2 = strB;
                z2 = z;
                oVar = oVar2;
                aVar.B = null;
                aVar.C = str2;
                aVar.D = oVar;
                aVar.E = this;
                aVar.A = z2;
                aVar.H = 3;
                objC = kVar.e(oVar, aVar);
                if (objC != aVar2) {
                    bVar = this;
                    str3 = str2;
                    bVar.c = (Map) objC;
                    this.d = str3;
                    this.e = new Integer(oVar.i);
                    this.f = oVar.b;
                    this.g = true;
                    return b0Var;
                }
            }
            return aVar2;
        } catch (Exception unused) {
            this.c = yVar;
            this.d = null;
            this.e = null;
            this.f = null;
            this.h = null;
            return b0Var;
        } finally {
            this.g = true;
        }
    }
}
