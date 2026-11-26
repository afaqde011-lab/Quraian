package nv;

import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import k9.a4;
import k9.y1;
import k9.z3;

public abstract class t {
    public static final z3 a;
    public static final z3 b;

    static {
        Bundle bundle = Bundle.EMPTY;
        a = new z3("SAVE_TO_FAVORITES", bundle);
        b = new z3("TOGGLE_REPEAT", bundle);
    }

    public static a4 a(boolean z) {
        a4 a4Var = y1.e;
        a4Var.getClass();
        HashSet hashSet = new HashSet((Collection) a4Var.a);
        z3 z3Var = a;
        z3Var.getClass();
        hashSet.add(z3Var);
        if (z) {
            z3 z3Var2 = b;
            z3Var2.getClass();
            hashSet.add(z3Var2);
        }
        return new a4(hashSet);
    }
}
