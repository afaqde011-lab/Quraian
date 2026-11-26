package l9;

public abstract class q {

    public final Object f10177a;

    public boolean f10178b;

    public boolean f10179c;

    public boolean f10180d;

    public q(Object obj) {
        this.f10177a = obj;
    }

    public void a() {
        boolean z10 = this.f10178b;
        Object obj = this.f10177a;
        if (z10) {
            throw new IllegalStateException(g4.c.h(obj, "detach() called when detach() had already been called for: "));
        }
        if (this.f10179c) {
            throw new IllegalStateException(g4.c.h(obj, "detach() called when sendResult() had already been called for: "));
        }
        if (this.f10180d) {
            throw new IllegalStateException(g4.c.h(obj, "detach() called when sendError() had already been called for: "));
        }
        this.f10178b = true;
    }

    public final boolean b() {
        return this.f10178b || this.f10179c || this.f10180d;
    }

    public void c() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f10177a);
    }

    public abstract void d(Object obj);

    public final void e() {
        if (this.f10179c || this.f10180d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f10177a);
        }
        this.f10180d = true;
        c();
    }

    public final void f(Object obj) {
        if (this.f10179c || this.f10180d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f10177a);
        }
        this.f10179c = true;
        d(obj);
    }
}
