package m9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ba.f1;

public final class o extends f1 {

    public final TextView f10721u;

    public final TextView f10722v;

    public final ImageView f10723w;

    public final u f10724x;

    public o(u uVar, View view) {
        super(view);
        this.f10724x = uVar;
        this.f10721u = (TextView) view.findViewById(2131362155);
        this.f10722v = (TextView) view.findViewById(2131362178);
        this.f10723w = (ImageView) view.findViewById(2131362153);
        view.setOnClickListener(new androidx.mediarouter.app.c(this, 4));
    }
}
