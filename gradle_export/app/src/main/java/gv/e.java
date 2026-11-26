package gv;

public final class e implements u00.k {
    public final int A;
    public final l1.y0 B;

    public e(l1.y0 y0Var, int i) {
        this.A = i;
        this.B = y0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                this.B.i(((Integer) obj).intValue());
                break;
            case 1:
                this.B.i((int) (((y3.l) obj).a >> 32));
                break;
            case 2:
                this.B.i((int) (((y3.l) obj).a >> 32));
                break;
            case 3:
                this.B.i((int) (((y3.l) obj).a >> 32));
                break;
            case 4:
                this.B.i((int) (((y3.l) obj).a >> 32));
                break;
            case 5:
                this.B.i((int) (((y3.l) obj).a >> 32));
                break;
            case 6:
                this.B.i((int) (((y3.l) obj).a & 4294967295L));
                break;
            default:
                this.B.i((int) (((y3.l) obj).a & 4294967295L));
                break;
        }
        return g00.b0.a;
    }
}
