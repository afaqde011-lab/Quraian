package j60;

public final class c implements AutoCloseable {
    public final String A;
    public final s50.a B;

    public c(String str, s50.a aVar) {
        this.A = str;
        this.B = aVar;
    }

    @Override
    public final void close() {
        c60.a aVar = this.B.c;
        aVar.getClass();
        e60.a aVar2 = (e60.a) aVar.c.get(this.A);
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
    }
}
