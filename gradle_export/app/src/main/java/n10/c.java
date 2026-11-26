package n10;

import j10.b1;
import j10.f1;

public final class c extends f1 {
    public static final c c = new c("protected_static", true);

    @Override
    public final String b() {
        return "protected/*protected static*/";
    }

    @Override
    public final f1 c() {
        return b1.c;
    }
}
