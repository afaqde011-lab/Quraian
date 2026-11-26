package x00;

import c3.s0;
import java.util.Random;
import kotlin.jvm.internal.m;

public final class b extends a {
    public final s0 C = new s0(10);

    @Override
    public final Random f() {
        Object obj = this.C.get();
        m.d(obj, "get(...)");
        return (Random) obj;
    }
}
