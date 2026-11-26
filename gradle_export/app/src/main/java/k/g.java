package k;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class g {
    public final int A;
    public final int B;
    public final boolean C;
    public final e D;

    public final Context f8381a;

    public final i f8382b;

    public final Window f8383c;

    public CharSequence f8384d;

    public AlertController$RecycleListView f8385e;

    public View f8386f;

    public Button f8388h;

    public CharSequence f8389i;

    public Message f8390j;

    public Button f8391k;
    public CharSequence l;
    public Message m;

    public Button f8392n;

    public CharSequence f8393o;

    public Message f8394p;

    public NestedScrollView f8395q;

    public Drawable f8396r;

    public ImageView f8397s;

    public TextView f8398t;

    public TextView f8399u;

    public View f8400v;

    public ListAdapter f8401w;

    public final int f8403y;

    public final int f8404z;

    public boolean f8387g = false;

    public int f8402x = -1;
    public final com.google.android.material.datepicker.l E = new com.google.android.material.datepicker.l(this, 2);

    public g(Context context, i iVar, Window window) {
        this.f8381a = context;
        this.f8382b = iVar;
        this.f8383c = window;
        e eVar = new e();
        eVar.f8380b = new WeakReference(iVar);
        this.D = eVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.a.f7720e, 2130968624, 0);
        this.f8403y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f8404z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        iVar.c().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.D.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f8393o = charSequence;
            this.f8394p = messageObtainMessage;
        } else if (i10 == -2) {
            this.l = charSequence;
            this.m = messageObtainMessage;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8389i = charSequence;
            this.f8390j = messageObtainMessage;
        }
    }
}
