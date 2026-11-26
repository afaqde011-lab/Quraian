package n30;

import h00.d0;
import h00.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class i extends h00.j {
    public static final int C = 0;
    public Object A;
    public int B;

    public i(int i) {
    }

    @Override
    public final int a() {
        return this.B;
    }

    @Override
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.B;
        if (i == 0) {
            this.A = obj;
        } else if (i == 1) {
            if (m.a(this.A, obj)) {
                return false;
            }
            this.A = new Object[]{this.A, obj};
        } else if (i < 5) {
            Object obj3 = this.A;
            m.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (n.m0(obj, objArr)) {
                return false;
            }
            int i2 = this.B;
            if (i2 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                m.e(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(elements.length));
                n.T0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i2 + 1);
                m.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.A = obj2;
        } else {
            Object obj4 = this.A;
            m.c(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!kotlin.jvm.internal.d0.c(obj4).add(obj)) {
                return false;
            }
        }
        this.B++;
        return true;
    }

    @Override
    public final void clear() {
        this.A = null;
        this.B = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return m.a(this.A, obj);
        }
        if (a() < 5) {
            Object obj2 = this.A;
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return n.m0(obj, (Object[]) obj2);
        }
        Object obj3 = this.A;
        m.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override
    public final Iterator iterator() {
        int i = this.B;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new h(this.A, 0);
        }
        if (i < 5) {
            Object obj = this.A;
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new g((Object[]) obj);
        }
        Object obj2 = this.A;
        m.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return kotlin.jvm.internal.d0.c(obj2).iterator();
    }
}
