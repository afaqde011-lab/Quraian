package pe;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.x;
import com.google.android.gms.common.internal.d0;

public class i extends x {
    public Dialog A;
    public DialogInterface.OnCancelListener B;
    public AlertDialog C;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.B;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.A;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.C == null) {
            Context context = getContext();
            d0.h(context);
            this.C = new AlertDialog.Builder(context).create();
        }
        return this.C;
    }
}
