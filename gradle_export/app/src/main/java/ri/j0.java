package ri;

import java.util.List;

public final class j0 extends m2 {

    public final String f13394a;

    public final String f13395b;

    public final String f13396c;

    public final long f13397d;

    public final Long f13398e;

    public final boolean f13399f;

    public final u1 f13400g;

    public final l2 f13401h;

    public final k2 f13402i;

    public final v1 f13403j;

    public final List f13404k;
    public final int l;

    public j0(String str, String str2, String str3, long j9, Long l, boolean z10, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i10) {
        this.f13394a = str;
        this.f13395b = str2;
        this.f13396c = str3;
        this.f13397d = j9;
        this.f13398e = l;
        this.f13399f = z10;
        this.f13400g = u1Var;
        this.f13401h = l2Var;
        this.f13402i = k2Var;
        this.f13403j = v1Var;
        this.f13404k = list;
        this.l = i10;
    }

    @Override
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.f13368a = this.f13394a;
        i0Var.f13369b = this.f13395b;
        i0Var.f13370c = this.f13396c;
        i0Var.f13371d = this.f13397d;
        i0Var.f13372e = this.f13398e;
        i0Var.f13373f = this.f13399f;
        i0Var.f13374g = this.f13400g;
        i0Var.f13375h = this.f13401h;
        i0Var.f13376i = this.f13402i;
        i0Var.f13377j = this.f13403j;
        i0Var.f13378k = this.f13404k;
        i0Var.l = this.l;
        i0Var.m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.f13404k;
            v1 v1Var2 = j0Var.f13403j;
            k2 k2Var2 = j0Var.f13402i;
            l2 l2Var2 = j0Var.f13401h;
            Long l10 = j0Var.f13398e;
            String str2 = j0Var.f13396c;
            if (this.f13394a.equals(j0Var.f13394a) && this.f13395b.equals(j0Var.f13395b) && ((str = this.f13396c) != null ? str.equals(str2) : str2 == null) && this.f13397d == j0Var.f13397d && ((l = this.f13398e) != null ? l.equals(l10) : l10 == null) && this.f13399f == j0Var.f13399f && this.f13400g.equals(j0Var.f13400g) && ((l2Var = this.f13401h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.f13402i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.f13403j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.f13404k) != null ? list.equals(list2) : list2 == null) && this.l == j0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13394a.hashCode() ^ 1000003) * 1000003) ^ this.f13395b.hashCode()) * 1000003;
        String str = this.f13396c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j9 = this.f13397d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        Long l = this.f13398e;
        int iHashCode3 = (((((i10 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f13399f ? 1231 : 1237)) * 1000003) ^ this.f13400g.hashCode()) * 1000003;
        l2 l2Var = this.f13401h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.f13402i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.f13403j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f13404k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f13394a);
        sb2.append(", identifier=");
        sb2.append(this.f13395b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f13396c);
        sb2.append(", startedAt=");
        sb2.append(this.f13397d);
        sb2.append(", endedAt=");
        sb2.append(this.f13398e);
        sb2.append(", crashed=");
        sb2.append(this.f13399f);
        sb2.append(", app=");
        sb2.append(this.f13400g);
        sb2.append(", user=");
        sb2.append(this.f13401h);
        sb2.append(", os=");
        sb2.append(this.f13402i);
        sb2.append(", device=");
        sb2.append(this.f13403j);
        sb2.append(", events=");
        sb2.append(this.f13404k);
        sb2.append(", generatorType=");
        return g4.c.g(this.l, "}", sb2);
    }
}
