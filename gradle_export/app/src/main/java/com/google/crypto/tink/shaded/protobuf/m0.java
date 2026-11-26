package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class m0 {
    public static void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (l0Var.isEmpty()) {
            return;
        }
        Iterator it = l0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static l0 b(Object obj, Object obj2) {
        l0 l0VarD = (l0) obj;
        l0 l0Var = (l0) obj2;
        if (!l0Var.isEmpty()) {
            if (!l0VarD.A) {
                l0VarD = l0VarD.d();
            }
            l0VarD.c();
            if (!l0Var.isEmpty()) {
                l0VarD.putAll(l0Var);
            }
        }
        return l0VarD;
    }
}
