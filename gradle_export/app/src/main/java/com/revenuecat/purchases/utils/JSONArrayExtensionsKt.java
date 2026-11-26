package com.revenuecat.purchases.utils;

import h00.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0000\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"replaceJsonNullWithKotlinNull", "", "T", "toList", "Lorg/json/JSONArray;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        m.e(list, "<this>");
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        for (T t : list) {
            if (t instanceof Map) {
                t = (T) JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) t);
            } else if (t instanceof List) {
                t = (T) replaceJsonNullWithKotlinNull((List) t);
            } else if (m.a(t, JSONObject.NULL)) {
                t = (T) null;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        m.e(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object list = jSONArray.get(i);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
