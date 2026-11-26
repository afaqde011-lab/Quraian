package g4;

import h4.m;
import java.util.ArrayList;

public abstract class j extends e {

    public e[] f6205p0 = new e[4];

    public int f6206q0 = 0;

    public final void M(int i10, m mVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f6206q0; i11++) {
            e eVar = this.f6205p0[i11];
            ArrayList arrayList2 = mVar.f6593a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i12 = 0; i12 < this.f6206q0; i12++) {
            h4.g.b(this.f6205p0[i12], i10, arrayList, mVar);
        }
    }

    public void N() {
    }
}
