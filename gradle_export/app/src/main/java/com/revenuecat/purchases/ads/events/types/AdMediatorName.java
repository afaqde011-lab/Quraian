package com.revenuecat.purchases.ads.events.types;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import r30.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdMediatorName {
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final String AD_MOB = m82constructorimpl("AdMob");
    private static final String APP_LOVIN = m82constructorimpl("AppLovin");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName$Companion;", "", "()V", "AD_MOB", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "getAD_MOB-GyoM_N4", "()Ljava/lang/String;", "Ljava/lang/String;", "APP_LOVIN", "getAPP_LOVIN-GyoM_N4", "fromString", "value", "", "fromString-CJOXPJU", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final String m88fromStringCJOXPJU(String value) {
            m.e(value, "value");
            String string = k.j1(value).toString();
            if (m.a(string, "AdMob")) {
                return m89getAD_MOBGyoM_N4();
            }
            return m.a(string, "AppLovin") ? m90getAPP_LOVINGyoM_N4() : AdMediatorName.m82constructorimpl(value);
        }

        public final String m89getAD_MOBGyoM_N4() {
            return AdMediatorName.AD_MOB;
        }

        public final String m90getAPP_LOVINGyoM_N4() {
            return AdMediatorName.APP_LOVIN;
        }
    }

    private AdMediatorName(String str) {
        this.value = str;
    }

    public static final AdMediatorName m81boximpl(String str) {
        return new AdMediatorName(str);
    }

    public static String m82constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m83equalsimpl(String str, Object obj) {
        return (obj instanceof AdMediatorName) && m.a(str, ((AdMediatorName) obj).getValue());
    }

    public static final boolean m84equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m85hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m86toStringimpl(String str) {
        return oi.k.g(')', "AdMediatorName(value=", str);
    }

    public boolean equals(Object obj) {
        return m83equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m85hashCodeimpl(this.value);
    }

    public String toString() {
        return m86toStringimpl(this.value);
    }

    public final String getValue() {
        return this.value;
    }
}
