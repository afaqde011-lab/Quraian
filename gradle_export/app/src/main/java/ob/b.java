package ob;

import java.io.IOException;
import java.util.ArrayList;
import k50.z;

public final class b {

    public final String f11907a;

    public final long[] f11908b = new long[2];

    public final ArrayList f11909c = new ArrayList(2);

    public final ArrayList f11910d = new ArrayList(2);

    public boolean f11911e;

    public boolean f11912f;

    public c7.c f11913g;

    public int f11914h;

    public final e f11915i;

    public b(e eVar, String str) {
        this.f11915i = eVar;
        this.f11907a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f11909c.add(this.f11915i.A.e(sb2.toString()));
            sb2.append(".tmp");
            this.f11910d.add(this.f11915i.A.e(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f11911e || this.f11913g != null || this.f11912f) {
            return null;
        }
        ArrayList arrayList = this.f11909c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            e eVar = this.f11915i;
            if (i10 >= size) {
                this.f11914h++;
                return new c(eVar, this);
            }
            if (!eVar.P.g((z) arrayList.get(i10))) {
                try {
                    eVar.I(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
