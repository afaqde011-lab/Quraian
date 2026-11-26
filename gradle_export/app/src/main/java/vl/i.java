package vl;

import com.revenuecat.purchases.common.Constants;

public final class i implements k {
    public final int a;
    public final int b;
    public final String c;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i2;
    }

    @Override
    public final String a() {
        return "reciter_surah";
    }

    @Override
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return g4.c.e(this.a, this.b, "ReciterSurah(reciterId=", ", surahNumber=", ")");
    }
}
