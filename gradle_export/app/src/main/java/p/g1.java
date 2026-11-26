package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

public abstract class g1 {

    public static final Method f12164a;

    public static final Method f12165b;

    public static final Method f12166c;

    public static final boolean f12167d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f12164a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f12165b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f12166c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f12167d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
