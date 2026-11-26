package l60;

import java.lang.reflect.Type;

public final class i implements f {
    public final int A;
    public final Type B;

    public i(int i, Type type) {
        this.A = i;
        this.B = type;
    }

    @Override
    public final Object a(y yVar) {
        switch (this.A) {
            case 0:
                j jVar = new j(yVar);
                yVar.l(new h(jVar, 0));
                return jVar;
            default:
                j jVar2 = new j(yVar);
                yVar.l(new h(jVar2, 1));
                return jVar2;
        }
    }

    @Override
    public final Type d() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B;
    }
}
