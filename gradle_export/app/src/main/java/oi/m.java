package oi;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class m implements Callable {

    public final long f12013a;

    public final n f12014b;

    public m(n nVar, long j9) {
        this.f12014b = nVar;
        this.f12013a = j9;
    }

    @Override
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f12013a);
        this.f12014b.f12027k.A(bundle);
        return null;
    }
}
