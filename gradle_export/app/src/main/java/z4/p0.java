package z4;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class p0 extends WindowInsetsAnimation.Callback {

    public final f7.e f17217a;

    public List f17218b;

    public ArrayList f17219c;

    public final HashMap f17220d;

    public p0(f7.e eVar) {
        super(eVar.B);
        this.f17220d = new HashMap();
        this.f17217a = eVar;
    }

    public final q0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f17220d;
        q0 q0Var = (q0) map.get(windowInsetsAnimation);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0();
        q0Var2.f17221a = new wi.b(new WindowInsetsAnimation(0, null, 0L), 12);
        q0Var2.f17221a = new wi.b(windowInsetsAnimation, 12);
        map.put(windowInsetsAnimation, q0Var2);
        return q0Var2;
    }

    @Override
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f17217a.m(a(windowInsetsAnimation));
        this.f17220d.remove(windowInsetsAnimation);
    }

    @Override
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f17217a.n(a(windowInsetsAnimation));
    }

    @Override
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f17219c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f17219c = arrayList2;
            this.f17218b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            q0 q0VarA = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) q0VarA.f17221a.B).setFraction(windowInsetsAnimation.getFraction());
            this.f17219c.add(q0VarA);
        }
        return this.f17217a.o(j1.g(null, windowInsets), this.f17218b).f();
    }

    @Override
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        q3.e0 e0VarP = this.f17217a.p(a(windowInsetsAnimation), new q3.e0(bounds));
        e0VarP.getClass();
        return new WindowInsetsAnimation.Bounds(((q4.b) e0VarP.B).e(), ((q4.b) e0VarP.C).e());
    }
}
