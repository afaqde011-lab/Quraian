package a2;

public final class l extends Exception {
    public final String A;

    public l(String str) {
        super(str);
        this.A = str;
    }

    @Override
    public final String getMessage() {
        return this.A;
    }
}
