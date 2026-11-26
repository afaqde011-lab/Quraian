package k20;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class f extends a {
    public static final f g;
    public static final f h;
    public final boolean f;

    static {
        f fVar = new f(new int[]{2, 3, 0}, false);
        g = fVar;
        int i = fVar.c;
        int i2 = fVar.b;
        h = (i2 == 1 && i == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i2, i + 1, 0}, false);
        new f(new int[0], false);
    }

    public f(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        m.e(versionArray, "versionArray");
        this.f = z;
    }

    public final boolean b(f metadataVersionFromLanguageVersion) {
        m.e(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        f fVar = this.f ? g : h;
        int i = fVar.b;
        int i2 = metadataVersionFromLanguageVersion.b;
        if (i > i2 || (i >= i2 && fVar.c > metadataVersionFromLanguageVersion.c)) {
            metadataVersionFromLanguageVersion = fVar;
        }
        int i3 = this.c;
        boolean z = false;
        int i4 = this.b;
        if ((i4 == 1 && i3 == 0) || i4 == 0) {
            return false;
        }
        int i5 = metadataVersionFromLanguageVersion.b;
        if (i4 > i5 || (i4 >= i5 && i3 > metadataVersionFromLanguageVersion.c)) {
            z = true;
        }
        return !z;
    }
}
