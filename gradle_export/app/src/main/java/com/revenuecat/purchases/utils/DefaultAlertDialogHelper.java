package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultAlertDialogHelper;", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "title", "message", "positiveButtonText", "negativeButtonText", "neutralButtonText", "Lkotlin/Function0;", "Lg00/b0;", "onPositiveButtonClicked", "onNegativeButtonClicked", "onNeutralButtonClicked", "showDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu00/a;Lu00/a;Lu00/a;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultAlertDialogHelper implements AlertDialogHelper {
    public static final void showDialog$lambda$0(u00.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    public static final void showDialog$lambda$1(u00.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    public static final void showDialog$lambda$2(u00.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    @Override
    public void showDialog(Activity activity, String title, String message, String positiveButtonText, String negativeButtonText, String neutralButtonText, final u00.a onPositiveButtonClicked, final u00.a onNegativeButtonClicked, final u00.a onNeutralButtonClicked) {
        m.e(activity, "activity");
        m.e(title, "title");
        m.e(message, "message");
        m.e(positiveButtonText, "positiveButtonText");
        m.e(negativeButtonText, "negativeButtonText");
        m.e(neutralButtonText, "neutralButtonText");
        m.e(onPositiveButtonClicked, "onPositiveButtonClicked");
        m.e(onNegativeButtonClicked, "onNegativeButtonClicked");
        m.e(onNeutralButtonClicked, "onNeutralButtonClicked");
        AlertDialog.Builder message2 = new AlertDialog.Builder(activity).setTitle(title).setMessage(message);
        final int i = 0;
        AlertDialog.Builder positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                u00.a aVar = onPositiveButtonClicked;
                switch (i3) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(aVar, dialogInterface, i2);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(aVar, dialogInterface, i2);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(aVar, dialogInterface, i2);
                        break;
                }
            }
        });
        final int i2 = 1;
        AlertDialog.Builder negativeButton = positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                u00.a aVar = onNegativeButtonClicked;
                switch (i4) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(aVar, dialogInterface, i3);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(aVar, dialogInterface, i3);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(aVar, dialogInterface, i3);
                        break;
                }
            }
        });
        final int i3 = 2;
        negativeButton.setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i3;
                u00.a aVar = onNeutralButtonClicked;
                switch (i5) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(aVar, dialogInterface, i4);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(aVar, dialogInterface, i4);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(aVar, dialogInterface, i4);
                        break;
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                onNeutralButtonClicked.invoke();
            }
        }).show();
    }
}
