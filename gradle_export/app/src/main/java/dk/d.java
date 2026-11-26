package dk;

import bk.a0;
import bk.b0;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d implements b0, Cloneable {
    public static final d C = new d();
    public final List A;
    public final List B;

    public d() {
        List list = Collections.EMPTY_LIST;
        this.A = list;
        this.B = list;
    }

    @Override
    public final a0 a(bk.m mVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zB = b(rawType, true);
        boolean zB2 = b(rawType, false);
        if (zB || zB2) {
            return new c(this, zB2, zB, mVar, typeToken);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            k00.f fVar = gk.c.f6361a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.A : this.B).iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }
}
