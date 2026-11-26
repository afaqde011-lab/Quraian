package androidx.constraintlayout.widget;

import a1.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import ca.p;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.k;
import com.google.protobuf.RuntimeVersion;
import g4.a;
import g4.f;
import g4.h;
import h4.j;
import h4.l;
import h7.b;
import j4.c;
import j4.d;
import j4.e;
import j4.g;
import j4.n;
import j4.o;
import j4.r;
import j4.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public static s R;
    public final SparseArray A;
    public final ArrayList B;
    public final f C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public n J;
    public b K;
    public int L;
    public HashMap M;
    public final SparseArray N;
    public final j4.f O;
    public int P;
    public int Q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.C = new f();
        this.D = 0;
        this.E = 0;
        this.F = Integer.MAX_VALUE;
        this.G = Integer.MAX_VALUE;
        this.H = true;
        this.I = 257;
        this.J = null;
        this.K = null;
        this.L = -1;
        this.M = new HashMap();
        this.N = new SparseArray();
        this.O = new j4.f(this, this);
        this.P = 0;
        this.Q = 0;
        i(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.C = new f();
        this.D = 0;
        this.E = 0;
        this.F = Integer.MAX_VALUE;
        this.G = Integer.MAX_VALUE;
        this.H = true;
        this.I = 257;
        this.J = null;
        this.K = null;
        this.L = -1;
        this.M = new HashMap();
        this.N = new SparseArray();
        this.O = new j4.f(this, this);
        this.P = 0;
        this.Q = 0;
        i(attributeSet, i10);
    }

    public static e a() {
        e eVar = new e(-2, -2);
        eVar.f8016a = -1;
        eVar.f8018b = -1;
        eVar.f8020c = -1.0f;
        eVar.f8022d = -1;
        eVar.f8024e = -1;
        eVar.f8026f = -1;
        eVar.f8028g = -1;
        eVar.f8030h = -1;
        eVar.f8032i = -1;
        eVar.f8034j = -1;
        eVar.f8036k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.f8040n = -1;
        eVar.f8042o = -1;
        eVar.f8044p = 0;
        eVar.f8045q = 0.0f;
        eVar.f8046r = -1;
        eVar.f8047s = -1;
        eVar.f8048t = -1;
        eVar.f8049u = -1;
        eVar.f8050v = Integer.MIN_VALUE;
        eVar.f8051w = Integer.MIN_VALUE;
        eVar.f8052x = Integer.MIN_VALUE;
        eVar.f8053y = Integer.MIN_VALUE;
        eVar.f8054z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f8017a0 = true;
        eVar.f8019b0 = false;
        eVar.f8021c0 = false;
        eVar.f8023d0 = false;
        eVar.f8025e0 = -1;
        eVar.f8027f0 = -1;
        eVar.f8029g0 = -1;
        eVar.f8031h0 = -1;
        eVar.f8033i0 = Integer.MIN_VALUE;
        eVar.f8035j0 = Integer.MIN_VALUE;
        eVar.f8037k0 = 0.5f;
        eVar.f8043o0 = new g4.e();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (R == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            R = sVar;
        }
        return R;
    }

    public final g4.e b(View view) {
        if (view == this) {
            return this.C;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f8043o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f8043o0;
        }
        return null;
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.B;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i15;
                        float f10 = i16;
                        float f11 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f3, f10, f11, f10, paint);
                        float f12 = i16 + i17;
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f3, f12, paint);
                        canvas.drawLine(f3, f12, f3, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f10, f11, f12, paint);
                        canvas.drawLine(f3, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override
    public final void forceLayout() {
        this.H = true;
        super.forceLayout();
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f8016a = -1;
        eVar.f8018b = -1;
        eVar.f8020c = -1.0f;
        eVar.f8022d = -1;
        eVar.f8024e = -1;
        eVar.f8026f = -1;
        eVar.f8028g = -1;
        eVar.f8030h = -1;
        eVar.f8032i = -1;
        eVar.f8034j = -1;
        eVar.f8036k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.f8040n = -1;
        eVar.f8042o = -1;
        eVar.f8044p = 0;
        eVar.f8045q = 0.0f;
        eVar.f8046r = -1;
        eVar.f8047s = -1;
        eVar.f8048t = -1;
        eVar.f8049u = -1;
        eVar.f8050v = Integer.MIN_VALUE;
        eVar.f8051w = Integer.MIN_VALUE;
        eVar.f8052x = Integer.MIN_VALUE;
        eVar.f8053y = Integer.MIN_VALUE;
        eVar.f8054z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f8017a0 = true;
        eVar.f8019b0 = false;
        eVar.f8021c0 = false;
        eVar.f8023d0 = false;
        eVar.f8025e0 = -1;
        eVar.f8027f0 = -1;
        eVar.f8029g0 = -1;
        eVar.f8031h0 = -1;
        eVar.f8033i0 = Integer.MIN_VALUE;
        eVar.f8035j0 = Integer.MIN_VALUE;
        eVar.f8037k0 = 0.5f;
        eVar.f8043o0 = new g4.e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f8157b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = d.f8015a.get(index);
            switch (i11) {
                case 1:
                    eVar.U = typedArrayObtainStyledAttributes.getInt(index, eVar.U);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8042o);
                    eVar.f8042o = resourceId;
                    if (resourceId == -1) {
                        eVar.f8042o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.f8044p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8044p);
                    break;
                case 4:
                    float f3 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f8045q) % 360.0f;
                    eVar.f8045q = f3;
                    if (f3 < 0.0f) {
                        eVar.f8045q = (360.0f - f3) % 360.0f;
                    }
                    break;
                case 5:
                    eVar.f8016a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f8016a);
                    break;
                case 6:
                    eVar.f8018b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f8018b);
                    break;
                case 7:
                    eVar.f8020c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f8020c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8022d);
                    eVar.f8022d = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f8022d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8024e);
                    eVar.f8024e = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f8024e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8026f);
                    eVar.f8026f = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f8026f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8028g);
                    eVar.f8028g = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f8028g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8030h);
                    eVar.f8030h = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f8030h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8032i);
                    eVar.f8032i = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f8032i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8034j);
                    eVar.f8034j = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f8034j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8036k);
                    eVar.f8036k = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f8036k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.l);
                    eVar.l = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8046r);
                    eVar.f8046r = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f8046r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8047s);
                    eVar.f8047s = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f8047s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case k.REMOTE_EXCEPTION:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8048t);
                    eVar.f8048t = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f8048t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case k.CONNECTION_SUSPENDED_DURING_CALL:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8049u);
                    eVar.f8049u = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f8049u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    eVar.f8050v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8050v);
                    break;
                case k.RECONNECTION_TIMED_OUT:
                    eVar.f8051w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8051w);
                    break;
                case 23:
                    eVar.f8052x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8052x);
                    break;
                case 24:
                    eVar.f8053y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8053y);
                    break;
                case 25:
                    eVar.f8054z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f8054z);
                    break;
                case RuntimeVersion.MINOR:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 27:
                    eVar.V = typedArrayObtainStyledAttributes.getBoolean(index, eVar.V);
                    break;
                case 28:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 29:
                    eVar.D = typedArrayObtainStyledAttributes.getFloat(index, eVar.D);
                    break;
                case 30:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 31:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.K = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.M);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.M) == -2) {
                            eVar.M = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.Q));
                    eVar.K = 2;
                    break;
                case 36:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            n.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.G = typedArrayObtainStyledAttributes.getFloat(index, eVar.G);
                            break;
                        case 46:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 47:
                            eVar.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.S);
                            break;
                        case 50:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 51:
                            eVar.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.m);
                            eVar.m = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f8040n);
                            eVar.f8040n = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f8040n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        case 55:
                            eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Y = typedArrayObtainStyledAttributes.getInt(index, eVar.Y);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(layoutParams);
        eVar.f8016a = -1;
        eVar.f8018b = -1;
        eVar.f8020c = -1.0f;
        eVar.f8022d = -1;
        eVar.f8024e = -1;
        eVar.f8026f = -1;
        eVar.f8028g = -1;
        eVar.f8030h = -1;
        eVar.f8032i = -1;
        eVar.f8034j = -1;
        eVar.f8036k = -1;
        eVar.l = -1;
        eVar.m = -1;
        eVar.f8040n = -1;
        eVar.f8042o = -1;
        eVar.f8044p = 0;
        eVar.f8045q = 0.0f;
        eVar.f8046r = -1;
        eVar.f8047s = -1;
        eVar.f8048t = -1;
        eVar.f8049u = -1;
        eVar.f8050v = Integer.MIN_VALUE;
        eVar.f8051w = Integer.MIN_VALUE;
        eVar.f8052x = Integer.MIN_VALUE;
        eVar.f8053y = Integer.MIN_VALUE;
        eVar.f8054z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f8017a0 = true;
        eVar.f8019b0 = false;
        eVar.f8021c0 = false;
        eVar.f8023d0 = false;
        eVar.f8025e0 = -1;
        eVar.f8027f0 = -1;
        eVar.f8029g0 = -1;
        eVar.f8031h0 = -1;
        eVar.f8033i0 = Integer.MIN_VALUE;
        eVar.f8035j0 = Integer.MIN_VALUE;
        eVar.f8037k0 = 0.5f;
        eVar.f8043o0 = new g4.e();
        return eVar;
    }

    public int getMaxHeight() {
        return this.G;
    }

    public int getMaxWidth() {
        return this.F;
    }

    public int getMinHeight() {
        return this.E;
    }

    public int getMinWidth() {
        return this.D;
    }

    public int getOptimizationLevel() {
        return this.C.C0;
    }

    public final void i(AttributeSet attributeSet, int i10) {
        f fVar = this.C;
        fVar.f6132e0 = this;
        j4.f fVar2 = this.O;
        fVar.f6166t0 = fVar2;
        fVar.f6164r0.f3070g = fVar2;
        this.A.put(getId(), this);
        this.J = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f8157b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                } else if (index == 17) {
                    this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                } else if (index == 14) {
                    this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                } else if (index == 15) {
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.G);
                } else if (index == 112) {
                    this.I = typedArrayObtainStyledAttributes.getInt(index, this.I);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.K = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.J = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.J = null;
                    }
                    this.L = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        fVar.C0 = this.I;
        e4.c.f5066p = fVar.R(512);
    }

    public final void j(int i10) {
        String str;
        Context context = getContext();
        b bVar = new b();
        bVar.A = new SparseArray();
        bVar.B = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            bg.b bVar2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                bVar.w(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                bVar2 = new bg.b(context, xml);
                                ((SparseArray) bVar.A).put(bVar2.A, bVar2);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                g gVar = new g(context, xml);
                                if (bVar2 != null) {
                                    ((ArrayList) bVar2.C).add(gVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
        this.K = bVar;
    }

    public final void k(f fVar, int i10, int i11, int i12) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i13;
        char c10;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        j4.f fVar2;
        int i16;
        boolean zO;
        int i17;
        int i18;
        boolean zS;
        j4.f fVar3;
        boolean z12;
        boolean z13;
        j4.f fVar4;
        boolean z14;
        int i19;
        j jVar;
        l lVar;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z15;
        Iterator it;
        h4.n nVar;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i26 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        j4.f fVar5 = this.O;
        fVar5.f8056b = iMax3;
        fVar5.f8057c = iMax4;
        fVar5.f8058d = paddingWidth;
        fVar5.f8059e = i26;
        fVar5.f8060f = i11;
        fVar5.f8061g = i12;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i27 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i28 = size - paddingWidth;
        int i29 = size2 - i26;
        int i30 = fVar5.f8059e;
        int i31 = fVar5.f8058d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.D);
                iMin = iMax;
            } else {
                iMin = i28;
            }
            i27 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.D);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i27 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.F - i31, i28);
            i27 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.E);
                iMin2 = iMax2;
            } else {
                iMin2 = i29;
            }
            i13 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.G - i30, i29);
            i13 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.E);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i13 = 2;
        }
        int iN = fVar.n();
        p pVar = fVar.f6164r0;
        int[] iArr = fVar.B;
        int i32 = iMin;
        if (i32 == iN && iMin2 == fVar.k()) {
            c10 = 1;
        } else {
            pVar.f3066c = true;
            c10 = 1;
        }
        fVar.X = 0;
        fVar.Y = 0;
        iArr[0] = this.F - i31;
        iArr[c10] = this.G - i30;
        fVar.f6124a0 = 0;
        fVar.f6126b0 = 0;
        fVar.H(i27);
        fVar.J(i32);
        fVar.I(i13);
        fVar.G(iMin2);
        int i33 = this.D - i31;
        if (i33 < 0) {
            fVar.f6124a0 = 0;
        } else {
            fVar.f6124a0 = i33;
        }
        int i34 = this.E - i30;
        if (i34 < 0) {
            fVar.f6126b0 = 0;
        } else {
            fVar.f6126b0 = i34;
        }
        fVar.f6169w0 = iMax5;
        fVar.f6170x0 = iMax3;
        i iVar = fVar.f6163q0;
        f fVar6 = (f) iVar.D;
        ArrayList arrayList = (ArrayList) iVar.B;
        j4.f fVar7 = fVar.f6166t0;
        int size3 = fVar.f6162p0.size();
        int iN2 = fVar.n();
        int iK = fVar.k();
        boolean zC = g4.k.c(i10, Cast.MAX_NAMESPACE_LENGTH);
        boolean z16 = zC || g4.k.c(i10, 64);
        if (z16) {
            int i35 = 0;
            while (true) {
                if (i35 < size3) {
                    boolean z17 = z16;
                    g4.e eVar = (g4.e) fVar.f6162p0.get(i35);
                    i14 = size3;
                    int[] iArr2 = eVar.f6150o0;
                    int i36 = i35;
                    boolean z18 = (iArr2[0] == 3) && (iArr2[1] == 3) && eVar.V > 0.0f;
                    if ((eVar.u() && z18) || ((eVar.v() && z18) || (eVar instanceof h) || eVar.u() || eVar.v())) {
                        i15 = 1073741824;
                        z10 = false;
                    } else {
                        i35 = i36 + 1;
                        z16 = z17;
                        size3 = i14;
                    }
                } else {
                    z10 = z16;
                    i14 = size3;
                    i15 = 1073741824;
                }
            }
        } else {
            z10 = z16;
            i14 = size3;
            i15 = 1073741824;
        }
        boolean z19 = z10 & ((mode == i15 && mode2 == i15) || zC);
        if (z19) {
            int iMin3 = Math.min(iArr[0], i28);
            int iMin4 = Math.min(iArr[1], i29);
            int i37 = 1073741824;
            if (mode == 1073741824) {
                if (fVar.n() != iMin3) {
                    fVar.J(iMin3);
                    pVar.f3065b = true;
                }
                i37 = 1073741824;
            }
            if (mode2 == i37 && fVar.k() != iMin4) {
                fVar.G(iMin4);
                pVar.f3065b = true;
            }
            if (mode == i37 && mode2 == i37) {
                ArrayList<h4.n> arrayList2 = (ArrayList) pVar.f3069f;
                f fVar8 = (f) pVar.f3067d;
                if (pVar.f3065b || pVar.f3066c) {
                    for (g4.e eVar2 : fVar8.f6162p0) {
                        eVar2.h();
                        eVar2.f6123a = false;
                        eVar2.f6129d.n();
                        eVar2.f6131e.m();
                        z19 = z19;
                    }
                    z11 = z19;
                    fVar8.h();
                    i22 = 0;
                    fVar8.f6123a = false;
                    fVar8.f6129d.n();
                    fVar8.f6131e.m();
                    pVar.f3066c = false;
                } else {
                    z11 = z19;
                    i22 = 0;
                }
                pVar.c((f) pVar.f3068e);
                fVar8.X = i22;
                int[] iArr3 = fVar8.f6150o0;
                fVar8.Y = i22;
                int iJ = fVar8.j(i22);
                int iJ2 = fVar8.j(1);
                if (pVar.f3065b) {
                    pVar.d();
                }
                int iO = fVar8.o();
                int iP = fVar8.p();
                fVar2 = fVar7;
                fVar8.f6129d.f6605h.d(iO);
                fVar8.f6131e.f6605h.d(iP);
                pVar.i();
                if (iJ == 2 || iJ2 == 2) {
                    if (zC) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((h4.n) it2.next()).k()) {
                                zC = false;
                                break;
                            }
                        }
                    }
                    if (zC && iJ == 2) {
                        fVar8.H(1);
                        fVar8.J(pVar.e(fVar8, 0));
                        fVar8.f6129d.f6602e.d(fVar8.n());
                    }
                    if (zC && iJ2 == 2) {
                        i23 = 1;
                        fVar8.I(1);
                        fVar8.G(pVar.e(fVar8, 1));
                        fVar8.f6131e.f6602e.d(fVar8.k());
                    }
                    i24 = iArr3[0];
                    if (i24 != i23 || i24 == 4) {
                        int iN3 = fVar8.n() + iO;
                        fVar8.f6129d.f6606i.d(iN3);
                        fVar8.f6129d.f6602e.d(iN3 - iO);
                        pVar.i();
                        i25 = iArr3[1];
                        if (i25 != 1 || i25 == 4) {
                            int iK2 = fVar8.k() + iP;
                            fVar8.f6131e.f6606i.d(iK2);
                            fVar8.f6131e.f6602e.d(iK2 - iP);
                        }
                        pVar.i();
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    for (h4.n nVar2 : arrayList2) {
                        if (nVar2.f6599b == fVar8 || nVar2.f6604g) {
                            nVar2.e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zO = true;
                            break;
                        }
                        nVar = (h4.n) it.next();
                        if (!z15 || nVar.f6599b != fVar8) {
                            if (nVar.f6605h.f6585j || ((!nVar.f6606i.f6585j && !(nVar instanceof h4.h)) || (!nVar.f6602e.f6585j && !(nVar instanceof h4.c) && !(nVar instanceof h4.h)))) {
                                zO = false;
                                break;
                            }
                        }
                    }
                    fVar8.H(iJ);
                    fVar8.I(iJ2);
                    i16 = 2;
                    i21 = 1073741824;
                } else {
                    iP = iP;
                }
                i23 = 1;
                i24 = iArr3[0];
                if (i24 != i23) {
                    int iN4 = fVar8.n() + iO;
                    fVar8.f6129d.f6606i.d(iN4);
                    fVar8.f6129d.f6602e.d(iN4 - iO);
                    pVar.i();
                    i25 = iArr3[1];
                    if (i25 != 1) {
                        int iK3 = fVar8.k() + iP;
                        fVar8.f6131e.f6606i.d(iK3);
                        fVar8.f6131e.f6602e.d(iK3 - iP);
                    } else {
                        int iK4 = fVar8.k() + iP;
                        fVar8.f6131e.f6606i.d(iK4);
                        fVar8.f6131e.f6602e.d(iK4 - iP);
                    }
                    pVar.i();
                    z15 = true;
                } else {
                    int iN5 = fVar8.n() + iO;
                    fVar8.f6129d.f6606i.d(iN5);
                    fVar8.f6129d.f6602e.d(iN5 - iO);
                    pVar.i();
                    i25 = iArr3[1];
                    if (i25 != 1) {
                        int iK5 = fVar8.k() + iP;
                        fVar8.f6131e.f6606i.d(iK5);
                        fVar8.f6131e.f6602e.d(iK5 - iP);
                    } else {
                        int iK6 = fVar8.k() + iP;
                        fVar8.f6131e.f6606i.d(iK6);
                        fVar8.f6131e.f6602e.d(iK6 - iP);
                    }
                    pVar.i();
                    z15 = true;
                }
                while (r8.hasNext()) {
                    if (nVar2.f6599b == fVar8) {
                    }
                    nVar2.e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zO = true;
                        break;
                    }
                    nVar = (h4.n) it.next();
                    if (!z15) {
                    }
                    if (nVar.f6605h.f6585j) {
                    }
                    zO = false;
                    break;
                }
                fVar8.H(iJ);
                fVar8.I(iJ2);
                i16 = 2;
                i21 = 1073741824;
            } else {
                z11 = z19;
                fVar2 = fVar7;
                f fVar9 = (f) pVar.f3067d;
                if (pVar.f3065b) {
                    for (g4.e eVar3 : fVar9.f6162p0) {
                        eVar3.h();
                        eVar3.f6123a = false;
                        j jVar2 = eVar3.f6129d;
                        jVar2.f6602e.f6585j = false;
                        jVar2.f6604g = false;
                        jVar2.n();
                        l lVar2 = eVar3.f6131e;
                        lVar2.f6602e.f6585j = false;
                        lVar2.f6604g = false;
                        lVar2.m();
                    }
                    i20 = 0;
                    fVar9.h();
                    fVar9.f6123a = false;
                    j jVar3 = fVar9.f6129d;
                    jVar3.f6602e.f6585j = false;
                    jVar3.f6604g = false;
                    jVar3.n();
                    l lVar3 = fVar9.f6131e;
                    lVar3.f6602e.f6585j = false;
                    lVar3.f6604g = false;
                    lVar3.m();
                    pVar.d();
                } else {
                    i20 = 0;
                }
                pVar.c((f) pVar.f3068e);
                fVar9.X = i20;
                fVar9.Y = i20;
                fVar9.f6129d.f6605h.d(i20);
                fVar9.f6131e.f6605h.d(i20);
                i21 = 1073741824;
                if (mode == 1073741824) {
                    zO = fVar.O(i20, zC);
                    i16 = 1;
                } else {
                    i16 = 0;
                    zO = true;
                }
                if (mode2 == 1073741824) {
                    zO &= fVar.O(1, zC);
                    i16++;
                }
            }
            if (zO) {
                fVar.K(mode == i21, mode2 == i21);
            }
        } else {
            z11 = z19;
            fVar2 = fVar7;
            i16 = 0;
            zO = false;
        }
        if (zO && i16 == 2) {
            return;
        }
        int i38 = fVar.C0;
        if (i14 > 0) {
            int size4 = fVar.f6162p0.size();
            boolean zR = fVar.R(64);
            j4.f fVar10 = fVar.f6166t0;
            int i39 = 0;
            while (i39 < size4) {
                g4.e eVar4 = (g4.e) fVar.f6162p0.get(i39);
                if ((eVar4 instanceof g4.i) || (eVar4 instanceof a) || eVar4.E || (zR && (jVar = eVar4.f6129d) != null && (lVar = eVar4.f6131e) != null && jVar.f6602e.f6585j && lVar.f6602e.f6585j)) {
                    i19 = size4;
                } else {
                    int iJ3 = eVar4.j(0);
                    int iJ4 = eVar4.j(1);
                    i19 = size4;
                    boolean z20 = iJ3 == 3 && eVar4.f6152q != 1 && iJ4 == 3 && eVar4.f6153r != 1;
                    if (!z20 && fVar.R(1) && !(eVar4 instanceof h)) {
                        if (iJ3 == 3 && eVar4.f6152q == 0 && iJ4 != 3 && !eVar4.u()) {
                            z20 = true;
                        }
                        if (iJ4 == 3 && eVar4.f6153r == 0 && iJ3 != 3 && !eVar4.u()) {
                            z20 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && eVar4.V > 0.0f) {
                            z20 = true;
                        }
                    }
                    if (!z20) {
                        iVar.s(0, eVar4, fVar10);
                    }
                }
                i39++;
                size4 = i19;
            }
            ConstraintLayout constraintLayout = fVar10.f8055a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.B;
            for (int i40 = 0; i40 < childCount2; i40++) {
                constraintLayout.getChildAt(i40);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i41 = 0; i41 < size5; i41++) {
                    ((c) arrayList3.get(i41)).getClass();
                }
            }
        }
        iVar.H(fVar);
        int size6 = arrayList.size();
        if (i14 > 0) {
            iVar.E(fVar, 0, iN2, iK);
        }
        if (size6 > 0) {
            int[] iArr4 = fVar.f6150o0;
            boolean z21 = iArr4[0] == 2;
            boolean z22 = iArr4[1] == 2;
            int iMax7 = Math.max(fVar.n(), fVar6.f6124a0);
            int iMax8 = Math.max(fVar.k(), fVar6.f6126b0);
            int i42 = 0;
            boolean z23 = false;
            while (i42 < size6) {
                g4.e eVar5 = (g4.e) arrayList.get(i42);
                if (eVar5 instanceof h) {
                    int iN6 = eVar5.n();
                    int iK7 = eVar5.k();
                    z12 = z22;
                    z13 = z21;
                    fVar4 = fVar2;
                    boolean zS2 = z23 | iVar.s(1, eVar5, fVar4);
                    int iN7 = eVar5.n();
                    int iK8 = eVar5.k();
                    if (iN7 != iN6) {
                        eVar5.J(iN7);
                        if (z13 && eVar5.o() + eVar5.T > iMax7) {
                            iMax7 = Math.max(iMax7, eVar5.i(4).e() + eVar5.o() + eVar5.T);
                        }
                        z14 = true;
                    } else {
                        z14 = zS2;
                    }
                    if (iK8 != iK7) {
                        eVar5.G(iK8);
                        if (z12 && eVar5.p() + eVar5.U > iMax8) {
                            iMax8 = Math.max(iMax8, eVar5.i(5).e() + eVar5.p() + eVar5.U);
                        }
                        z14 = true;
                    }
                    z23 = ((h) eVar5).f6196x0 | z14;
                } else {
                    z12 = z22;
                    z13 = z21;
                    fVar4 = fVar2;
                }
                i42++;
                fVar2 = fVar4;
                z21 = z13;
                z22 = z12;
            }
            boolean z24 = z22;
            boolean z25 = z21;
            int i43 = 0;
            while (true) {
                j4.f fVar11 = fVar2;
                if (i43 >= 2) {
                    break;
                }
                int i44 = 0;
                while (i44 < size6) {
                    g4.e eVar6 = (g4.e) arrayList.get(i44);
                    if (((eVar6 instanceof g4.j) && !(eVar6 instanceof h)) || (eVar6 instanceof g4.i) || eVar6.f6134f0 == 8 || ((z11 && eVar6.f6129d.f6602e.f6585j && eVar6.f6131e.f6602e.f6585j) || (eVar6 instanceof h))) {
                        i17 = size6;
                        fVar3 = fVar11;
                        i18 = i44;
                        zS = z23;
                    } else {
                        int iN8 = eVar6.n();
                        int iK9 = eVar6.k();
                        i17 = size6;
                        int i45 = eVar6.Z;
                        i18 = i44;
                        zS = iVar.s(i43 == 1 ? 2 : 1, eVar6, fVar11) | z23;
                        int iN9 = eVar6.n();
                        fVar3 = fVar11;
                        int iK10 = eVar6.k();
                        if (iN9 != iN8) {
                            eVar6.J(iN9);
                            if (z25 && eVar6.o() + eVar6.T > iMax7) {
                                iMax7 = Math.max(iMax7, eVar6.i(4).e() + eVar6.o() + eVar6.T);
                            }
                            zS = true;
                        }
                        if (iK10 != iK9) {
                            eVar6.G(iK10);
                            if (z24 && eVar6.p() + eVar6.U > iMax8) {
                                iMax8 = Math.max(iMax8, eVar6.i(5).e() + eVar6.p() + eVar6.U);
                            }
                            zS = true;
                        }
                        if (eVar6.D && i45 != eVar6.Z) {
                            zS = true;
                        }
                    }
                    z23 = zS;
                    fVar11 = fVar3;
                    i44 = i18 + 1;
                    size6 = i17;
                }
                int i46 = size6;
                fVar2 = fVar11;
                if (!z23) {
                    break;
                }
                i43++;
                iVar.E(fVar, i43, iN2, iK);
                size6 = i46;
                z23 = false;
            }
        }
        fVar.C0 = i38;
        e4.c.f5066p = fVar.R(512);
    }

    public final void l(g4.e eVar, e eVar2, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.A.get(i10);
        g4.e eVar3 = (g4.e) sparseArray.get(i10);
        if (eVar3 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar2.f8019b0 = true;
        if (i11 == 6) {
            e eVar4 = (e) view.getLayoutParams();
            eVar4.f8019b0 = true;
            eVar4.f8043o0.D = true;
        }
        eVar.i(6).b(eVar3.i(i11), eVar2.C, eVar2.B, true);
        eVar.D = true;
        eVar.i(3).j();
        eVar.i(5).j();
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            g4.e eVar2 = eVar.f8043o0;
            if (childAt.getVisibility() != 8 || eVar.f8021c0 || eVar.f8023d0 || zIsInEditMode) {
                int iO = eVar2.o();
                int iP = eVar2.p();
                childAt.layout(iO, iP, eVar2.n() + iO, eVar2.k() + iP);
            }
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).getClass();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        g4.e eVar;
        int i13;
        g4.e eVar2;
        int i14;
        int i15;
        int i16;
        g4.e eVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        g4.e eVar4;
        int i23;
        int i24;
        int i25;
        g4.e eVar5;
        e eVar6;
        int i26;
        int i27;
        int i28;
        g4.e eVar7;
        int i29;
        float f3;
        g4.e eVar8;
        g4.e eVar9;
        int i30;
        g4.e eVar10;
        int i31;
        int i32;
        int i33;
        int i34;
        float fAbs;
        int i35;
        byte b7;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iF;
        int i36;
        g4.e eVar11;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.P == i10) {
            int i37 = constraintLayout.Q;
        }
        int i38 = 1;
        int i39 = 0;
        if (!constraintLayout.H) {
            int childCount = constraintLayout.getChildCount();
            for (int i40 = 0; i40 < childCount; i40++) {
                if (constraintLayout.getChildAt(i40).isLayoutRequested()) {
                    constraintLayout.H = true;
                    break;
                }
            }
        }
        constraintLayout.P = i10;
        constraintLayout.Q = i11;
        boolean z12 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        f fVar = constraintLayout.C;
        fVar.f6167u0 = z12;
        if (constraintLayout.H) {
            constraintLayout.H = false;
            int childCount2 = constraintLayout.getChildCount();
            int i41 = 0;
            while (true) {
                if (i41 >= childCount2) {
                    z10 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i41).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i41++;
                }
            }
            if (z10) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i42 = 0; i42 < childCount3; i42++) {
                    g4.e eVarB = constraintLayout.b(constraintLayout.getChildAt(i42));
                    if (eVarB != null) {
                        eVarB.z();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.A;
                if (zIsInEditMode) {
                    int i43 = 0;
                    while (i43 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i43);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i36 = i38;
                                try {
                                    if (constraintLayout.M == null) {
                                        constraintLayout.M = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.M.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i36 = i38;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                eVar11 = viewFindViewById == constraintLayout ? fVar : viewFindViewById == null ? null : ((e) viewFindViewById.getLayoutParams()).f8043o0;
                            }
                            eVar11.f6136g0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i36 = i38;
                        }
                        i43++;
                        i38 = i36;
                    }
                }
                int i44 = i38;
                if (constraintLayout.L != -1) {
                    for (int i45 = 0; i45 < childCount3; i45++) {
                        constraintLayout.getChildAt(i45).getId();
                    }
                }
                n nVar = constraintLayout.J;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                fVar.f6162p0.clear();
                ArrayList arrayList2 = constraintLayout.B;
                int size = arrayList2.size();
                if (size > 0) {
                    int i46 = 0;
                    while (i46 < size) {
                        c cVar = (c) arrayList2.get(i46);
                        HashMap map = cVar.G;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.E);
                        }
                        g4.j jVar = cVar.D;
                        if (jVar == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            jVar.f6206q0 = i39;
                            Arrays.fill(jVar.f6205p0, (Object) null);
                            int i47 = i39;
                            while (i47 < cVar.B) {
                                int i48 = cVar.A[i47];
                                View view = (View) sparseArray2.get(i48);
                                if (view == null && (iF = cVar.f(constraintLayout, (str = (String) map.get(Integer.valueOf(i48))))) != 0) {
                                    cVar.A[i47] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray2.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    g4.j jVar2 = cVar.D;
                                    g4.e eVarB2 = constraintLayout.b(view2);
                                    jVar2.getClass();
                                    if (eVarB2 != jVar2 && eVarB2 != null) {
                                        int i49 = jVar2.f6206q0 + 1;
                                        g4.e[] eVarArr = jVar2.f6205p0;
                                        if (i49 > eVarArr.length) {
                                            jVar2.f6205p0 = (g4.e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
                                        }
                                        g4.e[] eVarArr2 = jVar2.f6205p0;
                                        int i50 = jVar2.f6206q0;
                                        eVarArr2[i50] = eVarB2;
                                        jVar2.f6206q0 = i50 + 1;
                                    }
                                }
                                i47++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            cVar.D.N();
                        }
                        i46++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i39 = 0;
                    }
                }
                int i51 = 2;
                for (int i52 = 0; i52 < childCount3; i52++) {
                    constraintLayout.getChildAt(i52);
                }
                SparseArray sparseArray3 = constraintLayout.N;
                sparseArray3.clear();
                sparseArray3.put(0, fVar);
                sparseArray3.put(constraintLayout.getId(), fVar);
                for (int i53 = 0; i53 < childCount3; i53++) {
                    View childAt2 = constraintLayout.getChildAt(i53);
                    sparseArray3.put(childAt2.getId(), constraintLayout.b(childAt2));
                }
                int i54 = 0;
                while (i54 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i54);
                    g4.e eVarB3 = constraintLayout.b(childAt3);
                    if (eVarB3 == null) {
                        i12 = i54;
                        z11 = z10;
                        i32 = i51;
                    } else {
                        e eVar12 = (e) childAt3.getLayoutParams();
                        fVar.f6162p0.add(eVarB3);
                        g4.e eVar13 = eVarB3.S;
                        if (eVar13 != null) {
                            ((f) eVar13).f6162p0.remove(eVarB3);
                            eVarB3.z();
                        }
                        eVarB3.S = fVar;
                        eVar12.a();
                        eVarB3.f6134f0 = childAt3.getVisibility();
                        eVarB3.f6132e0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(eVarB3, fVar.f6167u0);
                        }
                        if (eVar12.f8021c0) {
                            g4.i iVar = (g4.i) eVarB3;
                            int i55 = eVar12.f8038l0;
                            int i56 = eVar12.f8039m0;
                            float f10 = eVar12.f8041n0;
                            if (f10 == -1.0f) {
                                b7 = -1;
                                if (i55 != -1) {
                                    if (i55 > -1) {
                                        iVar.f6199p0 = -1.0f;
                                        iVar.f6200q0 = i55;
                                        iVar.f6201r0 = -1;
                                    }
                                } else if (i56 != -1 && i56 > -1) {
                                    iVar.f6199p0 = -1.0f;
                                    iVar.f6200q0 = -1;
                                    iVar.f6201r0 = i56;
                                    i12 = i54;
                                    z11 = z10;
                                    i32 = i51;
                                }
                                i12 = i54;
                                z11 = z10;
                                i32 = i51;
                            } else if (f10 > -1.0f) {
                                iVar.f6199p0 = f10;
                                b7 = -1;
                                iVar.f6200q0 = -1;
                                iVar.f6201r0 = -1;
                                i12 = i54;
                                z11 = z10;
                                i32 = i51;
                            } else {
                                i12 = i54;
                                z11 = z10;
                                i32 = i51;
                            }
                        } else {
                            int i57 = eVar12.f8025e0;
                            int i58 = eVar12.f8027f0;
                            int i59 = eVar12.f8029g0;
                            int i60 = eVar12.f8031h0;
                            int i61 = eVar12.f8033i0;
                            int i62 = eVar12.f8035j0;
                            i12 = i54;
                            float f11 = eVar12.f8037k0;
                            int i63 = eVar12.f8042o;
                            z11 = z10;
                            if (i63 != -1) {
                                g4.e eVar14 = (g4.e) sparseArray3.get(i63);
                                if (eVar14 != null) {
                                    float f12 = eVar12.f8045q;
                                    eVarB3.s(7, 7, eVar12.f8044p, 0, eVar14);
                                    eVarB3.C = f12;
                                }
                                constraintLayout = this;
                                eVar7 = eVarB3;
                                eVar6 = eVar12;
                                i17 = 4;
                                i16 = 2;
                            } else {
                                if (i57 != -1) {
                                    g4.e eVar15 = (g4.e) sparseArray3.get(i57);
                                    if (eVar15 != null) {
                                        eVar = eVarB3;
                                        i13 = 2;
                                        eVar.s(2, 2, ((ViewGroup.MarginLayoutParams) eVar12).leftMargin, i61, eVar15);
                                    } else {
                                        eVar = eVarB3;
                                        i13 = 2;
                                    }
                                } else {
                                    eVar = eVarB3;
                                    i13 = 2;
                                    if (i58 != -1 && (eVar2 = (g4.e) sparseArray3.get(i58)) != null) {
                                        eVar.s(2, 4, ((ViewGroup.MarginLayoutParams) eVar12).leftMargin, i61, eVar2);
                                        i14 = 2;
                                        i15 = 4;
                                    }
                                    if (i59 != -1) {
                                        eVar10 = (g4.e) sparseArray3.get(i59);
                                        if (eVar10 != null) {
                                            eVar.s(i15, i14, ((ViewGroup.MarginLayoutParams) eVar12).rightMargin, i62, eVar10);
                                        }
                                        i16 = i14;
                                    } else {
                                        i16 = i14;
                                        if (i60 != -1 && (eVar3 = (g4.e) sparseArray3.get(i60)) != null) {
                                            eVar.s(i15, i15, ((ViewGroup.MarginLayoutParams) eVar12).rightMargin, i62, eVar3);
                                        }
                                    }
                                    i17 = i15;
                                    i18 = eVar12.f8030h;
                                    if (i18 != -1) {
                                        eVar9 = (g4.e) sparseArray3.get(i18);
                                        if (eVar9 != null) {
                                            i30 = 3;
                                            eVar.s(3, 3, ((ViewGroup.MarginLayoutParams) eVar12).topMargin, eVar12.f8051w, eVar9);
                                        } else {
                                            i30 = 3;
                                        }
                                        i21 = i30;
                                        i22 = 5;
                                        i20 = -1;
                                    } else {
                                        i19 = eVar12.f8032i;
                                        i20 = -1;
                                        if (i19 != -1 || (eVar4 = (g4.e) sparseArray3.get(i19)) == null) {
                                            i21 = 3;
                                            i22 = 5;
                                        } else {
                                            eVar.s(3, 5, ((ViewGroup.MarginLayoutParams) eVar12).topMargin, eVar12.f8051w, eVar4);
                                            i21 = 3;
                                            i22 = 5;
                                        }
                                    }
                                    i23 = eVar12.f8034j;
                                    if (i23 != i20) {
                                        eVar8 = (g4.e) sparseArray3.get(i23);
                                        if (eVar8 != null) {
                                            int i64 = i21;
                                            eVar.s(i22, i64, ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin, eVar12.f8053y, eVar8);
                                            i24 = i64;
                                        } else {
                                            i24 = i21;
                                        }
                                    } else {
                                        i24 = i21;
                                        i25 = eVar12.f8036k;
                                        if (i25 != i20 && (eVar5 = (g4.e) sparseArray3.get(i25)) != null) {
                                            eVar.s(i22, i22, ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin, eVar12.f8053y, eVar5);
                                        }
                                    }
                                    eVar6 = eVar12;
                                    i26 = eVar6.l;
                                    if (i26 != -1) {
                                        constraintLayout = this;
                                        eVar7 = eVar;
                                        constraintLayout.l(eVar7, eVar6, sparseArray3, i26, 6);
                                    } else {
                                        i27 = eVar6.m;
                                        if (i27 != -1) {
                                            constraintLayout = this;
                                            eVar7 = eVar;
                                            constraintLayout.l(eVar7, eVar6, sparseArray3, i27, i24);
                                        } else {
                                            i28 = eVar6.f8040n;
                                            constraintLayout = this;
                                            eVar7 = eVar;
                                            i29 = i22;
                                            if (i28 != -1) {
                                                constraintLayout.l(eVar7, eVar6, sparseArray3, i28, i29);
                                            }
                                        }
                                        if (f11 >= 0.0f) {
                                            eVar7.f6128c0 = f11;
                                        }
                                        f3 = eVar6.E;
                                        if (f3 >= 0.0f) {
                                            eVar7.f6130d0 = f3;
                                        }
                                    }
                                    if (f11 >= 0.0f) {
                                        eVar7.f6128c0 = f11;
                                    }
                                    f3 = eVar6.E;
                                    if (f3 >= 0.0f) {
                                        eVar7.f6130d0 = f3;
                                    }
                                }
                                i14 = i13;
                                i15 = 4;
                                if (i59 != -1) {
                                    eVar10 = (g4.e) sparseArray3.get(i59);
                                    if (eVar10 != null) {
                                        eVar.s(i15, i14, ((ViewGroup.MarginLayoutParams) eVar12).rightMargin, i62, eVar10);
                                    }
                                    i16 = i14;
                                } else {
                                    i16 = i14;
                                    if (i60 != -1) {
                                        eVar.s(i15, i15, ((ViewGroup.MarginLayoutParams) eVar12).rightMargin, i62, eVar3);
                                    }
                                }
                                i17 = i15;
                                i18 = eVar12.f8030h;
                                if (i18 != -1) {
                                    eVar9 = (g4.e) sparseArray3.get(i18);
                                    if (eVar9 != null) {
                                        i30 = 3;
                                        eVar.s(3, 3, ((ViewGroup.MarginLayoutParams) eVar12).topMargin, eVar12.f8051w, eVar9);
                                    } else {
                                        i30 = 3;
                                    }
                                    i21 = i30;
                                    i22 = 5;
                                    i20 = -1;
                                } else {
                                    i19 = eVar12.f8032i;
                                    i20 = -1;
                                    if (i19 != -1) {
                                        i21 = 3;
                                        i22 = 5;
                                    } else {
                                        i21 = 3;
                                        i22 = 5;
                                    }
                                }
                                i23 = eVar12.f8034j;
                                if (i23 != i20) {
                                    eVar8 = (g4.e) sparseArray3.get(i23);
                                    if (eVar8 != null) {
                                        int i65 = i21;
                                        eVar.s(i22, i65, ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin, eVar12.f8053y, eVar8);
                                        i24 = i65;
                                    } else {
                                        i24 = i21;
                                    }
                                } else {
                                    i24 = i21;
                                    i25 = eVar12.f8036k;
                                    if (i25 != i20) {
                                        eVar.s(i22, i22, ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin, eVar12.f8053y, eVar5);
                                    }
                                }
                                eVar6 = eVar12;
                                i26 = eVar6.l;
                                if (i26 != -1) {
                                    constraintLayout = this;
                                    eVar7 = eVar;
                                    constraintLayout.l(eVar7, eVar6, sparseArray3, i26, 6);
                                } else {
                                    i27 = eVar6.m;
                                    if (i27 != -1) {
                                        constraintLayout = this;
                                        eVar7 = eVar;
                                        constraintLayout.l(eVar7, eVar6, sparseArray3, i27, i24);
                                    } else {
                                        i28 = eVar6.f8040n;
                                        constraintLayout = this;
                                        eVar7 = eVar;
                                        i29 = i22;
                                        if (i28 != -1) {
                                            constraintLayout.l(eVar7, eVar6, sparseArray3, i28, i29);
                                        }
                                    }
                                    if (f11 >= 0.0f) {
                                        eVar7.f6128c0 = f11;
                                    }
                                    f3 = eVar6.E;
                                    if (f3 >= 0.0f) {
                                        eVar7.f6130d0 = f3;
                                    }
                                }
                                if (f11 >= 0.0f) {
                                    eVar7.f6128c0 = f11;
                                }
                                f3 = eVar6.E;
                                if (f3 >= 0.0f) {
                                    eVar7.f6130d0 = f3;
                                }
                            }
                            if (zIsInEditMode && ((i35 = eVar6.S) != -1 || eVar6.T != -1)) {
                                int i66 = eVar6.T;
                                eVar7.X = i35;
                                eVar7.Y = i66;
                            }
                            if (eVar6.Z) {
                                eVar7.H(i44);
                                eVar7.J(((ViewGroup.MarginLayoutParams) eVar6).width);
                                if (((ViewGroup.MarginLayoutParams) eVar6).width == -2) {
                                    eVar7.H(i51);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar6).width == -1) {
                                if (eVar6.V) {
                                    eVar7.H(3);
                                } else {
                                    eVar7.H(4);
                                }
                                eVar7.i(i16).f6120g = ((ViewGroup.MarginLayoutParams) eVar6).leftMargin;
                                eVar7.i(i17).f6120g = ((ViewGroup.MarginLayoutParams) eVar6).rightMargin;
                            } else {
                                eVar7.H(3);
                                eVar7.J(0);
                            }
                            if (eVar6.f8017a0) {
                                i31 = -1;
                                eVar7.I(1);
                                eVar7.G(((ViewGroup.MarginLayoutParams) eVar6).height);
                                if (((ViewGroup.MarginLayoutParams) eVar6).height == -2) {
                                    eVar7.I(2);
                                }
                            } else {
                                i31 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar6).height == -1) {
                                    if (eVar6.W) {
                                        eVar7.I(3);
                                    } else {
                                        eVar7.I(4);
                                    }
                                    eVar7.i(3).f6120g = ((ViewGroup.MarginLayoutParams) eVar6).topMargin;
                                    eVar7.i(5).f6120g = ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                                } else {
                                    eVar7.I(3);
                                    eVar7.G(0);
                                }
                            }
                            String str2 = eVar6.F;
                            if (str2 == null || str2.length() == 0) {
                                eVar7.V = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i33 = i31;
                                    i34 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i33 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i31;
                                    i34 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i34);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i34, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f13 = Float.parseFloat(strSubstring3);
                                            float f14 = Float.parseFloat(strSubstring4);
                                            if (f13 <= 0.0f || f14 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i33 == 1 ? Math.abs(f14 / f13) : Math.abs(f13 / f14);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    eVar7.V = fAbs;
                                    eVar7.W = i33;
                                }
                            }
                            float f15 = eVar6.G;
                            float[] fArr = eVar7.f6142j0;
                            fArr[0] = f15;
                            i44 = 1;
                            fArr[1] = eVar6.H;
                            eVar7.f6138h0 = eVar6.I;
                            eVar7.f6140i0 = eVar6.J;
                            int i67 = eVar6.Y;
                            if (i67 >= 0 && i67 <= 3) {
                                eVar7.f6151p = i67;
                            }
                            int i68 = eVar6.K;
                            int i69 = eVar6.M;
                            int i70 = eVar6.O;
                            float f16 = eVar6.Q;
                            eVar7.f6152q = i68;
                            eVar7.f6155t = i69;
                            if (i70 == Integer.MAX_VALUE) {
                                i70 = 0;
                            }
                            eVar7.f6156u = i70;
                            eVar7.f6157v = f16;
                            if (f16 > 0.0f && f16 < 1.0f && i68 == 0) {
                                eVar7.f6152q = 2;
                            }
                            int i71 = eVar6.L;
                            int i72 = eVar6.N;
                            int i73 = eVar6.P;
                            float f17 = eVar6.R;
                            eVar7.f6153r = i71;
                            eVar7.f6158w = i72;
                            if (i73 == Integer.MAX_VALUE) {
                                i73 = 0;
                            }
                            eVar7.f6159x = i73;
                            eVar7.f6160y = f17;
                            if (f17 <= 0.0f || f17 >= 1.0f || i71 != 0) {
                                i32 = 2;
                            } else {
                                i32 = 2;
                                eVar7.f6153r = 2;
                            }
                        }
                    }
                    i54 = i12 + 1;
                    i51 = i32;
                    z10 = z11;
                }
            }
            if (z10) {
                fVar.f6163q0.H(fVar);
            }
        }
        constraintLayout.k(fVar, constraintLayout.I, i10, i11);
        int iN = fVar.n();
        int iK = fVar.k();
        boolean z13 = fVar.D0;
        boolean z14 = fVar.E0;
        j4.f fVar2 = constraintLayout.O;
        int i74 = fVar2.f8059e;
        int iResolveSizeAndState = View.resolveSizeAndState(iN + fVar2.f8058d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i74, i11, 0) & 16777215;
        int iMin = Math.min(constraintLayout.F, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.G, iResolveSizeAndState2);
        if (z13) {
            iMin |= 16777216;
        }
        if (z14) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        g4.e eVarB = b(view);
        if ((view instanceof j4.p) && !(eVarB instanceof g4.i)) {
            e eVar = (e) view.getLayoutParams();
            g4.i iVar = new g4.i();
            eVar.f8043o0 = iVar;
            eVar.f8021c0 = true;
            iVar.N(eVar.U);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f8023d0 = true;
            ArrayList arrayList = this.B;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.A.put(view.getId(), view);
        this.H = true;
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A.remove(view.getId());
        g4.e eVarB = b(view);
        this.C.f6162p0.remove(eVarB);
        eVarB.z();
        this.B.remove(view);
        this.H = true;
    }

    @Override
    public final void requestLayout() {
        this.H = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.J = nVar;
    }

    @Override
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.A;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.G) {
            return;
        }
        this.G = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.F = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.E) {
            return;
        }
        this.E = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.D) {
            return;
        }
        this.D = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        b bVar = this.K;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.I = i10;
        f fVar = this.C;
        fVar.C0 = i10;
        e4.c.f5066p = fVar.R(512);
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
