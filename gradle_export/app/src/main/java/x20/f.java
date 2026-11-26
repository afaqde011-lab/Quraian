package x20;

import h00.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f {
    public static final l c = new l();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        e eVar;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new f(i8);
        n = new f(i6 | i7);
        new f(i2);
        new f(i3);
        new f(i4);
        o = new f(i9);
        new f(i5);
        p = new f(i6);
        q = new f(i7);
        new f(i3 | i6 | i7);
        Field[] fields = f.class.getFields();
        kotlin.jvm.internal.m.d(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i11 = fVar.b;
                String name = field2.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                eVar2 = new e(i11, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        r = arrayList2;
        Field[] fields2 = f.class.getFields();
        kotlin.jvm.internal.m.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (kotlin.jvm.internal.m.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        s = arrayList5;
    }

    public f(int i2) {
        this(i2, x.A);
    }

    public f(int i2, List excludes) {
        kotlin.jvm.internal.m.e(excludes, "excludes");
        this.a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i2 &= ~((d) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).a != this.b);
        e eVar = (e) next;
        String strR0 = eVar != null ? eVar.b : null;
        if (strR0 == null) {
            ArrayList arrayList = new ArrayList();
            for (e eVar2 : s) {
                String str = a(eVar2.a) ? eVar2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strR0 = h00.q.R0(arrayList, " | ", null, null, null, 62);
        }
        return oi.k.n(g4.c.n("DescriptorKindFilter(", strR0, ", "), this.a, ')');
    }
}
