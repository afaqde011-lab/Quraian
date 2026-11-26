package d4;

public final class j extends g {
    public final k H;

    public j(k kVar) {
        this.H = kVar;
    }

    @Override
    public final String i() {
        h hVar = (h) this.H.A.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f4609a + "]";
    }
}
