package vl;

import com.revenuecat.purchases.common.Constants;

public final class d implements k {
    public final int a;
    public final int b;
    public final String c;

    public d(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i2;
    }

    @Override
    public final String a() {
        return "episode";
    }

    @Override
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return g4.c.e(this.a, this.b, "Episode(storyId=", ", episodeId=", ")");
    }
}
