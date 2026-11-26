package androidx.mediarouter.app;

import a1.u0;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class q0 extends k.d0 {

    public static final int f1766u0 = 0;
    public final o9.c0 G;
    public final i0 H;
    public o9.u I;
    public o9.b0 J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public final Context O;
    public boolean P;
    public boolean Q;
    public long R;
    public final d S;
    public RecyclerView T;
    public o0 U;
    public p0 V;
    public HashMap W;
    public o9.b0 X;
    public HashMap Y;
    public boolean Z;

    public boolean f1767a0;

    public boolean f1768b0;

    public ImageButton f1769c0;

    public Button f1770d0;

    public ImageView f1771e0;

    public View f1772f0;

    public ImageView f1773g0;

    public TextView f1774h0;

    public TextView f1775i0;

    public String f1776j0;

    public u0 f1777k0;

    public final s f1778l0;

    public MediaDescriptionCompat f1779m0;

    public f0 f1780n0;

    public Bitmap f1781o0;

    public Uri f1782p0;

    public boolean f1783q0;

    public Bitmap f1784r0;

    public int f1785s0;

    public final boolean f1786t0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    public q0(Context context) {
        ContextThemeWrapper contextThemeWrapperT = f50.c.t(context, 0, false);
        int I = f50.c.I(contextThemeWrapperT, 2130969554);
        super(contextThemeWrapperT, I == 0 ? f50.c.E(contextThemeWrapperT) : I);
        this.I = o9.u.f11876c;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.S = new d(this, 2);
        Context context2 = getContext();
        this.O = context2;
        this.G = o9.c0.d(context2);
        this.f1786t0 = o9.c0.g();
        this.H = new i0(this, 0);
        this.J = o9.c0.f();
        this.f1778l0 = new s(this, 1);
        g(o9.c0.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            o9.b0 b0Var = (o9.b0) list.get(size);
            if (b0Var.d() || !b0Var.f11743g || !b0Var.h(this.I) || this.J == b0Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f1779m0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.E;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.F : null;
        f0 f0Var = this.f1780n0;
        Bitmap bitmap2 = f0Var == null ? this.f1781o0 : f0Var.f1728a;
        Uri uri2 = f0Var == null ? this.f1782p0 : f0Var.f1729b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            f0 f0Var2 = this.f1780n0;
            if (f0Var2 != null) {
                f0Var2.cancel(true);
            }
            f0 f0Var3 = new f0(this);
            this.f1780n0 = f0Var3;
            f0Var3.execute(new Void[0]);
        }
    }

    public final void g(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        u0 u0Var = this.f1777k0;
        s sVar = this.f1778l0;
        if (u0Var != null) {
            u0Var.W(sVar);
            this.f1777k0 = null;
        }
        if (mediaSessionCompat$Token != null && this.Q) {
            u0 u0Var2 = new u0(this.O, mediaSessionCompat$Token);
            this.f1777k0 = u0Var2;
            u0Var2.Q(sVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.f1777k0.B).f496a.getMetadata();
            if (metadata != null) {
                u.e eVar = MediaMetadataCompat.D;
                Parcel parcelObtain = Parcel.obtain();
                metadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.B = metadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            this.f1779m0 = mediaMetadataCompatCreateFromParcel != null ? mediaMetadataCompatCreateFromParcel.a() : null;
            f();
            j();
        }
    }

    public final void h(o9.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.I.equals(uVar)) {
            return;
        }
        this.I = uVar;
        if (this.Q) {
            o9.c0 c0Var = this.G;
            i0 i0Var = this.H;
            c0Var.h(i0Var);
            c0Var.a(uVar, i0Var, 1);
            k();
        }
    }

    public final void i() {
        Context context = this.O;
        getWindow().setLayout(!context.getResources().getBoolean(2131034118) ? -1 : b5.t(context), context.getResources().getBoolean(2131034118) ? -2 : -1);
        this.f1781o0 = null;
        this.f1782p0 = null;
        f();
        j();
        l();
    }

    public final void j() {
        Bitmap bitmap;
        if ((this.X != null || this.Z) ? true : !this.P) {
            this.f1768b0 = true;
            return;
        }
        this.f1768b0 = false;
        if (!this.J.g() || this.J.d()) {
            dismiss();
        }
        if (this.f1783q0) {
            Bitmap bitmap2 = this.f1784r0;
            if ((bitmap2 != null && bitmap2.isRecycled()) || this.f1784r0 == null) {
                bitmap = this.f1784r0;
                if (bitmap == null && bitmap.isRecycled()) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f1784r0);
                }
                this.f1773g0.setVisibility(8);
                this.f1772f0.setVisibility(8);
                this.f1771e0.setImageBitmap(null);
            } else {
                this.f1773g0.setVisibility(0);
                this.f1773g0.setImageBitmap(this.f1784r0);
                this.f1773g0.setBackgroundColor(this.f1785s0);
                this.f1772f0.setVisibility(0);
                Bitmap bitmap3 = this.f1784r0;
                RenderScript renderScriptCreate = RenderScript.create(this.O);
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
                Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                scriptIntrinsicBlurCreate.setRadius(10.0f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
                allocationCreateTyped.copyTo(bitmapCopy);
                allocationCreateFromBitmap.destroy();
                allocationCreateTyped.destroy();
                scriptIntrinsicBlurCreate.destroy();
                renderScriptCreate.destroy();
                this.f1771e0.setImageBitmap(bitmapCopy);
            }
        } else {
            bitmap = this.f1784r0;
            if (bitmap == null && bitmap.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f1784r0);
            }
            this.f1773g0.setVisibility(8);
            this.f1772f0.setVisibility(8);
            this.f1771e0.setImageBitmap(null);
        }
        this.f1783q0 = false;
        this.f1784r0 = null;
        this.f1785s0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.f1779m0;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.B;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f1779m0;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.C : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        if (zIsEmpty) {
            this.f1774h0.setText(this.f1776j0);
        } else {
            this.f1774h0.setText(charSequence);
        }
        if (zIsEmpty2) {
            this.f1775i0.setVisibility(8);
        } else {
            this.f1775i0.setText(charSequence2);
            this.f1775i0.setVisibility(0);
        }
    }

    public final void k() {
        ArrayList arrayList = this.K;
        arrayList.clear();
        ArrayList arrayList2 = this.L;
        arrayList2.clear();
        ArrayList arrayList3 = this.M;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.J.f11756v));
        o9.x xVarA = this.J.a();
        if (xVarA != null) {
            o9.a0 a0Var = this.J.f11737a;
            a0Var.getClass();
            o9.c0.b();
            for (o9.b0 b0Var : Collections.unmodifiableList(a0Var.f11730b)) {
                if (xVarA.o(b0Var)) {
                    arrayList2.add(b0Var);
                }
                o9.o oVar = (o9.o) xVarA.f11892x.get(b0Var.f11739c);
                if (oVar != null && oVar.f11841e) {
                    arrayList3.add(b0Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        f fVar = f.D;
        Collections.sort(arrayList, fVar);
        Collections.sort(arrayList2, fVar);
        Collections.sort(arrayList3, fVar);
        this.U.d();
    }

    public final void l() {
        if (this.Q) {
            if (SystemClock.uptimeMillis() - this.R < 300) {
                d dVar = this.S;
                dVar.removeMessages(1);
                dVar.sendEmptyMessageAtTime(1, this.R + 300);
                return;
            }
            if ((this.X != null || this.Z) ? true : !this.P) {
                this.f1767a0 = true;
                return;
            }
            this.f1767a0 = false;
            if (!this.J.g() || this.J.d()) {
                dismiss();
            }
            this.R = SystemClock.uptimeMillis();
            this.U.c();
        }
    }

    public final void m() {
        if (this.f1767a0) {
            l();
        }
        if (this.f1768b0) {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.G.a(this.I, this.H, 1);
        k();
        g(o9.c0.e());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559088);
        View decorView = getWindow().getDecorView();
        Context context = this.O;
        decorView.setBackgroundColor(context.getColor(f50.c.O(context) ? 2131100612 : 2131100611));
        ImageButton imageButton = (ImageButton) findViewById(2131362813);
        this.f1769c0 = imageButton;
        imageButton.setColorFilter(-1);
        this.f1769c0.setOnClickListener(new e0(this, 0));
        Button button = (Button) findViewById(2131362829);
        this.f1770d0 = button;
        button.setTextColor(-1);
        this.f1770d0.setOnClickListener(new e0(this, 1));
        this.U = new o0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131362819);
        this.T = recyclerView;
        recyclerView.setAdapter(this.U);
        this.T.setLayoutManager(new LinearLayoutManager(1));
        this.V = new p0(this);
        this.W = new HashMap();
        this.Y = new HashMap();
        this.f1771e0 = (ImageView) findViewById(2131362821);
        this.f1772f0 = findViewById(2131362822);
        this.f1773g0 = (ImageView) findViewById(2131362820);
        TextView textView = (TextView) findViewById(2131362824);
        this.f1774h0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(2131362823);
        this.f1775i0 = textView2;
        textView2.setTextColor(-1);
        this.f1776j0 = context.getResources().getString(2131886806);
        this.P = true;
        i();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q = false;
        this.G.h(this.H);
        this.S.removeCallbacksAndMessages(null);
        g(null);
    }
}
