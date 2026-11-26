package ek;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class q extends bk.a0 {

    public static final o f5442c = new o(bk.y.A, 1);

    public final bk.m f5443a;

    public final bk.y f5444b;

    public q(bk.m mVar, bk.y yVar) {
        this.f5443a = mVar;
        this.f5444b = yVar;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iT0 = aVar.t0();
        int iB = e4.f.b(iT0);
        if (iB == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.i();
            arrayList = new dk.n(true);
        }
        if (arrayList == null) {
            return d(aVar, iT0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.G()) {
                String strN0 = arrayList instanceof Map ? aVar.n0() : null;
                int iT1 = aVar.t0();
                int iB2 = e4.f.b(iT1);
                if (iB2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.i();
                    arrayList2 = new dk.n(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iT1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strN0, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.v();
                } else {
                    aVar.x();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
            return;
        }
        Class<?> cls = obj.getClass();
        bk.m mVar = this.f5443a;
        mVar.getClass();
        bk.a0 a0VarF = mVar.f(TypeToken.get((Class) cls));
        if (!(a0VarF instanceof q)) {
            a0VarF.c(bVar, obj);
        } else {
            bVar.l();
            bVar.x();
        }
    }

    public final Serializable d(ik.a aVar, int i10) {
        int iB = e4.f.b(i10);
        if (iB == 5) {
            return aVar.r0();
        }
        if (iB == 6) {
            return this.f5444b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.S());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(g4.c.t(i10)));
        }
        aVar.p0();
        return null;
    }
}
