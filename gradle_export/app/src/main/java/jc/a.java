package jc;

import fc.f;
import fc.h;
import fc.l;
import java.util.List;

public final class a extends f5.c {
    public final int C;

    public a(int i10, List list) {
        super(list, 2);
        this.C = i10;
    }

    @Override
    public final fc.e m0() {
        switch (this.C) {
            case 0:
                return new f(0, (List) this.B);
            case 1:
                return new h(0, (List) this.B);
            case 2:
                return new f(2, (List) this.B);
            case 3:
                return new h(1, (List) this.B);
            case 4:
                return new h(2, (List) this.B);
            case 5:
                return new l((List) this.B);
            default:
                return new f(3, (List) this.B);
        }
    }
}
