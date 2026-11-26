package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f0 extends h0 {

    public static final Class f4262c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j9, int i10) {
        List listMutableCopyWithCapacity;
        List list = (List) m1.f4297c.i(obj, j9);
        if (list.isEmpty()) {
            if (list instanceof e0) {
                listMutableCopyWithCapacity = new d0(i10);
            } else {
                listMutableCopyWithCapacity = ((list instanceof w0) && (list instanceof a0)) ? ((a0) list).mutableCopyWithCapacity(i10) : new ArrayList(i10);
            }
            m1.p(obj, j9, listMutableCopyWithCapacity);
            return listMutableCopyWithCapacity;
        }
        if (f4262c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            m1.p(obj, j9, arrayList);
            return arrayList;
        }
        if (list instanceof h1) {
            d0 d0Var = new d0(list.size() + i10);
            d0Var.addAll((h1) list);
            m1.p(obj, j9, d0Var);
            return d0Var;
        }
        if ((list instanceof w0) && (list instanceof a0)) {
            a0 a0Var = (a0) list;
            if (!((b) a0Var).A) {
                a0 a0VarMutableCopyWithCapacity = a0Var.mutableCopyWithCapacity(list.size() + i10);
                m1.p(obj, j9, a0VarMutableCopyWithCapacity);
                return a0VarMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override
    public final void a(Object obj, long j9) {
        Object objUnmodifiableList;
        List list = (List) m1.f4297c.i(obj, j9);
        if (list instanceof e0) {
            objUnmodifiableList = ((e0) list).getUnmodifiableView();
        } else {
            if (f4262c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof w0) && (list instanceof a0)) {
                b bVar = (b) ((a0) list);
                if (bVar.A) {
                    bVar.A = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        m1.p(obj, j9, objUnmodifiableList);
    }

    @Override
    public final void b(Object obj, Object obj2, long j9) {
        List list = (List) m1.f4297c.i(obj2, j9);
        List listD = d(obj, j9, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        m1.p(obj, j9, list);
    }

    @Override
    public final List c(Object obj, long j9) {
        return d(obj, j9, 10);
    }
}
