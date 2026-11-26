package com.revenuecat.purchases.ads.events.types;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import r30.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdFormat {
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final String OTHER = m65constructorimpl("other");
    private static final String BANNER = m65constructorimpl("banner");
    private static final String INTERSTITIAL = m65constructorimpl("interstitial");
    private static final String REWARDED = m65constructorimpl("rewarded");
    private static final String REWARDED_INTERSTITIAL = m65constructorimpl("rewarded_interstitial");
    private static final String NATIVE = m65constructorimpl("native");
    private static final String APP_OPEN = m65constructorimpl("app_open");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat$Companion;", "", "()V", "APP_OPEN", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "getAPP_OPEN-y0COY5Q", "()Ljava/lang/String;", "Ljava/lang/String;", "BANNER", "getBANNER-y0COY5Q", "INTERSTITIAL", "getINTERSTITIAL-y0COY5Q", "NATIVE", "getNATIVE-y0COY5Q", "OTHER", "getOTHER-y0COY5Q", "REWARDED", "getREWARDED-y0COY5Q", "REWARDED_INTERSTITIAL", "getREWARDED_INTERSTITIAL-y0COY5Q", "fromString", "value", "", "fromString-XxFlno4", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final String m71fromStringXxFlno4(String value) {
            m.e(value, "value");
            String string = k.j1(value).toString();
            switch (string.hashCode()) {
                case -1396342996:
                    if (string.equals("banner")) {
                        return m73getBANNERy0COY5Q();
                    }
                    break;
                case -1052618729:
                    if (string.equals("native")) {
                        return m75getNATIVEy0COY5Q();
                    }
                    break;
                case -239580146:
                    if (string.equals("rewarded")) {
                        return m77getREWARDEDy0COY5Q();
                    }
                    break;
                case 106069776:
                    if (string.equals("other")) {
                        return m76getOTHERy0COY5Q();
                    }
                    break;
                case 604727084:
                    if (string.equals("interstitial")) {
                        return m74getINTERSTITIALy0COY5Q();
                    }
                    break;
                case 1167692200:
                    if (string.equals("app_open")) {
                        return m72getAPP_OPENy0COY5Q();
                    }
                    break;
                case 1911491517:
                    if (string.equals("rewarded_interstitial")) {
                        return m78getREWARDED_INTERSTITIALy0COY5Q();
                    }
                    break;
            }
            return AdFormat.m65constructorimpl(value);
        }

        public final String m72getAPP_OPENy0COY5Q() {
            return AdFormat.APP_OPEN;
        }

        public final String m73getBANNERy0COY5Q() {
            return AdFormat.BANNER;
        }

        public final String m74getINTERSTITIALy0COY5Q() {
            return AdFormat.INTERSTITIAL;
        }

        public final String m75getNATIVEy0COY5Q() {
            return AdFormat.NATIVE;
        }

        public final String m76getOTHERy0COY5Q() {
            return AdFormat.OTHER;
        }

        public final String m77getREWARDEDy0COY5Q() {
            return AdFormat.REWARDED;
        }

        public final String m78getREWARDED_INTERSTITIALy0COY5Q() {
            return AdFormat.REWARDED_INTERSTITIAL;
        }
    }

    private AdFormat(String str) {
        this.value = str;
    }

    public static final AdFormat m64boximpl(String str) {
        return new AdFormat(str);
    }

    public static String m65constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m66equalsimpl(String str, Object obj) {
        return (obj instanceof AdFormat) && m.a(str, ((AdFormat) obj).getValue());
    }

    public static final boolean m67equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m68hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m69toStringimpl(String str) {
        return oi.k.g(')', "AdFormat(value=", str);
    }

    public boolean equals(Object obj) {
        return m66equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m68hashCodeimpl(this.value);
    }

    public String toString() {
        return m69toStringimpl(this.value);
    }

    public final String getValue() {
        return this.value;
    }
}
