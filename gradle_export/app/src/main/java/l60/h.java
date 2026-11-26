package l60;

import retrofit2.HttpException;

public final class h implements g {
    public final int A;
    public final j B;

    public h(j jVar, int i) {
        this.A = i;
        this.B = jVar;
    }

    @Override
    public final void l(d dVar, o0 o0Var) {
        switch (this.A) {
            case 0:
                boolean zI = o0Var.a.i();
                j jVar = this.B;
                if (!zI) {
                    jVar.completeExceptionally(new HttpException(o0Var));
                } else {
                    jVar.complete(o0Var.b);
                }
                break;
            default:
                this.B.complete(o0Var);
                break;
        }
    }

    @Override
    public final void w0(d dVar, Throwable th) {
        switch (this.A) {
            case 0:
                this.B.completeExceptionally(th);
                break;
            default:
                this.B.completeExceptionally(th);
                break;
        }
    }
}
