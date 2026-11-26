package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ba.f1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class c0 extends ba.g0 {

    public final ArrayList f1719a = new ArrayList();

    public final LayoutInflater f1720b;

    public final Drawable f1721c;

    public final Drawable f1722d;

    public final Drawable f1723e;

    public final Drawable f1724f;

    public final d0 f1725g;

    public c0(d0 d0Var) {
        this.f1725g = d0Var;
        Context context = d0Var.I;
        this.f1720b = LayoutInflater.from(context);
        this.f1721c = f50.c.D(context, 2130969546);
        this.f1722d = f50.c.D(context, 2130969555);
        this.f1723e = f50.c.D(context, 2130969552);
        this.f1724f = f50.c.D(context, 2130969551);
        a();
    }

    public final void a() {
        ArrayList arrayList = this.f1719a;
        arrayList.clear();
        d0 d0Var = this.f1725g;
        arrayList.add(new z(d0Var.I.getString(2131886809)));
        Iterator it = d0Var.K.iterator();
        while (it.hasNext()) {
            arrayList.add(new z((o9.b0) it.next()));
        }
        notifyDataSetChanged();
    }

    @Override
    public final int getItemCount() {
        return this.f1719a.size();
    }

    @Override
    public final int getItemViewType(int i10) {
        return ((z) this.f1719a.get(i10)).f1839b;
    }

    @Override
    public final void onBindViewHolder(f1 f1Var, int i10) {
        Drawable drawableCreateFromStream;
        int i11;
        Drawable drawable;
        int itemViewType = getItemViewType(i10);
        z zVar = (z) this.f1719a.get(i10);
        if (itemViewType == 1) {
            y yVar = (y) f1Var;
            yVar.getClass();
            yVar.f1837u.setText(zVar.f1838a.toString());
            return;
        }
        if (itemViewType != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        b0 b0Var = (b0) f1Var;
        b0Var.getClass();
        o9.b0 b0Var2 = (o9.b0) zVar.f1838a;
        View view = b0Var.f1714u;
        view.setVisibility(0);
        b0Var.f1716w.setVisibility(4);
        view.setOnClickListener(new a0(b0Var, b0Var2));
        b0Var.f1717x.setText(b0Var2.f11740d);
        ImageView imageView = b0Var.f1715v;
        c0 c0Var = b0Var.f1718y;
        Uri uri = b0Var2.f11742f;
        if (uri != null) {
            try {
                drawableCreateFromStream = Drawable.createFromStream(c0Var.f1725g.I.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream == null) {
                    i11 = b0Var2.f11748n;
                    if (i11 != 1) {
                        drawable = c0Var.f1722d;
                    } else if (i11 != 2) {
                        drawable = c0Var.f1723e;
                    } else if (b0Var2.e()) {
                        drawable = c0Var.f1724f;
                    } else {
                        drawable = c0Var.f1721c;
                    }
                    drawableCreateFromStream = drawable;
                }
            } catch (IOException e3) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e3);
            }
        } else {
            i11 = b0Var2.f11748n;
            if (i11 != 1) {
                drawable = c0Var.f1722d;
            } else if (i11 != 2) {
                drawable = c0Var.f1723e;
            } else if (b0Var2.e()) {
                drawable = c0Var.f1724f;
            } else {
                drawable = c0Var.f1721c;
            }
            drawableCreateFromStream = drawable;
        }
        imageView.setImageDrawable(drawableCreateFromStream);
    }

    @Override
    public final f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.f1720b;
        if (i10 != 1) {
            if (i10 == 2) {
                return new b0(this, layoutInflater.inflate(2131559100, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View viewInflate = layoutInflater.inflate(2131559099, viewGroup, false);
        y yVar = new y(viewInflate);
        yVar.f1837u = (TextView) viewInflate.findViewById(2131362861);
        return yVar;
    }
}
