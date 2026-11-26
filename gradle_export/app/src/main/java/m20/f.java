package m20;

import h00.a0;
import h00.b0;
import h00.d0;
import h00.p;
import h00.q;
import h00.r;
import h00.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l20.h;
import l20.i;

public final class f implements k20.g {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String strR0 = q.R0(va.a.S(new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, null, 62);
        List listS = va.a.S(new String[]{w.c.j(strR0, "/Any"), w.c.j(strR0, "/Nothing"), w.c.j(strR0, "/Unit"), w.c.j(strR0, "/Throwable"), w.c.j(strR0, "/Number"), w.c.j(strR0, "/Byte"), w.c.j(strR0, "/Double"), w.c.j(strR0, "/Float"), w.c.j(strR0, "/Int"), w.c.j(strR0, "/Long"), w.c.j(strR0, "/Short"), w.c.j(strR0, "/Boolean"), w.c.j(strR0, "/Char"), w.c.j(strR0, "/CharSequence"), w.c.j(strR0, "/String"), w.c.j(strR0, "/Comparable"), w.c.j(strR0, "/Enum"), w.c.j(strR0, "/Array"), w.c.j(strR0, "/ByteArray"), w.c.j(strR0, "/DoubleArray"), w.c.j(strR0, "/FloatArray"), w.c.j(strR0, "/IntArray"), w.c.j(strR0, "/LongArray"), w.c.j(strR0, "/ShortArray"), w.c.j(strR0, "/BooleanArray"), w.c.j(strR0, "/CharArray"), w.c.j(strR0, "/Cloneable"), w.c.j(strR0, "/Annotation"), w.c.j(strR0, "/collections/Iterable"), w.c.j(strR0, "/collections/MutableIterable"), w.c.j(strR0, "/collections/Collection"), w.c.j(strR0, "/collections/MutableCollection"), w.c.j(strR0, "/collections/List"), w.c.j(strR0, "/collections/MutableList"), w.c.j(strR0, "/collections/Set"), w.c.j(strR0, "/collections/MutableSet"), w.c.j(strR0, "/collections/Map"), w.c.j(strR0, "/collections/MutableMap"), w.c.j(strR0, "/collections/Map.Entry"), w.c.j(strR0, "/collections/MutableMap.MutableEntry"), w.c.j(strR0, "/collections/Iterator"), w.c.j(strR0, "/collections/MutableIterator"), w.c.j(strR0, "/collections/ListIterator"), w.c.j(strR0, "/collections/MutableListIterator")});
        d = listS;
        p pVarS1 = q.s1(listS);
        int iP = d0.P(r.q0(pVarS1, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = pVarS1.iterator();
        while (true) {
            b0 b0Var = (b0) it;
            if (!b0Var.B.hasNext()) {
                return;
            }
            a0 a0Var = (a0) b0Var.next();
            linkedHashMap.put((String) a0Var.b, Integer.valueOf(a0Var.a));
        }
    }

    public f(i iVar, String[] strings) {
        m.e(strings, "strings");
        List list = iVar.C;
        Set setR1 = list.isEmpty() ? z.A : q.r1(list);
        List<h> list2 = iVar.B;
        m.d(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (h hVar : list2) {
            int i = hVar.C;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(hVar);
            }
        }
        arrayList.trimToSize();
        this.a = strings;
        this.b = setR1;
        this.c = arrayList;
    }

    @Override
    public final String a(int i) {
        return getString(i);
    }

    @Override
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    @Override
    public final String getString(int i) {
        String strU0;
        h hVar = (h) this.c.get(i);
        int i2 = hVar.B;
        if ((i2 & 4) == 4) {
            Object obj = hVar.E;
            if (obj instanceof String) {
                strU0 = (String) obj;
            } else {
                o20.e eVar = (o20.e) obj;
                String strQ = eVar.q();
                if (eVar.k()) {
                    hVar.E = strQ;
                }
                strU0 = strQ;
            }
        } else if ((i2 & 2) == 2) {
            List list = d;
            int size = list.size();
            int i3 = hVar.D;
            if (i3 < 0 || i3 >= size) {
                strU0 = this.a[i];
            } else {
                strU0 = (String) list.get(i3);
            }
        } else {
            strU0 = this.a[i];
        }
        if (hVar.G.size() >= 2) {
            List list2 = hVar.G;
            m.b(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strU0.length()) {
                strU0 = strU0.substring(num.intValue(), num2.intValue());
                m.d(strU0, "substring(...)");
            }
        }
        if (hVar.I.size() >= 2) {
            List list3 = hVar.I;
            m.b(list3);
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            m.b(strU0);
            strU0 = r30.r.u0(strU0, (char) num3.intValue(), (char) num4.intValue());
        }
        l20.g gVar = hVar.F;
        if (gVar == null) {
            gVar = l20.g.NONE;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m.b(strU0);
                strU0 = r30.r.u0(strU0, '$', '.');
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strU0.length() >= 2) {
                    strU0 = strU0.substring(1, strU0.length() - 1);
                    m.d(strU0, "substring(...)");
                }
                strU0 = r30.r.u0(strU0, '$', '.');
            }
        }
        m.b(strU0);
        return strU0;
    }
}
