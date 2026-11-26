package androidx.mediarouter.app;

import a1.u0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public final class v extends k.i {
    public static final int Q0;
    public boolean A0;
    public Bitmap B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final o9.c0 H;
    public boolean H0;
    public final i0 I;
    public int I0;
    public final o9.b0 J;
    public int J0;
    public final Context K;
    public int K0;
    public boolean L;
    public Interpolator L0;
    public boolean M;
    public final Interpolator M0;
    public int N;
    public final Interpolator N0;
    public Button O;
    public final AccessibilityManager O0;
    public Button P;
    public final k P0;
    public ImageButton Q;
    public MediaRouteExpandCollapseButton R;
    public FrameLayout S;
    public LinearLayout T;
    public FrameLayout U;
    public ImageView V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public final boolean Z;

    public final boolean f1810a0;

    public LinearLayout f1811b0;

    public RelativeLayout f1812c0;

    public LinearLayout f1813d0;

    public View f1814e0;

    public OverlayListView f1815f0;

    public u f1816g0;

    public ArrayList f1817h0;

    public HashSet f1818i0;

    public HashSet f1819j0;

    public HashSet f1820k0;

    public SeekBar f1821l0;

    public t f1822m0;

    public o9.b0 f1823n0;

    public int f1824o0;

    public int f1825p0;

    public int f1826q0;

    public final int f1827r0;

    public HashMap f1828s0;

    public u0 f1829t0;

    public final s f1830u0;

    public PlaybackStateCompat f1831v0;

    public MediaDescriptionCompat f1832w0;

    public r f1833x0;

    public Bitmap f1834y0;

    public Uri f1835z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        Q0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    public v(Context context, int i10) {
        ContextThemeWrapper contextThemeWrapperT = f50.c.t(context, i10, true);
        int I = f50.c.I(contextThemeWrapperT, 2130969554);
        super(contextThemeWrapperT, I == 0 ? f50.c.E(contextThemeWrapperT) : I);
        this.Z = true;
        this.P0 = new k(this, 0);
        Context context2 = getContext();
        this.K = context2;
        this.f1830u0 = new s(this, 0);
        this.H = o9.c0.d(context2);
        this.f1810a0 = o9.c0.g();
        this.I = new i0(this, 3);
        this.J = o9.c0.f();
        n(o9.c0.e());
        this.f1827r0 = context2.getResources().getDimensionPixelSize(2131166084);
        this.O0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.M0 = AnimationUtils.loadInterpolator(contextThemeWrapperT, 2131492885);
        this.N0 = AnimationUtils.loadInterpolator(contextThemeWrapperT, 2131492884);
    }

    public static void m(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void f(View view, int i10) {
        n nVar = new n(view.getLayoutParams().height, i10, view, 0);
        nVar.setDuration(this.I0);
        nVar.setInterpolator(this.L0);
        view.startAnimation(nVar);
    }

    public final boolean g() {
        return (this.f1832w0 == null && this.f1831v0 == null) ? false : true;
    }

    public final void h(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.f1815f0.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.f1815f0.getChildCount(); i10++) {
            View childAt = this.f1815f0.getChildAt(i10);
            o9.b0 b0Var = (o9.b0) this.f1816g0.getItem(firstVisiblePosition + i10);
            if (!z10 || (hashSet = this.f1818i0) == null || !hashSet.contains(b0Var)) {
                ((LinearLayout) childAt.findViewById(2131363135)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (r0 r0Var : this.f1815f0.A) {
            r0Var.f1801j = true;
            r0Var.f1802k = true;
            l9.f0 f0Var = r0Var.l;
            if (f0Var != null) {
                v vVar = (v) f0Var.C;
                vVar.f1820k0.remove((o9.b0) f0Var.B);
                vVar.f1816g0.notifyDataSetChanged();
            }
        }
        if (z10) {
            return;
        }
        i(false);
    }

    public final void i(boolean z10) {
        this.f1818i0 = null;
        this.f1819j0 = null;
        this.G0 = false;
        if (this.H0) {
            this.H0 = false;
            r(z10);
        }
        this.f1815f0.setEnabled(true);
    }

    public final int j(int i10, int i11) {
        float f3;
        float f10;
        if (i10 >= i11) {
            f3 = this.N * i11;
            f10 = i10;
        } else {
            f3 = this.N * 9.0f;
            f10 = 16.0f;
        }
        return (int) ((f3 / f10) + 0.5f);
    }

    public final int k(boolean z10) {
        if (!z10 && this.f1813d0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.f1811b0.getPaddingBottom() + this.f1811b0.getPaddingTop();
        if (z10) {
            paddingBottom += this.f1812c0.getMeasuredHeight();
        }
        if (this.f1813d0.getVisibility() == 0) {
            paddingBottom += this.f1813d0.getMeasuredHeight();
        }
        return (z10 && this.f1813d0.getVisibility() == 0) ? this.f1814e0.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean l() {
        o9.b0 b0Var = this.J;
        return b0Var.e() && Collections.unmodifiableList(b0Var.f11756v).size() > 1;
    }

    public final void n(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        PlaybackStateCompat playbackState;
        u0 u0Var = this.f1829t0;
        s sVar = this.f1830u0;
        if (u0Var != null) {
            u0Var.W(sVar);
            this.f1829t0 = null;
        }
        if (mediaSessionCompat$Token != null && this.M) {
            u0 u0Var2 = new u0(this.K, mediaSessionCompat$Token);
            this.f1829t0 = u0Var2;
            u0Var2.Q(sVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.f1829t0.B).f496a.getMetadata();
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
            this.f1832w0 = mediaMetadataCompatCreateFromParcel == null ? null : mediaMetadataCompatCreateFromParcel.a();
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f1829t0.B;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f500e;
            if (mediaSessionCompat$Token2.a() != null) {
                try {
                    playbackState = mediaSessionCompat$Token2.a().getPlaybackState();
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e3);
                    PlaybackState playbackState2 = hVar.f496a.getPlaybackState();
                    playbackState = playbackState2 != null ? PlaybackStateCompat.a(playbackState2) : null;
                }
            } else {
                PlaybackState playbackState3 = hVar.f496a.getPlaybackState();
                playbackState = playbackState3 != null ? PlaybackStateCompat.a(playbackState3) : null;
            }
            this.f1831v0 = playbackState;
            p();
            o(false);
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        PlaybackStateCompat playbackStateCompat;
        int i12;
        boolean z14;
        Context context;
        int i13;
        int i14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (this.f1823n0 != null) {
            this.D0 = true;
            this.E0 = z10 | this.E0;
            return;
        }
        this.D0 = false;
        this.E0 = false;
        o9.b0 b0Var = this.J;
        if (!b0Var.g() || b0Var.d()) {
            dismiss();
            return;
        }
        if (this.L) {
            this.Y.setText(b0Var.f11740d);
            this.O.setVisibility(b0Var.f11746j ? 0 : 8);
            if (this.A0) {
                Bitmap bitmap = this.B0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.V.setImageBitmap(this.B0);
                    this.V.setBackgroundColor(this.C0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.B0);
                }
                this.A0 = false;
                this.B0 = null;
                this.C0 = 0;
            }
            boolean z19 = this.f1810a0;
            if (!z19 && l()) {
                this.f1813d0.setVisibility(8);
                this.F0 = true;
                this.f1815f0.setVisibility(0);
                this.L0 = this.F0 ? this.M0 : this.N0;
                r(false);
            } else if (!this.F0 || z19) {
                if (this.Z) {
                    if (((!b0Var.e() || o9.c0.g()) ? b0Var.f11749o : 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    this.f1813d0.setVisibility(8);
                } else if (this.f1813d0.getVisibility() == 8) {
                    this.f1813d0.setVisibility(0);
                    this.f1821l0.setMax(b0Var.f11751q);
                    this.f1821l0.setProgress(b0Var.f11750p);
                    this.R.setVisibility(l() ? 0 : 8);
                }
            } else {
                this.f1813d0.setVisibility(8);
            }
            if (g()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.f1832w0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.B;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.f1832w0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.C : null;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                if (b0Var.f11752r != -1) {
                    this.W.setText(2131886819);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.f1831v0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.A == 0) {
                        this.W.setText(2131886825);
                    } else {
                        if (zIsEmpty && zIsEmpty2) {
                            this.W.setText(2131886824);
                        } else {
                            if (zIsEmpty) {
                                z12 = false;
                            } else {
                                this.W.setText(charSequence);
                                z12 = true;
                            }
                            if (zIsEmpty2) {
                                z13 = false;
                            } else {
                                this.X.setText(charSequence2);
                                z13 = true;
                            }
                        }
                        TextView textView = this.W;
                        if (z12) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                        TextView textView2 = this.X;
                        if (z13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        textView2.setVisibility(i11);
                        playbackStateCompat = this.f1831v0;
                        if (playbackStateCompat != null) {
                            i12 = playbackStateCompat.A;
                            if (i12 != 6 || i12 == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            context = this.Q.getContext();
                            if (!z14) {
                                if ((this.f1831v0.E & 514) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    i13 = 2130969549;
                                    i14 = 2131886826;
                                } else if (!z14) {
                                    if ((this.f1831v0.E & 1) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        i13 = 2130969553;
                                        i14 = 2131886828;
                                    } else if (z14) {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    } else {
                                        if ((this.f1831v0.E & 516) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            i13 = 2130969550;
                                            i14 = 2131886827;
                                        } else {
                                            z18 = false;
                                            i13 = 0;
                                            i14 = 0;
                                        }
                                    }
                                } else if (z14) {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                } else {
                                    if ((this.f1831v0.E & 516) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i13 = 2130969550;
                                        i14 = 2131886827;
                                    } else {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                }
                            } else if (!z14) {
                                if ((this.f1831v0.E & 1) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    i13 = 2130969553;
                                    i14 = 2131886828;
                                } else if (z14) {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                } else {
                                    if ((this.f1831v0.E & 516) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i13 = 2130969550;
                                        i14 = 2131886827;
                                    } else {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                }
                            } else if (z14) {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            } else {
                                if ((this.f1831v0.E & 516) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    i13 = 2130969550;
                                    i14 = 2131886827;
                                } else {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                }
                            }
                            this.Q.setVisibility(z18 ? 0 : 8);
                            if (z18) {
                                this.Q.setImageResource(f50.c.I(context, i13));
                                this.Q.setContentDescription(context.getResources().getText(i14));
                            }
                        }
                    }
                }
                z13 = false;
                z12 = true;
                TextView textView3 = this.W;
                if (z12) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView3.setVisibility(i10);
                TextView textView4 = this.X;
                if (z13) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView4.setVisibility(i11);
                playbackStateCompat = this.f1831v0;
                if (playbackStateCompat != null) {
                    i12 = playbackStateCompat.A;
                    if (i12 != 6) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    context = this.Q.getContext();
                    if (!z14) {
                        if ((this.f1831v0.E & 514) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i13 = 2130969549;
                            i14 = 2131886826;
                        } else if (!z14) {
                            if ((this.f1831v0.E & 1) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                i13 = 2130969553;
                                i14 = 2131886828;
                            } else if (z14) {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            } else {
                                if ((this.f1831v0.E & 516) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    i13 = 2130969550;
                                    i14 = 2131886827;
                                } else {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                }
                            }
                        } else if (z14) {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if ((this.f1831v0.E & 516) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i13 = 2130969550;
                                i14 = 2131886827;
                            } else {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            }
                        }
                    } else if (!z14) {
                        if ((this.f1831v0.E & 1) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            i13 = 2130969553;
                            i14 = 2131886828;
                        } else if (z14) {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if ((this.f1831v0.E & 516) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i13 = 2130969550;
                                i14 = 2131886827;
                            } else {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            }
                        }
                    } else if (z14) {
                        z18 = false;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        if ((this.f1831v0.E & 516) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i13 = 2130969550;
                            i14 = 2131886827;
                        } else {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                    this.Q.setVisibility(z18 ? 0 : 8);
                    if (z18) {
                        this.Q.setImageResource(f50.c.I(context, i13));
                        this.Q.setContentDescription(context.getResources().getText(i14));
                    }
                }
            }
            r(z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        this.H.a(o9.u.f11876c, this.I, 2);
        n(o9.c0.e());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(2131559096);
        findViewById(R.id.button3).setVisibility(8);
        q qVar = new q(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131362855);
        this.S = frameLayout;
        frameLayout.setOnClickListener(new q(this, 2));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131362854);
        this.T = linearLayout;
        linearLayout.setOnClickListener(new l());
        Context context = this.K;
        int iH = f50.c.H(context, 2130968923);
        if (q4.a.c(iH, f50.c.H(context, R.attr.colorBackground)) < 3.0d) {
            iH = f50.c.H(context, 2130968888);
        }
        Button button = (Button) findViewById(R.id.button2);
        this.O = button;
        button.setText(2131886822);
        this.O.setTextColor(iH);
        this.O.setOnClickListener(qVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.P = button2;
        button2.setText(2131886829);
        this.P.setTextColor(iH);
        this.P.setOnClickListener(qVar);
        this.Y = (TextView) findViewById(2131362859);
        ((ImageButton) findViewById(2131362846)).setOnClickListener(qVar);
        this.U = (FrameLayout) findViewById(2131362853);
        q qVar2 = new q(this, 3);
        ImageView imageView = (ImageView) findViewById(2131362811);
        this.V = imageView;
        imageView.setOnClickListener(qVar2);
        findViewById(2131362851).setOnClickListener(qVar2);
        this.f1811b0 = (LinearLayout) findViewById(2131362858);
        this.f1814e0 = findViewById(2131362847);
        this.f1812c0 = (RelativeLayout) findViewById(2131362866);
        this.W = (TextView) findViewById(2131362850);
        this.X = (TextView) findViewById(2131362849);
        ImageButton imageButton = (ImageButton) findViewById(2131362848);
        this.Q = imageButton;
        imageButton.setOnClickListener(qVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131362868);
        this.f1813d0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(2131362871);
        this.f1821l0 = seekBar;
        o9.b0 b0Var = this.J;
        seekBar.setTag(b0Var);
        t tVar = new t(this);
        this.f1822m0 = tVar;
        this.f1821l0.setOnSeekBarChangeListener(tVar);
        this.f1815f0 = (OverlayListView) findViewById(2131362869);
        this.f1817h0 = new ArrayList();
        u uVar = new u(this, this.f1815f0.getContext(), this.f1817h0);
        this.f1816g0 = uVar;
        this.f1815f0.setAdapter((ListAdapter) uVar);
        this.f1820k0 = new HashSet();
        LinearLayout linearLayout3 = this.f1811b0;
        OverlayListView overlayListView = this.f1815f0;
        boolean zL = l();
        int iH2 = f50.c.H(context, 2130968923);
        int iH3 = f50.c.H(context, 2130968925);
        if (zL && f50.c.B(context) == -570425344) {
            iH3 = iH2;
            iH2 = -1;
        }
        linearLayout3.setBackgroundColor(iH2);
        overlayListView.setBackgroundColor(iH3);
        linearLayout3.setTag(Integer.valueOf(iH2));
        overlayListView.setTag(Integer.valueOf(iH3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.f1821l0;
        LinearLayout linearLayout4 = this.f1811b0;
        int iB = f50.c.B(context);
        if (Color.alpha(iB) != 255) {
            iB = q4.a.f(iB, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iB, iB);
        HashMap map = new HashMap();
        this.f1828s0 = map;
        map.put(b0Var, this.f1821l0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(2131362856);
        this.R = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.I = new q(this, 1);
        this.L0 = this.F0 ? this.M0 : this.N0;
        this.I0 = context.getResources().getInteger(2131427383);
        this.J0 = context.getResources().getInteger(2131427384);
        this.K0 = context.getResources().getInteger(2131427385);
        this.L = true;
        q();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.H.h(this.I);
        n(null);
        this.M = false;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f1810a0 || !this.F0) {
            this.J.k(i10 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 25 || i10 == 24) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public final void p() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f1832w0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.E;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.F : null;
        r rVar = this.f1833x0;
        Bitmap bitmap2 = rVar == null ? this.f1834y0 : rVar.f1787a;
        Uri uri2 = rVar == null ? this.f1835z0 : rVar.f1788b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!l() || this.f1810a0) {
            r rVar2 = this.f1833x0;
            if (rVar2 != null) {
                rVar2.cancel(true);
            }
            r rVar3 = new r(this);
            this.f1833x0 = rVar3;
            rVar3.execute(new Void[0]);
        }
    }

    public final void q() {
        Context context = this.K;
        int iT = b5.t(context);
        getWindow().setLayout(iT, -2);
        View decorView = getWindow().getDecorView();
        this.N = (iT - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.f1824o0 = resources.getDimensionPixelSize(2131166082);
        this.f1825p0 = resources.getDimensionPixelSize(2131166081);
        this.f1826q0 = resources.getDimensionPixelSize(2131166083);
        this.f1834y0 = null;
        this.f1835z0 = null;
        p();
        o(false);
    }

    public final void r(boolean z10) {
        this.U.requestLayout();
        this.U.getViewTreeObserver().addOnGlobalLayoutListener(new m(this, z10));
    }

    public final void s(boolean z10) {
        int i10 = 0;
        this.f1814e0.setVisibility((this.f1813d0.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.f1811b0;
        if (this.f1813d0.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
