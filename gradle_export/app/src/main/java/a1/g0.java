package a1;

import java.util.ArrayList;

public final class g0 implements d40.j {
    public final int A;
    public final ArrayList B;
    public final l1.z0 C;

    public g0(ArrayList arrayList, l1.z0 z0Var, int i10) {
        this.A = i10;
        this.B = arrayList;
        this.C = z0Var;
    }

    public final Object emit(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                f0.h hVar = (f0.h) obj;
                boolean z10 = hVar instanceof e0;
                ArrayList arrayList = this.B;
                if (z10) {
                    arrayList.add(hVar);
                } else if (hVar instanceof f0) {
                    arrayList.remove(((f0) hVar).f33a);
                }
                this.C.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                f0.h hVar2 = (f0.h) obj;
                boolean z11 = hVar2 instanceof f0.d;
                ArrayList arrayList2 = this.B;
                if (z11) {
                    arrayList2.add(hVar2);
                } else if (hVar2 instanceof f0.e) {
                    arrayList2.remove(((f0.e) hVar2).f5474a);
                }
                this.C.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return g00.b0.a;
    }
}
