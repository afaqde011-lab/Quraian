package fs;

import a1.q0;
import b6.o;
import h00.d0;
import h00.j0;
import h00.q;
import h00.r;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import ri.t1;
import ss.s;
import ss.v;
import ss.w;
import ss.x;

public final class l {
    public static void a(Map map, Serializable serializable, long j) {
        Long l = (Long) map.get(serializable);
        map.put(serializable, Long.valueOf((l != null ? l.longValue() : 0L) + j));
    }

    public static v b(v vVar, ui.b bVar, int i) {
        int iIntValue;
        boolean z;
        Object objS;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.B;
        LocalDate localDateNow = LocalDate.now();
        kotlin.jvm.internal.m.b(localDateNow);
        String strZ = f50.c.z(localDateNow);
        LocalDate localDateMinusDays = localDateNow.minusDays(((long) i) - 1);
        kotlin.jvm.internal.m.d(localDateMinusDays, "minusDays(...)");
        String strZ2 = f50.c.z(localDateMinusDays);
        o oVar = new o(strZ2, 1);
        List list = vVar.f;
        x xVar = vVar.d;
        int iP = d0.P(r.q0(list, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP);
        for (Object obj : list) {
            linkedHashMap2.put(((ss.c) obj).a, obj);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d0.P(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), Long.valueOf(((ss.c) entry.getValue()).b));
        }
        LinkedHashMap linkedHashMapB0 = d0.b0(linkedHashMap3);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            a(linkedHashMapB0, (String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            oVar = oVar;
        }
        o oVar2 = oVar;
        int i2 = xVar.b;
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            int i3 = vVar.a;
            numValueOf = Integer.valueOf(i3);
            if (i3 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 5;
            }
        }
        int i4 = iIntValue;
        q0 q0Var = new q0(strZ, i4, linkedHashMap2, 3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMapB0.entrySet()) {
            if (((Number) entry3.getValue()).longValue() >= ((Number) q0Var.invoke((String) entry3.getKey())).longValue()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        Set setKeySet = linkedHashMap4.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            try {
                objS = LocalDate.parse((String) it.next());
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            if (objS instanceof g00.m) {
                objS = null;
            }
            LocalDate localDate = (LocalDate) objS;
            if (localDate != null) {
                arrayList.add(localDate);
            }
        }
        TreeSet treeSet = new TreeSet();
        q.l1(arrayList, treeSet);
        Iterator it2 = treeSet.iterator();
        LocalDate localDate2 = null;
        int iMax = 0;
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkedHashMap linkedHashMap5 = linkedHashMap;
            LocalDate localDate3 = (LocalDate) it2.next();
            LinkedHashMap linkedHashMap6 = linkedHashMapB0;
            LinkedHashMap linkedHashMap7 = linkedHashMap2;
            int i6 = kotlin.jvm.internal.m.a(localDate2 != null ? localDate2.plusDays(1L) : null, localDate3) ? i5 + 1 : 1;
            iMax = Math.max(iMax, i6);
            i5 = i6;
            linkedHashMap2 = linkedHashMap7;
            linkedHashMapB0 = linkedHashMap6;
            localDate2 = localDate3;
            linkedHashMap = linkedHashMap5;
        }
        LinkedHashMap linkedHashMap8 = linkedHashMap;
        LinkedHashMap linkedHashMap9 = linkedHashMapB0;
        LinkedHashMap linkedHashMap10 = linkedHashMap2;
        if (!treeSet.contains(localDateNow)) {
            localDateNow = localDateNow.minusDays(1L);
        }
        int i7 = 0;
        while (treeSet.contains(localDateNow)) {
            i7++;
            localDateNow = localDateNow.minusDays(1L);
        }
        if (i7 > 0) {
            kotlin.jvm.internal.m.b(localDateNow);
            if (f50.c.z(localDateNow).compareTo(strZ2) < 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap11 = (LinkedHashMap) bVar.D;
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap11.entrySet()) {
            if (((Boolean) oVar2.invoke(((g00.q) entry4.getKey()).A)).booleanValue()) {
                linkedHashMap12.put(entry4.getKey(), entry4.getValue());
            }
        }
        long jLongValue = ((Number) q0Var.invoke(strZ)).longValue();
        ss.c cVar = (ss.c) linkedHashMap10.get(strZ);
        boolean z2 = (cVar != null ? cVar.b : 0L) >= jLongValue;
        Long l = (Long) linkedHashMap9.get(strZ);
        int i8 = z ? vVar.b + ((!((l != null ? l.longValue() : 0L) >= jLongValue) || z2) ? 0 : 1) : i7;
        int iMax2 = Math.max(vVar.c, Math.max(iMax, i7));
        Long l2 = (Long) linkedHashMap9.get(strZ);
        x xVarA = x.a(xVar, l2 != null ? l2.longValue() : 0L, 0, strZ, 2);
        long j = vVar.e;
        Collection collectionValues = linkedHashMap8.values();
        kotlin.jvm.internal.m.e(collectionValues, "<this>");
        Iterator it3 = collectionValues.iterator();
        long jLongValue2 = 0;
        while (it3.hasNext()) {
            jLongValue2 = ((Number) it3.next()).longValue() + jLongValue2;
        }
        long j2 = j + jLongValue2;
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap9.entrySet()) {
            if (((Boolean) oVar2.invoke(entry5.getKey())).booleanValue()) {
                linkedHashMap13.put(entry5.getKey(), entry5.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap13.size());
        Iterator it4 = linkedHashMap13.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry6 = (Map.Entry) it4.next();
            String str = (String) entry6.getKey();
            Iterator it5 = it4;
            int i9 = iMax2;
            long jLongValue3 = ((Number) entry6.getValue()).longValue();
            Object obj2 = linkedHashMap10.get(str);
            int i11 = i8;
            ss.c cVar2 = (ss.c) obj2;
            arrayList2.add(new ss.c(str, jLongValue3, cVar2 != null ? cVar2.c : i4));
            iMax2 = i9;
            it4 = it5;
            i8 = i11;
        }
        int i12 = i8;
        int i13 = iMax2;
        List list2 = vVar.g;
        LinkedHashMap linkedHashMap14 = (LinkedHashMap) bVar.C;
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        for (Map.Entry entry7 : linkedHashMap14.entrySet()) {
            if (((Boolean) oVar2.invoke(((g00.k) entry7.getKey()).A)).booleanValue()) {
                linkedHashMap15.put(entry7.getKey(), entry7.getValue());
            }
        }
        int iP2 = d0.P(r.q0(list2, 10));
        if (iP2 < 16) {
            iP2 = 16;
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap(iP2);
        for (Object obj3 : list2) {
            ss.i iVar = (ss.i) obj3;
            linkedHashMap16.put(new g00.k(iVar.a, Integer.valueOf(iVar.b)), obj3);
        }
        LinkedHashMap linkedHashMapB1 = d0.b0(linkedHashMap16);
        Iterator it6 = linkedHashMap15.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry8 = (Map.Entry) it6.next();
            g00.k kVar = (g00.k) entry8.getKey();
            long jLongValue4 = ((Number) entry8.getValue()).longValue();
            String str2 = (String) kVar.A;
            Iterator it7 = it6;
            int iIntValue2 = ((Number) kVar.B).intValue();
            x xVar2 = xVarA;
            ss.i iVar2 = (ss.i) linkedHashMapB1.get(kVar);
            long j3 = j2;
            linkedHashMapB1.put(kVar, new ss.i(str2, (iVar2 != null ? iVar2.c : 0L) + jLongValue4, iIntValue2));
            it6 = it7;
            xVarA = xVar2;
            j2 = j3;
        }
        x xVar3 = xVarA;
        long j4 = j2;
        List listN1 = q.n1(linkedHashMapB1.values());
        List list3 = vVar.h;
        int iP3 = d0.P(r.q0(list3, 10));
        if (iP3 < 16) {
            iP3 = 16;
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap(iP3);
        for (Object obj4 : list3) {
            s sVar = (s) obj4;
            linkedHashMap17.put(new g00.k(sVar.a, Integer.valueOf(sVar.b)), obj4);
        }
        LinkedHashMap linkedHashMapB2 = d0.b0(linkedHashMap17);
        Iterator it8 = linkedHashMap12.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry9 = (Map.Entry) it8.next();
            g00.q qVar = (g00.q) entry9.getKey();
            long jLongValue5 = ((Number) entry9.getValue()).longValue();
            Object obj5 = qVar.A;
            Object obj6 = qVar.B;
            g00.k kVar2 = new g00.k(obj5, obj6);
            s sVar2 = (s) linkedHashMapB2.get(kVar2);
            Iterator it9 = it8;
            linkedHashMapB2.put(kVar2, new s((String) qVar.A, (sVar2 != null ? sVar2.c : 0L) + jLongValue5, ((Number) obj6).intValue()));
            it8 = it9;
        }
        List listN2 = q.n1(linkedHashMapB2.values());
        List list4 = vVar.i;
        LinkedHashMap linkedHashMap18 = (LinkedHashMap) bVar.E;
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        for (Map.Entry entry10 : linkedHashMap18.entrySet()) {
            if (((Boolean) oVar2.invoke(((g00.q) entry10.getKey()).A)).booleanValue()) {
                linkedHashMap19.put(entry10.getKey(), entry10.getValue());
            }
        }
        int iP4 = d0.P(r.q0(list4, 10));
        if (iP4 < 16) {
            iP4 = 16;
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap(iP4);
        for (Object obj7 : list4) {
            w wVar = (w) obj7;
            linkedHashMap20.put(new g00.q(wVar.a, Integer.valueOf(wVar.b), Integer.valueOf(wVar.c)), obj7);
        }
        LinkedHashMap linkedHashMapB3 = d0.b0(linkedHashMap20);
        for (g00.q qVar2 : j0.q0(linkedHashMap12.keySet(), linkedHashMap19.keySet())) {
            w wVar2 = (w) linkedHashMapB3.get(qVar2);
            String str3 = (String) qVar2.A;
            int iIntValue3 = ((Number) qVar2.B).intValue();
            int iIntValue4 = ((Number) qVar2.C).intValue();
            ArrayList arrayList3 = arrayList2;
            long j5 = wVar2 != null ? wVar2.d : 0L;
            Long l3 = (Long) linkedHashMap12.get(qVar2);
            long jLongValue6 = j5 + (l3 != null ? l3.longValue() : 0L);
            int i14 = wVar2 != null ? wVar2.e : 0;
            Integer num = (Integer) linkedHashMap19.get(qVar2);
            linkedHashMapB3.put(qVar2, new w(iIntValue3, iIntValue4, i14 + (num != null ? num.intValue() : 0), jLongValue6, str3));
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = arrayList2;
        List listN3 = q.n1(linkedHashMapB3.values());
        List list5 = vVar.j;
        int iP5 = d0.P(r.q0(list5, 10));
        LinkedHashMap linkedHashMap21 = new LinkedHashMap(iP5 < 16 ? 16 : iP5);
        for (Object obj8 : list5) {
            ss.b bVar2 = (ss.b) obj8;
            linkedHashMap21.put(new g00.q(bVar2.a, Integer.valueOf(bVar2.b), bVar2.c), obj8);
        }
        LinkedHashMap linkedHashMapB4 = d0.b0(linkedHashMap21);
        LinkedHashMap linkedHashMap22 = (LinkedHashMap) bVar.F;
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        for (Map.Entry entry11 : linkedHashMap22.entrySet()) {
            if (((Boolean) oVar2.invoke(((g00.q) entry11.getKey()).A)).booleanValue()) {
                linkedHashMap23.put(entry11.getKey(), entry11.getValue());
            }
        }
        for (Map.Entry entry12 : linkedHashMap23.entrySet()) {
            g00.q qVar3 = (g00.q) entry12.getKey();
            long jLongValue7 = ((Number) entry12.getValue()).longValue();
            ss.b bVar3 = (ss.b) linkedHashMapB4.get(qVar3);
            long j6 = bVar3 != null ? bVar3.d : 0L;
            List list6 = listN3;
            long j7 = ((long) (bVar3 != null ? bVar3.e : 0)) * j6;
            Long l4 = (Long) ((LinkedHashMap) bVar.G).get(qVar3);
            long jLongValue8 = j6 + (l4 != null ? l4.longValue() : 0L);
            Long l5 = (Long) ((LinkedHashMap) bVar.H).get(qVar3);
            linkedHashMapB4.put(qVar3, new ss.b(((Number) qVar3.B).intValue(), jLongValue8 > 0 ? (int) ((j7 + (l5 != null ? l5.longValue() : 0L)) / jLongValue8) : 0, j6 + jLongValue7, (String) qVar3.A, (String) qVar3.C));
            listN3 = list6;
        }
        return v.a(vVar, 0, i12, i13, xVar3, j4, arrayList4, listN1, listN2, listN3, q.n1(linkedHashMapB4.values()), 3073);
    }

    public static v c(v server, v vVar, int i) {
        Object obj;
        Object next;
        kotlin.jvm.internal.m.e(server, "server");
        if (vVar == null) {
            return server;
        }
        LocalDate localDateNow = LocalDate.now();
        kotlin.jvm.internal.m.d(localDateNow, "now(...)");
        String strZ = f50.c.z(localDateNow);
        ui.b bVar = new ui.b(5);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.E;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) bVar.C;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) bVar.B;
        Iterator it = vVar.f.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((ss.c) next).a, strZ));
        ss.c cVar = (ss.c) next;
        long j = cVar != null ? cVar.b : 0L;
        for (Object obj2 : server.f) {
            if (kotlin.jvm.internal.m.a(((ss.c) obj2).a, strZ)) {
                obj = obj2;
                break;
            }
        }
        ss.c cVar2 = (ss.c) obj;
        long j2 = cVar2 != null ? cVar2.b : 0L;
        if (j > j2) {
            linkedHashMap3.put(strZ, Long.valueOf(j - j2));
        }
        List list = server.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (kotlin.jvm.internal.m.a(((ss.i) obj3).a, strZ)) {
                arrayList.add(obj3);
            }
        }
        int iP = d0.P(r.q0(arrayList, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iP);
        for (Object obj4 : arrayList) {
            linkedHashMap4.put(Integer.valueOf(((ss.i) obj4).b), obj4);
        }
        List list2 = vVar.g;
        ArrayList<ss.i> arrayList2 = new ArrayList();
        for (Object obj5 : list2) {
            if (kotlin.jvm.internal.m.a(((ss.i) obj5).a, strZ)) {
                arrayList2.add(obj5);
            }
        }
        for (ss.i iVar : arrayList2) {
            g00.k kVar = new g00.k(strZ, Integer.valueOf(iVar.b));
            long j3 = iVar.c;
            ss.i iVar2 = (ss.i) linkedHashMap4.get(Integer.valueOf(iVar.b));
            LinkedHashMap linkedHashMap5 = linkedHashMap4;
            long j4 = iVar2 != null ? iVar2.c : 0L;
            if (j3 > j4) {
                linkedHashMap2.put(kVar, Long.valueOf(j3 - j4));
            }
            linkedHashMap4 = linkedHashMap5;
        }
        List list3 = server.i;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : list3) {
            if (kotlin.jvm.internal.m.a(((w) obj6).a, strZ)) {
                arrayList3.add(obj6);
            }
        }
        int iP2 = d0.P(r.q0(arrayList3, 10));
        if (iP2 < 16) {
            iP2 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(iP2);
        for (Object obj7 : arrayList3) {
            w wVar = (w) obj7;
            linkedHashMap6.put(new g00.q(wVar.a, Integer.valueOf(wVar.b), Integer.valueOf(wVar.c)), obj7);
        }
        List list4 = vVar.i;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj8 : list4) {
            if (kotlin.jvm.internal.m.a(((w) obj8).a, strZ)) {
                arrayList4.add(obj8);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            w wVar2 = (w) it2.next();
            g00.q qVar = new g00.q(wVar2.a, Integer.valueOf(wVar2.b), Integer.valueOf(wVar2.c));
            w wVar3 = (w) linkedHashMap6.get(qVar);
            LinkedHashMap linkedHashMap7 = (LinkedHashMap) bVar.D;
            long j5 = wVar2.d;
            Iterator it3 = it2;
            long j6 = wVar3 != null ? wVar3.d : 0L;
            if (j5 > j6) {
                linkedHashMap7.put(qVar, Long.valueOf(j5 - j6));
            }
            int i2 = wVar2.e - (wVar3 != null ? wVar3.e : 0);
            if (i2 > 0) {
                linkedHashMap.put(qVar, Integer.valueOf(i2));
            }
            it2 = it3;
        }
        List list5 = server.j;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj9 : list5) {
            if (kotlin.jvm.internal.m.a(((ss.b) obj9).a, strZ)) {
                arrayList5.add(obj9);
            }
        }
        int iP3 = d0.P(r.q0(arrayList5, 10));
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(iP3 < 16 ? 16 : iP3);
        for (Object obj10 : arrayList5) {
            ss.b bVar2 = (ss.b) obj10;
            linkedHashMap8.put(new g00.q(bVar2.a, Integer.valueOf(bVar2.b), bVar2.c), obj10);
        }
        List list6 = vVar.j;
        ArrayList<ss.b> arrayList6 = new ArrayList();
        for (Object obj11 : list6) {
            if (kotlin.jvm.internal.m.a(((ss.b) obj11).a, strZ)) {
                arrayList6.add(obj11);
            }
        }
        for (ss.b bVar3 : arrayList6) {
            g00.q qVar2 = new g00.q(bVar3.a, Integer.valueOf(bVar3.b), bVar3.c);
            long j7 = bVar3.d;
            ss.b bVar4 = (ss.b) linkedHashMap8.get(qVar2);
            long j8 = j7 - (bVar4 != null ? bVar4.d : 0L);
            if (j8 > 0) {
                ((LinkedHashMap) bVar.F).put(qVar2, Long.valueOf(j8));
                ((LinkedHashMap) bVar.G).put(qVar2, Long.valueOf(j8));
                ((LinkedHashMap) bVar.H).put(qVar2, Long.valueOf(((long) bVar3.e) * j8));
            }
        }
        return (linkedHashMap3.isEmpty() && linkedHashMap2.isEmpty() && linkedHashMap.isEmpty()) ? server : b(server, bVar, i);
    }

    public static v d(v summary, List events, int i) {
        Object objS;
        kotlin.jvm.internal.m.e(summary, "summary");
        kotlin.jvm.internal.m.e(events, "events");
        ui.b bVar = new ui.b(5);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.C;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) bVar.B;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) bVar.E;
        Iterator it = events.iterator();
        while (it.hasNext()) {
            ss.d dVar = (ss.d) it.next();
            ss.e fields = dVar.getFields();
            try {
                objS = OffsetDateTime.parse(fields.g, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            g00.q qVar = null;
            if (objS instanceof g00.m) {
                objS = null;
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) objS;
            if (offsetDateTime != null) {
                LocalDate localDate = offsetDateTime.toLocalDate();
                kotlin.jvm.internal.m.d(localDate, "toLocalDate(...)");
                String strZ = f50.c.z(localDate);
                int hour = offsetDateTime.getHour();
                Integer num = fields.j;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = fields.k;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                if (iIntValue > 0 && iIntValue2 > 0) {
                    qVar = new g00.q(strZ, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                if (dVar.getType() == ss.f.TRACK_CHANGE && qVar != null) {
                    Integer num3 = (Integer) linkedHashMap3.get(qVar);
                    linkedHashMap3.put(qVar, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                }
                int i2 = fields.e;
                if (i2 > 0) {
                    long j = i2;
                    a(linkedHashMap2, strZ, j);
                    a(linkedHashMap, new g00.k(strZ, Integer.valueOf(hour)), j);
                    if (qVar != null) {
                        a((LinkedHashMap) bVar.D, qVar, j);
                    }
                    String str = fields.h;
                    if (str != null && !r30.k.L0(str)) {
                        g00.q qVar2 = new g00.q(strZ, Integer.valueOf(hour), str);
                        a((LinkedHashMap) bVar.F, qVar2, j);
                        Integer num4 = fields.i;
                        if (num4 != null) {
                            int iIntValue3 = num4.intValue();
                            a((LinkedHashMap) bVar.G, qVar2, j);
                            a((LinkedHashMap) bVar.H, qVar2, ((long) iIntValue3) * j);
                        }
                    }
                }
            }
        }
        return (linkedHashMap2.isEmpty() && linkedHashMap.isEmpty() && linkedHashMap3.isEmpty()) ? summary : b(summary, bVar, i);
    }
}
