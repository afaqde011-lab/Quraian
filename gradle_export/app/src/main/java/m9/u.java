package m9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.f1;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.q2;
import androidx.media3.common.r0;
import androidx.media3.common.r2;
import androidx.media3.common.s2;
import androidx.media3.common.x2;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaError;
import fh.d2;
import fh.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.x0;

public final class u extends FrameLayout {

    public static final float[] f10735h1;
    public final z A;
    public final String A0;
    public final Resources B;
    public final String B0;
    public final Handler C;
    public final Drawable C0;
    public final j D;
    public final Drawable D0;
    public final Class E;
    public final float E0;
    public final Method F;
    public final float F0;
    public final Method G;
    public final String G0;
    public final Class H;
    public final String H0;
    public final Method I;
    public final Drawable I0;
    public final Method J;
    public final Drawable J0;
    public final CopyOnWriteArrayList K;
    public final String K0;
    public final RecyclerView L;
    public final String L0;
    public final p M;
    public final Drawable M0;
    public final m N;
    public final Drawable N0;
    public final i O;
    public final String O0;
    public final i P;
    public final String P0;
    public final gi.c Q;
    public f1 Q0;
    public final PopupWindow R;
    public boolean R0;
    public final int S;
    public boolean S0;
    public final ImageView T;
    public boolean T0;
    public final ImageView U;
    public boolean U0;
    public final ImageView V;
    public boolean V0;
    public final View W;
    public boolean W0;
    public int X0;
    public boolean Y0;
    public int Z0;

    public final View f10736a0;

    public int f10737a1;

    public final TextView f10738b0;

    public long[] f10739b1;

    public final TextView f10740c0;

    public boolean[] f10741c1;

    public final ImageView f10742d0;

    public final long[] f10743d1;

    public final ImageView f10744e0;

    public final boolean[] f10745e1;

    public final ImageView f10746f0;

    public long f10747f1;

    public final ImageView f10748g0;

    public boolean f10749g1;

    public final ImageView f10750h0;

    public final ImageView f10751i0;

    public final View f10752j0;

    public final View f10753k0;

    public final View f10754l0;

    public final TextView f10755m0;

    public final TextView f10756n0;

    public final k0 f10757o0;

    public final StringBuilder f10758p0;

    public final Formatter f10759q0;

    public final h2 f10760r0;

    public final j2 f10761s0;

    public final f f10762t0;

    public final Drawable f10763u0;

    public final Drawable f10764v0;

    public final Drawable f10765w0;

    public final Drawable f10766x0;

    public final Drawable f10767y0;

    public final String f10768z0;

