package ib;

import a1.z;
import ab.y;
import androidx.work.impl.WorkDatabase;
import g00.b0;

public final class b implements u00.a {
    public final int A = 0;
    public final String B;
    public final y C;

    public b(y yVar, String str) {
        this.C = yVar;
        this.B = str;
    }

    public b(String str, y yVar) {
        this.B = str;
        this.C = yVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                y yVar = this.C;
                WorkDatabase workDatabase = yVar.f420c;
                kotlin.jvm.internal.m.d(workDatabase, "getWorkDatabase(...)");
                workDatabase.o(new z(new a(workDatabase, this.B, yVar, 1), 14));
                ab.l.b(yVar.f419b, workDatabase, yVar.f422e);
                break;
            default:
                y yVar2 = this.C;
                WorkDatabase workDatabase2 = yVar2.f420c;
                kotlin.jvm.internal.m.d(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.o(new z(new a(workDatabase2, this.B, yVar2, 0), 14));
                ab.l.b(yVar2.f419b, workDatabase2, yVar2.f422e);
                break;
        }
        return b0.a;
    }
}
