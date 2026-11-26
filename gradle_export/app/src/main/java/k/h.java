package k;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

public class h {

    public final d f8410a;

    public final int f8411b;

    public h(Context context) {
        this(context, i.e(context, 0));
    }

    public h(Context context, int i10) {
        this.f8410a = new d(new ContextThemeWrapper(context, i.e(context, i10)));
        this.f8411b = i10;
    }

    public i create() {
        d dVar = this.f8410a;
        i iVar = new i(dVar.f8366a, this.f8411b);
        View view = dVar.f8370e;
        g gVar = iVar.G;
        if (view != null) {
            gVar.f8400v = view;
        } else {
            CharSequence charSequence = dVar.f8369d;
            if (charSequence != null) {
                gVar.f8384d = charSequence;
                TextView textView = gVar.f8398t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f8368c;
            if (drawable != null) {
                gVar.f8396r = drawable;
                ImageView imageView = gVar.f8397s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    gVar.f8397s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f8371f;
        if (charSequence2 != null) {
            gVar.c(-1, charSequence2, dVar.f8372g);
        }
        CharSequence charSequence3 = dVar.f8373h;
        if (charSequence3 != null) {
            gVar.c(-2, charSequence3, dVar.f8374i);
        }
        if (dVar.f8376k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f8367b.inflate(gVar.f8404z, (ViewGroup) null);
            int i10 = dVar.f8377n ? gVar.A : gVar.B;
            Object obj = dVar.f8376k;
            ?? fVar = obj;
            if (obj == null) {
                fVar = new f(dVar.f8366a, i10, R.id.text1, null);
            }
            gVar.f8401w = fVar;
            gVar.f8402x = dVar.f8378o;
            if (dVar.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new c(dVar, gVar));
            }
            if (dVar.f8377n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            gVar.f8385e = alertController$RecycleListView;
        }
        View view2 = dVar.m;
        if (view2 != null) {
            gVar.f8386f = view2;
            gVar.f8387g = false;
        }
        iVar.setCancelable(true);
        iVar.setCanceledOnTouchOutside(true);
        iVar.setOnCancelListener(null);
        iVar.setOnDismissListener(null);
        o.m mVar = dVar.f8375j;
        if (mVar != null) {
            iVar.setOnKeyListener(mVar);
        }
        return iVar;
    }

    public Context getContext() {
        return this.f8410a.f8366a;
    }

    public h setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        d dVar = this.f8410a;
        dVar.f8373h = dVar.f8366a.getText(i10);
        dVar.f8374i = onClickListener;
        return this;
    }

    public h setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        d dVar = this.f8410a;
        dVar.f8371f = dVar.f8366a.getText(i10);
        dVar.f8372g = onClickListener;
        return this;
    }

    public h setTitle(CharSequence charSequence) {
        this.f8410a.f8369d = charSequence;
        return this;
    }

    public h setView(View view) {
        this.f8410a.m = view;
        return this;
    }
}
