package ct;

public final class e implements l1.y {
    public final int a;
    public final b b;

    public e(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.a.release();
                break;
            default:
                b bVar = this.b;
                bVar.b = false;
                bVar.a.pause();
                break;
        }
    }
}
