package eh;

public final enum p extends t {
    public p() {
        super("ALWAYS_TRUE", 0);
    }

    @Override
    public final boolean apply(Object obj) {
        return true;
    }

    @Override
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
