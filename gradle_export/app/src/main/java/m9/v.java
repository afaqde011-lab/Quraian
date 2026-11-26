package m9;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class v implements Runnable {
    public final int A;
    public final z B;

    public v(z zVar, int i10) {
        this.A = i10;
        this.B = zVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.k();
                break;
            case 1:
                z zVar = this.B;
                View view = zVar.f10786k;
                ViewGroup viewGroup = zVar.f10781f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(zVar.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = zVar.f10776a.getResources().getDimensionPixelSize(2131165401);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (zVar.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof h) {
                        h hVar = (h) view;
                        Rect rect = hVar.A;
                        ValueAnimator valueAnimator = hVar.f10675h0;
                        if (zVar.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            hVar.f10677j0 = true;
                            hVar.f10676i0 = 0.0f;
                            hVar.invalidate(rect);
                        } else {
                            int i10 = zVar.A;
                            if (i10 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                hVar.f10677j0 = false;
                                hVar.f10676i0 = 0.0f;
                                hVar.invalidate(rect);
                            } else if (i10 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                hVar.f10677j0 = false;
                                hVar.f10676i0 = 1.0f;
                                hVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : zVar.f10799z) {
                    view2.setVisibility((zVar.B && z.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                z zVar2 = this.B;
                ValueAnimator valueAnimator2 = zVar2.f10792s;
                View view3 = zVar2.l;
                u uVar = zVar2.f10776a;
                ViewGroup viewGroup2 = zVar2.f10783h;
                ViewGroup viewGroup3 = zVar2.f10782g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (uVar.getWidth() - uVar.getPaddingLeft()) - uVar.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iC = z.c(zVar2.f10785j);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i11 = 0; i11 < childCount; i11++) {
                                iC += z.c(viewGroup3.getChildAt(i11));
                            }
                            if (iC > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iC += z.c(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt = viewGroup3.getChildAt(i12);
                                    iC -= z.c(childAt);
                                    arrayList.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                                viewGroup2.addView((View) arrayList.get(i13), viewGroup2.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    while (i13 < arrayList.size()) {
                                        viewGroup2.addView((View) arrayList.get(i13), viewGroup2.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = zVar2.f10784i;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    zVar2.f10791r.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.B.f10788o.start();
                break;
            case 4:
                this.B.f10787n.start();
                break;
            case 5:
                z zVar3 = this.B;
                zVar3.m.start();
                zVar3.e(zVar3.f10795v, 2000L);
                break;
            default:
                this.B.i(2);
                break;
        }
    }
}
