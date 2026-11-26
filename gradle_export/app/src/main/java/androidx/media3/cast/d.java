package androidx.media3.cast;

import android.content.DialogInterface;

public final class d implements DialogInterface.OnDismissListener {
    public final int A;
    public final u00.a B;

    public d(int i10, u00.a aVar) {
        this.A = i10;
        this.B = aVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.A;
        u00.a aVar = this.B;
        switch (i10) {
            case 0:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
