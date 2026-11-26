package z4;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class o {

    public ViewParent f17212a;

    public ViewParent f17213b;

    public final View f17214c;

    public boolean f17215d;

    public int[] f17216e;

    public o(View view) {
        this.f17214c = view;
    }

    public final boolean a(float f3, float f10, boolean z10) {
        ViewParent viewParentE;
        if (this.f17215d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f17214c, f3, f10, z10);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f10) {
        ViewParent viewParentE;
        if (this.f17215d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f17214c, f3, f10);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f17215d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f17214c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f17216e == null) {
                this.f17216e = new int[2];
            }
            iArr3 = this.f17216e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z10 = viewParentE instanceof p;
        View view2 = this.f17214c;
        if (z10) {
            ((p) viewParentE).h(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                viewParentE.onNestedPreScroll(view2, i10, i11, iArr3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (this.f17215d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                View view = this.f17214c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f17216e == null) {
                        this.f17216e = new int[2];
                    }
                    int[] iArr4 = this.f17216e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z10 = viewParentE instanceof q;
                View view2 = this.f17214c;
                if (z10) {
                    ((q) viewParentE).c(view2, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof p) {
                        ((p) viewParentE).d(view2, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            viewParentE.onNestedScroll(view2, i10, i11, i12, i13);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e3);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f17212a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f17213b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!f(i11)) {
            if (this.f17215d) {
                View view = this.f17214c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof p;
                    if (z10) {
                        zOnStartNestedScroll = ((p) parent).e(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f17212a = parent;
                        } else if (i11 == 1) {
                            this.f17213b = parent;
                        }
                        if (z10) {
                            ((p) parent).f(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof p;
            View view = this.f17214c;
            if (z10) {
                ((p) viewParentE).g(view, i10);
            } else if (i10 == 0) {
                try {
                    viewParentE.onStopNestedScroll(view);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i10 == 0) {
                this.f17212a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f17213b = null;
            }
        }
    }
}
