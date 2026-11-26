package dh;

public abstract class x implements Runnable {
    public final xf.g A;

    public x() {
        this.A = null;
    }

    public x(xf.g gVar) {
        this.A = gVar;
    }

    public void a(Exception exc) {
        xf.g gVar = this.A;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public abstract void b();

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e3) {
            a(e3);
        }
    }
}
