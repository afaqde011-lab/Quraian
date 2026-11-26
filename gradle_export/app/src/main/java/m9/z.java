package m9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

public final class z {
    public boolean B;
    public boolean C;

    public final u f10776a;

    public final View f10777b;

    public final ViewGroup f10778c;

    public final ViewGroup f10779d;

    public final ViewGroup f10780e;

    public final ViewGroup f10781f;

    public final ViewGroup f10782g;

    public final ViewGroup f10783h;

    public final ViewGroup f10784i;

    public final ViewGroup f10785j;

    public final View f10786k;
    public final View l;
    public final AnimatorSet m;

    public final AnimatorSet f10787n;

    public final AnimatorSet f10788o;

    public final AnimatorSet f10789p;

    public final AnimatorSet f10790q;

    public final ValueAnimator f10791r;

    public final ValueAnimator f10792s;

    public final v f10793t;

    public final v f10794u;

    public final v f10797x;

    public final gg.a f10798y;

    public final v f10795v = new v(this, 4);

    public final v f10796w = new v(this, 5);
    public boolean D = true;
    public int A = 0;

    public final ArrayList f10799z = new ArrayList();

    public z(u uVar) {
        this.f10776a = uVar;
        final int i10 = 0;
        this.f10793t = new v(this, i10);
        final int i11 = 3;
        this.f10794u = new v(this, i11);
        int i12 = 6;
        this.f10797x = new v(this, i12);
        final int i13 = 2;
        this.f10798y = new gg.a(this, i13);
        final int i14 = 1;
        this.f10778c = (ViewGroup) uVar.findViewById(2131362183);
        this.f10777b = uVar.findViewById(2131362145);
        this.f10779d = (ViewGroup) uVar.findViewById(2131362140);
        this.f10781f = (ViewGroup) uVar.findViewById(2131362157);
        ViewGroup viewGroup = (ViewGroup) uVar.findViewById(2131362138);
        this.f10780e = viewGroup;
        this.f10785j = (ViewGroup) uVar.findViewById(2131362182);
        View viewFindViewById = uVar.findViewById(2131362169);
        this.f10786k = viewFindViewById;
        this.f10782g = (ViewGroup) uVar.findViewById(2131362137);
        this.f10783h = (ViewGroup) uVar.findViewById(2131362148);
        this.f10784i = (ViewGroup) uVar.findViewById(2131362149);
        View viewFindViewById2 = uVar.findViewById(2131362161);
        this.l = viewFindViewById2;
        View viewFindViewById3 = uVar.findViewById(2131362160);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new androidx.mediarouter.app.c(this, i12));
            viewFindViewById3.setOnClickListener(new androidx.mediarouter.app.c(this, i12));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final z f10770b;

            {
                this.f10770b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i11;
                z zVar = this.f10770b;
                zVar.getClass();
                switch (i15) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f10777b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.f10778c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.f10779d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zVar.f10781f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar.f10777b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar.f10778c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zVar.f10779d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zVar.f10781f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new x(this, i10));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final z f10770b;

            {
                this.f10770b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i10;
                z zVar = this.f10770b;
                zVar.getClass();
                switch (i15) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f10777b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.f10778c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.f10779d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zVar.f10781f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar.f10777b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar.f10778c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zVar.f10779d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zVar.f10781f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new x(this, i14));
        Resources resources = uVar.getResources();
        float dimension = resources.getDimension(2131165392) - resources.getDimension(2131165397);
        float dimension2 = resources.getDimension(2131165392);
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new y(this, uVar, i10));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f10787n = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new y(this, uVar, i14));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f10788o = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new y(this, uVar, i13));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f10789p = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new x(this, i13));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f10790q = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new x(this, i11));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10791r = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final z f10770b;

            {
                this.f10770b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                z zVar = this.f10770b;
                zVar.getClass();
                switch (i15) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f10777b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.f10778c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.f10779d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zVar.f10781f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar.f10777b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar.f10778c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zVar.f10779d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zVar.f10781f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new x(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f10792s = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final z f10770b;

            {
                this.f10770b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i13;
                z zVar = this.f10770b;
                zVar.getClass();
                switch (i15) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f10777b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.f10778c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.f10779d;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup4 = zVar.f10781f;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        zVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar.f10777b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar.f10778c;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup6 = zVar.f10779d;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup7 = zVar.f10781f;
                        if (viewGroup7 != null) {
                            viewGroup7.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new x(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f3, float f10) {
        return ObjectAnimator.ofFloat(view, "translationY", f3, f10);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        return id2 == 2131362138 || id2 == 2131362156 || id2 == 2131362168 || id2 == 2131362159 || id2 == 2131362172 || id2 == 2131362173 || id2 == 2131362150 || id2 == 2131362151;
    }

    public final void a(float f3) {
        ViewGroup viewGroup = this.f10784i;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f3) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f10785j;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f3);
        }
        ViewGroup viewGroup3 = this.f10782g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f3);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f10799z.contains(view);
    }

    public final void e(Runnable runnable, long j9) {
        if (j9 >= 0) {
            this.f10776a.postDelayed(runnable, j9);
        }
    }

    public final void f() {
        v vVar = this.f10797x;
        u uVar = this.f10776a;
        uVar.removeCallbacks(vVar);
        uVar.removeCallbacks(this.f10794u);
        uVar.removeCallbacks(this.f10796w);
        uVar.removeCallbacks(this.f10795v);
    }

    public final void g() {
        if (this.A == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f10776a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.D) {
                e(this.f10797x, showTimeoutMs);
            } else if (this.A == 1) {
                e(this.f10795v, 2000L);
            } else {
                e(this.f10796w, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f10799z;
        if (!z10) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.B && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i10) {
        int i11 = this.A;
        this.A = i10;
        u uVar = this.f10776a;
        if (i10 == 2) {
            uVar.setVisibility(8);
        } else if (i11 == 2) {
            uVar.setVisibility(0);
        }
        if (i11 != i10) {
            for (t tVar : uVar.K) {
                uVar.getVisibility();
                ((b0) tVar).C.l();
            }
        }
    }

    public final void k() {
        if (!this.D) {
            i(0);
            g();
            return;
        }
        int i10 = this.A;
        if (i10 == 1) {
            this.f10789p.start();
        } else if (i10 == 2) {
            this.f10790q.start();
        } else if (i10 == 3) {
            this.C = true;
        } else if (i10 == 4) {
            return;
        }
        g();
    }
}
