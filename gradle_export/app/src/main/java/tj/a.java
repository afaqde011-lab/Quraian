package tj;

import li.b;
import vj.d;

public final class a implements Runnable {
    public final int A;
    public final b B;
    public final d C;

    public a(b bVar, d dVar, int i10) {
        this.A = i10;
        this.B = bVar;
        this.C = dVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.a(this.C);
                break;
            default:
                this.B.a(this.C);
                break;
        }
    }
}
