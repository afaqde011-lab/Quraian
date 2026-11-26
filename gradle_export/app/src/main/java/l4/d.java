package l4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class d extends ViewGroup.MarginLayoutParams {

    public a f10017a;

    public boolean f10018b;

    public final int f10019c;

    public final int f10020d;

    public final int f10021e;

    public final int f10022f;

    public final int f10023g;

    public int f10024h;

    public int f10025i;

    public int f10026j;

    public View f10027k;
    public View l;
    public boolean m;

    public boolean f10028n;

    public final Rect f10029o;

    public d() {
        super(-2, -2);
        this.f10018b = false;
        this.f10019c = 0;
        this.f10020d = 0;
        this.f10021e = -1;
        this.f10022f = -1;
        this.f10023g = 0;
        this.f10024h = 0;
        this.f10029o = new Rect();
    }

    public d(Context context, AttributeSet attributeSet) {
        a aVar;
        super(context, attributeSet);
        this.f10018b = false;
        this.f10019c = 0;
        this.f10020d = 0;
        this.f10021e = -1;
        this.f10022f = -1;
        this.f10023g = 0;
        this.f10024h = 0;
        this.f10029o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k4.a.f8965b);
        this.f10019c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f10022f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f10020d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f10021e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f10023g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f10024h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f10018b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.T;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.T;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.V;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.U);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException(a1.b.o("Could not inflate Behavior subclass ", string), e3);
                }
            }
            this.f10017a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f10017a;
        if (aVar2 != null) {
            aVar2.g(this);
        }
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10018b = false;
        this.f10019c = 0;
        this.f10020d = 0;
        this.f10021e = -1;
        this.f10022f = -1;
        this.f10023g = 0;
        this.f10024h = 0;
        this.f10029o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10018b = false;
        this.f10019c = 0;
        this.f10020d = 0;
        this.f10021e = -1;
        this.f10022f = -1;
        this.f10023g = 0;
        this.f10024h = 0;
        this.f10029o = new Rect();
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f10018b = false;
        this.f10019c = 0;
        this.f10020d = 0;
        this.f10021e = -1;
        this.f10022f = -1;
        this.f10023g = 0;
        this.f10024h = 0;
        this.f10029o = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f10028n;
    }
}
