package f7;

import java.util.ArrayList;
import java.util.Arrays;

public final class c extends e {
    public final long C;
    public final ArrayList D;
    public final ArrayList E;

    public c(int i10, long j9) {
        super(i10, 0);
        this.C = j9;
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    public final c q(int i10) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.B == i10) {
                return cVar;
            }
        }
        return null;
    }

    public final d r(int i10) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.B == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return e.b(this.B) + " leaves: " + Arrays.toString(this.D.toArray()) + " containers: " + Arrays.toString(this.E.toArray());
    }
}
