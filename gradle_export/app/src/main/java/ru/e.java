package ru;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class e {
    public final boolean a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public e(boolean z, String appliedId, Integer num, boolean z2) {
        m.e(appliedId, "appliedId");
        this.a = z;
        this.b = appliedId;
        this.c = num;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && m.a(this.b, eVar.b) && m.a(this.c, eVar.c) && this.d == eVar.d;
    }

    public final int hashCode() {
        int iE = x5.e(Boolean.hashCode(this.a) * 31, this.b, 31);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "TafsirReloadKey(showTafsir=" + this.a + ", appliedId=" + this.b + ", surahNumber=" + this.c + ", isLyricsAvailable=" + this.d + ")";
    }
}
