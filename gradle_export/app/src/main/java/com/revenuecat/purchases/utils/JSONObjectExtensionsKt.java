package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import h00.d0;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q30.l;
import u00.k;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000\u001a4\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u00130\u0011\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u0010\u0012\u0004\u0012\u0002H\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u00130\u0011H\u0000\u001a(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00150\u0011\"\u0004\b\u0000\u0010\u0015*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"copy", "Lorg/json/JSONObject;", "deep", "", "getDate", "Ljava/util/Date;", "jsonKey", "", "getNullableInt", "", DiagnosticsEntry.NAME_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getNullableString", "optDate", "optNullableInt", "optNullableString", "replaceJsonNullWithKotlinNull", "", "K", "V", "toMap", "T", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONObjectExtensionsKt {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "jsonKey", "Lg00/k;", "invoke", "(Ljava/lang/String;)Lg00/k;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final boolean $deep;
        final JSONObject $this_toMap;

        public AnonymousClass1(boolean z, JSONObject jSONObject) {
            super(1);
            this.$deep = z;
            this.$this_toMap = jSONObject;
        }

        @Override
        public final g00.k invoke(String str) throws JSONException {
            if (!this.$deep) {
                return new g00.k(str, this.$this_toMap.get(str));
            }
            Object list = this.$this_toMap.get(str);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = JSONArrayExtensionsKt.toList((JSONArray) list);
            }
            return new g00.k(str, list);
        }
    }

    public static final JSONObject copy(JSONObject jSONObject, boolean z) {
        m.e(jSONObject, "<this>");
        return new JSONObject(toMap(jSONObject, z));
    }

    public static JSONObject copy$default(JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copy(jSONObject, z);
    }

    public static final Date getDate(JSONObject jSONObject, String jsonKey) {
        m.e(jSONObject, "<this>");
        m.e(jsonKey, "jsonKey");
        Date date = Iso8601Utils.parse(jSONObject.getString(jsonKey));
        m.d(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final Integer getNullableInt(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final String getNullableString(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String jsonKey) {
        m.e(jSONObject, "<this>");
        m.e(jsonKey, "jsonKey");
        if (jSONObject.isNull(jsonKey)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, jsonKey);
        }
        return null;
    }

    public static final Integer optNullableInt(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, name);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, name);
        }
        return null;
    }

    public static final <K, V> Map<K, V> replaceJsonNullWithKotlinNull(Map<K, ? extends V> map) {
        m.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.P(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = replaceJsonNullWithKotlinNull((Map) value);
            } else if (value instanceof List) {
                value = JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((List) value);
            } else if (m.a(value, JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z) {
        m.e(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "this.keys()");
        return d0.a0(l.r0(l.j0(itKeys), new AnonymousClass1(z, jSONObject)));
    }

    public static Map toMap$default(JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toMap(jSONObject, z);
    }
}
