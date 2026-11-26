package po;

import g00.b0;

public final class e implements u00.a {
    public final int A;
    public final u00.a B;
    public final u00.a C;

    public e(u00.a aVar, u00.a aVar2, int i) {
        this.A = i;
        this.B = aVar;
        this.C = aVar2;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke();
                this.C.invoke();
                break;
            case 1:
                this.B.invoke();
                this.C.invoke();
                break;
            case 2:
                this.B.invoke();
                this.C.invoke();
                break;
            default:
                this.B.invoke();
                this.C.invoke();
                break;
        }
        return b0.a;
    }
}
