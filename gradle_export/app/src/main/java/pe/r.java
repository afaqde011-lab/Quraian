package pe;

public final class r extends s {

    public final n f12520e;

    public r(n nVar) {
        super(false, null, null);
        this.f12520e = nVar;
    }

    @Override
    public final String a() {
        try {
            return (String) this.f12520e.call();
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
