package ek;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

public final class w implements bk.b0 {
    public final a1.u0 A;
    public final bk.h B;
    public final dk.d C;
    public final l D;
    public final List E;

    public w(a1.u0 u0Var, bk.h hVar, dk.d dVar, l lVar, List list) {
        this.A = u0Var;
        this.B = hVar;
        this.C = dVar;
        this.D = lVar;
        this.E = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + gk.c.c(field) + " and " + gk.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        k00.f fVar = gk.c.f6361a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new bk.j(2);
        }
        dk.h.f(this.E);
        return gk.c.f6361a.L(rawType) ? new v(rawType, c(mVar, typeToken, rawType, true)) : new t(this.A.C(typeToken, true), c(mVar, typeToken, rawType, false));
    }

    public final ek.u c(bk.m r30, com.google.gson.reflect.TypeToken r31, java.lang.Class r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: ek.w.c(bk.m, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):ek.u");
    }

    public final boolean d(Field field, boolean z10) {
        boolean z11;
        dk.d dVar = this.C;
        dVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || dVar.b(field.getType(), z10)) {
            z11 = true;
        } else {
            List list = z10 ? dVar.A : dVar.B;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw a1.b.j(it);
                }
            }
            z11 = false;
        }
        return !z11;
    }
}
