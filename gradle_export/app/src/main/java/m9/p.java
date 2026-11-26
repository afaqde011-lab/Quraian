package m9;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.f1;
import ba.q0;

public final class p extends ba.g0 {

    public final String[] f10726a;

    public final String[] f10727b;

    public final Drawable[] f10728c;

    public final u f10729d;

    public p(u uVar, String[] strArr, Drawable[] drawableArr) {
        this.f10729d = uVar;
        this.f10726a = strArr;
        this.f10727b = new String[strArr.length];
        this.f10728c = drawableArr;
    }

    public final boolean a(int i10) {
        u uVar = this.f10729d;
        f1 f1Var = uVar.Q0;
        if (f1Var == null) {
            return false;
        }
        if (i10 == 0) {
            return f1Var.isCommandAvailable(13);
        }
        if (i10 != 1) {
            return true;
        }
        return f1Var.isCommandAvailable(30) && uVar.Q0.isCommandAvailable(29);
    }

    @Override
    public final int getItemCount() {
        return this.f10726a.length;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final void onBindViewHolder(ba.f1 f1Var, int i10) {
        o oVar = (o) f1Var;
        if (a(i10)) {
            oVar.f2275a.setLayoutParams(new q0(-1, -2));
        } else {
            oVar.f2275a.setLayoutParams(new q0(0, 0));
        }
        TextView textView = oVar.f10721u;
        ImageView imageView = oVar.f10723w;
        TextView textView2 = oVar.f10722v;
        textView.setText(this.f10726a[i10]);
        String str = this.f10727b[i10];
        if (str == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        Drawable drawable = this.f10728c[i10];
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override
    public final ba.f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        u uVar = this.f10729d;
        return new o(uVar, LayoutInflater.from(uVar.getContext()).inflate(2131558751, viewGroup, false));
    }
}
