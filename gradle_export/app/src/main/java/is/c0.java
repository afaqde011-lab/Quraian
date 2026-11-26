package is;

public final class c0 {
    public final wo.c0 a;
    public final js.f b;

    public c0(wo.c0 c0Var, js.f fVar, fs.f fVar2) {
        this.a = c0Var;
        this.b = fVar;
    }

    public static boolean c(gs.e eVar) {
        if (kotlin.jvm.internal.m.a(eVar.e, "app_background")) {
            return true;
        }
        n00.b bVar = ss.f.I;
        if (bVar != null && bVar.isEmpty()) {
            return false;
        }
        bVar.getClass();
        g00.s sVar = new g00.s(bVar, 4);
        while (sVar.hasNext()) {
            if (((ss.f) sVar.next()).A.equals(eVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final Object a(m00.c cVar) {
        Object objN = rd.a.N(this.b.a.a, false, true, new ks.e(5), cVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN != aVar) {
            objN = b0Var;
        }
        return objN == aVar ? objN : b0Var;
    }

    public final java.io.Serializable b(int r10, m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: is.c0.b(int, m00.c):java.io.Serializable");
    }
}
