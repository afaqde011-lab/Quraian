package v4;

import android.util.Base64;
import java.util.List;
import oi.k;

public final class c {

    public final String f15434a;

    public final String f15435b;

    public final String f15436c;

    public final List f15437d;

    public final String f15438e;

    public final String f15439f;

    public final String f15440g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f15434a = str;
        str2.getClass();
        this.f15435b = str2;
        this.f15436c = str3;
        list.getClass();
        this.f15437d = list;
        this.f15438e = str4;
        this.f15439f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.f15440g = k.m(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f15434a + ", mProviderPackage: " + this.f15435b + ", mQuery: " + this.f15436c + ", mSystemFont: " + this.f15438e + ", mVariationSettings: " + this.f15439f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f15437d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
