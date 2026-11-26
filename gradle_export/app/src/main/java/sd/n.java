package sd;

import java.util.ArrayList;

public final class n {

    public final int f14025a;

    public final String f14026b;

    public ArrayList f14027c = null;

    public ArrayList f14028d = null;

    public n(int i10, String str) {
        this.f14025a = 0;
        this.f14026b = null;
        this.f14025a = i10 == 0 ? 1 : i10;
        this.f14026b = str;
    }

    public final void a(String str, int i10, String str2) {
        if (this.f14027c == null) {
            this.f14027c = new ArrayList();
        }
        this.f14027c.add(new b(str, i10, str2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f14025a;
        if (i10 == 2) {
            sb2.append("> ");
        } else if (i10 == 3) {
            sb2.append("+ ");
        }
        String str = this.f14026b;
        if (str == null) {
            str = "*";
        }
        sb2.append(str);
        ArrayList<b> arrayList = this.f14027c;
        if (arrayList != null) {
            for (b bVar : arrayList) {
                sb2.append('[');
                String str2 = bVar.f13948a;
                String str3 = bVar.f13950c;
                sb2.append(str2);
                int iB = e4.f.b(bVar.f13949b);
                if (iB == 1) {
                    sb2.append('=');
                    sb2.append(str3);
                } else if (iB == 2) {
                    sb2.append("~=");
                    sb2.append(str3);
                } else if (iB == 3) {
                    sb2.append("|=");
                    sb2.append(str3);
                }
                sb2.append(']');
            }
        }
        ArrayList<e> arrayList2 = this.f14028d;
        if (arrayList2 != null) {
            for (e eVar : arrayList2) {
                sb2.append(':');
                sb2.append(eVar);
            }
        }
        return sb2.toString();
    }
}
