package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

public final class g0 implements m0, DialogInterface.OnClickListener {
    public k.i A;
    public h0 B;
    public CharSequence C;
    public final n0 D;

    public g0(n0 n0Var) {
        this.D = n0Var;
    }

    @Override
    public final boolean a() {
        k.i iVar = this.A;
        if (iVar != null) {
            return iVar.isShowing();
        }
        return false;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final void d(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void dismiss() {
        k.i iVar = this.A;
        if (iVar != null) {
            iVar.dismiss();
            this.A = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.C;
    }

    @Override
    public final Drawable f() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i10, int i11) {
        if (this.B == null) {
            return;
        }
        n0 n0Var = this.D;
        k.h hVar = new k.h(n0Var.getPopupContext());
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            hVar.setTitle(charSequence);
        }
        h0 h0Var = this.B;
        int selectedItemPosition = n0Var.getSelectedItemPosition();
        k.d dVar = hVar.f8410a;
        dVar.f8376k = h0Var;
        dVar.l = this;
        dVar.f8378o = selectedItemPosition;
        dVar.f8377n = true;
        k.i iVarCreate = hVar.create();
        this.A = iVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = iVarCreate.G.f8385e;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.A.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.B = (h0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        n0 n0Var = this.D;
        n0Var.setSelection(i10);
        if (n0Var.getOnItemClickListener() != null) {
            n0Var.performItemClick(null, i10, this.B.getItemId(i10));
        }
        dismiss();
    }
}
