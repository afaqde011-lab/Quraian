package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.Collections;

public final class d0 extends k.d0 {
    public final o9.c0 G;
    public final i0 H;
    public final Context I;
    public o9.u J;
    public ArrayList K;
    public c0 L;
    public RecyclerView M;
    public boolean N;
    public o9.b0 O;
    public final long P;
    public long Q;
    public final d R;

    public d0(Context context) {
        ContextThemeWrapper contextThemeWrapperT = f50.c.t(context, 0, false);
        int I = f50.c.I(contextThemeWrapperT, 2130969554);
        super(contextThemeWrapperT, I == 0 ? f50.c.E(contextThemeWrapperT) : I);
        this.J = o9.u.f11876c;
        this.R = new d(this, 1);
        Context context2 = getContext();
        this.G = o9.c0.d(context2);
        this.H = new i0(this, 4);
        this.I = context2;
        this.P = context2.getResources().getInteger(2131427386);
    }

    public final void e() {
        if (this.O == null && this.N) {
            this.G.getClass();
            o9.c0.b();
            ArrayList arrayList = new ArrayList(o9.c0.c().f11787j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                o9.b0 b0Var = (o9.b0) arrayList.get(i10);
                if (b0Var.d() || !b0Var.f11743g || !b0Var.h(this.J)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, f.C);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.Q;
            long j9 = this.P;
            if (jUptimeMillis < j9) {
                d dVar = this.R;
                dVar.removeMessages(1);
                dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.Q + j9);
            } else {
                this.Q = SystemClock.uptimeMillis();
                this.K.clear();
                this.K.addAll(arrayList);
                this.L.a();
            }
        }
    }

    public final void f(o9.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.J.equals(uVar)) {
            return;
        }
        this.J = uVar;
        if (this.N) {
            o9.c0 c0Var = this.G;
            i0 i0Var = this.H;
            c0Var.h(i0Var);
            c0Var.a(uVar, i0Var, 1);
        }
        e();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.G.a(this.J, this.H, 1);
        e();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559098);
        View decorView = getWindow().getDecorView();
        Context context = this.I;
        decorView.setBackgroundColor(context.getColor(f50.c.O(context) ? 2131100612 : 2131100611));
        this.K = new ArrayList();
        ((ImageButton) findViewById(2131362860)).setOnClickListener(new g0(this, 2));
        this.L = new c0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131362862);
        this.M = recyclerView;
        recyclerView.setAdapter(this.L);
        this.M.setLayoutManager(new LinearLayoutManager(1));
        getWindow().setLayout(!context.getResources().getBoolean(2131034118) ? -1 : b5.t(context), context.getResources().getBoolean(2131034118) ? -2 : -1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.G.h(this.H);
        this.R.removeMessages(1);
    }
}
