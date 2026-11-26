package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.util.ArrayList;

public final class e extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater A;
    public final Drawable B;
    public final Drawable C;
    public final Drawable D;
    public final Drawable E;

    public e(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.A = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969546, 2130969555, 2130969552, 2130969551});
        this.B = p30.f.f0(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.C = p30.f.f0(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.D = p30.f.f0(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.E = p30.f.f0(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Drawable drawableCreateFromStream;
        int i11;
        Drawable drawable;
        if (view == null) {
            view = this.A.inflate(2131559095, viewGroup, false);
        }
        o9.b0 b0Var = (o9.b0) getItem(i10);
        TextView textView = (TextView) view.findViewById(2131362837);
        TextView textView2 = (TextView) view.findViewById(2131362835);
        textView.setText(b0Var.f11740d);
        String str = b0Var.f11741e;
        int i12 = b0Var.f11745i;
        if ((i12 == 2 || i12 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText(RuntimeVersion.SUFFIX);
        }
        view.setEnabled(b0Var.f11743g);
        ImageView imageView = (ImageView) view.findViewById(2131362836);
        if (imageView != null) {
            Uri uri = b0Var.f11742f;
            if (uri != null) {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream == null) {
                        i11 = b0Var.f11748n;
                        if (i11 != 1) {
                            drawable = this.C;
                        } else if (i11 != 2) {
                            drawable = this.D;
                        } else if (b0Var.e()) {
                            drawable = this.E;
                        } else {
                            drawable = this.B;
                        }
                        drawableCreateFromStream = drawable;
                    }
                } catch (IOException e3) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + uri, e3);
                }
            } else {
                i11 = b0Var.f11748n;
                if (i11 != 1) {
                    drawable = this.C;
                } else if (i11 != 2) {
                    drawable = this.D;
                } else if (b0Var.e()) {
                    drawable = this.E;
                } else {
                    drawable = this.B;
                }
                drawableCreateFromStream = drawable;
            }
            imageView.setImageDrawable(drawableCreateFromStream);
        }
        return view;
    }

    @Override
    public final boolean isEnabled(int i10) {
        return ((o9.b0) getItem(i10)).f11743g;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        o9.b0 b0Var = (o9.b0) getItem(i10);
        ImageView imageView = (ImageView) view.findViewById(2131362836);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131362838);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        b0Var.l(true);
    }
}
