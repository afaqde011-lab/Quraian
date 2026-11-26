package bp;

import ep.m;
import ri.t1;
import wo.b0;

public final class g {
    public final b0 a;

    public g(b0 b0Var) {
        this.a = b0Var;
    }

    public final java.lang.Object a(ep.e r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, m00.c r16) {
        throw new UnsupportedOperationException("Method not decompiled: bp.g.a(ep.e, java.lang.String, java.lang.String, java.lang.String, java.lang.String, m00.c):java.lang.Object");
    }

    public final Object b(ep.a aVar, m00.c cVar) {
        f fVar;
        String str;
        String str2;
        ep.e eVar;
        String str3;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.G = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.E;
        Object obj2 = l00.a.A;
        int i2 = fVar2.G;
        if (i2 == 0) {
            t1.O(obj);
            ep.e eVar2 = ep.e.B;
            String str4 = aVar.a;
            str = aVar.b;
            String str5 = aVar.d;
            fVar2.A = eVar2;
            fVar2.B = str4;
            fVar2.C = str;
            fVar2.D = str5;
            fVar2.G = 1;
            Object objG = this.a.g(str4, fVar2);
            if (objG != obj2) {
                str2 = str5;
                eVar = eVar2;
                str3 = str4;
                obj = objG;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        String str6 = fVar2.D;
        str = fVar2.C;
        str3 = fVar2.B;
        ep.e eVar3 = fVar2.A;
        t1.O(obj);
        str2 = str6;
        eVar = eVar3;
        String str7 = str;
        fVar2.A = null;
        fVar2.B = null;
        fVar2.C = null;
        fVar2.D = null;
        fVar2.G = 2;
        Object objA = a(eVar, str3, str2, (String) obj, str7, fVar2);
        return objA == obj2 ? obj2 : objA;
    }

    public final Object c(m mVar, m00.c cVar) {
        e eVar;
        g gVar;
        ep.e eVar2;
        String str;
        String str2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.G = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar3 = eVar;
        Object obj = eVar3.E;
        l00.a aVar = l00.a.A;
        int i2 = eVar3.G;
        if (i2 == 0) {
            t1.O(obj);
            ep.e eVar4 = ep.e.C;
            String str3 = mVar.a;
            String str4 = mVar.c;
            eVar3.A = this;
            eVar3.B = eVar4;
            eVar3.C = str3;
            eVar3.D = str4;
            eVar3.G = 1;
            Object objH = this.a.h(str3, eVar3);
            if (objH != aVar) {
                gVar = this;
                eVar2 = eVar4;
                str = str3;
                obj = objH;
                str2 = str4;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        String str5 = eVar3.D;
        String str6 = eVar3.C;
        ep.e eVar5 = eVar3.B;
        g gVar2 = eVar3.A;
        t1.O(obj);
        str2 = str5;
        eVar2 = eVar5;
        gVar = gVar2;
        str = str6;
        eVar3.A = null;
        eVar3.B = null;
        eVar3.C = null;
        eVar3.D = null;
        eVar3.G = 2;
        Object objA = gVar.a(eVar2, str, str2, (String) obj, "", eVar3);
        return objA == aVar ? aVar : objA;
    }
}
