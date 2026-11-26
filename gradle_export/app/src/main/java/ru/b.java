package ru;

import bx.f;
import java.util.List;
import kotlin.jvm.internal.m;

public final class b {
    public final bx.c a;
    public final f b;
    public final Integer c;
    public final List d;

    public b(bx.c reciter, f surah, Integer num, List downloadedSurahs) {
        m.e(reciter, "reciter");
        m.e(surah, "surah");
        m.e(downloadedSurahs, "downloadedSurahs");
        this.a = reciter;
        this.b = surah;
        this.c = num;
        this.d = downloadedSurahs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.a, bVar.a) && m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && m.a(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return this.d.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "PlayerItemData(reciter=" + this.a + ", surah=" + this.b + ", collectionId=" + this.c + ", downloadedSurahs=" + this.d + ")";
    }
}
