package l1;

public interface y0 extends z0, p2 {
    @Override
    default Object getValue() {
        return Integer.valueOf(((f1) this).h());
    }

    @Override
    default void setValue(Object obj) {
        ((f1) this).i(((Number) obj).intValue());
    }
}
