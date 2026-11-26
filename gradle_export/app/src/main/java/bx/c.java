package bx;

import com.google.android.gms.internal.measurement.x5;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;
import r30.r;

public final class c {
    public final int a;
    public final String b;
    public final String c;
    public final u30.b d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final List k;
    public final u30.b l;

    public c(int i, String str, String str2, u30.b moshaf, String str3, boolean z, String bio, String countryCode, String countryName, List list, List list2, u30.b socialLinks) {
        m.e(moshaf, "moshaf");
        m.e(bio, "bio");
        m.e(countryCode, "countryCode");
        m.e(countryName, "countryName");
        m.e(socialLinks, "socialLinks");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = moshaf;
        this.e = str3;
        this.f = z;
        this.g = bio;
        this.h = countryCode;
        this.i = countryName;
        this.j = list;
        this.k = list2;
        this.l = socialLinks;
    }

    public final b a() {
        b bVar;
        Object obj = null;
        u30.b bVar2 = this.d;
        int i = this.a;
        if (i == 138) {
            for (Object obj2 : bVar2) {
                if (((b) obj2).d == 131) {
                    obj = obj2;
                    break;
                }
            }
            bVar = (b) obj;
        } else if (i == 273) {
            for (Object obj3 : bVar2) {
                if (((b) obj3).d == 14) {
                    obj = obj3;
                    break;
                }
            }
            bVar = (b) obj;
        } else if (i != 307) {
            for (Object obj4 : bVar2) {
                if (((b) obj4).d == 11) {
                    obj = obj4;
                    break;
                }
            }
            bVar = (b) obj;
        } else {
            for (Object obj5 : bVar2) {
                if (((b) obj5).d == 21) {
                    obj = obj5;
                    break;
                }
            }
            bVar = (b) obj;
        }
        return bVar == null ? (b) q.N0(bVar2) : bVar;
    }

    public final boolean b(String query) {
        m.e(query, "query");
        return k.A0(this.b, query, true) || k.A0(this.i, query, true) || r.q0(this.h, query);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && m.a(this.b, cVar.b) && m.a(this.c, cVar.c) && m.a(this.d, cVar.d) && m.a(this.e, cVar.e) && this.f == cVar.f && m.a(this.g, cVar.g) && m.a(this.h, cVar.h) && m.a(this.i, cVar.i) && m.a(this.j, cVar.j) && m.a(this.k, cVar.k) && m.a(this.l, cVar.l);
    }

    public final int hashCode() {
        int iE = x5.e(Integer.hashCode(this.a) * 31, this.b, 31);
        String str = this.c;
        return this.l.hashCode() + g4.c.a(g4.c.a(x5.e(x5.e(x5.e(w.c.e(x5.e(g4.c.c(this.d, (iE + (str == null ? 0 : str.hashCode())) * 31, 31), this.e, 31), 31, this.f), this.g, 31), this.h, 31), this.i, 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("Reciter(id=", this.a, ", name=", this.b, ", letter=");
        sbM.append(this.c);
        sbM.append(", moshaf=");
        sbM.append(this.d);
        sbM.append(", photoUrl=");
        sbM.append(this.e);
        sbM.append(", isNew=");
        sbM.append(this.f);
        sbM.append(", bio=");
        a1.b.z(sbM, this.g, ", countryCode=", this.h, ", countryName=");
        sbM.append(this.i);
        sbM.append(", nameOtherLanguages=");
        sbM.append(this.j);
        sbM.append(", countryNameOtherLanguages=");
        sbM.append(this.k);
        sbM.append(", socialLinks=");
        sbM.append(this.l);
        sbM.append(")");
        return sbM.toString();
    }
}
