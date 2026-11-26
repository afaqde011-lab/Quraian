package x10;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import h00.j0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class e0 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Object c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final a0 g;
    public static final Object h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set<String> setX0 = h00.n.X0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(h00.r.q0(setX0, 10));
        for (String str : setX0) {
            String strC = v20.c.BOOLEAN.c();
            kotlin.jvm.internal.m.d(strC, "getDesc(...)");
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a0) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a0) it2.next()).b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        v20.c cVar = v20.c.BOOLEAN;
        String strC2 = cVar.c();
        kotlin.jvm.internal.m.d(strC2, "getDesc(...)");
        a0 a0VarA = l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        d0 d0Var = d0.D;
        g00.k kVar = new g00.k(a0VarA, d0Var);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = cVar.c();
        kotlin.jvm.internal.m.d(strC3, "getDesc(...)");
        g00.k kVar2 = new g00.k(l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), d0Var);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = cVar.c();
        kotlin.jvm.internal.m.d(strC4, "getDesc(...)");
        g00.k kVar3 = new g00.k(l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), d0Var);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = cVar.c();
        kotlin.jvm.internal.m.d(strC5, "getDesc(...)");
        g00.k kVar4 = new g00.k(l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), d0Var);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = cVar.c();
        kotlin.jvm.internal.m.d(strC6, "getDesc(...)");
        g00.k kVar5 = new g00.k(l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), d0Var);
        g00.k kVar6 = new g00.k(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), d0.E);
        a0 a0VarA2 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        d0 d0Var2 = d0.B;
        g00.k kVar7 = new g00.k(a0VarA2, d0Var2);
        g00.k kVar8 = new g00.k(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), d0Var2);
        String strConcat6 = "java/util/".concat("List");
        v20.c cVar2 = v20.c.INT;
        String strC7 = cVar2.c();
        kotlin.jvm.internal.m.d(strC7, "getDesc(...)");
        a0 a0VarA3 = l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        d0 d0Var3 = d0.C;
        g00.k kVar9 = new g00.k(a0VarA3, d0Var3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = cVar2.c();
        kotlin.jvm.internal.m.d(strC8, "getDesc(...)");
        Map mapR = h00.d0.R(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, new g00.k(l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), d0Var3));
        c = mapR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h00.d0.P(mapR.size()));
        for (Map.Entry entry : mapR.entrySet()) {
            linkedHashMap.put(((a0) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetQ0 = j0.q0(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(h00.r.q0(linkedHashSetQ0, 10));
        Iterator it3 = linkedHashSetQ0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a0) it3.next()).b);
        }
        e = h00.q.r1(arrayList5);
        ArrayList arrayList6 = new ArrayList(h00.r.q0(linkedHashSetQ0, 10));
        Iterator it4 = linkedHashSetQ0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a0) it4.next()).e);
        }
        f = h00.q.r1(arrayList6);
        v20.c cVar3 = v20.c.INT;
        String strC9 = cVar3.c();
        kotlin.jvm.internal.m.d(strC9, "getDesc(...)");
        a0 a0VarA4 = l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = a0VarA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = v20.c.BYTE.c();
        kotlin.jvm.internal.m.d(strC10, "getDesc(...)");
        g00.k kVar10 = new g00.k(l.a(strConcat8, "toByte", "", strC10), n20.e.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = v20.c.SHORT.c();
        kotlin.jvm.internal.m.d(strC11, "getDesc(...)");
        g00.k kVar11 = new g00.k(l.a(strConcat9, "toShort", "", strC11), n20.e.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = cVar3.c();
        kotlin.jvm.internal.m.d(strC12, "getDesc(...)");
        g00.k kVar12 = new g00.k(l.a(strConcat10, "toInt", "", strC12), n20.e.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = v20.c.LONG.c();
        kotlin.jvm.internal.m.d(strC13, "getDesc(...)");
        g00.k kVar13 = new g00.k(l.a(strConcat11, "toLong", "", strC13), n20.e.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = v20.c.FLOAT.c();
        kotlin.jvm.internal.m.d(strC14, "getDesc(...)");
        g00.k kVar14 = new g00.k(l.a(strConcat12, "toFloat", "", strC14), n20.e.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = v20.c.DOUBLE.c();
        kotlin.jvm.internal.m.d(strC15, "getDesc(...)");
        g00.k kVar15 = new g00.k(l.a(strConcat13, "toDouble", "", strC15), n20.e.e("doubleValue"));
        g00.k kVar16 = new g00.k(a0VarA4, n20.e.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = cVar3.c();
        kotlin.jvm.internal.m.d(strC16, "getDesc(...)");
        String strC17 = v20.c.CHAR.c();
        kotlin.jvm.internal.m.d(strC17, "getDesc(...)");
        Map mapR2 = h00.d0.R(kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, new g00.k(l.a(strConcat14, "get", strC16, strC17), n20.e.e("charAt")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), ProductResponseJsonKeys.STORE, "I", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), n20.e.e("getAndAdd")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), n20.e.e("addAndGet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), ProductResponseJsonKeys.STORE, "J", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), n20.e.e("getAndAdd")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), n20.e.e("addAndGet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), ProductResponseJsonKeys.STORE, "Z", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), ProductResponseJsonKeys.STORE, "Ljava/lang/Object;", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), n20.e.e("compareAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), n20.e.e("getAndAdd")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), n20.e.e("addAndGet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), n20.e.e("compareAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), n20.e.e("getAndAdd")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), n20.e.e("addAndGet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), n20.e.e("get")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), n20.e.e("set")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), n20.e.e("getAndSet")), new g00.k(l.a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), n20.e.e("compareAndSet")));
        h = mapR2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h00.d0.P(mapR2.size()));
        for (Map.Entry entry2 : mapR2.entrySet()) {
            linkedHashMap2.put(((a0) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        ?? r0 = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            a0 a0Var = (a0) entry3.getKey();
            n20.e name = (n20.e) entry3.getValue();
            String classInternalName = a0Var.a;
            String str2 = a0Var.c;
            String str3 = a0Var.d;
            kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
            kotlin.jvm.internal.m.e(name, "name");
            String jvmDescriptor = name + '(' + str2 + ')' + str3;
            kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(classInternalName + '.' + jvmDescriptor);
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a0) it5.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<g00.k> arrayList7 = new ArrayList(h00.r.q0(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new g00.k(((a0) entry4.getKey()).b, entry4.getValue()));
        }
        int iP = h00.d0.P(h00.r.q0(arrayList7, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP);
        for (g00.k kVar17 : arrayList7) {
            linkedHashMap3.put((n20.e) kVar17.B, (n20.e) kVar17.A);
        }
        k = linkedHashMap3;
    }
}
