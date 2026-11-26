package pm;

import android.content.res.Resources;
import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class c {
    public final Resources a;

    public c(Resources resources) {
        this.a = resources;
    }

    public final String a(int i, Object... objArr) {
        String string = this.a.getString(i, Arrays.copyOf(objArr, objArr.length));
        m.d(string, "getString(...)");
        return string;
    }
}
