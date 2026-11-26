package vs;

import g00.b0;
import g00.k;
import h00.d0;
import h00.r;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import m00.i;
import ri.t1;
import ss.v;
import ss.x;
import u00.q;

public final class a extends i implements q {
    public boolean A;
    public v B;
    public long C;
    public int D;

    @Override
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean z = this.A;
        v vVar = this.B;
        long j = this.C;
        int iIntValue = this.D;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (!z || vVar == null) {
            return null;
        }
        x xVar = vVar.d;
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDate localDate = localDateTimeNow.toLocalDate();
        m.d(localDate, "toLocalDate(...)");
        String strZ = f50.c.z(localDate);
        List list = vVar.f;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m.a(((ss.c) next).a, strZ));
        ss.c cVar = (ss.c) next;
        long j2 = cVar != null ? cVar.b : 0L;
        Long lValueOf = Long.valueOf(xVar.a);
        if (!xVar.c.equals(strZ)) {
            lValueOf = null;
        }
        long jMax = Math.max(j2, lValueOf != null ? lValueOf.longValue() : 0L);
        long j3 = j - jMax;
        if (j3 <= 0) {
            return vVar;
        }
        if (cVar != null) {
            int i = cVar.c;
            Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        long j4 = ((long) iIntValue) * 60000;
        int i2 = 0;
        boolean z2 = j4 > 0 && jMax >= j4;
        boolean z3 = j4 > 0 && j >= j4;
        int i3 = vVar.b;
        if (z3 && !z2) {
            i2 = 1;
        }
        int i4 = i3 + i2;
        int iMax = Math.max(vVar.c, i4);
        x xVarA = x.a(xVar, j, 0, strZ, 2);
        long j5 = vVar.e + j3;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int i5 = i4;
            if (!m.a(((ss.c) obj2).a, strZ)) {
                arrayList.add(obj2);
            }
            i4 = i5;
        }
        int i6 = i4;
        ArrayList arrayListZ0 = h00.q.Z0(new ss.c(strZ, j, iIntValue), arrayList);
        List listN1 = vVar.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int hour = localDateTimeNow.getHour();
        long minute = ((((long) localDateTimeNow.getMinute()) * 60) + ((long) localDateTimeNow.getSecond())) * 1000;
        while (j3 > 0 && hour >= 0) {
            long jMin = Math.min(j3, minute);
            if (jMin > 0) {
                linkedHashMap.put(Integer.valueOf(hour), Long.valueOf(jMin));
            }
            j3 -= jMin;
            hour--;
            minute = 3600000;
        }
        if (!linkedHashMap.isEmpty()) {
            int iP = d0.P(r.q0(listN1, 10));
            if (iP < 16) {
                iP = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP);
            for (Object obj3 : listN1) {
                ss.i iVar = (ss.i) obj3;
                linkedHashMap2.put(new k(iVar.a, Integer.valueOf(iVar.b)), obj3);
            }
            LinkedHashMap linkedHashMapB0 = d0.b0(linkedHashMap2);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                int iIntValue2 = ((Number) entry.getKey()).intValue();
                long jLongValue = ((Number) entry.getValue()).longValue();
                k kVar = new k(strZ, Integer.valueOf(iIntValue2));
                ss.i iVar2 = (ss.i) linkedHashMapB0.get(kVar);
                Iterator it3 = it2;
                long j6 = (iVar2 != null ? iVar2.c : 0L) + jLongValue;
                if (j6 > 3600000) {
                    j6 = 3600000;
                }
                linkedHashMapB0.put(kVar, new ss.i(strZ, j6, iIntValue2));
                it2 = it3;
            }
            listN1 = h00.q.n1(linkedHashMapB0.values());
        }
        return v.a(vVar, 0, i6, iMax, xVarA, j5, arrayListZ0, listN1, null, null, null, 3969);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        int iIntValue = ((Number) obj4).intValue();
        a aVar = new a(5, (k00.c) obj5);
        aVar.A = zBooleanValue;
        aVar.B = (v) obj2;
        aVar.C = jLongValue;
        aVar.D = iIntValue;
        return aVar.invokeSuspend(b0.a);
    }
}
