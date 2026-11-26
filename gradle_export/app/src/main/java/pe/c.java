package pe;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.d0;

public class c extends DialogFragment {
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
            Activity activity = getActivity();
            d0.h(activity);
            this.C = new AlertDialog.Builder(activity).create();
        }
        return this.C;
    }
}
