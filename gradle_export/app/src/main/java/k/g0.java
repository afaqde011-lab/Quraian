package k;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p.v0;
import u.s0;

public class g0 {

    public static final Class[] f8405b = {Context.class, AttributeSet.class};

    public static final int[] f8406c = {R.attr.onClick};

    public static final String[] f8407d = {"android.widget.", "android.view.", "android.webkit."};

    public static final s0 f8408e = new s0(0);

    public final Object[] f8409a = new Object[2];

    public p.n a(Context context, AttributeSet attributeSet) {
        return new p.n(context, attributeSet);
    }

    public p.o b(Context context, AttributeSet attributeSet) {
        return new p.o(context, attributeSet, 2130968743);
    }

    public p.p c(Context context, AttributeSet attributeSet) {
        return new p.p(context, attributeSet, 2130968817);
    }

    public p.a0 d(Context context, AttributeSet attributeSet) {
        return new p.a0(context, attributeSet);
    }

    public v0 e(Context context, AttributeSet attributeSet) {
        return new v0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        s0 s0Var = f8408e;
        Constructor constructor = (Constructor) s0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8405b);
            s0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f8409a);
    }
}
