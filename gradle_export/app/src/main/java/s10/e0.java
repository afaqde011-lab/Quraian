package s10;

public abstract class e0 extends m0 {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof h0) {
            string = "\"" + ((Object) ((h0) this).a) + '\"';
        } else {
            string = a().toString();
        }
        return g4.c.k(sb, string, ')');
    }
}
