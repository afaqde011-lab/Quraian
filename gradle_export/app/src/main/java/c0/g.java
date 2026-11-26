package c0;

import g00.b0;

public final class g implements u00.a {
    public final int A;
    public final boolean B;
    public final u00.a C;

    public g(boolean z11, u00.a aVar, int i11) {
        this.A = i11;
        this.B = z11;
        this.C = aVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                if (this.B) {
                    this.C.invoke();
                }
                break;
            case 1:
                if (!this.B) {
                    this.C.invoke();
                }
                break;
            case 2:
                if (!this.B) {
                    this.C.invoke();
                }
                break;
            case 3:
                if (!this.B) {
                    this.C.invoke();
                }
                break;
            default:
                if (!this.B) {
                    this.C.invoke();
                }
                break;
        }
        return b0.f7770a;
    }
}
