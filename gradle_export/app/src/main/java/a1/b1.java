package a1;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c3.c3;
import com.google.protobuf.RuntimeVersion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class b1 implements c3.m2 {

    public final View f16a;

    public final u0 f17b;

    public q0.j1 f20e;

    public e1.v0 f21f;

    public c3 f22g;
    public Rect l;
    public final y0 m;

    public u00.k f18c = new s0(1);

    public u00.k f19d = new s0(2);

    public r3.w f23h = new r3.w(RuntimeVersion.SUFFIX, m3.q0.f10518b, 4);

    public r3.j f24i = r3.j.f13072g;

    public final ArrayList f25j = new ArrayList();

    public final Object f26k = rd.a.I(g00.i.C, new z(this, 2));

    public b1(View view, e eVar, u0 u0Var) {
        this.f16a = view;
        this.f17b = u0Var;
        this.m = new y0(eVar, u0Var);
    }

    @Override
    public final InputConnection a(EditorInfo editorInfo) {
        r3.w wVar = this.f23h;
        x0.F(editorInfo, wVar.f13099a.B, wVar.f13100b, this.f24i);
        z0 z0Var = a1.f4a;
        if (v5.g.d()) {
            v5.g.a().i(editorInfo);
        }
        f1 f1Var = new f1(this.f23h, new me.i(this, 1), this.f24i.f13075c, this.f20e, this.f21f, this.f22g);
        this.f25j.add(new WeakReference(f1Var));
        return f1Var;
    }
}
