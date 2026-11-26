package eg;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class a extends ze.d {

    public final int f5375c;

    public final l4.a f5376d;

    public a(l4.a aVar, int i10) {
        this.f5375c = i10;
        this.f5376d = aVar;
    }

    @Override
    public int B(View view) {
        switch (this.f5375c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                return sideSheetBehavior.l + sideSheetBehavior.f4190o;
            default:
                return super.B(view);
        }
    }

    @Override
    public int C() {
        switch (this.f5375c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5376d;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.C();
        }
    }

    @Override
    public final void J(int i10) {
        switch (this.f5375c) {
            case 0:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5376d;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.L(1);
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                    if (sideSheetBehavior.f4184g) {
                        sideSheetBehavior.w(1);
                    }
                }
                break;
        }
    }

    @Override
    public final void K(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f5375c) {
            case 0:
                ((BottomSheetBehavior) this.f5376d).y(i11);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                WeakReference weakReference = sideSheetBehavior.f4192q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f4178a.j0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f4197v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f4178a.i(i10);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw a1.b.j(it);
                }
                return;
        }
    }

    @Override
    public final void L(View view, float f3, float f10) {
        int i10;
        switch (this.f5375c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5376d;
                int i11 = 6;
                if (f10 < 0.0f) {
                    if (bottomSheetBehavior.f4108b) {
                        i11 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.E) {
                            i11 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.M(view, f10)) {
                    if (Math.abs(f3) >= Math.abs(f10) || f10 <= bottomSheetBehavior.f4112d) {
                        if (view.getTop() > (bottomSheetBehavior.C() + bottomSheetBehavior.V) / 2) {
                            i11 = 5;
                        } else if (bottomSheetBehavior.f4108b || Math.abs(view.getTop() - bottomSheetBehavior.C()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i11 = 3;
                        }
                    } else {
                        i11 = 5;
                    }
                } else if (f10 == 0.0f || Math.abs(f3) > Math.abs(f10)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f4108b) {
                        int i12 = bottomSheetBehavior.E;
                        if (top2 < i12) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i11 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i11 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (bottomSheetBehavior.f4108b) {
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i11 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.N(view, i11, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                if (!sideSheetBehavior.f4178a.L(f3)) {
                    if (!sideSheetBehavior.f4178a.e0(view, f3)) {
                        if (f3 == 0.0f || Math.abs(f3) <= Math.abs(f10)) {
                            int left = view.getLeft();
                            i10 = Math.abs(left - sideSheetBehavior.f4178a.z()) < Math.abs(left - sideSheetBehavior.f4178a.B()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f4178a.Q(f3, f10) || sideSheetBehavior.f4178a.P(view)) {
                    }
                }
                sideSheetBehavior.y(view, i10, true);
                break;
        }
    }

    @Override
    public final boolean T(View view, int i10) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f5375c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5376d;
                int i11 = bottomSheetBehavior.N;
                if (i11 != 1 && !bottomSheetBehavior.f4113d0) {
                    if (i11 == 3 && bottomSheetBehavior.f4109b0 == i10) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.W;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.W;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                return (sideSheetBehavior.f4185h == 1 || (weakReference2 = sideSheetBehavior.f4191p) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override
    public final int k(View view, int i10) {
        switch (this.f5375c) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5376d;
                return rd.a.k(i10, sideSheetBehavior.f4178a.D(), sideSheetBehavior.f4178a.C());
        }
    }

    @Override
    public final int l(View view, int i10) {
        switch (this.f5375c) {
            case 0:
                return rd.a.k(i10, ((BottomSheetBehavior) this.f5376d).C(), C());
            default:
                return view.getTop();
        }
    }
}
