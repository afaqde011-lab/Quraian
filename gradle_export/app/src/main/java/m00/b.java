package m00;

public final class b implements k00.c {
    public static final b A = new b();

    @Override
    public final k00.i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
