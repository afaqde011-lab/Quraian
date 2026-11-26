package xu;

import d40.j;
import g00.b0;

public final class d implements j {
    public final int A;
    public final f B;

    public d(f fVar, int i) {
        this.A = i;
        this.B = fVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.B.c();
                }
                break;
            default:
                if (((ru.a) obj) == ru.a.B) {
                    this.B.c();
                }
                break;
        }
        return b0.a;
    }
}
