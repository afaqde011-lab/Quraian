package l0;

import android.os.Build;
import java.util.Locale;

public abstract class m1 {

    public static final l1 f9777a;

    static {
        l1 l1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("robolectric")) {
                l1Var = new l1();
            } else {
                l1Var = null;
            }
        } else {
            l1Var = null;
        }
        f9777a = l1Var;
    }
}
