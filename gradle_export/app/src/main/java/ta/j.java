package ta;

import android.view.View;
import java.util.ArrayList;

public final class j implements r {

    public final View f14462a;

    public final ArrayList f14463b;

    public j(View view, ArrayList arrayList) {
        this.f14462a = view;
        this.f14463b = arrayList;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b(t tVar) {
    }

    @Override
    public final void c(t tVar) {
        tVar.D(this);
        tVar.a(this);
    }

    @Override
    public final void d(t tVar) {
        tVar.D(this);
        this.f14462a.setVisibility(8);
        ArrayList arrayList = this.f14463b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override
    public final void e() {
    }
}
