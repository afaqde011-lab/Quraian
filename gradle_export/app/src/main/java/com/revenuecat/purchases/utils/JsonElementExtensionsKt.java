package com.revenuecat.purchases.utils;

import a20.g;
import h00.d0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.internal.JsonDecodingException;
import q40.b0;
import q40.e;
import q40.l;
import q40.u;
import q40.x;
import r30.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lq40/l;", "", "", "", "asMap", "(Lq40/l;)Ljava/util/Map;", "getExtractedContent", "(Lq40/l;)Ljava/lang/Object;", "extractedContent", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(l lVar) {
        m.e(lVar, "<this>");
        if (!(lVar instanceof x)) {
            return null;
        }
        Set<Map.Entry> setEntrySet = q40.m.g(lVar).A.entrySet();
        int iP = d0.P(r.q0(setEntrySet, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), getExtractedContent((l) entry.getValue()));
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(l lVar) {
        Long lValueOf;
        Integer numValueOf;
        Long lValueOf2;
        Float fValueOf;
        LinkedHashMap linkedHashMap = null;
        if (!(lVar instanceof b0)) {
            if (lVar instanceof e) {
                e eVarF = q40.m.f(lVar);
                ArrayList arrayList = new ArrayList(r.q0(eVarF, 10));
                Iterator it = eVarF.A.iterator();
                while (it.hasNext()) {
                    arrayList.add(getExtractedContent((l) it.next()));
                }
                return arrayList;
            }
            if (lVar instanceof x) {
                Set<Map.Entry> setEntrySet = q40.m.g(lVar).A.entrySet();
                int iP = d0.P(r.q0(setEntrySet, 10));
                if (iP < 16) {
                    iP = 16;
                }
                linkedHashMap = new LinkedHashMap(iP);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), getExtractedContent((l) entry.getValue()));
                }
            }
            return linkedHashMap;
        }
        b0 b0VarH = q40.m.h(lVar);
        if (b0VarH.c()) {
            return b0VarH.a();
        }
        Boolean boolD = q40.m.d(b0VarH);
        if (boolD != null) {
            return boolD;
        }
        try {
            lValueOf = Long.valueOf(new g(b0VarH.a()).o());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L > jLongValue || jLongValue > 2147483647L) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf((int) jLongValue);
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        try {
            lValueOf2 = Long.valueOf(new g(b0VarH.a()).o());
        } catch (JsonDecodingException unused2) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            return lValueOf2;
        }
        String strA = b0VarH.a();
        m.e(strA, "<this>");
        try {
            fValueOf = q.l0(strA) ? Float.valueOf(Float.parseFloat(strA)) : null;
        } catch (NumberFormatException unused3) {
        }
        if (fValueOf != null) {
            return fValueOf;
        }
        Double dM0 = q.m0(b0VarH.a());
        if (dM0 == null) {
            return b0VarH instanceof u ? null : b0VarH.a();
        }
        return dM0;
    }
}
