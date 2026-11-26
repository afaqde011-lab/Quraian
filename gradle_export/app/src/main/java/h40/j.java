package h40;

import a40.c0;

public final class j extends i {
    public final Runnable C;

    public j(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.C = runnable;
    }

    @Override
    public final void run() {
        this.C.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.C;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(c0.q(runnable));
        sb.append(", ");
        sb.append(this.A);
        sb.append(", ");
        return g4.c.k(sb, this.B ? "Blocking" : "Non-blocking", ']');
    }
}
