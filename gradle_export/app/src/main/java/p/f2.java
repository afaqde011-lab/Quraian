package p;

public final class f2 {

    public int f12155a;

    public int f12156b;

    public int f12157c;

    public int f12158d;

    public int f12159e;

    public int f12160f;

    public boolean f12161g;

    public boolean f12162h;

    public final void a(int i10, int i11) {
        this.f12157c = i10;
        this.f12158d = i11;
        this.f12162h = true;
        if (this.f12161g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f12155a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f12156b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f12155a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f12156b = i11;
        }
    }
}
