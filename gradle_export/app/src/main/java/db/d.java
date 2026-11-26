package db;

import a1.e2;
import android.net.ConnectivityManager;
import hb.p;
import k00.j;
import kotlin.jvm.internal.m;
import za.w;

public final class d implements eb.c {

    public final ConnectivityManager f4846a;

    public d(ConnectivityManager connectivityManager) {
        this.f4846a = connectivityManager;
    }

    @Override
    public final d40.c a(za.e eVar) {
        m.e(eVar, "constraints");
        return new d40.c(new e2(eVar, this, (k00.c) null, 22), j.A, -2, c40.a.A);
    }

    @Override
    public final boolean b(p pVar) {
        m.e(pVar, "workSpec");
        return (pVar.f7013j.a() == null && pVar.f7013j.f17356a == w.A) ? false : true;
    }
}
