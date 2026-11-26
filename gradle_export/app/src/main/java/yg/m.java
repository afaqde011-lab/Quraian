package yg;

import java.util.Set;

public final class m {

    public final String f16887a;

    public final Set f16888b;

    public m(String str, Set set) {
        this.f16887a = str;
        this.f16888b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            String str = mVar.f16887a;
            String str2 = this.f16887a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f16888b.equals(mVar.f16888b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16887a;
        return this.f16888b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return oi.k.m(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f16887a, ", verdictOptOut=", this.f16888b.toString(), "}");
    }
}
