package bh;

public abstract class g implements Runnable {
    public final xf.g A;

    public g() {
        this.A = null;
    }

    public g(xf.g gVar) {
        this.A = gVar;
    }

    public abstract void a();

    @Override
    public final void run() {
        try {
            a();
        } catch (Exception e3) {
            xf.g gVar = this.A;
            if (gVar != null) {
                gVar.c(e3);
            }
        }
    }
}
