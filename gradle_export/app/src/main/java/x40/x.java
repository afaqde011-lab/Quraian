package x40;

public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String A;

    x(String str) {
        this.A = str;
    }

    @Override
    public final String toString() {
        return this.A;
    }
}
