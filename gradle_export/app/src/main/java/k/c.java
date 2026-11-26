package k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public final class c implements AdapterView.OnItemClickListener {
    public final g A;
    public final d B;

    public c(d dVar, g gVar) {
        this.B = dVar;
        this.A = gVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        d dVar = this.B;
        DialogInterface.OnClickListener onClickListener = dVar.l;
        g gVar = this.A;
        onClickListener.onClick(gVar.f8382b, i10);
        if (dVar.f8377n) {
            return;
        }
        gVar.f8382b.dismiss();
    }
}
