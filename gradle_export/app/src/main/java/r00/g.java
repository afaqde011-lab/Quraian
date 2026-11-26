package r00;

import java.io.File;
import kotlin.jvm.internal.m;

public abstract class g {
    public final File a;

    public g(File root) {
        m.e(root, "root");
        this.a = root;
    }

    public abstract File a();
}
