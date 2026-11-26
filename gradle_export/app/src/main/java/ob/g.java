package ob;

import java.io.Closeable;

public final class g implements Closeable {
    public final c A;

    public g(c cVar) {
        this.A = cVar;
    }

    @Override
    public final void close() {
        this.A.close();
    }
}
