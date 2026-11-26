package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

public class j1 extends ListView {
    public final Rect A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public i1 G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public e5.c K;
    public a50.d L;

    public j1(Context context, boolean z10) {
        super(context, null, 2130969079);
        this.A = new Rect();
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.I = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        View childAt;
        View childAt2;
        e5.c cVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
                z11 = false;
            } else {
                z11 = false;
                z10 = false;
            }
            if (z10 || z11) {
                this.J = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.F - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                cVar = this.K;
                if (cVar != null) {
                    if (cVar.P) {
                        cVar.d();
                    }
                    cVar.P = false;
                }
                return z10;
            }
            if (this.K == null) {
                this.K = new e5.c(this);
            }
            e5.c cVar2 = this.K;
            boolean z12 = cVar2.P;
            cVar2.P = true;
            cVar2.onTouch(this, motionEvent);
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y10);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f3 = x2;
                float f10 = y10;
                this.J = true;
                f1.a(this, f3, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.F;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.F = iPointToPosition;
                f1.a(childAt3, f3 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.A;
                rect.set(left, top, right, bottom);
                rect.left -= this.B;
                rect.top -= this.C;
                rect.right += this.D;
                rect.bottom += this.E;
                boolean zA = h1.a(this);
                if (childAt3.isEnabled() != zA) {
                    h1.b(this, !zA);
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f3, f10);
                }
                i1 i1Var = this.G;
                if (i1Var != null) {
                    i1Var.B = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z11 = false;
                z10 = true;
            }
        }
        if (z10) {
            this.J = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.F - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.J = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.F - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            cVar = this.K;
            if (cVar != null) {
                if (cVar.P) {
                    cVar.d();
                }
                cVar.P = false;
            }
            return z10;
        }
        if (this.K == null) {
            this.K = new e5.c(this);
        }
        e5.c cVar3 = this.K;
        boolean z14 = cVar3.P;
        cVar3.P = true;
        cVar3.onTouch(this, motionEvent);
        return z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        if (this.L != null) {
            return;
        }
        super.drawableStateChanged();
        i1 i1Var = this.G;
        if (i1Var != null) {
            i1Var.B = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.J && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override
    public final boolean hasFocus() {
        return this.I || super.hasFocus();
    }

    @Override
    public final boolean hasWindowFocus() {
        return this.I || super.hasWindowFocus();
    }

    @Override
    public final boolean isFocused() {
        return this.I || super.isFocused();
    }

    @Override
    public final boolean isInTouchMode() {
        return (this.I && this.H) || super.isInTouchMode();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.L = null;
        super.onDetachedFromWindow();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.L == null) {
            a50.d dVar = new a50.d(this, 14);
            this.L = dVar;
            post(dVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (g1.f12167d) {
                    try {
                        g1.f12164a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        g1.f12165b.invoke(this, Integer.valueOf(iPointToPosition));
                        g1.f12166c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.J && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.F = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            j1 j1Var = (j1) ((a50.d) runnable).B;
            j1Var.L = null;
            j1Var.removeCallbacks(runnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.H = z10;
    }

    @Override
    public void setSelector(Drawable drawable) {
        i1 i1Var;
        if (drawable != null) {
            i1Var = new i1();
            Drawable drawable2 = i1Var.A;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            i1Var.A = drawable;
            if (drawable != null) {
                drawable.setCallback(i1Var);
            }
            i1Var.B = true;
        } else {
            i1Var = null;
        }
        this.G = i1Var;
        super.setSelector(i1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.B = rect.left;
        this.C = rect.top;
        this.D = rect.right;
        this.E = rect.bottom;
    }
}
