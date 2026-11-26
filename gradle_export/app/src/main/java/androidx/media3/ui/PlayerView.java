package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.a1;
import androidx.media3.common.f1;
import androidx.media3.common.p;
import androidx.media3.common.r2;
import androidx.media3.common.w2;
import androidx.media3.common.x2;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import e7.i0;
import fh.t0;
import hf.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import m9.a;
import m9.b0;
import m9.d0;
import m9.e0;
import m9.t;
import m9.u;
import m9.z;
import ta.c0;
import y7.r;
import z7.k;

public class PlayerView extends FrameLayout {

    public static final int f1701j0 = 0;
    public final b0 A;
    public final AspectRatioFrameLayout B;
    public final View C;
    public final View D;
    public final boolean E;
    public final c F;
    public final ImageView G;
    public final ImageView H;
    public final SubtitleView I;
    public final View J;
    public final TextView K;
    public final u L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final Handler O;
    public final Class P;
    public final Method Q;
    public final Object R;
    public f1 S;
    public boolean T;
    public t U;
    public int V;
    public int W;

    public Drawable f1702a0;

    public int f1703b0;

    public boolean f1704c0;

    public CharSequence f1705d0;

    public int f1706e0;

    public boolean f1707f0;

    public boolean f1708g0;

    public boolean f1709h0;

    public boolean f1710i0;

