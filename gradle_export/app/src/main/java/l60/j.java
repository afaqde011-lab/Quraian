package l60;

import java.util.concurrent.CompletableFuture;

public final class j extends CompletableFuture {
    public final y A;

    public j(y yVar) {
        this.A = yVar;
    }

    @Override
    public final boolean cancel(boolean z) {
        if (z) {
            this.A.cancel();
        }
        return super.cancel(z);
    }
}
