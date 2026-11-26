package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h extends k.d0 {
    public final o9.c0 G;
    public final i0 H;
    public o9.u I;
    public ArrayList J;
    public TextView K;
    public TextView L;
    public RelativeLayout M;
    public TextView N;
    public TextView O;
    public LinearLayout P;
    public Button Q;
    public ProgressBar R;
    public ListView S;
    public e T;
    public final g U;
    public boolean V;
    public long W;
    public final d X;

    public h(Context context, int i10) {
        ContextThemeWrapper contextThemeWrapperT = f50.c.t(context, i10, false);
        int I = f50.c.I(contextThemeWrapperT, 2130969554);
        super(contextThemeWrapperT, I == 0 ? f50.c.E(contextThemeWrapperT) : I);
        this.I = o9.u.f11876c;
        this.X = new d(this, 0);
        this.G = o9.c0.d(getContext());
        this.H = new i0(this, 2);
        this.U = new g(this, 0);
    }

    @Override
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.U);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.W = SystemClock.uptimeMillis();
        this.J.clear();
        this.J.addAll(list);
        this.T.notifyDataSetChanged();
        d dVar = this.X;
        dVar.removeMessages(3);
        dVar.removeMessages(2);
        if (!list.isEmpty()) {
            h(1);
        } else {
            h(0);
            dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.V) {
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
                if (b0Var.d() || !b0Var.f11743g || !b0Var.h(this.I)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, f.B);
            if (SystemClock.uptimeMillis() - this.W >= 300) {
                e(arrayList);
                return;
            }
            d dVar = this.X;
            dVar.removeMessages(1);
            dVar.sendMessageAtTime(dVar.obtainMessage(1, arrayList), this.W + 300);
        }
    }

    public final void g(o9.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.I.equals(uVar)) {
            return;
        }
        this.I = uVar;
        if (this.V) {
            o9.c0 c0Var = this.G;
            i0 i0Var = this.H;
            c0Var.h(i0Var);
            c0Var.a(uVar, i0Var, 1);
        }
        f();
    }

    public final void h(int i10) {
        if (i10 == 0) {
            setTitle(2131886809);
            this.S.setVisibility(8);
            this.L.setVisibility(0);
            this.R.setVisibility(0);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            this.O.setVisibility(8);
            this.M.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(2131886809);
            this.S.setVisibility(0);
            this.L.setVisibility(8);
            this.R.setVisibility(8);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            this.O.setVisibility(8);
            this.M.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(2131886809);
            this.S.setVisibility(8);
            this.L.setVisibility(8);
            this.R.setVisibility(0);
            this.P.setVisibility(8);
            this.Q.setVisibility(8);
            this.O.setVisibility(4);
            this.M.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(2131886817);
        this.S.setVisibility(8);
        this.L.setVisibility(8);
        this.R.setVisibility(8);
        this.P.setVisibility(0);
        this.Q.setVisibility(0);
        this.O.setVisibility(0);
        this.M.setVisibility(0);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
        this.G.a(this.I, this.H, 1);
        f();
        d dVar = this.X;
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        dVar.removeMessages(1);
        dVar.sendMessageDelayed(dVar.obtainMessage(2), 5000L);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(2131559094);
        this.J = new ArrayList();
        this.T = new e(getContext(), this.J);
        this.K = (TextView) findViewById(2131362841);
        this.L = (TextView) findViewById(2131362840);
        this.M = (RelativeLayout) findViewById(2131362844);
        this.N = (TextView) findViewById(2131362845);
        this.O = (TextView) findViewById(2131362842);
        this.P = (LinearLayout) findViewById(2131362834);
        this.Q = (Button) findViewById(2131362833);
        this.R = (ProgressBar) findViewById(2131362839);
        Context context = getContext();
        boolean z11 = false;
        if (g4.f3763b == null) {
            if (g4.S(context)) {
                z10 = false;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (g4.f3767f == null) {
                    g4.f3767f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (g4.f3767f.booleanValue()) {
                    z10 = false;
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (g4.f3768g == null) {
                        g4.f3768g = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.automotive"));
                    }
                    if (g4.f3768g.booleanValue() || g4.T(context)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
            g4.f3763b = Boolean.valueOf(z10);
        }
        if (g4.f3763b.booleanValue()) {
            string = context.getString(2131886812);
        } else {
            if (g4.f3765d == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                g4.f3765d = Boolean.valueOf(z11);
            }
            if (g4.f3765d.booleanValue()) {
                string = context.getString(2131886812);
            } else if (g4.S(context) || g4.R(context.getResources())) {
                string = context.getString(2131886813);
            } else if (g4.T(context)) {
                string = context.getString(2131886814);
            } else {
                PackageManager packageManager3 = context.getPackageManager();
                if (g4.f3767f == null) {
                    g4.f3767f = Boolean.valueOf(packageManager3.hasSystemFeature("android.hardware.type.watch"));
                }
                if (g4.f3767f.booleanValue()) {
                    string = context.getString(2131886816);
                } else {
                    PackageManager packageManager4 = context.getPackageManager();
                    if (g4.f3768g == null) {
                        g4.f3768g = Boolean.valueOf(packageManager4.hasSystemFeature("android.hardware.type.automotive"));
                    }
                    string = g4.f3768g.booleanValue() ? context.getString(2131886811) : context.getString(2131886815);
                }
            }
        }
        this.N.setText(string);
        this.O.setMovementMethod(LinkMovementMethod.getInstance());
        this.Q.setOnClickListener(new c(this, 0));
        ListView listView = (ListView) findViewById(2131362832);
        this.S = listView;
        listView.setAdapter((ListAdapter) this.T);
        this.S.setOnItemClickListener(this.T);
        this.S.setEmptyView(findViewById(R.id.empty));
        getWindow().setLayout(b5.t(getContext()), -2);
        getContext().registerReceiver(this.U, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override
    public final void onDetachedFromWindow() {
        this.V = false;
        this.G.h(this.H);
        d dVar = this.X;
        dVar.removeMessages(1);
        dVar.removeMessages(2);
        dVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override
    public final void setTitle(int i10) {
        this.K.setText(i10);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}
