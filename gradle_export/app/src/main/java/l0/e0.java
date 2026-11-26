package l0;

import java.util.Comparator;

public final class e0 implements Comparator {
    public final int A;
    public final c50.h B;

    public e0(c50.h hVar, int i10) {
        this.A = i10;
        this.B = hVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Object key = ((p0) obj).getKey();
                c50.h hVar = this.B;
                return p30.f.Z(Integer.valueOf(hVar.l(key)), Integer.valueOf(hVar.l(((p0) obj2).getKey())));
            case 1:
                Object key2 = ((p0) obj).getKey();
                c50.h hVar2 = this.B;
                return p30.f.Z(Integer.valueOf(hVar2.l(key2)), Integer.valueOf(hVar2.l(((p0) obj2).getKey())));
            case 2:
                Object key3 = ((p0) obj2).getKey();
                c50.h hVar3 = this.B;
                return p30.f.Z(Integer.valueOf(hVar3.l(key3)), Integer.valueOf(hVar3.l(((p0) obj).getKey())));
            default:
                Object key4 = ((p0) obj2).getKey();
                c50.h hVar4 = this.B;
                return p30.f.Z(Integer.valueOf(hVar4.l(key4)), Integer.valueOf(hVar4.l(((p0) obj).getKey())));
        }
    }
}