    static {
        r0.a("media3.ui");
        f10735h1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public u(Context context, AttributeSet attributeSet) throws NoSuchMethodException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i22;
        int i23;
        int i24;
        boolean z17;
        Class<ExoPlayer> cls;
        Method method;
        Method method2;
        Class<?> cls2;
        Method method3;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        androidx.mediarouter.app.c cVar;
        int i25;
        ImageView imageView3;
        androidx.mediarouter.app.c cVar2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        k0 k0Var;
        View viewFindViewById4;
        Handler.Callback callback;
        k0 k0Var2;
        Resources resources;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        Typeface typefaceA;
        ImageView imageView7;
        TextView textView;
        View view;
        ImageView imageView8;
        TextView textView2;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        boolean z18;
        super(context, null, 0);
        Class cls3 = Boolean.TYPE;
        this.U0 = true;
        this.X0 = 5000;
        this.f10737a1 = 0;
        this.Z0 = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
        int resourceId = 2131558748;
        int resourceId2 = 2131231021;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e0.f10656c, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, 2131558748);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, 2131231021);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, 2131231020);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, 2131231017);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, 2131231030);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, 2131231022);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, 2131231031);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, 2131231016);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, 2131231015);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, 2131231024);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, 2131231025);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, 2131231023);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, 2131231029);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, 2131231028);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, 2131231034);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, 2131231033);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, 2131231035);
                this.X0 = typedArrayObtainStyledAttributes.getInt(32, this.X0);
                this.f10737a1 = typedArrayObtainStyledAttributes.getInt(19, this.f10737a1);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.Y0 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.Z0));
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i12 = resourceId8;
                i16 = resourceId5;
                i22 = resourceId17;
                i20 = resourceId14;
                z15 = z21;
                i17 = resourceId10;
                i21 = resourceId15;
                z16 = z19;
                i18 = resourceId12;
                z13 = z23;
                i19 = resourceId13;
                z14 = z22;
                i13 = resourceId9;
                i15 = resourceId4;
                i10 = resourceId6;
                z11 = z25;
                i23 = resourceId7;
                i24 = resourceId16;
                z17 = z20;
                i11 = resourceId11;
                z12 = z24;
                i14 = resourceId3;
                z10 = z26;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i10 = 2131231022;
            i11 = 2131231025;
            i12 = 2131231016;
            i13 = 2131231015;
            i14 = 2131231020;
            i15 = 2131231017;
            i16 = 2131231030;
            i17 = 2131231024;
            i18 = 2131231023;
            i19 = 2131231029;
            i20 = 2131231028;
            i21 = 2131231034;
            z10 = true;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = true;
            z15 = true;
            z16 = true;
            i22 = 2131231035;
            i23 = 2131231031;
            i24 = 2131231033;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        this.D = new j(this);
        this.K = new CopyOnWriteArrayList();
        this.f10760r0 = new h2();
        this.f10761s0 = new j2();
        StringBuilder sb2 = new StringBuilder();
        this.f10758p0 = sb2;
        int i26 = resourceId2;
        this.f10759q0 = new Formatter(sb2, Locale.getDefault());
        this.f10739b1 = new long[0];
        this.f10741c1 = new boolean[0];
        this.f10743d1 = new long[0];
        this.f10745e1 = new boolean[0];
        this.f10762t0 = new f(this, 1);
        try {
            cls = ExoPlayer.class;
            int i27 = ExoPlayer.f1692a;
            try {
                method = cls.getMethod("setScrubbingModeEnabled", cls3);
                try {
                    method2 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
                method2 = null;
                this.E = cls;
                this.F = method;
                this.G = method2;
                cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
                try {
                    method3 = cls2.getMethod("setScrubbingModeEnabled", cls3);
                    try {
                        method4 = cls2.getMethod("isScrubbingModeEnabled", null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method4 = null;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method3 = null;
                    method4 = null;
                    this.H = cls2;
                    this.I = method3;
                    this.J = method4;
                    this.f10755m0 = (TextView) findViewById(2131362146);
                    this.f10756n0 = (TextView) findViewById(2131362167);
                    imageView = (ImageView) findViewById(2131362179);
                    this.f10748g0 = imageView;
                    if (imageView != null) {
                        imageView.setOnClickListener(this.D);
                    }
                    imageView2 = (ImageView) findViewById(2131362152);
                    this.f10750h0 = imageView2;
                    int i28 = 2;
                    cVar = new androidx.mediarouter.app.c(this, i28);
                    if (imageView2 == null) {
                        i25 = 8;
                    } else {
                        i25 = 8;
                        imageView2.setVisibility(8);
                        imageView2.setOnClickListener(cVar);
                    }
                    imageView3 = (ImageView) findViewById(2131362158);
                    this.f10751i0 = imageView3;
                    cVar2 = new androidx.mediarouter.app.c(this, i28);
                    if (imageView3 != null) {
                        imageView3.setVisibility(i25);
                        imageView3.setOnClickListener(cVar2);
                    }
                    viewFindViewById = findViewById(2131362174);
                    this.f10752j0 = viewFindViewById;
                    if (viewFindViewById != null) {
                        viewFindViewById.setOnClickListener(this.D);
                    }
                    viewFindViewById2 = findViewById(2131362166);
                    this.f10753k0 = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setOnClickListener(this.D);
                    }
                    viewFindViewById3 = findViewById(2131362136);
                    this.f10754l0 = viewFindViewById3;
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setOnClickListener(this.D);
                    }
                    k0Var = (k0) findViewById(2131362169);
                    viewFindViewById4 = findViewById(2131362170);
                    if (k0Var == null) {
                        if (viewFindViewById4 != null) {
                            h hVar = new h(context, attributeSet);
                            hVar.setId(2131362169);
                            hVar.setLayoutParams(viewFindViewById4.getLayoutParams());
                            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                            viewGroup.removeView(viewFindViewById4);
                            viewGroup.addView(hVar, iIndexOfChild);
                            this.f10757o0 = hVar;
                        } else {
                            callback = null;
                            this.f10757o0 = null;
                        }
                        k0Var2 = this.f10757o0;
                        if (k0Var2 != null) {
                            j jVar = this.D;
                            jVar.getClass();
                            ((h) k0Var2).f10668a0.add(jVar);
                        }
                        this.C = e7.i0.l(callback);
                        resources = context.getResources();
                        this.B = resources;
                        imageView4 = (ImageView) findViewById(2131362165);
                        this.V = imageView4;
                        if (imageView4 != null) {
                            imageView4.setOnClickListener(this.D);
                        }
                        imageView5 = (ImageView) findViewById(2131362168);
                        this.T = imageView5;
                        if (imageView5 != null) {
                            imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
                            imageView5.setOnClickListener(this.D);
                        }
                        imageView6 = (ImageView) findViewById(2131362159);
                        this.U = imageView6;
                        if (imageView6 != null) {
                            imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                            imageView6.setOnClickListener(this.D);
                        }
                        typefaceA = p4.i.a(context, 2131296259);
                        imageView7 = (ImageView) findViewById(2131362172);
                        textView = (TextView) findViewById(2131362173);
                        if (imageView7 != null) {
                            imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
                            this.f10736a0 = imageView7;
                            this.f10740c0 = null;
                        } else if (textView != null) {
                            textView.setTypeface(typefaceA);
                            this.f10740c0 = textView;
                            this.f10736a0 = textView;
                        } else {
                            this.f10740c0 = null;
                            this.f10736a0 = null;
                        }
                        view = this.f10736a0;
                        if (view != null) {
                            view.setOnClickListener(this.D);
                        }
                        imageView8 = (ImageView) findViewById(2131362150);
                        textView2 = (TextView) findViewById(2131362151);
                        if (imageView8 != null) {
                            imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
                            this.W = imageView8;
                            this.f10738b0 = null;
                        } else if (textView2 != null) {
                            textView2.setTypeface(typefaceA);
                            this.f10738b0 = textView2;
                            this.W = textView2;
                        } else {
                            this.f10738b0 = null;
                            this.W = null;
                        }
                        view2 = this.W;
                        if (view2 != null) {
                            view2.setOnClickListener(this.D);
                        }
                        imageView9 = (ImageView) findViewById(2131362171);
                        this.f10742d0 = imageView9;
                        if (imageView9 != null) {
                            imageView9.setOnClickListener(this.D);
                        }
                        imageView10 = (ImageView) findViewById(2131362176);
                        this.f10744e0 = imageView10;
                        if (imageView10 != null) {
                            imageView10.setOnClickListener(this.D);
                        }
                        this.E0 = resources.getInteger(2131427339) / 100.0f;
                        this.F0 = resources.getInteger(2131427338) / 100.0f;
                        imageView11 = (ImageView) findViewById(2131362185);
                        this.f10746f0 = imageView11;
                        if (imageView11 != null) {
                            imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
                            n(imageView11, false);
                        }
                        z zVar = new z(this);
                        this.A = zVar;
                        zVar.D = z10;
                        p pVar = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
                        this.M = pVar;
                        this.S = resources.getDimensionPixelSize(2131165384);
                        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
                        this.L = recyclerView;
                        recyclerView.setAdapter(pVar);
                        getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                        this.R = popupWindow;
                        popupWindow.setOnDismissListener(this.D);
                        this.f10749g1 = true;
                        this.Q = new gi.c(getResources());
                        this.I0 = resources.getDrawable(i21, context.getTheme());
                        this.J0 = resources.getDrawable(i24, context.getTheme());
                        this.K0 = resources.getString(2131886450);
                        this.L0 = resources.getString(2131886449);
                        this.O = new i(this, 1);
                        this.P = new i(this, 0);
                        this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
                        this.f10763u0 = resources.getDrawable(i26, context.getTheme());
                        this.f10764v0 = resources.getDrawable(i14, context.getTheme());
                        this.M0 = resources.getDrawable(i12, context.getTheme());
                        this.N0 = resources.getDrawable(i13, context.getTheme());
                        this.f10765w0 = resources.getDrawable(i17, context.getTheme());
                        this.f10766x0 = resources.getDrawable(i11, context.getTheme());
                        this.f10767y0 = resources.getDrawable(i18, context.getTheme());
                        this.C0 = resources.getDrawable(i19, context.getTheme());
                        this.D0 = resources.getDrawable(i20, context.getTheme());
                        this.O0 = resources.getString(2131886454);
                        this.P0 = resources.getString(2131886453);
                        this.f10768z0 = resources.getString(2131886464);
                        this.A0 = resources.getString(2131886465);
                        this.B0 = resources.getString(2131886463);
                        this.G0 = resources.getString(2131886471);
                        this.H0 = resources.getString(2131886470);
                        zVar.h((ViewGroup) findViewById(2131362138), true);
                        zVar.h(this.W, z17);
                        zVar.h(this.f10736a0, z16);
                        zVar.h(imageView5, z15);
                        zVar.h(imageView6, z14);
                        zVar.h(imageView10, z13);
                        zVar.h(this.f10748g0, z12);
                        zVar.h(imageView11, z11);
                        if (this.f10737a1 != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zVar.h(imageView9, z18);
                        addOnLayoutChangeListener(new gg.a(this, 1));
                    }
                    this.f10757o0 = k0Var;
                    callback = null;
                    k0Var2 = this.f10757o0;
                    if (k0Var2 != null) {
                        j jVar2 = this.D;
                        jVar2.getClass();
                        ((h) k0Var2).f10668a0.add(jVar2);
                    }
                    this.C = e7.i0.l(callback);
                    resources = context.getResources();
                    this.B = resources;
                    imageView4 = (ImageView) findViewById(2131362165);
                    this.V = imageView4;
                    if (imageView4 != null) {
                        imageView4.setOnClickListener(this.D);
                    }
                    imageView5 = (ImageView) findViewById(2131362168);
                    this.T = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
                        imageView5.setOnClickListener(this.D);
                    }
                    imageView6 = (ImageView) findViewById(2131362159);
                    this.U = imageView6;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                        imageView6.setOnClickListener(this.D);
                    }
                    typefaceA = p4.i.a(context, 2131296259);
                    imageView7 = (ImageView) findViewById(2131362172);
                    textView = (TextView) findViewById(2131362173);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
                        this.f10736a0 = imageView7;
                        this.f10740c0 = null;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceA);
                        this.f10740c0 = textView;
                        this.f10736a0 = textView;
                    } else {
                        this.f10740c0 = null;
                        this.f10736a0 = null;
                    }
                    view = this.f10736a0;
                    if (view != null) {
                        view.setOnClickListener(this.D);
                    }
                    imageView8 = (ImageView) findViewById(2131362150);
                    textView2 = (TextView) findViewById(2131362151);
                    if (imageView8 != null) {
                        imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
                        this.W = imageView8;
                        this.f10738b0 = null;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceA);
                        this.f10738b0 = textView2;
                        this.W = textView2;
                    } else {
                        this.f10738b0 = null;
                        this.W = null;
                    }
                    view2 = this.W;
                    if (view2 != null) {
                        view2.setOnClickListener(this.D);
                    }
                    imageView9 = (ImageView) findViewById(2131362171);
                    this.f10742d0 = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(this.D);
                    }
                    imageView10 = (ImageView) findViewById(2131362176);
                    this.f10744e0 = imageView10;
                    if (imageView10 != null) {
                        imageView10.setOnClickListener(this.D);
                    }
                    this.E0 = resources.getInteger(2131427339) / 100.0f;
                    this.F0 = resources.getInteger(2131427338) / 100.0f;
                    imageView11 = (ImageView) findViewById(2131362185);
                    this.f10746f0 = imageView11;
                    if (imageView11 != null) {
                        imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
                        n(imageView11, false);
                    }
                    z zVar2 = new z(this);
                    this.A = zVar2;
                    zVar2.D = z10;
                    p pVar2 = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
                    this.M = pVar2;
                    this.S = resources.getDimensionPixelSize(2131165384);
                    RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
                    this.L = recyclerView2;
                    recyclerView2.setAdapter(pVar2);
                    getContext();
                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                    PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                    this.R = popupWindow2;
                    popupWindow2.setOnDismissListener(this.D);
                    this.f10749g1 = true;
                    this.Q = new gi.c(getResources());
                    this.I0 = resources.getDrawable(i21, context.getTheme());
                    this.J0 = resources.getDrawable(i24, context.getTheme());
                    this.K0 = resources.getString(2131886450);
                    this.L0 = resources.getString(2131886449);
                    this.O = new i(this, 1);
                    this.P = new i(this, 0);
                    this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
                    this.f10763u0 = resources.getDrawable(i26, context.getTheme());
                    this.f10764v0 = resources.getDrawable(i14, context.getTheme());
                    this.M0 = resources.getDrawable(i12, context.getTheme());
                    this.N0 = resources.getDrawable(i13, context.getTheme());
                    this.f10765w0 = resources.getDrawable(i17, context.getTheme());
                    this.f10766x0 = resources.getDrawable(i11, context.getTheme());
                    this.f10767y0 = resources.getDrawable(i18, context.getTheme());
                    this.C0 = resources.getDrawable(i19, context.getTheme());
                    this.D0 = resources.getDrawable(i20, context.getTheme());
                    this.O0 = resources.getString(2131886454);
                    this.P0 = resources.getString(2131886453);
                    this.f10768z0 = resources.getString(2131886464);
                    this.A0 = resources.getString(2131886465);
                    this.B0 = resources.getString(2131886463);
                    this.G0 = resources.getString(2131886471);
                    this.H0 = resources.getString(2131886470);
                    zVar2.h((ViewGroup) findViewById(2131362138), true);
                    zVar2.h(this.W, z17);
                    zVar2.h(this.f10736a0, z16);
                    zVar2.h(imageView5, z15);
                    zVar2.h(imageView6, z14);
                    zVar2.h(imageView10, z13);
                    zVar2.h(this.f10748g0, z12);
                    zVar2.h(imageView11, z11);
                    if (this.f10737a1 != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zVar2.h(imageView9, z18);
                    addOnLayoutChangeListener(new gg.a(this, 1));
                }
                this.H = cls2;
                this.I = method3;
                this.J = method4;
                this.f10755m0 = (TextView) findViewById(2131362146);
                this.f10756n0 = (TextView) findViewById(2131362167);
                imageView = (ImageView) findViewById(2131362179);
                this.f10748g0 = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(this.D);
                }
                imageView2 = (ImageView) findViewById(2131362152);
                this.f10750h0 = imageView2;
                int i29 = 2;
                cVar = new androidx.mediarouter.app.c(this, i29);
                if (imageView2 == null) {
                    i25 = 8;
                } else {
                    i25 = 8;
                    imageView2.setVisibility(8);
                    imageView2.setOnClickListener(cVar);
                }
                imageView3 = (ImageView) findViewById(2131362158);
                this.f10751i0 = imageView3;
                cVar2 = new androidx.mediarouter.app.c(this, i29);
                if (imageView3 != null) {
                    imageView3.setVisibility(i25);
                    imageView3.setOnClickListener(cVar2);
                }
                viewFindViewById = findViewById(2131362174);
                this.f10752j0 = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(this.D);
                }
                viewFindViewById2 = findViewById(2131362166);
                this.f10753k0 = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(this.D);
                }
                viewFindViewById3 = findViewById(2131362136);
                this.f10754l0 = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(this.D);
                }
                k0Var = (k0) findViewById(2131362169);
                viewFindViewById4 = findViewById(2131362170);
                if (k0Var == null) {
                    if (viewFindViewById4 != null) {
                        h hVar2 = new h(context, attributeSet);
                        hVar2.setId(2131362169);
                        hVar2.setLayoutParams(viewFindViewById4.getLayoutParams());
                        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
                        int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
                        viewGroup2.removeView(viewFindViewById4);
                        viewGroup2.addView(hVar2, iIndexOfChild2);
                        this.f10757o0 = hVar2;
                    } else {
                        callback = null;
                        this.f10757o0 = null;
                    }
                    k0Var2 = this.f10757o0;
                    if (k0Var2 != null) {
                        j jVar3 = this.D;
                        jVar3.getClass();
                        ((h) k0Var2).f10668a0.add(jVar3);
                    }
                    this.C = e7.i0.l(callback);
                    resources = context.getResources();
                    this.B = resources;
                    imageView4 = (ImageView) findViewById(2131362165);
                    this.V = imageView4;
                    if (imageView4 != null) {
                        imageView4.setOnClickListener(this.D);
                    }
                    imageView5 = (ImageView) findViewById(2131362168);
                    this.T = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
                        imageView5.setOnClickListener(this.D);
                    }
                    imageView6 = (ImageView) findViewById(2131362159);
                    this.U = imageView6;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                        imageView6.setOnClickListener(this.D);
                    }
                    typefaceA = p4.i.a(context, 2131296259);
                    imageView7 = (ImageView) findViewById(2131362172);
                    textView = (TextView) findViewById(2131362173);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
                        this.f10736a0 = imageView7;
                        this.f10740c0 = null;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceA);
                        this.f10740c0 = textView;
                        this.f10736a0 = textView;
                    } else {
                        this.f10740c0 = null;
                        this.f10736a0 = null;
                    }
                    view = this.f10736a0;
                    if (view != null) {
                        view.setOnClickListener(this.D);
                    }
                    imageView8 = (ImageView) findViewById(2131362150);
                    textView2 = (TextView) findViewById(2131362151);
                    if (imageView8 != null) {
                        imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
                        this.W = imageView8;
                        this.f10738b0 = null;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceA);
                        this.f10738b0 = textView2;
                        this.W = textView2;
                    } else {
                        this.f10738b0 = null;
                        this.W = null;
                    }
                    view2 = this.W;
                    if (view2 != null) {
                        view2.setOnClickListener(this.D);
                    }
                    imageView9 = (ImageView) findViewById(2131362171);
                    this.f10742d0 = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(this.D);
                    }
                    imageView10 = (ImageView) findViewById(2131362176);
                    this.f10744e0 = imageView10;
                    if (imageView10 != null) {
                        imageView10.setOnClickListener(this.D);
                    }
                    this.E0 = resources.getInteger(2131427339) / 100.0f;
                    this.F0 = resources.getInteger(2131427338) / 100.0f;
                    imageView11 = (ImageView) findViewById(2131362185);
                    this.f10746f0 = imageView11;
                    if (imageView11 != null) {
                        imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
                        n(imageView11, false);
                    }
                    z zVar3 = new z(this);
                    this.A = zVar3;
                    zVar3.D = z10;
                    p pVar3 = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
                    this.M = pVar3;
                    this.S = resources.getDimensionPixelSize(2131165384);
                    RecyclerView recyclerView3 = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
                    this.L = recyclerView3;
                    recyclerView3.setAdapter(pVar3);
                    getContext();
                    recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                    PopupWindow popupWindow3 = new PopupWindow((View) recyclerView3, -2, -2, true);
                    this.R = popupWindow3;
                    popupWindow3.setOnDismissListener(this.D);
                    this.f10749g1 = true;
                    this.Q = new gi.c(getResources());
                    this.I0 = resources.getDrawable(i21, context.getTheme());
                    this.J0 = resources.getDrawable(i24, context.getTheme());
                    this.K0 = resources.getString(2131886450);
                    this.L0 = resources.getString(2131886449);
                    this.O = new i(this, 1);
                    this.P = new i(this, 0);
                    this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
                    this.f10763u0 = resources.getDrawable(i26, context.getTheme());
                    this.f10764v0 = resources.getDrawable(i14, context.getTheme());
                    this.M0 = resources.getDrawable(i12, context.getTheme());
                    this.N0 = resources.getDrawable(i13, context.getTheme());
                    this.f10765w0 = resources.getDrawable(i17, context.getTheme());
                    this.f10766x0 = resources.getDrawable(i11, context.getTheme());
                    this.f10767y0 = resources.getDrawable(i18, context.getTheme());
                    this.C0 = resources.getDrawable(i19, context.getTheme());
                    this.D0 = resources.getDrawable(i20, context.getTheme());
                    this.O0 = resources.getString(2131886454);
                    this.P0 = resources.getString(2131886453);
                    this.f10768z0 = resources.getString(2131886464);
                    this.A0 = resources.getString(2131886465);
                    this.B0 = resources.getString(2131886463);
                    this.G0 = resources.getString(2131886471);
                    this.H0 = resources.getString(2131886470);
                    zVar3.h((ViewGroup) findViewById(2131362138), true);
                    zVar3.h(this.W, z17);
                    zVar3.h(this.f10736a0, z16);
                    zVar3.h(imageView5, z15);
                    zVar3.h(imageView6, z14);
                    zVar3.h(imageView10, z13);
                    zVar3.h(this.f10748g0, z12);
                    zVar3.h(imageView11, z11);
                    if (this.f10737a1 != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zVar3.h(imageView9, z18);
                    addOnLayoutChangeListener(new gg.a(this, 1));
                }
                this.f10757o0 = k0Var;
                callback = null;
                k0Var2 = this.f10757o0;
                if (k0Var2 != null) {
                    j jVar4 = this.D;
                    jVar4.getClass();
                    ((h) k0Var2).f10668a0.add(jVar4);
                }
                this.C = e7.i0.l(callback);
                resources = context.getResources();
                this.B = resources;
                imageView4 = (ImageView) findViewById(2131362165);
                this.V = imageView4;
                if (imageView4 != null) {
                    imageView4.setOnClickListener(this.D);
                }
                imageView5 = (ImageView) findViewById(2131362168);
                this.T = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
                    imageView5.setOnClickListener(this.D);
                }
                imageView6 = (ImageView) findViewById(2131362159);
                this.U = imageView6;
                if (imageView6 != null) {
                    imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                    imageView6.setOnClickListener(this.D);
                }
                typefaceA = p4.i.a(context, 2131296259);
                imageView7 = (ImageView) findViewById(2131362172);
                textView = (TextView) findViewById(2131362173);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
                    this.f10736a0 = imageView7;
                    this.f10740c0 = null;
                } else if (textView != null) {
                    textView.setTypeface(typefaceA);
                    this.f10740c0 = textView;
                    this.f10736a0 = textView;
                } else {
                    this.f10740c0 = null;
                    this.f10736a0 = null;
                }
                view = this.f10736a0;
                if (view != null) {
                    view.setOnClickListener(this.D);
                }
                imageView8 = (ImageView) findViewById(2131362150);
                textView2 = (TextView) findViewById(2131362151);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
                    this.W = imageView8;
                    this.f10738b0 = null;
                } else if (textView2 != null) {
                    textView2.setTypeface(typefaceA);
                    this.f10738b0 = textView2;
                    this.W = textView2;
                } else {
                    this.f10738b0 = null;
                    this.W = null;
                }
                view2 = this.W;
                if (view2 != null) {
                    view2.setOnClickListener(this.D);
                }
                imageView9 = (ImageView) findViewById(2131362171);
                this.f10742d0 = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(this.D);
                }
                imageView10 = (ImageView) findViewById(2131362176);
                this.f10744e0 = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(this.D);
                }
                this.E0 = resources.getInteger(2131427339) / 100.0f;
                this.F0 = resources.getInteger(2131427338) / 100.0f;
                imageView11 = (ImageView) findViewById(2131362185);
                this.f10746f0 = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
                    n(imageView11, false);
                }
                z zVar4 = new z(this);
                this.A = zVar4;
                zVar4.D = z10;
                p pVar4 = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
                this.M = pVar4;
                this.S = resources.getDimensionPixelSize(2131165384);
                RecyclerView recyclerView4 = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
                this.L = recyclerView4;
                recyclerView4.setAdapter(pVar4);
                getContext();
                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                PopupWindow popupWindow4 = new PopupWindow((View) recyclerView4, -2, -2, true);
                this.R = popupWindow4;
                popupWindow4.setOnDismissListener(this.D);
                this.f10749g1 = true;
                this.Q = new gi.c(getResources());
                this.I0 = resources.getDrawable(i21, context.getTheme());
                this.J0 = resources.getDrawable(i24, context.getTheme());
                this.K0 = resources.getString(2131886450);
                this.L0 = resources.getString(2131886449);
                this.O = new i(this, 1);
                this.P = new i(this, 0);
                this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
                this.f10763u0 = resources.getDrawable(i26, context.getTheme());
                this.f10764v0 = resources.getDrawable(i14, context.getTheme());
                this.M0 = resources.getDrawable(i12, context.getTheme());
                this.N0 = resources.getDrawable(i13, context.getTheme());
                this.f10765w0 = resources.getDrawable(i17, context.getTheme());
                this.f10766x0 = resources.getDrawable(i11, context.getTheme());
                this.f10767y0 = resources.getDrawable(i18, context.getTheme());
                this.C0 = resources.getDrawable(i19, context.getTheme());
                this.D0 = resources.getDrawable(i20, context.getTheme());
                this.O0 = resources.getString(2131886454);
                this.P0 = resources.getString(2131886453);
                this.f10768z0 = resources.getString(2131886464);
                this.A0 = resources.getString(2131886465);
                this.B0 = resources.getString(2131886463);
                this.G0 = resources.getString(2131886471);
                this.H0 = resources.getString(2131886470);
                zVar4.h((ViewGroup) findViewById(2131362138), true);
                zVar4.h(this.W, z17);
                zVar4.h(this.f10736a0, z16);
                zVar4.h(imageView5, z15);
                zVar4.h(imageView6, z14);
                zVar4.h(imageView10, z13);
                zVar4.h(this.f10748g0, z12);
                zVar4.h(imageView11, z11);
                if (this.f10737a1 != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zVar4.h(imageView9, z18);
                addOnLayoutChangeListener(new gg.a(this, 1));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            cls = null;
        }
        this.E = cls;
        this.F = method;
        this.G = method2;
        try {
            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            method3 = cls2.getMethod("setScrubbingModeEnabled", cls3);
            method4 = cls2.getMethod("isScrubbingModeEnabled", null);
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            cls2 = null;
        }
        this.H = cls2;
        this.I = method3;
        this.J = method4;
        this.f10755m0 = (TextView) findViewById(2131362146);
        this.f10756n0 = (TextView) findViewById(2131362167);
        imageView = (ImageView) findViewById(2131362179);
        this.f10748g0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.D);
        }
        imageView2 = (ImageView) findViewById(2131362152);
        this.f10750h0 = imageView2;
        int i210 = 2;
        cVar = new androidx.mediarouter.app.c(this, i210);
        if (imageView2 == null) {
            i25 = 8;
        } else {
            i25 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(cVar);
        }
        imageView3 = (ImageView) findViewById(2131362158);
        this.f10751i0 = imageView3;
        cVar2 = new androidx.mediarouter.app.c(this, i210);
        if (imageView3 != null) {
            imageView3.setVisibility(i25);
            imageView3.setOnClickListener(cVar2);
        }
        viewFindViewById = findViewById(2131362174);
        this.f10752j0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.D);
        }
        viewFindViewById2 = findViewById(2131362166);
        this.f10753k0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.D);
        }
        viewFindViewById3 = findViewById(2131362136);
        this.f10754l0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.D);
        }
        k0Var = (k0) findViewById(2131362169);
        viewFindViewById4 = findViewById(2131362170);
        if (k0Var == null) {
            if (viewFindViewById4 != null) {
                h hVar3 = new h(context, attributeSet);
                hVar3.setId(2131362169);
                hVar3.setLayoutParams(viewFindViewById4.getLayoutParams());
                ViewGroup viewGroup3 = (ViewGroup) viewFindViewById4.getParent();
                int iIndexOfChild3 = viewGroup3.indexOfChild(viewFindViewById4);
                viewGroup3.removeView(viewFindViewById4);
                viewGroup3.addView(hVar3, iIndexOfChild3);
                this.f10757o0 = hVar3;
            } else {
                callback = null;
                this.f10757o0 = null;
            }
            k0Var2 = this.f10757o0;
            if (k0Var2 != null) {
                j jVar5 = this.D;
                jVar5.getClass();
                ((h) k0Var2).f10668a0.add(jVar5);
            }
            this.C = e7.i0.l(callback);
            resources = context.getResources();
            this.B = resources;
            imageView4 = (ImageView) findViewById(2131362165);
            this.V = imageView4;
            if (imageView4 != null) {
                imageView4.setOnClickListener(this.D);
            }
            imageView5 = (ImageView) findViewById(2131362168);
            this.T = imageView5;
            if (imageView5 != null) {
                imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
                imageView5.setOnClickListener(this.D);
            }
            imageView6 = (ImageView) findViewById(2131362159);
            this.U = imageView6;
            if (imageView6 != null) {
                imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                imageView6.setOnClickListener(this.D);
            }
            typefaceA = p4.i.a(context, 2131296259);
            imageView7 = (ImageView) findViewById(2131362172);
            textView = (TextView) findViewById(2131362173);
            if (imageView7 != null) {
                imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
                this.f10736a0 = imageView7;
                this.f10740c0 = null;
            } else if (textView != null) {
                textView.setTypeface(typefaceA);
                this.f10740c0 = textView;
                this.f10736a0 = textView;
            } else {
                this.f10740c0 = null;
                this.f10736a0 = null;
            }
            view = this.f10736a0;
            if (view != null) {
                view.setOnClickListener(this.D);
            }
            imageView8 = (ImageView) findViewById(2131362150);
            textView2 = (TextView) findViewById(2131362151);
            if (imageView8 != null) {
                imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
                this.W = imageView8;
                this.f10738b0 = null;
            } else if (textView2 != null) {
                textView2.setTypeface(typefaceA);
                this.f10738b0 = textView2;
                this.W = textView2;
            } else {
                this.f10738b0 = null;
                this.W = null;
            }
            view2 = this.W;
            if (view2 != null) {
                view2.setOnClickListener(this.D);
            }
            imageView9 = (ImageView) findViewById(2131362171);
            this.f10742d0 = imageView9;
            if (imageView9 != null) {
                imageView9.setOnClickListener(this.D);
            }
            imageView10 = (ImageView) findViewById(2131362176);
            this.f10744e0 = imageView10;
            if (imageView10 != null) {
                imageView10.setOnClickListener(this.D);
            }
            this.E0 = resources.getInteger(2131427339) / 100.0f;
            this.F0 = resources.getInteger(2131427338) / 100.0f;
            imageView11 = (ImageView) findViewById(2131362185);
            this.f10746f0 = imageView11;
            if (imageView11 != null) {
                imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
                n(imageView11, false);
            }
            z zVar5 = new z(this);
            this.A = zVar5;
            zVar5.D = z10;
            p pVar5 = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
            this.M = pVar5;
            this.S = resources.getDimensionPixelSize(2131165384);
            RecyclerView recyclerView5 = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
            this.L = recyclerView5;
            recyclerView5.setAdapter(pVar5);
            getContext();
            recyclerView5.setLayoutManager(new LinearLayoutManager(1));
            PopupWindow popupWindow5 = new PopupWindow((View) recyclerView5, -2, -2, true);
            this.R = popupWindow5;
            popupWindow5.setOnDismissListener(this.D);
            this.f10749g1 = true;
            this.Q = new gi.c(getResources());
            this.I0 = resources.getDrawable(i21, context.getTheme());
            this.J0 = resources.getDrawable(i24, context.getTheme());
            this.K0 = resources.getString(2131886450);
            this.L0 = resources.getString(2131886449);
            this.O = new i(this, 1);
            this.P = new i(this, 0);
            this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
            this.f10763u0 = resources.getDrawable(i26, context.getTheme());
            this.f10764v0 = resources.getDrawable(i14, context.getTheme());
            this.M0 = resources.getDrawable(i12, context.getTheme());
            this.N0 = resources.getDrawable(i13, context.getTheme());
            this.f10765w0 = resources.getDrawable(i17, context.getTheme());
            this.f10766x0 = resources.getDrawable(i11, context.getTheme());
            this.f10767y0 = resources.getDrawable(i18, context.getTheme());
            this.C0 = resources.getDrawable(i19, context.getTheme());
            this.D0 = resources.getDrawable(i20, context.getTheme());
            this.O0 = resources.getString(2131886454);
            this.P0 = resources.getString(2131886453);
            this.f10768z0 = resources.getString(2131886464);
            this.A0 = resources.getString(2131886465);
            this.B0 = resources.getString(2131886463);
            this.G0 = resources.getString(2131886471);
            this.H0 = resources.getString(2131886470);
            zVar5.h((ViewGroup) findViewById(2131362138), true);
            zVar5.h(this.W, z17);
            zVar5.h(this.f10736a0, z16);
            zVar5.h(imageView5, z15);
            zVar5.h(imageView6, z14);
            zVar5.h(imageView10, z13);
            zVar5.h(this.f10748g0, z12);
            zVar5.h(imageView11, z11);
            if (this.f10737a1 != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            zVar5.h(imageView9, z18);
            addOnLayoutChangeListener(new gg.a(this, 1));
        }
        this.f10757o0 = k0Var;
        callback = null;
        k0Var2 = this.f10757o0;
        if (k0Var2 != null) {
            j jVar6 = this.D;
            jVar6.getClass();
            ((h) k0Var2).f10668a0.add(jVar6);
        }
        this.C = e7.i0.l(callback);
        resources = context.getResources();
        this.B = resources;
        imageView4 = (ImageView) findViewById(2131362165);
        this.V = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.D);
        }
        imageView5 = (ImageView) findViewById(2131362168);
        this.T = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
            imageView5.setOnClickListener(this.D);
        }
        imageView6 = (ImageView) findViewById(2131362159);
        this.U = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView6.setOnClickListener(this.D);
        }
        typefaceA = p4.i.a(context, 2131296259);
        imageView7 = (ImageView) findViewById(2131362172);
        textView = (TextView) findViewById(2131362173);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i23, context.getTheme()));
            this.f10736a0 = imageView7;
            this.f10740c0 = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.f10740c0 = textView;
            this.f10736a0 = textView;
        } else {
            this.f10740c0 = null;
            this.f10736a0 = null;
        }
        view = this.f10736a0;
        if (view != null) {
            view.setOnClickListener(this.D);
        }
        imageView8 = (ImageView) findViewById(2131362150);
        textView2 = (TextView) findViewById(2131362151);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.W = imageView8;
            this.f10738b0 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.f10738b0 = textView2;
            this.W = textView2;
        } else {
            this.f10738b0 = null;
            this.W = null;
        }
        view2 = this.W;
        if (view2 != null) {
            view2.setOnClickListener(this.D);
        }
        imageView9 = (ImageView) findViewById(2131362171);
        this.f10742d0 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.D);
        }
        imageView10 = (ImageView) findViewById(2131362176);
        this.f10744e0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.D);
        }
        this.E0 = resources.getInteger(2131427339) / 100.0f;
        this.F0 = resources.getInteger(2131427338) / 100.0f;
        imageView11 = (ImageView) findViewById(2131362185);
        this.f10746f0 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i22, context.getTheme()));
            n(imageView11, false);
        }
        z zVar6 = new z(this);
        this.A = zVar6;
        zVar6.D = z10;
        p pVar6 = new p(this, new String[]{resources.getString(2131886461), resources.getString(2131886494)}, new Drawable[]{resources.getDrawable(2131231032, context.getTheme()), resources.getDrawable(2131231012, context.getTheme())});
        this.M = pVar6;
        this.S = resources.getDimensionPixelSize(2131165384);
        RecyclerView recyclerView6 = (RecyclerView) LayoutInflater.from(context).inflate(2131558750, (ViewGroup) null);
        this.L = recyclerView6;
        recyclerView6.setAdapter(pVar6);
        getContext();
        recyclerView6.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow6 = new PopupWindow((View) recyclerView6, -2, -2, true);
        this.R = popupWindow6;
        popupWindow6.setOnDismissListener(this.D);
        this.f10749g1 = true;
        this.Q = new gi.c(getResources());
        this.I0 = resources.getDrawable(i21, context.getTheme());
        this.J0 = resources.getDrawable(i24, context.getTheme());
        this.K0 = resources.getString(2131886450);
        this.L0 = resources.getString(2131886449);
        this.O = new i(this, 1);
        this.P = new i(this, 0);
        this.N = new m(this, resources.getStringArray(2130903046), f10735h1);
        this.f10763u0 = resources.getDrawable(i26, context.getTheme());
        this.f10764v0 = resources.getDrawable(i14, context.getTheme());
        this.M0 = resources.getDrawable(i12, context.getTheme());
        this.N0 = resources.getDrawable(i13, context.getTheme());
        this.f10765w0 = resources.getDrawable(i17, context.getTheme());
        this.f10766x0 = resources.getDrawable(i11, context.getTheme());
        this.f10767y0 = resources.getDrawable(i18, context.getTheme());
        this.C0 = resources.getDrawable(i19, context.getTheme());
        this.D0 = resources.getDrawable(i20, context.getTheme());
        this.O0 = resources.getString(2131886454);
        this.P0 = resources.getString(2131886453);
        this.f10768z0 = resources.getString(2131886464);
        this.A0 = resources.getString(2131886465);
        this.B0 = resources.getString(2131886463);
        this.G0 = resources.getString(2131886471);
        this.H0 = resources.getString(2131886470);
        zVar6.h((ViewGroup) findViewById(2131362138), true);
        zVar6.h(this.W, z17);
        zVar6.h(this.f10736a0, z16);
        zVar6.h(imageView5, z15);
        zVar6.h(imageView6, z14);
        zVar6.h(imageView10, z13);
        zVar6.h(this.f10748g0, z12);
        zVar6.h(imageView11, z11);
        if (this.f10737a1 != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        zVar6.h(imageView9, z18);
        addOnLayoutChangeListener(new gg.a(this, 1));
    }

    public static void a(u uVar, f1 f1Var, long j9) {
        if (uVar.V0) {
            if (f1Var.isCommandAvailable(17) && f1Var.isCommandAvailable(10)) {
                k2 currentTimeline = f1Var.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i10 = 0;
                while (true) {
                    long jW = e7.i0.W(currentTimeline.getWindow(i10, uVar.f10761s0).m);
                    if (j9 < jW) {
                        break;
                    }
                    if (i10 == windowCount - 1) {
                        j9 = jW;
                        break;
                    } else {
                        j9 -= jW;
                        i10++;
                    }
                }
                f1Var.seekTo(i10, j9);
            }
        } else if (f1Var.isCommandAvailable(5)) {
            f1Var.seekTo(j9);
        }
        uVar.s();
    }

    public static boolean c(f1 f1Var, j2 j2Var) {
        k2 currentTimeline;
        int windowCount;
        if (!f1Var.isCommandAvailable(17) || (windowCount = (currentTimeline = f1Var.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i10 = 0; i10 < windowCount; i10++) {
            if (currentTimeline.getWindow(i10, j2Var).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public void setPlaybackSpeed(float f3) {
        f1 f1Var = this.Q0;
        if (f1Var == null || !f1Var.isCommandAvailable(13)) {
            return;
        }
        f1 f1Var2 = this.Q0;
        f1Var2.setPlaybackParameters(new z0(f3, f1Var2.getPlaybackParameters().f1689b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        f1 f1Var = this.Q0;
        if (f1Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (f1Var.getPlaybackState() != 4 && f1Var.isCommandAvailable(12)) {
                    f1Var.seekForward();
                }
            } else if (keyCode == 89 && f1Var.isCommandAvailable(11)) {
                f1Var.seekBack();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (e7.i0.S(f1Var, this.U0)) {
                        e7.i0.A(f1Var);
                    } else if (f1Var.isCommandAvailable(1)) {
                        f1Var.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            e7.i0.A(f1Var);
                        } else if (keyCode == 127) {
                            String str = e7.i0.f5136a;
                            if (f1Var.isCommandAvailable(1)) {
                                f1Var.pause();
                            }
                        }
                    } else if (f1Var.isCommandAvailable(7)) {
                        f1Var.seekToPrevious();
                    }
                } else if (f1Var.isCommandAvailable(9)) {
                    f1Var.seekToNext();
                }
            }
        }
        return true;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(ba.g0 g0Var, View view) {
        this.L.setAdapter(g0Var);
        u();
        this.f10749g1 = false;
        PopupWindow popupWindow = this.R;
        popupWindow.dismiss();
        this.f10749g1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.S;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    public final d2 f(s2 s2Var, int i10) {
        fh.w.g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        t0 t0Var = s2Var.f1556a;
        int i11 = 0;
        for (int i12 = 0; i12 < t0Var.size(); i12++) {
            r2 r2Var = (r2) t0Var.get(i12);
            if (r2Var.f1487b.f1340c == i10) {
                for (int i13 = 0; i13 < r2Var.f1486a; i13++) {
                    if (r2Var.a(i13)) {
                        androidx.media3.common.t tVar = r2Var.f1487b.f1341d[i13];
                        if ((tVar.f1587e & 2) == 0) {
                            r rVar = new r(s2Var, i12, i13, this.Q.p(tVar));
                            int i14 = i11 + 1;
                            int iB = fh.n0.b(objArrCopyOf.length, i14);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i11] = rVar;
                            i11 = i14;
                        }
                    }
                }
            }
        }
        return t0.l(i11, objArrCopyOf);
    }

    public final void g() {
        z zVar = this.A;
        int i10 = zVar.A;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        zVar.f();
        if (!zVar.D) {
            zVar.i(2);
        } else if (zVar.A == 1) {
            zVar.f10787n.start();
        } else {
            zVar.f10788o.start();
        }
    }

    public f1 getPlayer() {
        return this.Q0;
    }

    public int getRepeatToggleModes() {
        return this.f10737a1;
    }

    public boolean getShowShuffleButton() {
        return this.A.b(this.f10744e0);
    }

    public boolean getShowSubtitleButton() {
        return this.A.b(this.f10748g0);
    }

    public int getShowTimeoutMs() {
        return this.X0;
    }

    public boolean getShowVrButton() {
        return this.A.b(this.f10746f0);
    }

    public final boolean h(f1 f1Var) {
        Class cls;
        return (f1Var == null || (cls = this.H) == null || !cls.isAssignableFrom(f1Var.getClass())) ? false : true;
    }

    public final boolean i(f1 f1Var) {
        Class cls;
        return (f1Var == null || (cls = this.E) == null || !cls.isAssignableFrom(f1Var.getClass())) ? false : true;
    }

    public final boolean j() {
        z zVar = this.A;
        return zVar.A == 0 && zVar.f10776a.l();
    }

    public final boolean k(f1 f1Var) {
        try {
            if (i(f1Var)) {
                Method method = this.G;
                method.getClass();
                Object objInvoke = method.invoke(f1Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!h(f1Var)) {
                return false;
            }
            Method method2 = this.J;
            method2.getClass();
            Object objInvoke2 = method2.invoke(f1Var, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.E0 : this.F0);
    }

    public final void o(boolean z10) {
        if (this.R0 == z10) {
            return;
        }
        this.R0 = z10;
        String str = this.P0;
        Drawable drawable = this.N0;
        String str2 = this.O0;
        Drawable drawable2 = this.M0;
        ImageView imageView = this.f10750h0;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f10751i0;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z zVar = this.A;
        zVar.f10776a.addOnLayoutChangeListener(zVar.f10798y);
        this.S0 = true;
        if (j()) {
            zVar.g();
        }
        m();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z zVar = this.A;
        zVar.f10776a.removeOnLayoutChangeListener(zVar.f10798y);
        this.S0 = false;
        removeCallbacks(this.f10762t0);
        zVar.f();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.A.f10777b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void p() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (l() && this.S0) {
            f1 f1Var = this.Q0;
            if (f1Var != null) {
                zIsCommandAvailable = (this.T0 && c(f1Var, this.f10761s0)) ? f1Var.isCommandAvailable(10) : f1Var.isCommandAvailable(5);
                zIsCommandAvailable3 = f1Var.isCommandAvailable(7);
                zIsCommandAvailable4 = f1Var.isCommandAvailable(11);
                zIsCommandAvailable5 = f1Var.isCommandAvailable(12);
                zIsCommandAvailable2 = f1Var.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.B;
            View view = this.f10736a0;
            if (zIsCommandAvailable4) {
                f1 f1Var2 = this.Q0;
                int seekBackIncrement = (int) ((f1Var2 != null ? f1Var2.getSeekBackIncrement() : 5000L) / 1000);
                TextView textView = this.f10740c0;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(2131755010, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view2 = this.W;
            if (zIsCommandAvailable5) {
                f1 f1Var3 = this.Q0;
                int seekForwardIncrement = (int) ((f1Var3 != null ? f1Var3.getSeekForwardIncrement() : 15000L) / 1000);
                TextView textView2 = this.f10738b0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(2131755009, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            n(this.T, zIsCommandAvailable3);
            n(view, zIsCommandAvailable4);
            n(view2, zIsCommandAvailable5);
            n(this.U, zIsCommandAvailable2);
            k0 k0Var = this.f10757o0;
            if (k0Var != null) {
                ((h) k0Var).setEnabled(zIsCommandAvailable);
            }
        }
    }

    public final void q() {
        ImageView imageView;
        boolean z10;
        if (l() && this.S0 && (imageView = this.V) != null) {
            boolean zS = e7.i0.S(this.Q0, this.U0);
            Drawable drawable = zS ? this.f10763u0 : this.f10764v0;
            int i10 = zS ? 2131886460 : 2131886459;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.B.getString(i10));
            f1 f1Var = this.Q0;
            if (f1Var != null) {
                z10 = true;
                if (!f1Var.isCommandAvailable(1) || (f1Var.isCommandAvailable(17) && f1Var.getCurrentTimeline().isEmpty())) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            n(imageView, z10);
        }
    }

    public final void r() {
        m mVar;
        f1 f1Var = this.Q0;
        if (f1Var == null) {
            return;
        }
        float f3 = f1Var.getPlaybackParameters().f1688a;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            mVar = this.N;
            float[] fArr = mVar.f10716b;
            if (i10 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f3 - fArr[i10]);
            if (fAbs < f10) {
                i11 = i10;
                f10 = fAbs;
            }
            i10++;
        }
        mVar.f10717c = i11;
        String str = mVar.f10715a[i11];
        p pVar = this.M;
        pVar.f10727b[0] = str;
        n(this.f10752j0, pVar.a(1) || pVar.a(0));
    }

    public final void s() {
        long contentPosition;
        long contentBufferedPosition;
        if (l() && this.S0) {
            f1 f1Var = this.Q0;
            if (f1Var == null || !f1Var.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = f1Var.getContentPosition() + this.f10747f1;
                contentBufferedPosition = f1Var.getContentBufferedPosition() + this.f10747f1;
            }
            TextView textView = this.f10756n0;
            if (textView != null && !this.W0) {
                textView.setText(e7.i0.y(this.f10758p0, this.f10759q0, contentPosition));
            }
            k0 k0Var = this.f10757o0;
            if (k0Var != null) {
                h hVar = (h) k0Var;
                hVar.setPosition(contentPosition);
                if (k(f1Var)) {
                    contentBufferedPosition = contentPosition;
                }
                hVar.setBufferedPosition(contentBufferedPosition);
            }
            f fVar = this.f10762t0;
            removeCallbacks(fVar);
            int playbackState = f1Var == null ? 1 : f1Var.getPlaybackState();
            if (f1Var != null && f1Var.isPlaying()) {
                long jMin = Math.min(k0Var != null ? ((h) k0Var).getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f3 = f1Var.getPlaybackParameters().f1688a;
                postDelayed(fVar, e7.i0.i(f3 > 0.0f ? (long) (jMin / f3) : 1000L, this.Z0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(fVar, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.A.D = z10;
    }

    public void setMediaRouteButtonViewProvider(x2 x2Var) {
        View viewFindViewById = findViewById(2131362156);
        if (viewFindViewById == null) {
            throw new IllegalStateException("The media route button placeholder is missing.");
        }
        if (x2Var == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            throw new IllegalStateException("The media route button placeholder has no parent view.");
        }
        kh.v view = x2Var.getView(viewGroup);
        x0 x0Var = new x0(this, viewFindViewById, viewGroup);
        Handler handler = this.C;
        Objects.requireNonNull(handler);
        view.a(new kh.r(view, x0Var, 0), new androidx.media3.cast.s(handler));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(k kVar) {
        boolean z10 = kVar != null;
        ImageView imageView = this.f10750h0;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = kVar != null;
        ImageView imageView2 = this.f10751i0;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(f1 f1Var) {
        ta.c0.A(Looper.myLooper() == Looper.getMainLooper());
        ta.c0.s(f1Var == null || f1Var.getApplicationLooper() == Looper.getMainLooper());
        f1 f1Var2 = this.Q0;
        if (f1Var2 == f1Var) {
            return;
        }
        j jVar = this.D;
        if (f1Var2 != null) {
            f1Var2.removeListener(jVar);
        }
        this.Q0 = f1Var;
        if (f1Var != null) {
            f1Var.addListener(jVar);
        }
        m();
    }

    public void setProgressUpdateListener(n nVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f10737a1 = i10;
        f1 f1Var = this.Q0;
        if (f1Var != null && f1Var.isCommandAvailable(15)) {
            int repeatMode = this.Q0.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.Q0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.Q0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.Q0.setRepeatMode(2);
            }
        }
        this.A.h(this.f10742d0, i10 != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.A.h(this.W, z10);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.T0 = z10;
        w();
    }

    public void setShowNextButton(boolean z10) {
        this.A.h(this.U, z10);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.U0 = z10;
        q();
    }

    public void setShowPreviousButton(boolean z10) {
        this.A.h(this.T, z10);
        p();
    }

    public void setShowRewindButton(boolean z10) {
        this.A.h(this.f10736a0, z10);
        p();
    }

    public void setShowShuffleButton(boolean z10) {
        this.A.h(this.f10744e0, z10);
        v();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.A.h(this.f10748g0, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.X0 = i10;
        if (j()) {
            this.A.g();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.A.h(this.f10746f0, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.Z0 = e7.i0.h(i10, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        this.Y0 = z10;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f10746f0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.S0 && (imageView = this.f10742d0) != null) {
            if (this.f10737a1 == 0) {
                n(imageView, false);
                return;
            }
            f1 f1Var = this.Q0;
            String str = this.f10768z0;
            Drawable drawable = this.f10765w0;
            if (f1Var == null || !f1Var.isCommandAvailable(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int repeatMode = f1Var.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.f10766x0);
                imageView.setContentDescription(this.A0);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f10767y0);
                imageView.setContentDescription(this.B0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.L;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.S;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.R;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.S0 && (imageView = this.f10744e0) != null) {
            f1 f1Var = this.Q0;
            if (!this.A.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.H0;
            Drawable drawable = this.D0;
            if (f1Var == null || !f1Var.isCommandAvailable(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (f1Var.getShuffleModeEnabled()) {
                drawable = this.C0;
            }
            imageView.setImageDrawable(drawable);
            if (f1Var.getShuffleModeEnabled()) {
                str = this.G0;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void w() {
        boolean z10;
        long jH;
        int i10;
        long j9;
        long[] jArr;
        androidx.media3.common.a aVarA;
        int i11;
        int i12;
        k2 k2Var;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int length;
        f1 f1Var = this.Q0;
        if (f1Var == null) {
            return;
        }
        boolean z13 = this.T0;
        j2 j2Var = this.f10761s0;
        boolean z14 = true;
        this.V0 = z13 && c(f1Var, j2Var);
        long j10 = 0;
        this.f10747f1 = 0L;
        k2 currentTimeline = f1Var.isCommandAvailable(17) ? f1Var.getCurrentTimeline() : k2.EMPTY;
        long j11 = -9223372036854775807L;
        if (currentTimeline.isEmpty()) {
            z10 = true;
            if (f1Var.isCommandAvailable(16)) {
                long contentDuration = f1Var.getContentDuration();
                if (contentDuration != -9223372036854775807L) {
                    jH = e7.i0.H(contentDuration);
                } else {
                    jH = 0;
                }
            } else {
                jH = 0;
            }
            i10 = 0;
        } else {
            int currentMediaItemIndex = f1Var.getCurrentMediaItemIndex();
            boolean z15 = this.V0;
            int i15 = z15 ? 0 : currentMediaItemIndex;
            int windowCount = z15 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j12 = 0;
            i10 = 0;
            while (i15 <= windowCount) {
                long j13 = j10;
                if (i15 == currentMediaItemIndex) {
                    this.f10747f1 = e7.i0.W(j12);
                }
                currentTimeline.getWindow(i15, j2Var);
                if (j2Var.m == j11) {
                    ta.c0.A(this.V0 ^ z14);
                    break;
                }
                int i16 = j2Var.f1294n;
                while (i16 <= j2Var.f1295o) {
                    h2 h2Var = this.f10760r0;
                    currentTimeline.getPeriod(i16, h2Var);
                    long j14 = j11;
                    androidx.media3.common.c cVar = h2Var.f1237g;
                    int i17 = cVar.f1137d;
                    int i18 = cVar.f1134a;
                    while (i17 < i18) {
                        long jD = h2Var.d(i17);
                        if (jD == Long.MIN_VALUE) {
                            long j15 = h2Var.f1234d;
                            if (j15 == j14) {
                                k2Var = currentTimeline;
                                z11 = true;
                            } else {
                                jD = j15;
                                j9 = jD + h2Var.f1235e;
                                if (j9 >= j13) {
                                    jArr = this.f10739b1;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f10739b1 = Arrays.copyOf(jArr, length);
                                        this.f10741c1 = Arrays.copyOf(this.f10741c1, length);
                                    }
                                    this.f10739b1[i10] = e7.i0.W(j12 + j9);
                                    boolean[] zArr = this.f10741c1;
                                    aVarA = h2Var.f1237g.a(i17);
                                    i11 = aVarA.f1051b;
                                    if (i11 != -1) {
                                        i12 = 0;
                                        while (true) {
                                            if (i12 < i11) {
                                                k2Var = currentTimeline;
                                                z11 = true;
                                                z12 = false;
                                                break;
                                            }
                                            i13 = i12;
                                            i14 = aVarA.f1055f[i13];
                                            k2Var = currentTimeline;
                                            z11 = true;
                                            if (i14 != 0 || i14 == 1) {
                                                z12 = true;
                                                break;
                                            } else {
                                                i12 = i13 + 1;
                                                currentTimeline = k2Var;
                                            }
                                        }
                                    } else {
                                        k2Var = currentTimeline;
                                        z11 = true;
                                        z12 = true;
                                    }
                                    zArr[i10] = !z12;
                                    i10++;
                                } else {
                                    k2Var = currentTimeline;
                                    z11 = true;
                                }
                            }
                        } else {
                            j9 = jD + h2Var.f1235e;
                            if (j9 >= j13) {
                                jArr = this.f10739b1;
                                if (i10 == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f10739b1 = Arrays.copyOf(jArr, length);
                                    this.f10741c1 = Arrays.copyOf(this.f10741c1, length);
                                }
                                this.f10739b1[i10] = e7.i0.W(j12 + j9);
                                boolean[] zArr2 = this.f10741c1;
                                aVarA = h2Var.f1237g.a(i17);
                                i11 = aVarA.f1051b;
                                if (i11 != -1) {
                                    k2Var = currentTimeline;
                                    z11 = true;
                                    z12 = true;
                                } else {
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            k2Var = currentTimeline;
                                            z11 = true;
                                            z12 = false;
                                            break;
                                        } else {
                                            i13 = i12;
                                            i14 = aVarA.f1055f[i13];
                                            k2Var = currentTimeline;
                                            z11 = true;
                                            if (i14 != 0) {
                                            }
                                            z12 = true;
                                            break;
                                        }
                                        i12 = i13 + 1;
                                        currentTimeline = k2Var;
                                    }
                                }
                                zArr2[i10] = !z12;
                                i10++;
                            } else {
                                k2Var = currentTimeline;
                                z11 = true;
                            }
                        }
                        i17++;
                        z14 = z11;
                        currentMediaItemIndex = currentMediaItemIndex;
                        currentTimeline = k2Var;
                        j13 = 0;
                    }
                    i16++;
                    j11 = j14;
                    currentTimeline = currentTimeline;
                    j13 = 0;
                }
                j12 += j2Var.m;
                i15++;
                z14 = z14;
                currentTimeline = currentTimeline;
                j10 = 0;
            }
            z10 = z14;
            jH = j12;
        }
        long jW = e7.i0.W(jH);
        TextView textView = this.f10755m0;
        if (textView != null) {
            textView.setText(e7.i0.y(this.f10758p0, this.f10759q0, jW));
        }
        k0 k0Var = this.f10757o0;
        if (k0Var != null) {
            h hVar = (h) k0Var;
            hVar.setDuration(jW);
            long[] jArr2 = this.f10743d1;
            int length2 = jArr2.length;
            int i19 = i10 + length2;
            long[] jArr3 = this.f10739b1;
            if (i19 > jArr3.length) {
                this.f10739b1 = Arrays.copyOf(jArr3, i19);
                this.f10741c1 = Arrays.copyOf(this.f10741c1, i19);
            }
            System.arraycopy(jArr2, 0, this.f10739b1, i10, length2);
            System.arraycopy(this.f10745e1, 0, this.f10741c1, i10, length2);
            long[] jArr4 = this.f10739b1;
            boolean[] zArr3 = this.f10741c1;
            if (i19 != 0 && (jArr4 == null || zArr3 == null)) {
                z10 = false;
            }
            ta.c0.s(z10);
            hVar.f10683p0 = i19;
            hVar.f10684q0 = jArr4;
            hVar.f10685r0 = zArr3;
            hVar.e();
        }
        s();
    }

    public final void x() {
        i iVar = this.O;
        iVar.getClass();
        List list = Collections.EMPTY_LIST;
        iVar.f10687a = list;
        i iVar2 = this.P;
        iVar2.getClass();
        iVar2.f10687a = list;
        f1 f1Var = this.Q0;
        ImageView imageView = this.f10748g0;
        if (f1Var != null && f1Var.isCommandAvailable(30) && this.Q0.isCommandAvailable(29)) {
            s2 currentTracks = this.Q0.getCurrentTracks();
            d2 d2VarF = f(currentTracks, 1);
            iVar2.f10687a = d2VarF;
            u uVar = iVar2.f10690d;
            f1 f1Var2 = uVar.Q0;
            p pVar = uVar.M;
            f1Var2.getClass();
            q2 trackSelectionParameters = f1Var2.getTrackSelectionParameters();
            if (d2VarF.isEmpty()) {
                pVar.f10727b[1] = uVar.getResources().getString(2131886493);
            } else if (iVar2.a(trackSelectionParameters)) {
                for (int i10 = 0; i10 < d2VarF.D; i10++) {
                    r rVar = (r) d2VarF.get(i10);
                    if (rVar.f10732a.f1490e[rVar.f10733b]) {
                        pVar.f10727b[1] = rVar.f10734c;
                        break;
                    }
                }
            } else {
                pVar.f10727b[1] = uVar.getResources().getString(2131886492);
            }
            if (this.A.b(imageView)) {
                iVar.b(f(currentTracks, 3));
            } else {
                iVar.b(d2.E);
            }
        }
        n(imageView, iVar.getItemCount() > 0);
        p pVar2 = this.M;
        n(this.f10752j0, pVar2.a(1) || pVar2.a(0));
    }
}
