package qr;

import com.google.android.gms.internal.measurement.x5;

public final class t {
    public final u30.b a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final u30.b h;
    public final u30.b i;

    public t(u30.b announcementBanners, String str, String str2, String str3, String str4, String str5, String str6, u30.b upcomingReciterCountryCodes, u30.b publishedEventReciters) {
        kotlin.jvm.internal.m.e(announcementBanners, "announcementBanners");
        kotlin.jvm.internal.m.e(upcomingReciterCountryCodes, "upcomingReciterCountryCodes");
        kotlin.jvm.internal.m.e(publishedEventReciters, "publishedEventReciters");
        this.a = announcementBanners;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = upcomingReciterCountryCodes;
        this.i = publishedEventReciters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.a, tVar.a) && kotlin.jvm.internal.m.a(this.b, tVar.b) && kotlin.jvm.internal.m.a(this.c, tVar.c) && kotlin.jvm.internal.m.a(this.d, tVar.d) && kotlin.jvm.internal.m.a(this.e, tVar.e) && kotlin.jvm.internal.m.a(this.f, tVar.f) && kotlin.jvm.internal.m.a(this.g, tVar.g) && kotlin.jvm.internal.m.a(this.h, tVar.h) && kotlin.jvm.internal.m.a(this.i, tVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + g4.c.c(this.h, x5.e(x5.e(x5.e(x5.e(x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterEventDvo(announcementBanners=");
        sb.append(this.a);
        sb.append(", upcomingReciterBannerTitle=");
        sb.append(this.b);
        sb.append(", upcomingReciterBannerSubtitle=");
        a1.b.z(sb, this.c, ", publishedReciterBannerTitle=", this.d, ", publishedReciterBannerSubtitle=");
        a1.b.z(sb, this.e, ", upcomingReciterCountdownText=", this.f, ", upcomingReciterHintText=");
        sb.append(this.g);
        sb.append(", upcomingReciterCountryCodes=");
        sb.append(this.h);
        sb.append(", publishedEventReciters=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
