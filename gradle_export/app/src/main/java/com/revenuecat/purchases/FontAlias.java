package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import oi.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/FontAlias;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontAlias {

    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/FontAlias$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/FontAlias;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final l40.a serializer() {
            return FontAlias$$serializer.INSTANCE;
        }
    }

    private FontAlias(String str) {
        this.value = str;
    }

    public static final FontAlias m21boximpl(String str) {
        return new FontAlias(str);
    }

    public static String m22constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m23equalsimpl(String str, Object obj) {
        return (obj instanceof FontAlias) && m.a(str, ((FontAlias) obj).m27unboximpl());
    }

    public static final boolean m24equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m25hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m26toStringimpl(String str) {
        return k.g(')', "FontAlias(value=", str);
    }

    public boolean equals(Object obj) {
        return m23equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m25hashCodeimpl(this.value);
    }

    public String toString() {
        return m26toStringimpl(this.value);
    }

    public final String m27unboximpl() {
        return this.value;
    }
}