    public PlayerView(Context context, AttributeSet attributeSet) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        boolean z14;
        int i18;
        boolean z15;
        boolean z16;
        boolean z17;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        b0 b0Var = new b0(this);
        this.A = b0Var;
        this.O = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = false;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.P = null;
            this.Q = null;
            this.R = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            String str = i0.f5136a;
            imageView.setImageDrawable(resources.getDrawable(2131230955, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(2131099782, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e0.f10657d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, 2131558749);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i20 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i21 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i22 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z14 = z19;
                i10 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f1704c0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f1704c0);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId;
                z11 = z21;
                i14 = i20;
                z15 = zHasValue;
                i12 = integer;
                i17 = color;
                i16 = i21;
                i15 = i22;
                i13 = resourceId2;
                z12 = z22;
                z10 = z20;
                i18 = i19;
                z13 = z18;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i10 = 5000;
            i11 = 2131558749;
            z10 = true;
            z11 = true;
            z12 = true;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            z13 = true;
            z14 = true;
            i18 = 1;
            z15 = false;
        }
        LayoutInflater.from(context).inflate(i11, (ViewGroup) this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(2131362142);
        this.B = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i15);
        }
        View viewFindViewById = findViewById(2131362177);
        this.C = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i17);
        }
        if (aspectRatioFrameLayout == null || i16 == 0) {
            z16 = false;
            this.D = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 != 2) {
                if (i16 == 3) {
                    try {
                        int i23 = k.L;
                        this.D = (View) k.class.getConstructor(Context.class).newInstance(context);
                        z17 = true;
                    } catch (Exception e3) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e3);
                    }
                } else if (i16 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        surfaceView.setSurfaceLifecycle(2);
                    }
                    this.D = surfaceView;
                } else {
                    try {
                        int i24 = r.B;
                        this.D = (View) r.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e10) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                }
                this.D.setLayoutParams(layoutParams);
                this.D.setOnClickListener(b0Var);
                z16 = false;
                this.D.setClickable(false);
                aspectRatioFrameLayout.addView(this.D, 0);
            } else {
                this.D = new TextureView(context);
            }
            z17 = false;
            this.D.setLayoutParams(layoutParams);
            this.D.setOnClickListener(b0Var);
            z16 = false;
            this.D.setClickable(false);
            aspectRatioFrameLayout.addView(this.D, 0);
        }
        this.E = z17;
        this.F = Build.VERSION.SDK_INT == 34 ? new c(19, z16) : null;
        this.M = (FrameLayout) findViewById(2131362134);
        this.N = (FrameLayout) findViewById(2131362162);
        this.G = (ImageView) findViewById(2131362154);
        this.W = i14;
        try {
            cls = ExoPlayer.class;
            int i25 = ExoPlayer.f1692a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() {
                @Override
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i26 = PlayerView.f1701j0;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f10643a;
                    playerView.O.post(new ji.a(playerView, bitmap, 27));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.P = cls;
        this.Q = method;
        this.R = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(2131362135);
        this.H = imageView2;
        this.V = (!z13 || i18 == 0 || imageView2 == null) ? z16 : i18;
        if (i13 != 0) {
            this.f1702a0 = getContext().getDrawable(i13);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(2131362180);
        this.I = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(2131362139);
        this.J = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f1703b0 = i12;
        TextView textView = (TextView) findViewById(2131362147);
        this.K = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        u uVar = (u) findViewById(2131362143);
        View viewFindViewById3 = findViewById(2131362144);
        if (uVar != null) {
            this.L = uVar;
        } else if (viewFindViewById3 != null) {
            u uVar2 = new u(context, attributeSet);
            this.L = uVar2;
            uVar2.setId(2131362143);
            uVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(uVar2, iIndexOfChild);
        } else {
            this.L = null;
        }
        u uVar3 = this.L;
        this.f1706e0 = uVar3 != null ? i10 : z16;
        this.f1709h0 = z10;
        this.f1707f0 = z11;
        this.f1708g0 = z12;
        this.T = (!z14 || uVar3 == null) ? z16 : true;
        if (uVar3 != null) {
            z zVar = uVar3.A;
            int i26 = zVar.A;
            if (i26 != 3 && i26 != 2) {
                zVar.f();
                zVar.i(2);
            }
            u uVar4 = this.L;
            b0 b0Var2 = this.A;
            uVar4.getClass();
            b0Var2.getClass();
            uVar4.K.add(b0Var2);
        }
        if (z14) {
            setClickable(true);
        }
        l();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        f1 f1Var = playerView.S;
        if (f1Var != null && f1Var.isCommandAvailable(30) && f1Var.getCurrentTracks().a(2)) {
            return;
        }
        ImageView imageView = playerView.G;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.C;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.G;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(f1 f1Var) {
        Class cls = this.P;
        if (cls == null || !cls.isAssignableFrom(f1Var.getClass())) {
            return;
        }
        try {
            Method method = this.Q;
            method.getClass();
            Object obj = this.R;
            obj.getClass();
            method.invoke(f1Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final boolean b() {
        f1 f1Var = this.S;
        return f1Var != null && this.R != null && f1Var.isCommandAvailable(30) && f1Var.getCurrentTracks().a(4);
    }

    public final void c() {
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final boolean d() {
        f1 f1Var = this.S;
        return f1Var != null && f1Var.isCommandAvailable(16) && this.S.isPlayingAd() && this.S.getPlayWhenReady();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c cVar;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT != 34 || (cVar = this.F) == null || !this.f1710i0 || (surfaceSyncGroup = (SurfaceSyncGroup) cVar.B) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        cVar.B = null;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f1 f1Var = this.S;
        if (f1Var != null && f1Var.isCommandAvailable(16) && this.S.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        u uVar = this.L;
        if (z10 && p() && !uVar.j()) {
            e(true);
            return true;
        }
        if ((p() && uVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z10 && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!(d() && this.f1708g0) && p()) {
            u uVar = this.L;
            boolean z11 = uVar.j() && uVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z10 || z11 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.H;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.V == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.B;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        f1 f1Var = this.S;
        if (f1Var == null) {
            return true;
        }
        int playbackState = f1Var.getPlaybackState();
        if (!this.f1707f0) {
            return false;
        }
        if (this.S.isCommandAvailable(17) && this.S.getCurrentTimeline().isEmpty()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            f1 f1Var2 = this.S;
            f1Var2.getClass();
            if (f1Var2.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public List<a1> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.N;
        if (frameLayout != null) {
            arrayList.add(new a1(frameLayout));
        }
        u uVar = this.L;
        if (uVar != null) {
            arrayList.add(new a1(uVar));
        }
        return t0.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.M;
        c0.w(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.V;
    }

    public boolean getControllerAutoShow() {
        return this.f1707f0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f1709h0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f1706e0;
    }

    public Drawable getDefaultArtwork() {
        return this.f1702a0;
    }

    public int getImageDisplayMode() {
        return this.W;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.N;
    }

    public f1 getPlayer() {
        return this.S;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.B;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.I;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.V != 0;
    }

    public boolean getUseController() {
        return this.T;
    }

    public View getVideoSurfaceView() {
        return this.D;
    }

    public final void h(boolean z10) {
        if (p()) {
            int i10 = z10 ? 0 : this.f1706e0;
            u uVar = this.L;
            uVar.setShowTimeoutMs(i10);
            z zVar = uVar.A;
            u uVar2 = zVar.f10776a;
            if (!uVar2.l()) {
                uVar2.setVisibility(0);
                uVar2.m();
                ImageView imageView = uVar2.V;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            zVar.k();
        }
    }

    public final void i() {
        if (!p() || this.S == null) {
            return;
        }
        u uVar = this.L;
        if (!uVar.j()) {
            e(true);
        } else if (this.f1709h0) {
            uVar.g();
        }
    }

    public final void j() {
        f1 f1Var = this.S;
        w2 videoSize = f1Var != null ? f1Var.getVideoSize() : w2.f1669d;
        int i10 = videoSize.f1673a;
        int i11 = videoSize.f1674b;
        float f3 = this.E ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f1675c) / i11;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.B;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f3);
        }
    }

    public final void k() {
        boolean z10;
        View view = this.J;
        if (view != null) {
            f1 f1Var = this.S;
            if (f1Var == null || f1Var.getPlaybackState() != 2) {
                z10 = false;
            } else {
                int i10 = this.f1703b0;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.S.getPlayWhenReady())) {
                    z10 = false;
                }
            }
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void l() {
        u uVar = this.L;
        if (uVar == null || !this.T) {
            setContentDescription(null);
        } else if (uVar.j()) {
            setContentDescription(this.f1709h0 ? getResources().getString(2131886455) : null);
        } else {
            setContentDescription(getResources().getString(2131886469));
        }
    }

    public final void m() {
        TextView textView = this.K;
        if (textView != null) {
            CharSequence charSequence = this.f1705d0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                f1 f1Var = this.S;
                if (f1Var != null) {
                    f1Var.getPlayerError();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z10) {
        byte[] bArr;
        Drawable drawable;
        f1 f1Var = this.S;
        boolean zF = false;
        boolean z11 = (f1Var == null || !f1Var.isCommandAvailable(30) || f1Var.getCurrentTracks().f1556a.isEmpty()) ? false : true;
        boolean z12 = this.f1704c0;
        ImageView imageView = this.H;
        View view = this.C;
        if (!z12 && (!z11 || z10)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z11) {
            f1 f1Var2 = this.S;
            boolean z13 = f1Var2 != null && f1Var2.isCommandAvailable(30) && f1Var2.getCurrentTracks().a(2);
            boolean zB = b();
            if (!z13 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.G;
            boolean z14 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z13 && z14) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z13 && !zB && z14) {
                c();
            }
            if (!z13 && !zB && this.V != 0) {
                imageView.getClass();
                if (f1Var != null && f1Var.isCommandAvailable(18) && (bArr = f1Var.getMediaMetadata().f1637k) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.f1702a0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.G;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.W == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.B) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.S == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.T) {
            return false;
        }
        this.L.getClass();
        return true;
    }

    @Override
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        c0.A(i10 == 0 || this.H != null);
        if (this.V != i10) {
            this.V = i10;
            n(false);
        }
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.B;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f1707f0 = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f1708g0 = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        this.L.getClass();
        this.f1709h0 = z10;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(m9.k kVar) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setOnFullScreenModeChangedListener(kVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        u uVar = this.L;
        uVar.getClass();
        this.f1706e0 = i10;
        if (uVar.j()) {
            h(g());
        }
    }

    public void setControllerVisibilityListener(m9.c0 c0Var) {
        if (c0Var != null) {
            setControllerVisibilityListener((t) null);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(t tVar) {
        u uVar = this.L;
        uVar.getClass();
        t tVar2 = this.U;
        if (tVar2 == tVar) {
            return;
        }
        if (tVar2 != null) {
            uVar.K.remove(tVar2);
        }
        this.U = tVar;
        if (tVar != null) {
            uVar.getClass();
            uVar.K.add(tVar);
            setControllerVisibilityListener((m9.c0) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        c0.A(this.K != null);
        this.f1705d0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f1702a0 != drawable) {
            this.f1702a0 = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f1710i0 = z10;
    }

    public void setErrorMessageProvider(p pVar) {
        if (pVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(d0 d0Var) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setOnFullScreenModeChangedListener(this.A);
    }

    public void setFullscreenButtonState(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.o(z10);
    }

    public void setImageDisplayMode(int i10) {
        c0.A(this.G != null);
        if (this.W != i10) {
            this.W = i10;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f1704c0 != z10) {
            this.f1704c0 = z10;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(x2 x2Var) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setMediaRouteButtonViewProvider(x2Var);
    }

    public void setPlayer(f1 f1Var) {
        c0.A(Looper.myLooper() == Looper.getMainLooper());
        c0.s(f1Var == null || f1Var.getApplicationLooper() == Looper.getMainLooper());
        f1 f1Var2 = this.S;
        if (f1Var2 == f1Var) {
            return;
        }
        View view = this.D;
        b0 b0Var = this.A;
        if (f1Var2 != null) {
            f1Var2.removeListener(b0Var);
            if (f1Var2.isCommandAvailable(27)) {
                if (view instanceof TextureView) {
                    f1Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    f1Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class cls = this.P;
            if (cls != null && cls.isAssignableFrom(f1Var2.getClass())) {
                try {
                    Method method = this.Q;
                    method.getClass();
                    method.invoke(f1Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        SubtitleView subtitleView = this.I;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.S = f1Var;
        boolean zP = p();
        u uVar = this.L;
        if (zP) {
            uVar.setPlayer(f1Var);
        }
        k();
        m();
        n(true);
        if (f1Var == null) {
            if (uVar != null) {
                uVar.g();
                return;
            }
            return;
        }
        if (f1Var.isCommandAvailable(27)) {
            if (view instanceof TextureView) {
                f1Var.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                f1Var.setVideoSurfaceView((SurfaceView) view);
            }
            if (f1Var.isCommandAvailable(30)) {
                t0 t0Var = f1Var.getCurrentTracks().f1556a;
                boolean z10 = false;
                loop0: for (int i10 = 0; i10 < t0Var.size(); i10++) {
                    if (((r2) t0Var.get(i10)).f1487b.f1340c == 2) {
                        r2 r2Var = (r2) t0Var.get(i10);
                        for (int i11 = 0; i11 < r2Var.f1489d.length; i11++) {
                            if (r2Var.a(i11)) {
                                z10 = true;
                                break loop0;
                            }
                        }
                    }
                }
                if (z10) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && f1Var.isCommandAvailable(28)) {
            subtitleView.setCues(f1Var.getCurrentCues().f4767a);
        }
        f1Var.addListener(b0Var);
        setImageOutput(f1Var);
        e(false);
    }

    public void setRepeatToggleModes(int i10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.B;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f1703b0 != i10) {
            this.f1703b0 = i10;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.C;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        u uVar = this.L;
        uVar.getClass();
        uVar.setTimeBarScrubbingEnabled(z10);
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        u uVar = this.L;
        c0.A((z10 && uVar == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        if (p()) {
            uVar.setPlayer(this.S);
        } else if (uVar != null) {
            uVar.g();
            uVar.setPlayer(null);
        }
        l();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.D;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
