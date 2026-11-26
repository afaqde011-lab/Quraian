package ri;

import android.os.Build;

public final class n1 {

    public final boolean f13471a;

    public n1(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f13471a = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f13471a == n1Var.f13471a;
    }

    public final int hashCode() {
        return (this.f13471a ? 1231 : 1237) ^ ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", osCodeName=");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append(", isRooted=");
        return g4.c.l(sb2, this.f13471a, "}");
    }
}
