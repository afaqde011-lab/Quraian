package tf;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.r7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends t3 {
    public String E;
    public HashSet F;
    public u.e G;
    public Long H;
    public Long I;

    @Override
    public final void Y0() {
    }

    public final ArrayList Z0(String str, List list, List list2, Long l, Long l10, boolean z10) throws Throwable {
        boolean z11;
        boolean z12;
        String str2;
        Map map;
        h1 h1VarZ0;
        ?? r7;
        Cursor cursorQuery;
        h1 h1Var;
        String str3;
        Object obj;
        ?? r21;
        Map map2;
        String str4;
        h1 h1Var2;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        com.google.android.gms.internal.measurement.l3 l3Var;
        BitSet bitSet;
        BitSet bitSet2;
        u.e eVar;
        com.google.android.gms.internal.measurement.l3 l3Var2;
        u.e eVar2;
        List<com.google.android.gms.internal.measurement.n1> list3;
        long jLongValue;
        Integer numValueOf;
        int i10;
        boolean z13;
        Iterator it;
        com.google.android.gms.internal.measurement.n3 n3Var;
        Long lValueOf;
        m mVarD0;
        String str6;
        ?? eVar3;
        ?? r10;
        Cursor cursorRawQuery;
        ?? r4;
        u.e eVar4;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.l3 l3Var3;
        List list4;
        ?? r17;
        Iterator it3;
        h1 h1Var3;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        m mVarD1;
        h1 h1Var4;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        u.s0 s0Var;
        String strR;
        Map map6;
        Iterator it5;
        Iterator it6;
        u.s0 s0Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        u.s0 s0Var3;
        Map map7;
        com.google.android.gms.internal.measurement.u1 u1Var;
        Integer numValueOf3;
        b bVar;
        int i11;
        Integer numValueOf4;
        h1 h1Var5;
        String str9;
        u.e eVar5;
        Cursor cursor;
        h1 h1Var6;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        b50.n nVar;
        ?? eVar6;
        com.google.android.gms.internal.measurement.a3 a3VarD;
        q qVarB1;
        long j9;
        String strS;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zA;
        Map map9;
        b50.n nVar2;
        Integer num3;
        b bVar2;
        int iQ;
        h4 h4Var;
        boolean z14;
        String str11;
        u.e eVar7;
        ?? r11;
        String str12;
        ?? r12;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        u.e eVar8;
        int i12;
        ?? r13;
        ?? r14;
        ?? r18;
        ?? r19;
        List arrayList5;
        h1 h1Var7 = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.h(list);
        com.google.android.gms.common.internal.d0.h(list2);
        this.E = str;
        this.F = new HashSet();
        this.G = new u.e();
        this.H = l;
        this.I = l10;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.a3) it9.next()).s())) {
                z11 = true;
                break;
            }
        }
        r7.a();
        boolean zF1 = h1Var7.D.f1(this.E, b0.F0);
        r7.a();
        boolean zF2 = h1Var7.D.f1(this.E, b0.E0);
        y3 y3Var = this.C;
        if (z11) {
            m mVarD2 = y3Var.d0();
            String str13 = this.E;
            mVarD2.W0();
            mVarD2.V0();
            com.google.android.gms.common.internal.d0.e(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                mVarD2.K1().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e3) {
                ((h1) mVarD2.B).t().Z0().d("Error resetting session-scoped event counts. appId", q0.d1(str13), e3);
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objD1 = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zF2 && zF1) {
                        m mVarD3 = y3Var.d0();
                        h1 h1Var8 = (h1) mVarD3.B;
                        String str16 = this.E;
                        com.google.android.gms.common.internal.d0.e(str16);
                        z12 = z11;
                        u.e eVar9 = new u.e();
                        try {
                            ?? Query2 = mVarD3.K1().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r110 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query2.getBlob(1))).e();
                                                    if (n1Var.v()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) eVar9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            eVar9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(n1Var);
                                                        r110 = Query2;
                                                    } else {
                                                        r110 = Query2;
                                                    }
                                                } catch (IOException e10) {
                                                    r110 = Query2;
                                                    h1Var8.t().Z0().d("Failed to merge filter. appId", q0.d1(str16), e10);
                                                }
                                                try {
                                                    if (!r110.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r110;
                                                    r110 = r110;
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    r19 = r110;
                                                    r14 = r19;
                                                    try {
                                                        h1Var8.t().Z0().d("Database error querying filters. appId", q0.d1(str16), e);
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r14 != 0) {
                                                            r14.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (r14 != 0) {
                                                            r14.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r18 = r110;
                                                    r14 = r18;
                                                    if (r14 != 0) {
                                                        r14.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                r19 = Query2;
                                                r14 = r19;
                                                h1Var8.t().Z0().d("Database error querying filters. appId", q0.d1(str16), e);
                                                map10 = Collections.EMPTY_MAP;
                                                if (r14 != 0) {
                                                    r14.close();
                                                }
                                                map = map10;
                                                m mVarD4 = y3Var.d0();
                                                h1VarZ0 = (h1) mVarD4.B;
                                                r7 = this.E;
                                                mVarD4.W0();
                                                mVarD4.V0();
                                                com.google.android.gms.common.internal.d0.e(r7);
                                                cursorQuery = mVarD4.K1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r7}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    eVar8 = new u.e();
                                                    h1Var = h1VarZ0;
                                                    r21 = r7;
                                                    while (true) {
                                                        try {
                                                            i12 = cursorQuery.getInt(0);
                                                            try {
                                                                com.google.android.gms.internal.measurement.l3 l3Var4 = (com.google.android.gms.internal.measurement.l3) ((com.google.android.gms.internal.measurement.k3) t0.I1(com.google.android.gms.internal.measurement.l3.x(), cursorQuery.getBlob(1))).e();
                                                                h1VarZ0 = Integer.valueOf(i12);
                                                                eVar8.put(h1VarZ0, l3Var4);
                                                                str3 = str14;
                                                                obj = objD1;
                                                                r13 = r21;
                                                            } catch (IOException e13) {
                                                                h1VarZ0 = h1Var.t().Z0();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj = objD1;
                                                                try {
                                                                    objD1 = q0.d1(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i12);
                                                                    h1VarZ0.e("Failed to merge filter results. appId, audienceId, error", objD1, numValueOf8, e13);
                                                                    r13 = numValueOf8;
                                                                } catch (SQLiteException e14) {
                                                                    e = e14;
                                                                    r21 = r21;
                                                                    h1Var.t().Z0().d("Database error querying filter results. appId", q0.d1(r21), e);
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        h1Var2 = h1Var7;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z12) {
                                                                            String str17 = this.E;
                                                                            mVarD0 = y3Var.d0();
                                                                            str6 = this.E;
                                                                            mVarD0.W0();
                                                                            mVarD0.V0();
                                                                            com.google.android.gms.common.internal.d0.e(str6);
                                                                            eVar3 = new u.e();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = mVarD0.K1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    eVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            eVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        ((h1) mVarD0.B).t().Z0().d("Database error querying scoped filters. appId", q0.d1(str6), e);
                                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                                        r4 = eVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        com.google.android.gms.common.internal.d0.e(str17);
                                                                                        eVar4 = new u.e();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                                                                                                list4 = (List) r4.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r17 = r4;
                                                                                                it3 = it2;
                                                                                                h1Var3 = h1Var7;
                                                                                                eVar4.put(num, l3Var3);
                                                                                                r4 = r17;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                h1Var7 = h1Var3;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        h1Var2 = h1Var7;
                                                                                        map3 = eVar4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            eVar = new u.e();
                                                                                            if (l3Var != null) {
                                                                                                for (com.google.android.gms.internal.measurement.y2 y2Var : l3Var.t()) {
                                                                                                    if (y2Var.p()) {
                                                                                                        com.google.android.gms.internal.measurement.l3 l3Var5 = l3Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(y2Var.q());
                                                                                                        if (y2Var.r()) {
                                                                                                            lValueOf = Long.valueOf(y2Var.s());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        eVar.put(numValueOf9, lValueOf);
                                                                                                        l3Var = l3Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            l3Var2 = l3Var;
                                                                                            eVar2 = new u.e();
                                                                                            if (l3Var2 != null) {
                                                                                                it = l3Var2.v().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                                                                                                    if (!n3Var.p()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (l3Var2 != null) {
                                                                                                i10 = 0;
                                                                                                while (i10 < l3Var2.q() * 64) {
                                                                                                    if (t0.C1((j5) l3Var2.p(), i10)) {
                                                                                                        z13 = zF1;
                                                                                                        h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                                        bitSet2.set(i10);
                                                                                                        if (t0.C1((j5) l3Var2.r(), i10)) {
                                                                                                            bitSet.set(i10);
                                                                                                        }
                                                                                                        i10++;
                                                                                                        zF1 = z13;
                                                                                                    } else {
                                                                                                        z13 = zF1;
                                                                                                    }
                                                                                                    eVar.remove(Integer.valueOf(i10));
                                                                                                    i10++;
                                                                                                    zF1 = z13;
                                                                                                }
                                                                                            }
                                                                                            boolean z15 = zF1;
                                                                                            com.google.android.gms.internal.measurement.l3 l3Var6 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                                                                                            if (zF2) {
                                                                                                for (com.google.android.gms.internal.measurement.n1 n1Var2 : list3) {
                                                                                                    int iQ2 = n1Var2.q();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.I.longValue() / 1000;
                                                                                                    if (n1Var2.y()) {
                                                                                                        jLongValue = this.H.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iQ2);
                                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.G.put(num4, new h4(this, this.E, l3Var6, bitSet, bitSet2, eVar, eVar2));
                                                                                            map = map;
                                                                                            zF1 = z15;
                                                                                            map4 = map4;
                                                                                            zF2 = zF2;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r15 = obj;
                                                                                        if (!list.isEmpty()) {
                                                                                            nVar = new b50.n(this);
                                                                                            eVar6 = new u.e();
                                                                                            for (com.google.android.gms.internal.measurement.a3 a3Var : list) {
                                                                                                a3VarD = nVar.d(a3Var, this.E);
                                                                                                if (a3VarD != null) {
                                                                                                    qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                                                                                                    y3Var.d0().u1("events", qVarB1);
                                                                                                    if (z10) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j9 = qVarB1.f14685c;
                                                                                                        strS = a3VarD.s();
                                                                                                        map8 = (Map) eVar6.get(strS);
                                                                                                        if (map8 == null) {
                                                                                                            m mVarD5 = y3Var.d0();
                                                                                                            h1 h1Var9 = (h1) mVarD5.B;
                                                                                                            str11 = this.E;
                                                                                                            mVarD5.W0();
                                                                                                            mVarD5.V0();
                                                                                                            com.google.android.gms.common.internal.d0.e(str11);
                                                                                                            com.google.android.gms.common.internal.d0.e(strS);
                                                                                                            eVar7 = new u.e();
                                                                                                            try {
                                                                                                                Query = mVarD5.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        com.google.android.gms.internal.measurement.n1 n1Var3 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e16) {
                                                                                                                                                e = e16;
                                                                                                                                                r45 = r46;
                                                                                                                                                r12 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    h1Var9.t().Z0().d((String) r15, q0.d1(str12), e);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r12 != 0) {
                                                                                                                                                        r12.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th4) {
                                                                                                                                                    th = th4;
                                                                                                                                                    r11 = r12;
                                                                                                                                                    if (r11 != 0) {
                                                                                                                                                        r11.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th5) {
                                                                                                                                                th = th5;
                                                                                                                                                r44 = r46;
                                                                                                                                                r11 = r44;
                                                                                                                                                if (r11 != 0) {
                                                                                                                                                    r11.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(n1Var3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e17) {
                                                                                                                                        r47 = Query;
                                                                                                                                        h1Var9.t().Z0().d(str18, q0.d1(str12), e17);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e18) {
                                                                                                                                    e = e18;
                                                                                                                                    r45 = Query;
                                                                                                                                    r12 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    h1Var9.t().Z0().d((String) r15, q0.d1(str12), e);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r12 != 0) {
                                                                                                                                        r12.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    eVar6.put(strS, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.F.contains(num6)) {
                                                                                                                                            h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    nVar2 = nVar;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                com.google.android.gms.internal.measurement.n1 n1Var4 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                                                                                                                nVar2 = nVar;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                bVar2 = new b(this, this.E, iIntValue2, n1Var4, 0);
                                                                                                                                                Long l11 = this.H;
                                                                                                                                                Long l12 = this.I;
                                                                                                                                                iQ = n1Var4.q();
                                                                                                                                                h4Var = (h4) this.G.get(num3);
                                                                                                                                                if (h4Var == null) {
                                                                                                                                                    z14 = false;
                                                                                                                                                } else {
                                                                                                                                                    z14 = h4Var.f14633d.get(iQ);
                                                                                                                                                }
                                                                                                                                                zA = bVar2.a(l11, l12, a3VarD, j9, qVarB1, z14);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.F.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                a1(num3).a(bVar2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                nVar = nVar2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.F.add(num3);
                                                                                                                                            }
                                                                                                                                            nVar = nVar2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = eVar7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e19) {
                                                                                                                        e = e19;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th6) {
                                                                                                                    th = th6;
                                                                                                                    r44 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e20) {
                                                                                                                e = e20;
                                                                                                                str12 = str11;
                                                                                                                r12 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th7) {
                                                                                                                th = th7;
                                                                                                                r11 = 0;
                                                                                                            }
                                                                                                            eVar6.put(strS, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.F.contains(num6)) {
                                                                                                                h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        nVar2 = nVar;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    com.google.android.gms.internal.measurement.n1 n1Var5 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                                                                                    nVar2 = nVar;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    bVar2 = new b(this, this.E, iIntValue2, n1Var5, 0);
                                                                                                                    Long l13 = this.H;
                                                                                                                    Long l14 = this.I;
                                                                                                                    iQ = n1Var5.q();
                                                                                                                    h4Var = (h4) this.G.get(num3);
                                                                                                                    if (h4Var == null) {
                                                                                                                        z14 = false;
                                                                                                                    } else {
                                                                                                                        z14 = h4Var.f14633d.get(iQ);
                                                                                                                    }
                                                                                                                    zA = bVar2.a(l13, l14, a3VarD, j9, qVarB1, z14);
                                                                                                                    if (!zA) {
                                                                                                                        this.F.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    a1(num3).a(bVar2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    nVar = nVar2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.F.add(num3);
                                                                                                                }
                                                                                                                nVar = nVar2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z10) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            u.e eVar10 = new u.e();
                                                                                            it4 = list2.iterator();
                                                                                            s0Var = eVar10;
                                                                                            while (it4.hasNext()) {
                                                                                                com.google.android.gms.internal.measurement.r3 r3Var = (com.google.android.gms.internal.measurement.r3) it4.next();
                                                                                                strR = r3Var.r();
                                                                                                map6 = (Map) s0Var.get(strR);
                                                                                                if (map6 == null) {
                                                                                                    m mVarD6 = y3Var.d0();
                                                                                                    h1Var5 = (h1) mVarD6.B;
                                                                                                    str9 = this.E;
                                                                                                    mVarD6.W0();
                                                                                                    mVarD6.V0();
                                                                                                    com.google.android.gms.common.internal.d0.e(str9);
                                                                                                    com.google.android.gms.common.internal.d0.e(strR);
                                                                                                    eVar5 = new u.e();
                                                                                                    try {
                                                                                                        cursorQuery2 = mVarD6.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                com.google.android.gms.internal.measurement.u1 u1Var2 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    h1Var6 = h1Var5;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e21) {
                                                                                                                                        e = e21;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            h1Var6.t().Z0().d((String) r15, q0.d1(str10), e);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            s0Var.put(strR, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            s0Var2 = s0Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.F.contains(num2)) {
                                                                                                                                                    h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                s0Var3 = s0Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                                                                                                            b50.b bVarC1 = h1Var2.t().c1();
                                                                                                                                                            if (u1Var.p()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            bVarC1.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                                                                                                            h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (u1Var.p()) {
                                                                                                                                                        }
                                                                                                                                                        b50.b bVarA1 = h1Var2.t().a1();
                                                                                                                                                        p0 p0VarD1 = q0.d1(this.E);
                                                                                                                                                        if (u1Var.p()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        bVarA1.d("Invalid property filter ID. appId, id", p0VarD1, String.valueOf(numValueOf3));
                                                                                                                                                        this.F.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        s0Var2 = s0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        s0Var3 = s0Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.F.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    s0Var2 = s0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    a1(num2).a(bVar);
                                                                                                                                                    iIntValue = i11;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    s0Var3 = s0Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            s0Var = s0Var2;
                                                                                                                                        } catch (Throwable th8) {
                                                                                                                                            th = th8;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    h1Var6 = h1Var5;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(u1Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e22) {
                                                                                                                                h1Var6 = h1Var5;
                                                                                                                                str10 = str9;
                                                                                                                                h1Var6.t().Z0().d("Failed to merge filter", q0.d1(str10), e22);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                h1Var5 = h1Var6;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e23) {
                                                                                                                                e = e23;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                h1Var6.t().Z0().d((String) r15, q0.d1(str10), e);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e24) {
                                                                                                                            e = e24;
                                                                                                                            h1Var6 = h1Var5;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            h1Var6.t().Z0().d((String) r15, q0.d1(str10), e);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            s0Var.put(strR, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            s0Var2 = s0Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.F.contains(num2)) {
                                                                                                                                    h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                s0Var3 = s0Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                                                                                            b50.b bVarC2 = h1Var2.t().c1();
                                                                                                                                            if (u1Var.p()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            bVarC2.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                                                                                            h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (u1Var.p()) {
                                                                                                                                        }
                                                                                                                                        b50.b bVarA2 = h1Var2.t().a1();
                                                                                                                                        p0 p0VarD2 = q0.d1(this.E);
                                                                                                                                        if (u1Var.p()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        bVarA2.d("Invalid property filter ID. appId, id", p0VarD2, String.valueOf(numValueOf3));
                                                                                                                                        this.F.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        s0Var2 = s0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        s0Var3 = s0Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.F.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    s0Var2 = s0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    a1(num2).a(bVar);
                                                                                                                                    iIntValue = i11;
                                                                                                                                    map6 = map7;
                                                                                                                                    s0Var3 = s0Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            s0Var = s0Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = eVar5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e25) {
                                                                                                            e = e25;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e26) {
                                                                                                        e = e26;
                                                                                                        it5 = it4;
                                                                                                        h1Var6 = h1Var5;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th10) {
                                                                                                        th = th10;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    s0Var.put(strR, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                s0Var2 = s0Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.F.contains(num2)) {
                                                                                                        h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    s0Var3 = s0Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                                                                b50.b bVarC3 = h1Var2.t().c1();
                                                                                                                if (u1Var.p()) {
                                                                                                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                bVarC3.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                                                                h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                                                            }
                                                                                                            if (u1Var.p()) {
                                                                                                            }
                                                                                                            b50.b bVarA3 = h1Var2.t().a1();
                                                                                                            p0 p0VarD3 = q0.d1(this.E);
                                                                                                            if (u1Var.p()) {
                                                                                                                numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            bVarA3.d("Invalid property filter ID. appId, id", p0VarD3, String.valueOf(numValueOf3));
                                                                                                            this.F.add(num2);
                                                                                                            map6 = map7;
                                                                                                            s0Var2 = s0Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            s0Var3 = s0Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.F.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        s0Var2 = s0Var3;
                                                                                                        it6 = it6;
                                                                                                        a1(num2).a(bVar);
                                                                                                        iIntValue = i11;
                                                                                                        map6 = map7;
                                                                                                        s0Var3 = s0Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                s0Var = s0Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        u.b<Integer> bVar3 = (u.b) this.G.keySet();
                                                                                        bVar3.removeAll(this.F);
                                                                                        for (Integer num7 : bVar3) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            h4 h4Var2 = (h4) this.G.get(num7);
                                                                                            com.google.android.gms.common.internal.d0.h(h4Var2);
                                                                                            com.google.android.gms.internal.measurement.s2 s2VarB = h4Var2.b(iIntValue3);
                                                                                            arrayList2.add(s2VarB);
                                                                                            mVarD1 = y3Var.d0();
                                                                                            h1Var4 = (h1) mVarD1.B;
                                                                                            str8 = this.E;
                                                                                            com.google.android.gms.internal.measurement.l3 l3VarR = s2VarB.r();
                                                                                            mVarD1.W0();
                                                                                            mVarD1.V0();
                                                                                            com.google.android.gms.common.internal.d0.e(str8);
                                                                                            com.google.android.gms.common.internal.d0.h(l3VarR);
                                                                                            byte[] bArrA = l3VarR.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e27) {
                                                                                                    e = e27;
                                                                                                    h1Var4.t().Z0().d("Error storing filter results. appId", q0.d1(str8), e);
                                                                                                }
                                                                                            } catch (SQLiteException e28) {
                                                                                                e = e28;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e29) {
                                                                                    e = e29;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    r10 = 0;
                                                                                    if (r10 != 0) {
                                                                                        r10.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r4 = eVar3;
                                                                                com.google.android.gms.common.internal.d0.e(str17);
                                                                                eVar4 = new u.e();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                                                                                        list4 = (List) r4.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r17 = r4;
                                                                                        it3 = it2;
                                                                                        h1Var3 = h1Var7;
                                                                                        eVar4.put(num, l3Var3);
                                                                                        r4 = r17;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        h1Var7 = h1Var3;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                h1Var2 = h1Var7;
                                                                                map3 = eVar4;
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                r10 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            h1Var2 = h1Var7;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            eVar = new u.e();
                                                                            if (l3Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (y2Var.p()) {
                                                                                        com.google.android.gms.internal.measurement.l3 l3Var7 = l3Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(y2Var.q());
                                                                                        if (y2Var.r()) {
                                                                                            lValueOf = Long.valueOf(y2Var.s());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        eVar.put(numValueOf10, lValueOf);
                                                                                        l3Var = l3Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            l3Var2 = l3Var;
                                                                            eVar2 = new u.e();
                                                                            if (l3Var2 != null) {
                                                                                it = l3Var2.v().iterator();
                                                                                while (it.hasNext()) {
                                                                                    n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                                                                                    if (!n3Var.p()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (l3Var2 != null) {
                                                                                i10 = 0;
                                                                                while (i10 < l3Var2.q() * 64) {
                                                                                    if (t0.C1((j5) l3Var2.p(), i10)) {
                                                                                        z13 = zF1;
                                                                                        h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                        bitSet2.set(i10);
                                                                                        if (t0.C1((j5) l3Var2.r(), i10)) {
                                                                                            bitSet.set(i10);
                                                                                        }
                                                                                        i10++;
                                                                                        zF1 = z13;
                                                                                    } else {
                                                                                        z13 = zF1;
                                                                                    }
                                                                                    eVar.remove(Integer.valueOf(i10));
                                                                                    i10++;
                                                                                    zF1 = z13;
                                                                                }
                                                                            }
                                                                            boolean z16 = zF1;
                                                                            com.google.android.gms.internal.measurement.l3 l3Var8 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                                                                            if (zF2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iQ3 = n1Var2.q();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.I.longValue() / 1000;
                                                                                    if (n1Var2.y()) {
                                                                                        jLongValue = this.H.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iQ3);
                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.G.put(num4, new h4(this, this.E, l3Var8, bitSet, bitSet2, eVar, eVar2));
                                                                            map = map;
                                                                            zF1 = z16;
                                                                            map4 = map4;
                                                                            zF2 = zF2;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r16 = obj;
                                                                    if (!list.isEmpty()) {
                                                                        nVar = new b50.n(this);
                                                                        eVar6 = new u.e();
                                                                        while (r17.hasNext()) {
                                                                            a3VarD = nVar.d(a3Var, this.E);
                                                                            if (a3VarD != null) {
                                                                                qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                                                                                y3Var.d0().u1("events", qVarB1);
                                                                                if (z10) {
                                                                                    j9 = qVarB1.f14685c;
                                                                                    strS = a3VarD.s();
                                                                                    map8 = (Map) eVar6.get(strS);
                                                                                    if (map8 == null) {
                                                                                        m mVarD7 = y3Var.d0();
                                                                                        h1 h1Var10 = (h1) mVarD7.B;
                                                                                        str11 = this.E;
                                                                                        mVarD7.W0();
                                                                                        mVarD7.V0();
                                                                                        com.google.android.gms.common.internal.d0.e(str11);
                                                                                        com.google.android.gms.common.internal.d0.e(strS);
                                                                                        eVar7 = new u.e();
                                                                                        Query = mVarD7.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                com.google.android.gms.internal.measurement.n1 n1Var6 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) eVar7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    eVar7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(n1Var6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = eVar7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        eVar6.put(strS, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.F.contains(num6)) {
                                                                                            h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    nVar2 = nVar;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.n1 n1Var7 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                                                                nVar2 = nVar;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                bVar2 = new b(this, this.E, iIntValue2, n1Var7, 0);
                                                                                                Long l15 = this.H;
                                                                                                Long l16 = this.I;
                                                                                                iQ = n1Var7.q();
                                                                                                h4Var = (h4) this.G.get(num3);
                                                                                                if (h4Var == null) {
                                                                                                    z14 = false;
                                                                                                } else {
                                                                                                    z14 = h4Var.f14633d.get(iQ);
                                                                                                }
                                                                                                zA = bVar2.a(l15, l16, a3VarD, j9, qVarB1, z14);
                                                                                                if (!zA) {
                                                                                                    this.F.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                a1(num3).a(bVar2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                nVar = nVar2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.F.add(num3);
                                                                                            }
                                                                                            nVar = nVar2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        u.e eVar11 = new u.e();
                                                                        it4 = list2.iterator();
                                                                        s0Var = eVar11;
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) it4.next();
                                                                            strR = r3Var2.r();
                                                                            map6 = (Map) s0Var.get(strR);
                                                                            if (map6 == null) {
                                                                                m mVarD8 = y3Var.d0();
                                                                                h1Var5 = (h1) mVarD8.B;
                                                                                str9 = this.E;
                                                                                mVarD8.W0();
                                                                                mVarD8.V0();
                                                                                com.google.android.gms.common.internal.d0.e(str9);
                                                                                com.google.android.gms.common.internal.d0.e(strR);
                                                                                eVar5 = new u.e();
                                                                                cursorQuery2 = mVarD8.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        com.google.android.gms.internal.measurement.u1 u1Var3 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) eVar5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            h1Var6 = h1Var5;
                                                                                            arrayList3 = new ArrayList();
                                                                                            eVar5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            h1Var6 = h1Var5;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(u1Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        h1Var5 = h1Var6;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = eVar5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                s0Var.put(strR, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            s0Var2 = s0Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.F.contains(num2)) {
                                                                                    h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                s0Var3 = s0Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                                            b50.b bVarC4 = h1Var2.t().c1();
                                                                                            if (u1Var.p()) {
                                                                                                numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            bVarC4.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                                            h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                                        }
                                                                                        if (u1Var.p()) {
                                                                                        }
                                                                                        b50.b bVarA4 = h1Var2.t().a1();
                                                                                        p0 p0VarD4 = q0.d1(this.E);
                                                                                        if (u1Var.p()) {
                                                                                            numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        bVarA4.d("Invalid property filter ID. appId, id", p0VarD4, String.valueOf(numValueOf3));
                                                                                        this.F.add(num2);
                                                                                        map6 = map7;
                                                                                        s0Var2 = s0Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        s0Var3 = s0Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.F.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    s0Var2 = s0Var3;
                                                                                    it6 = it6;
                                                                                    a1(num2).a(bVar);
                                                                                    iIntValue = i11;
                                                                                    map6 = map7;
                                                                                    s0Var3 = s0Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            s0Var = s0Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    u.b<Integer> bVar4 = (u.b) this.G.keySet();
                                                                    bVar4.removeAll(this.F);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        h4 h4Var3 = (h4) this.G.get(num7);
                                                                        com.google.android.gms.common.internal.d0.h(h4Var3);
                                                                        com.google.android.gms.internal.measurement.s2 s2VarB2 = h4Var3.b(iIntValue4);
                                                                        arrayList2.add(s2VarB2);
                                                                        mVarD1 = y3Var.d0();
                                                                        h1Var4 = (h1) mVarD1.B;
                                                                        str8 = this.E;
                                                                        com.google.android.gms.internal.measurement.l3 l3VarR2 = s2VarB2.r();
                                                                        mVarD1.W0();
                                                                        mVarD1.V0();
                                                                        com.google.android.gms.common.internal.d0.e(str8);
                                                                        com.google.android.gms.common.internal.d0.h(l3VarR2);
                                                                        byte[] bArrA2 = l3VarR2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objD1 = obj;
                                                                r21 = r21;
                                                            } catch (SQLiteException e30) {
                                                                e = e30;
                                                                h1Var.t().Z0().d("Database error querying filter results. appId", q0.d1(r21), e);
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e31) {
                                                            e = e31;
                                                            r21 = r21;
                                                            str3 = str14;
                                                            obj = objD1;
                                                            r21 = r21;
                                                            h1Var.t().Z0().d("Database error querying filter results. appId", q0.d1(r21), e);
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                h1Var2 = h1Var7;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z12) {
                                                                    String str110 = this.E;
                                                                    mVarD0 = y3Var.d0();
                                                                    str6 = this.E;
                                                                    mVarD0.W0();
                                                                    mVarD0.V0();
                                                                    com.google.android.gms.common.internal.d0.e(str6);
                                                                    eVar3 = new u.e();
                                                                    cursorRawQuery = mVarD0.K1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) eVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                eVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r4 = eVar3;
                                                                    com.google.android.gms.common.internal.d0.e(str110);
                                                                    eVar4 = new u.e();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                                                                            list4 = (List) r4.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r17 = r4;
                                                                            it3 = it2;
                                                                            h1Var3 = h1Var7;
                                                                            eVar4.put(num, l3Var3);
                                                                            r4 = r17;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            h1Var7 = h1Var3;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    h1Var2 = h1Var7;
                                                                    map3 = eVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    h1Var2 = h1Var7;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    eVar = new u.e();
                                                                    if (l3Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (y2Var.p()) {
                                                                                com.google.android.gms.internal.measurement.l3 l3Var9 = l3Var;
                                                                                Integer numValueOf11 = Integer.valueOf(y2Var.q());
                                                                                if (y2Var.r()) {
                                                                                    lValueOf = Long.valueOf(y2Var.s());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                eVar.put(numValueOf11, lValueOf);
                                                                                l3Var = l3Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    l3Var2 = l3Var;
                                                                    eVar2 = new u.e();
                                                                    if (l3Var2 != null) {
                                                                        it = l3Var2.v().iterator();
                                                                        while (it.hasNext()) {
                                                                            n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                                                                            if (!n3Var.p()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (l3Var2 != null) {
                                                                        i10 = 0;
                                                                        while (i10 < l3Var2.q() * 64) {
                                                                            if (t0.C1((j5) l3Var2.p(), i10)) {
                                                                                z13 = zF1;
                                                                                h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                bitSet2.set(i10);
                                                                                if (t0.C1((j5) l3Var2.r(), i10)) {
                                                                                    bitSet.set(i10);
                                                                                }
                                                                                i10++;
                                                                                zF1 = z13;
                                                                            } else {
                                                                                z13 = zF1;
                                                                            }
                                                                            eVar.remove(Integer.valueOf(i10));
                                                                            i10++;
                                                                            zF1 = z13;
                                                                        }
                                                                    }
                                                                    boolean z17 = zF1;
                                                                    com.google.android.gms.internal.measurement.l3 l3Var10 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                                                                    if (zF2) {
                                                                        while (r2.hasNext()) {
                                                                            int iQ4 = n1Var2.q();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.I.longValue() / 1000;
                                                                            if (n1Var2.y()) {
                                                                                jLongValue = this.H.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iQ4);
                                                                            if (eVar.containsKey(numValueOf)) {
                                                                                eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (eVar2.containsKey(numValueOf)) {
                                                                                eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.G.put(num4, new h4(this, this.E, l3Var10, bitSet, bitSet2, eVar, eVar2));
                                                                    map = map;
                                                                    zF1 = z17;
                                                                    map4 = map4;
                                                                    zF2 = zF2;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r111 = obj;
                                                            if (!list.isEmpty()) {
                                                                nVar = new b50.n(this);
                                                                eVar6 = new u.e();
                                                                while (r17.hasNext()) {
                                                                    a3VarD = nVar.d(a3Var, this.E);
                                                                    if (a3VarD != null) {
                                                                        qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                                                                        y3Var.d0().u1("events", qVarB1);
                                                                        if (z10) {
                                                                            j9 = qVarB1.f14685c;
                                                                            strS = a3VarD.s();
                                                                            map8 = (Map) eVar6.get(strS);
                                                                            if (map8 == null) {
                                                                                m mVarD9 = y3Var.d0();
                                                                                h1 h1Var11 = (h1) mVarD9.B;
                                                                                str11 = this.E;
                                                                                mVarD9.W0();
                                                                                mVarD9.V0();
                                                                                com.google.android.gms.common.internal.d0.e(str11);
                                                                                com.google.android.gms.common.internal.d0.e(strS);
                                                                                eVar7 = new u.e();
                                                                                Query = mVarD9.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        com.google.android.gms.internal.measurement.n1 n1Var8 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            eVar7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(n1Var8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = eVar7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                eVar6.put(strS, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.F.contains(num6)) {
                                                                                    h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            nVar2 = nVar;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        com.google.android.gms.internal.measurement.n1 n1Var9 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                                                        nVar2 = nVar;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        bVar2 = new b(this, this.E, iIntValue2, n1Var9, 0);
                                                                                        Long l17 = this.H;
                                                                                        Long l18 = this.I;
                                                                                        iQ = n1Var9.q();
                                                                                        h4Var = (h4) this.G.get(num3);
                                                                                        if (h4Var == null) {
                                                                                            z14 = false;
                                                                                        } else {
                                                                                            z14 = h4Var.f14633d.get(iQ);
                                                                                        }
                                                                                        zA = bVar2.a(l17, l18, a3VarD, j9, qVarB1, z14);
                                                                                        if (!zA) {
                                                                                            this.F.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        a1(num3).a(bVar2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        nVar = nVar2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.F.add(num3);
                                                                                    }
                                                                                    nVar = nVar2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z10) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                u.e eVar12 = new u.e();
                                                                it4 = list2.iterator();
                                                                s0Var = eVar12;
                                                                while (it4.hasNext()) {
                                                                    com.google.android.gms.internal.measurement.r3 r3Var3 = (com.google.android.gms.internal.measurement.r3) it4.next();
                                                                    strR = r3Var3.r();
                                                                    map6 = (Map) s0Var.get(strR);
                                                                    if (map6 == null) {
                                                                        m mVarD10 = y3Var.d0();
                                                                        h1Var5 = (h1) mVarD10.B;
                                                                        str9 = this.E;
                                                                        mVarD10.W0();
                                                                        mVarD10.V0();
                                                                        com.google.android.gms.common.internal.d0.e(str9);
                                                                        com.google.android.gms.common.internal.d0.e(strR);
                                                                        eVar5 = new u.e();
                                                                        cursorQuery2 = mVarD10.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                com.google.android.gms.internal.measurement.u1 u1Var4 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    h1Var6 = h1Var5;
                                                                                    arrayList3 = new ArrayList();
                                                                                    eVar5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    h1Var6 = h1Var5;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(u1Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                h1Var5 = h1Var6;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = eVar5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        s0Var.put(strR, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    s0Var2 = s0Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.F.contains(num2)) {
                                                                            h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        s0Var3 = s0Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                                    b50.b bVarC5 = h1Var2.t().c1();
                                                                                    if (u1Var.p()) {
                                                                                        numValueOf4 = Integer.valueOf(u1Var.q());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    bVarC5.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                                    h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                                }
                                                                                if (u1Var.p()) {
                                                                                }
                                                                                b50.b bVarA5 = h1Var2.t().a1();
                                                                                p0 p0VarD5 = q0.d1(this.E);
                                                                                if (u1Var.p()) {
                                                                                    numValueOf3 = Integer.valueOf(u1Var.q());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                bVarA5.d("Invalid property filter ID. appId, id", p0VarD5, String.valueOf(numValueOf3));
                                                                                this.F.add(num2);
                                                                                map6 = map7;
                                                                                s0Var2 = s0Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                s0Var3 = s0Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.F.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            s0Var2 = s0Var3;
                                                                            it6 = it6;
                                                                            a1(num2).a(bVar);
                                                                            iIntValue = i11;
                                                                            map6 = map7;
                                                                            s0Var3 = s0Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    s0Var = s0Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            u.b<Integer> bVar5 = (u.b) this.G.keySet();
                                                            bVar5.removeAll(this.F);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                h4 h4Var4 = (h4) this.G.get(num7);
                                                                com.google.android.gms.common.internal.d0.h(h4Var4);
                                                                com.google.android.gms.internal.measurement.s2 s2VarB3 = h4Var4.b(iIntValue5);
                                                                arrayList2.add(s2VarB3);
                                                                mVarD1 = y3Var.d0();
                                                                h1Var4 = (h1) mVarD1.B;
                                                                str8 = this.E;
                                                                com.google.android.gms.internal.measurement.l3 l3VarR3 = s2VarB3.r();
                                                                mVarD1.W0();
                                                                mVarD1.V0();
                                                                com.google.android.gms.common.internal.d0.e(str8);
                                                                com.google.android.gms.common.internal.d0.h(l3VarR3);
                                                                byte[] bArrA3 = l3VarR3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    r7 = r13;
                                                    map2 = eVar8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj = "Database error querying filters. appId";
                                                    r7 = r7;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    h1Var2 = h1Var7;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str112 = this.E;
                                                        mVarD0 = y3Var.d0();
                                                        str6 = this.E;
                                                        mVarD0.W0();
                                                        mVarD0.V0();
                                                        com.google.android.gms.common.internal.d0.e(str6);
                                                        eVar3 = new u.e();
                                                        cursorRawQuery = mVarD0.K1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    eVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            eVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r4 = eVar3;
                                                        com.google.android.gms.common.internal.d0.e(str112);
                                                        eVar4 = new u.e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                                                                list4 = (List) r4.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r17 = r4;
                                                                it3 = it2;
                                                                h1Var3 = h1Var7;
                                                                eVar4.put(num, l3Var3);
                                                                r4 = r17;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                h1Var7 = h1Var3;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        h1Var2 = h1Var7;
                                                        map3 = eVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        h1Var2 = h1Var7;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        eVar = new u.e();
                                                        if (l3Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (y2Var.p()) {
                                                                    com.google.android.gms.internal.measurement.l3 l3Var11 = l3Var;
                                                                    Integer numValueOf12 = Integer.valueOf(y2Var.q());
                                                                    if (y2Var.r()) {
                                                                        lValueOf = Long.valueOf(y2Var.s());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    eVar.put(numValueOf12, lValueOf);
                                                                    l3Var = l3Var11;
                                                                }
                                                            }
                                                        }
                                                        l3Var2 = l3Var;
                                                        eVar2 = new u.e();
                                                        if (l3Var2 != null) {
                                                            it = l3Var2.v().iterator();
                                                            while (it.hasNext()) {
                                                                n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                                                                if (!n3Var.p()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (l3Var2 != null) {
                                                            i10 = 0;
                                                            while (i10 < l3Var2.q() * 64) {
                                                                if (t0.C1((j5) l3Var2.p(), i10)) {
                                                                    z13 = zF1;
                                                                    h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                    bitSet2.set(i10);
                                                                    if (t0.C1((j5) l3Var2.r(), i10)) {
                                                                        bitSet.set(i10);
                                                                    }
                                                                    i10++;
                                                                    zF1 = z13;
                                                                } else {
                                                                    z13 = zF1;
                                                                }
                                                                eVar.remove(Integer.valueOf(i10));
                                                                i10++;
                                                                zF1 = z13;
                                                            }
                                                        }
                                                        boolean z18 = zF1;
                                                        com.google.android.gms.internal.measurement.l3 l3Var12 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                                                        if (zF2) {
                                                            while (r2.hasNext()) {
                                                                int iQ5 = n1Var2.q();
                                                                Integer num10 = num4;
                                                                jLongValue = this.I.longValue() / 1000;
                                                                if (n1Var2.y()) {
                                                                    jLongValue = this.H.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iQ5);
                                                                if (eVar.containsKey(numValueOf)) {
                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (eVar2.containsKey(numValueOf)) {
                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.G.put(num4, new h4(this, this.E, l3Var12, bitSet, bitSet2, eVar, eVar2));
                                                        map = map;
                                                        zF1 = z18;
                                                        map4 = map4;
                                                        zF2 = zF2;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r112 = obj;
                                                if (!list.isEmpty()) {
                                                    nVar = new b50.n(this);
                                                    eVar6 = new u.e();
                                                    while (r17.hasNext()) {
                                                        a3VarD = nVar.d(a3Var, this.E);
                                                        if (a3VarD != null) {
                                                            qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                                                            y3Var.d0().u1("events", qVarB1);
                                                            if (z10) {
                                                                j9 = qVarB1.f14685c;
                                                                strS = a3VarD.s();
                                                                map8 = (Map) eVar6.get(strS);
                                                                if (map8 == null) {
                                                                    m mVarD11 = y3Var.d0();
                                                                    h1 h1Var12 = (h1) mVarD11.B;
                                                                    str11 = this.E;
                                                                    mVarD11.W0();
                                                                    mVarD11.V0();
                                                                    com.google.android.gms.common.internal.d0.e(str11);
                                                                    com.google.android.gms.common.internal.d0.e(strS);
                                                                    eVar7 = new u.e();
                                                                    Query = mVarD11.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.n1 n1Var10 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) eVar7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(n1Var10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = eVar7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    eVar6.put(strS, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.F.contains(num6)) {
                                                                        h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                nVar2 = nVar;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.n1 n1Var11 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                                            nVar2 = nVar;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            bVar2 = new b(this, this.E, iIntValue2, n1Var11, 0);
                                                                            Long l19 = this.H;
                                                                            Long l110 = this.I;
                                                                            iQ = n1Var11.q();
                                                                            h4Var = (h4) this.G.get(num3);
                                                                            if (h4Var == null) {
                                                                                z14 = false;
                                                                            } else {
                                                                                z14 = h4Var.f14633d.get(iQ);
                                                                            }
                                                                            zA = bVar2.a(l19, l110, a3VarD, j9, qVarB1, z14);
                                                                            if (!zA) {
                                                                                this.F.add(num3);
                                                                                break;
                                                                            }
                                                                            a1(num3).a(bVar2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            nVar = nVar2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.F.add(num3);
                                                                        }
                                                                        nVar = nVar2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    u.e eVar13 = new u.e();
                                                    it4 = list2.iterator();
                                                    s0Var = eVar13;
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.r3 r3Var4 = (com.google.android.gms.internal.measurement.r3) it4.next();
                                                        strR = r3Var4.r();
                                                        map6 = (Map) s0Var.get(strR);
                                                        if (map6 == null) {
                                                            m mVarD12 = y3Var.d0();
                                                            h1Var5 = (h1) mVarD12.B;
                                                            str9 = this.E;
                                                            mVarD12.W0();
                                                            mVarD12.V0();
                                                            com.google.android.gms.common.internal.d0.e(str9);
                                                            com.google.android.gms.common.internal.d0.e(strR);
                                                            eVar5 = new u.e();
                                                            cursorQuery2 = mVarD12.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.u1 u1Var5 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) eVar5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        h1Var6 = h1Var5;
                                                                        arrayList3 = new ArrayList();
                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        h1Var6 = h1Var5;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(u1Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    h1Var5 = h1Var6;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = eVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            s0Var.put(strR, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        s0Var2 = s0Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.F.contains(num2)) {
                                                                h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            s0Var3 = s0Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                                        b50.b bVarC6 = h1Var2.t().c1();
                                                                        if (u1Var.p()) {
                                                                            numValueOf4 = Integer.valueOf(u1Var.q());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        bVarC6.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                                        h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                                                    }
                                                                    if (u1Var.p()) {
                                                                    }
                                                                    b50.b bVarA6 = h1Var2.t().a1();
                                                                    p0 p0VarD6 = q0.d1(this.E);
                                                                    if (u1Var.p()) {
                                                                        numValueOf3 = Integer.valueOf(u1Var.q());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    bVarA6.d("Invalid property filter ID. appId, id", p0VarD6, String.valueOf(numValueOf3));
                                                                    this.F.add(num2);
                                                                    map6 = map7;
                                                                    s0Var2 = s0Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    s0Var3 = s0Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.F.add(num2);
                                                                }
                                                                map6 = map7;
                                                                s0Var2 = s0Var3;
                                                                it6 = it6;
                                                                a1(num2).a(bVar);
                                                                iIntValue = i11;
                                                                map6 = map7;
                                                                s0Var3 = s0Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        s0Var = s0Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                u.b<Integer> bVar6 = (u.b) this.G.keySet();
                                                bVar6.removeAll(this.F);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    h4 h4Var5 = (h4) this.G.get(num7);
                                                    com.google.android.gms.common.internal.d0.h(h4Var5);
                                                    com.google.android.gms.internal.measurement.s2 s2VarB4 = h4Var5.b(iIntValue6);
                                                    arrayList2.add(s2VarB4);
                                                    mVarD1 = y3Var.d0();
                                                    h1Var4 = (h1) mVarD1.B;
                                                    str8 = this.E;
                                                    com.google.android.gms.internal.measurement.l3 l3VarR4 = s2VarB4.r();
                                                    mVarD1.W0();
                                                    mVarD1.V0();
                                                    com.google.android.gms.common.internal.d0.e(str8);
                                                    com.google.android.gms.common.internal.d0.h(l3VarR4);
                                                    byte[] bArrA4 = l3VarR4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r110.close();
                                        map = eVar9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    r18 = Query2;
                                }
                            } catch (SQLiteException e32) {
                                e = e32;
                                str2 = "data";
                            }
                        } catch (SQLiteException e33) {
                            e = e33;
                            str2 = "data";
                            r14 = 0;
                        } catch (Throwable th14) {
                            th = th14;
                            r14 = 0;
                        }
                        m mVarD13 = y3Var.d0();
                        h1VarZ0 = (h1) mVarD13.B;
                        r7 = this.E;
                        mVarD13.W0();
                        mVarD13.V0();
                        com.google.android.gms.common.internal.d0.e(r7);
                        cursorQuery = mVarD13.K1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r7}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj = "Database error querying filters. appId";
                            r7 = r7;
                        } else {
                            eVar8 = new u.e();
                            h1Var = h1VarZ0;
                            r21 = r7;
                            while (true) {
                                i12 = cursorQuery.getInt(0);
                                com.google.android.gms.internal.measurement.l3 l3Var13 = (com.google.android.gms.internal.measurement.l3) ((com.google.android.gms.internal.measurement.k3) t0.I1(com.google.android.gms.internal.measurement.l3.x(), cursorQuery.getBlob(1))).e();
                                h1VarZ0 = Integer.valueOf(i12);
                                eVar8.put(h1VarZ0, l3Var13);
                                str3 = str14;
                                obj = objD1;
                                r13 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objD1 = obj;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            r7 = r13;
                            map2 = eVar8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            h1Var2 = h1Var7;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z12) {
                                String str114 = this.E;
                                mVarD0 = y3Var.d0();
                                str6 = this.E;
                                mVarD0.W0();
                                mVarD0.V0();
                                com.google.android.gms.common.internal.d0.e(str6);
                                eVar3 = new u.e();
                                cursorRawQuery = mVarD0.K1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) eVar3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    eVar3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r4 = eVar3;
                                com.google.android.gms.common.internal.d0.e(str114);
                                eVar4 = new u.e();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                                        list4 = (List) r4.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r17 = r4;
                                            it3 = it2;
                                            h1Var3 = h1Var7;
                                            eVar4.put(num, l3Var3);
                                            r4 = r17;
                                            str15 = str15;
                                            it2 = it3;
                                            h1Var7 = h1Var3;
                                        } else {
                                            ?? r113 = r4;
                                            it3 = it2;
                                            List listE1 = y3Var.h0().E1((j5) l3Var3.r(), list4);
                                            if (listE1.isEmpty()) {
                                                r4 = r113;
                                                it2 = it3;
                                            } else {
                                                com.google.android.gms.internal.measurement.k3 k3Var = (com.google.android.gms.internal.measurement.k3) l3Var3.i();
                                                k3Var.j();
                                                k3Var.b();
                                                ((com.google.android.gms.internal.measurement.l3) k3Var.B).B(listE1);
                                                List listE2 = y3Var.h0().E1((j5) l3Var3.p(), list4);
                                                k3Var.h();
                                                k3Var.b();
                                                ((com.google.android.gms.internal.measurement.l3) k3Var.B).z(listE2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = l3Var3.t().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    com.google.android.gms.internal.measurement.y2 y2Var2 = (com.google.android.gms.internal.measurement.y2) it10.next();
                                                    h1 h1Var13 = h1Var7;
                                                    if (!list4.contains(Integer.valueOf(y2Var2.q()))) {
                                                        arrayList6.add(y2Var2);
                                                    }
                                                    it10 = it11;
                                                    h1Var7 = h1Var13;
                                                }
                                                h1Var3 = h1Var7;
                                                k3Var.k();
                                                k3Var.b();
                                                ((com.google.android.gms.internal.measurement.l3) k3Var.B).D(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (com.google.android.gms.internal.measurement.n3 n3Var2 : l3Var3.v()) {
                                                    if (!list4.contains(Integer.valueOf(n3Var2.q()))) {
                                                        arrayList7.add(n3Var2);
                                                    }
                                                }
                                                k3Var.m();
                                                k3Var.b();
                                                ((com.google.android.gms.internal.measurement.l3) k3Var.B).F(arrayList7);
                                                eVar4.put(num, (com.google.android.gms.internal.measurement.l3) k3Var.e());
                                                r17 = r113;
                                                r4 = r17;
                                                str15 = str15;
                                                it2 = it3;
                                                h1Var7 = h1Var3;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                h1Var2 = h1Var7;
                                map3 = eVar4;
                            } else {
                                str4 = "audience_id";
                                h1Var2 = h1Var7;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                eVar = new u.e();
                                if (l3Var != null && l3Var.u() != 0) {
                                    while (r3.hasNext()) {
                                        if (y2Var.p()) {
                                            com.google.android.gms.internal.measurement.l3 l3Var14 = l3Var;
                                            Integer numValueOf13 = Integer.valueOf(y2Var.q());
                                            if (y2Var.r()) {
                                                lValueOf = Long.valueOf(y2Var.s());
                                            } else {
                                                lValueOf = null;
                                            }
                                            eVar.put(numValueOf13, lValueOf);
                                            l3Var = l3Var14;
                                        }
                                    }
                                }
                                l3Var2 = l3Var;
                                eVar2 = new u.e();
                                if (l3Var2 != null && l3Var2.w() != 0) {
                                    it = l3Var2.v().iterator();
                                    while (it.hasNext()) {
                                        n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                                        if (!n3Var.p() && n3Var.s() > 0) {
                                            eVar2.put(Integer.valueOf(n3Var.q()), Long.valueOf(n3Var.t(n3Var.s() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (l3Var2 != null) {
                                    i10 = 0;
                                    while (i10 < l3Var2.q() * 64) {
                                        if (t0.C1((j5) l3Var2.p(), i10)) {
                                            z13 = zF1;
                                            h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                            bitSet2.set(i10);
                                            if (t0.C1((j5) l3Var2.r(), i10)) {
                                                bitSet.set(i10);
                                            }
                                            i10++;
                                            zF1 = z13;
                                        } else {
                                            z13 = zF1;
                                        }
                                        eVar.remove(Integer.valueOf(i10));
                                        i10++;
                                        zF1 = z13;
                                    }
                                }
                                boolean z19 = zF1;
                                com.google.android.gms.internal.measurement.l3 l3Var15 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                                if (zF2 && z19 && (list3 = (List) map.get(num4)) != null && this.I != null && this.H != null) {
                                    while (r2.hasNext()) {
                                        int iQ6 = n1Var2.q();
                                        Integer num11 = num4;
                                        jLongValue = this.I.longValue() / 1000;
                                        if (n1Var2.y()) {
                                            jLongValue = this.H.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iQ6);
                                        if (eVar.containsKey(numValueOf)) {
                                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (eVar2.containsKey(numValueOf)) {
                                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.G.put(num4, new h4(this, this.E, l3Var15, bitSet, bitSet2, eVar, eVar2));
                                map = map;
                                zF1 = z19;
                                map4 = map4;
                                zF2 = zF2;
                                str3 = str3;
                                map5 = map110;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r114 = obj;
                        if (!list.isEmpty()) {
                            nVar = new b50.n(this);
                            eVar6 = new u.e();
                            while (r17.hasNext()) {
                                a3VarD = nVar.d(a3Var, this.E);
                                if (a3VarD != null) {
                                    qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                                    y3Var.d0().u1("events", qVarB1);
                                    if (z10) {
                                        j9 = qVarB1.f14685c;
                                        strS = a3VarD.s();
                                        map8 = (Map) eVar6.get(strS);
                                        if (map8 == null) {
                                            m mVarD14 = y3Var.d0();
                                            h1 h1Var14 = (h1) mVarD14.B;
                                            str11 = this.E;
                                            mVarD14.W0();
                                            mVarD14.V0();
                                            com.google.android.gms.common.internal.d0.e(str11);
                                            com.google.android.gms.common.internal.d0.e(strS);
                                            eVar7 = new u.e();
                                            Query = mVarD14.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.n1 n1Var12 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) eVar7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        eVar7.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(n1Var12);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = eVar7;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            eVar6.put(strS, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.F.contains(num6)) {
                                                h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zA = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        nVar2 = nVar;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.n1 n1Var13 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                                    nVar2 = nVar;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    bVar2 = new b(this, this.E, iIntValue2, n1Var13, 0);
                                                    Long l111 = this.H;
                                                    Long l112 = this.I;
                                                    iQ = n1Var13.q();
                                                    h4Var = (h4) this.G.get(num3);
                                                    if (h4Var == null) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = h4Var.f14633d.get(iQ);
                                                    }
                                                    zA = bVar2.a(l111, l112, a3VarD, j9, qVarB1, z14);
                                                    if (!zA) {
                                                        this.F.add(num3);
                                                        break;
                                                    }
                                                    a1(num3).a(bVar2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    nVar = nVar2;
                                                }
                                                if (!zA) {
                                                    this.F.add(num3);
                                                }
                                                nVar = nVar2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            u.e eVar14 = new u.e();
                            it4 = list2.iterator();
                            s0Var = eVar14;
                            while (it4.hasNext()) {
                                com.google.android.gms.internal.measurement.r3 r3Var5 = (com.google.android.gms.internal.measurement.r3) it4.next();
                                strR = r3Var5.r();
                                map6 = (Map) s0Var.get(strR);
                                if (map6 == null) {
                                    m mVarD15 = y3Var.d0();
                                    h1Var5 = (h1) mVarD15.B;
                                    str9 = this.E;
                                    mVarD15.W0();
                                    mVarD15.V0();
                                    com.google.android.gms.common.internal.d0.e(str9);
                                    com.google.android.gms.common.internal.d0.e(strR);
                                    eVar5 = new u.e();
                                    cursorQuery2 = mVarD15.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            com.google.android.gms.internal.measurement.u1 u1Var6 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) eVar5.get(numValueOf5);
                                            if (list5 == null) {
                                                h1Var6 = h1Var5;
                                                arrayList3 = new ArrayList();
                                                eVar5.put(numValueOf5, arrayList3);
                                            } else {
                                                h1Var6 = h1Var5;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(u1Var6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            h1Var5 = h1Var6;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = eVar5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    s0Var.put(strR, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                s0Var2 = s0Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.F.contains(num2)) {
                                        h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zB = true;
                                    s0Var3 = s0Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                                b50.b bVarC7 = h1Var2.t().c1();
                                                if (u1Var.p()) {
                                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                bVarC7.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                                h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                                            }
                                            if (u1Var.p() || u1Var.q() > 256) {
                                                b50.b bVarA7 = h1Var2.t().a1();
                                                p0 p0VarD7 = q0.d1(this.E);
                                                if (u1Var.p()) {
                                                    numValueOf3 = Integer.valueOf(u1Var.q());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                bVarA7.d("Invalid property filter ID. appId, id", p0VarD7, String.valueOf(numValueOf3));
                                                this.F.add(num2);
                                                map6 = map7;
                                                s0Var2 = s0Var3;
                                                it6 = it6;
                                            } else {
                                                i11 = iIntValue;
                                                bVar = new b(this, this.E, i11, u1Var, 1);
                                                Long l20 = this.H;
                                                Long l21 = this.I;
                                                int iQ7 = u1Var.q();
                                                h4 h4Var6 = (h4) this.G.get(num2);
                                                zB = bVar.b(l20, l21, r3Var5, h4Var6 == null ? false : h4Var6.f14633d.get(iQ7));
                                                if (zB) {
                                                    a1(num2).a(bVar);
                                                    iIntValue = i11;
                                                    map6 = map7;
                                                    s0Var3 = s0Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.F.add(num2);
                                                    s0Var3 = s0Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            s0Var3 = s0Var3;
                                            it6 = it6;
                                        }
                                        if (!zB) {
                                            this.F.add(num2);
                                        }
                                        map6 = map7;
                                        s0Var2 = s0Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                s0Var = s0Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        u.b<Integer> bVar7 = (u.b) this.G.keySet();
                        bVar7.removeAll(this.F);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            h4 h4Var7 = (h4) this.G.get(num7);
                            com.google.android.gms.common.internal.d0.h(h4Var7);
                            com.google.android.gms.internal.measurement.s2 s2VarB5 = h4Var7.b(iIntValue7);
                            arrayList2.add(s2VarB5);
                            mVarD1 = y3Var.d0();
                            h1Var4 = (h1) mVarD1.B;
                            str8 = this.E;
                            com.google.android.gms.internal.measurement.l3 l3VarR5 = s2VarB5.r();
                            mVarD1.W0();
                            mVarD1.V0();
                            com.google.android.gms.common.internal.d0.e(str8);
                            com.google.android.gms.common.internal.d0.h(l3VarR5);
                            byte[] bArrA5 = l3VarR5.a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z12 = z11;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj = "Database error querying filters. appId";
                        r7 = r7;
                    } else {
                        eVar8 = new u.e();
                        h1Var = h1VarZ0;
                        r21 = r7;
                        while (true) {
                            i12 = cursorQuery.getInt(0);
                            com.google.android.gms.internal.measurement.l3 l3Var16 = (com.google.android.gms.internal.measurement.l3) ((com.google.android.gms.internal.measurement.k3) t0.I1(com.google.android.gms.internal.measurement.l3.x(), cursorQuery.getBlob(1))).e();
                            h1VarZ0 = Integer.valueOf(i12);
                            eVar8.put(h1VarZ0, l3Var16);
                            str3 = str14;
                            obj = objD1;
                            r13 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objD1 = obj;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        r7 = r13;
                        map2 = eVar8;
                    }
                } catch (SQLiteException e34) {
                    e = e34;
                    h1Var = h1VarZ0;
                    r21 = r7;
                }
            } catch (Throwable th15) {
                th = th15;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = mVarD13.K1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r7}, null, null, null);
        } catch (SQLiteException e35) {
            e = e35;
            h1Var = h1VarZ0;
            str3 = "Failed to merge filter. appId";
            obj = "Database error querying filters. appId";
            r21 = r7;
            cursorQuery = null;
        } catch (Throwable th16) {
            th = th16;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        m mVarD16 = y3Var.d0();
        h1VarZ0 = (h1) mVarD16.B;
        r7 = this.E;
        mVarD16.W0();
        mVarD16.V0();
        com.google.android.gms.common.internal.d0.e(r7);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            h1Var2 = h1Var7;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z12) {
                String str116 = this.E;
                mVarD0 = y3Var.d0();
                str6 = this.E;
                mVarD0.W0();
                mVarD0.V0();
                com.google.android.gms.common.internal.d0.e(str6);
                eVar3 = new u.e();
                cursorRawQuery = mVarD0.K1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) eVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            eVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    eVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r4 = eVar3;
                com.google.android.gms.common.internal.d0.e(str116);
                eVar4 = new u.e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        l3Var3 = (com.google.android.gms.internal.measurement.l3) map2.get(num);
                        list4 = (List) r4.get(num);
                        if (list4 != null) {
                        }
                        r17 = r4;
                        it3 = it2;
                        h1Var3 = h1Var7;
                        eVar4.put(num, l3Var3);
                        r4 = r17;
                        str15 = str15;
                        it2 = it3;
                        h1Var7 = h1Var3;
                    }
                }
                str4 = str15;
                h1Var2 = h1Var7;
                map3 = eVar4;
            } else {
                str4 = "audience_id";
                h1Var2 = h1Var7;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                l3Var = (com.google.android.gms.internal.measurement.l3) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                eVar = new u.e();
                if (l3Var != null) {
                    while (r3.hasNext()) {
                        if (y2Var.p()) {
                            com.google.android.gms.internal.measurement.l3 l3Var17 = l3Var;
                            Integer numValueOf14 = Integer.valueOf(y2Var.q());
                            if (y2Var.r()) {
                                lValueOf = Long.valueOf(y2Var.s());
                            } else {
                                lValueOf = null;
                            }
                            eVar.put(numValueOf14, lValueOf);
                            l3Var = l3Var17;
                        }
                    }
                }
                l3Var2 = l3Var;
                eVar2 = new u.e();
                if (l3Var2 != null) {
                    it = l3Var2.v().iterator();
                    while (it.hasNext()) {
                        n3Var = (com.google.android.gms.internal.measurement.n3) it.next();
                        if (!n3Var.p()) {
                        }
                    }
                }
                Map map112 = map5;
                if (l3Var2 != null) {
                    i10 = 0;
                    while (i10 < l3Var2.q() * 64) {
                        if (t0.C1((j5) l3Var2.p(), i10)) {
                            z13 = zF1;
                            h1Var2.t().c1().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                            bitSet2.set(i10);
                            if (t0.C1((j5) l3Var2.r(), i10)) {
                                bitSet.set(i10);
                            }
                            i10++;
                            zF1 = z13;
                        } else {
                            z13 = zF1;
                        }
                        eVar.remove(Integer.valueOf(i10));
                        i10++;
                        zF1 = z13;
                    }
                }
                boolean z110 = zF1;
                com.google.android.gms.internal.measurement.l3 l3Var18 = (com.google.android.gms.internal.measurement.l3) map4.get(num4);
                if (zF2) {
                    while (r2.hasNext()) {
                        int iQ8 = n1Var2.q();
                        Integer num12 = num4;
                        jLongValue = this.I.longValue() / 1000;
                        if (n1Var2.y()) {
                            jLongValue = this.H.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iQ8);
                        if (eVar.containsKey(numValueOf)) {
                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (eVar2.containsKey(numValueOf)) {
                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.G.put(num4, new h4(this, this.E, l3Var18, bitSet, bitSet2, eVar, eVar2));
                map = map;
                zF1 = z110;
                map4 = map4;
                zF2 = zF2;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r115 = obj;
        if (!list.isEmpty()) {
            nVar = new b50.n(this);
            eVar6 = new u.e();
            while (r17.hasNext()) {
                a3VarD = nVar.d(a3Var, this.E);
                if (a3VarD != null) {
                    qVarB1 = y3Var.d0().B1(this.E, a3Var, a3VarD.s());
                    y3Var.d0().u1("events", qVarB1);
                    if (z10) {
                        j9 = qVarB1.f14685c;
                        strS = a3VarD.s();
                        map8 = (Map) eVar6.get(strS);
                        if (map8 == null) {
                            m mVarD17 = y3Var.d0();
                            h1 h1Var15 = (h1) mVarD17.B;
                            str11 = this.E;
                            mVarD17.W0();
                            mVarD17.V0();
                            com.google.android.gms.common.internal.d0.e(str11);
                            com.google.android.gms.common.internal.d0.e(strS);
                            eVar7 = new u.e();
                            Query = mVarD17.K1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strS}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    com.google.android.gms.internal.measurement.n1 n1Var14 = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) t0.I1(com.google.android.gms.internal.measurement.n1.B(), Query.getBlob(1))).e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) eVar7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        eVar7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(n1Var14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = eVar7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            eVar6.put(strS, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.F.contains(num6)) {
                                h1Var2.t().c1().c(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        nVar2 = nVar;
                                        num3 = num6;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.n1 n1Var15 = (com.google.android.gms.internal.measurement.n1) it8.next();
                                    nVar2 = nVar;
                                    num3 = num6;
                                    map9 = map8;
                                    bVar2 = new b(this, this.E, iIntValue2, n1Var15, 0);
                                    Long l113 = this.H;
                                    Long l114 = this.I;
                                    iQ = n1Var15.q();
                                    h4Var = (h4) this.G.get(num3);
                                    if (h4Var == null) {
                                        z14 = false;
                                    } else {
                                        z14 = h4Var.f14633d.get(iQ);
                                    }
                                    zA = bVar2.a(l113, l114, a3VarD, j9, qVarB1, z14);
                                    if (!zA) {
                                        this.F.add(num3);
                                        break;
                                    }
                                    a1(num3).a(bVar2);
                                    num6 = num3;
                                    map8 = map9;
                                    nVar = nVar2;
                                }
                                if (!zA) {
                                    this.F.add(num3);
                                }
                                nVar = nVar2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            u.e eVar15 = new u.e();
            it4 = list2.iterator();
            s0Var = eVar15;
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.r3 r3Var6 = (com.google.android.gms.internal.measurement.r3) it4.next();
                strR = r3Var6.r();
                map6 = (Map) s0Var.get(strR);
                if (map6 == null) {
                    m mVarD18 = y3Var.d0();
                    h1Var5 = (h1) mVarD18.B;
                    str9 = this.E;
                    mVarD18.W0();
                    mVarD18.V0();
                    com.google.android.gms.common.internal.d0.e(str9);
                    com.google.android.gms.common.internal.d0.e(strR);
                    eVar5 = new u.e();
                    cursorQuery2 = mVarD18.K1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strR}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            com.google.android.gms.internal.measurement.u1 u1Var7 = (com.google.android.gms.internal.measurement.u1) ((com.google.android.gms.internal.measurement.t1) t0.I1(com.google.android.gms.internal.measurement.u1.x(), cursorQuery2.getBlob(1))).e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) eVar5.get(numValueOf5);
                            if (list5 == null) {
                                h1Var6 = h1Var5;
                                arrayList3 = new ArrayList();
                                eVar5.put(numValueOf5, arrayList3);
                            } else {
                                h1Var6 = h1Var5;
                                arrayList3 = list5;
                            }
                            arrayList3.add(u1Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            h1Var5 = h1Var6;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = eVar5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    s0Var.put(strR, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                s0Var2 = s0Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.F.contains(num2)) {
                        h1Var2.t().c1().c(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    s0Var3 = s0Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            u1Var = (com.google.android.gms.internal.measurement.u1) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(h1Var2.t().f1(), 2)) {
                                b50.b bVarC8 = h1Var2.t().c1();
                                if (u1Var.p()) {
                                    numValueOf4 = Integer.valueOf(u1Var.q());
                                } else {
                                    numValueOf4 = null;
                                }
                                bVarC8.e("Evaluating filter. audience, filter, property", num2, numValueOf4, h1Var2.h().c(u1Var.r()));
                                h1Var2.t().c1().c(y3Var.h0().z1(u1Var), "Filter definition");
                            }
                            if (u1Var.p()) {
                            }
                            b50.b bVarA8 = h1Var2.t().a1();
                            p0 p0VarD8 = q0.d1(this.E);
                            if (u1Var.p()) {
                                numValueOf3 = Integer.valueOf(u1Var.q());
                            } else {
                                numValueOf3 = null;
                            }
                            bVarA8.d("Invalid property filter ID. appId, id", p0VarD8, String.valueOf(numValueOf3));
                            this.F.add(num2);
                            map6 = map7;
                            s0Var2 = s0Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            s0Var3 = s0Var3;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.F.add(num2);
                        }
                        map6 = map7;
                        s0Var2 = s0Var3;
                        it6 = it6;
                        a1(num2).a(bVar);
                        iIntValue = i11;
                        map6 = map7;
                        s0Var3 = s0Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                s0Var = s0Var2;
            }
        }
        arrayList2 = new ArrayList();
        u.b<Integer> bVar8 = (u.b) this.G.keySet();
        bVar8.removeAll(this.F);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            h4 h4Var8 = (h4) this.G.get(num7);
            com.google.android.gms.common.internal.d0.h(h4Var8);
            com.google.android.gms.internal.measurement.s2 s2VarB6 = h4Var8.b(iIntValue8);
            arrayList2.add(s2VarB6);
            mVarD1 = y3Var.d0();
            h1Var4 = (h1) mVarD1.B;
            str8 = this.E;
            com.google.android.gms.internal.measurement.l3 l3VarR6 = s2VarB6.r();
            mVarD1.W0();
            mVarD1.V0();
            com.google.android.gms.common.internal.d0.e(str8);
            com.google.android.gms.common.internal.d0.h(l3VarR6);
            byte[] bArrA6 = l3VarR6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (mVarD1.K1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                h1Var4.t().Z0().c(q0.d1(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final h4 a1(Integer num) {
        if (this.G.containsKey(num)) {
            return (h4) this.G.get(num);
        }
        h4 h4Var = new h4(this, this.E);
        this.G.put(num, h4Var);
        return h4Var;
    }
}
