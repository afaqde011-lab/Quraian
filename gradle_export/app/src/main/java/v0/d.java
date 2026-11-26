package v0;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;

public final class d {

    public final e f15310a;

    public final b f15311b;

    public final b f15312c;

    public final View f15313d;

    public d(e eVar, b bVar, b bVar2, View view) {
        this.f15310a = eVar;
        this.f15311b = bVar;
        this.f15312c = bVar2;
        this.f15313d = view;
    }

    public final boolean a(Menu menu) {
        int i10;
        int i11;
        t0.c cVar = (t0.c) this.f15311b.invoke();
        int i12 = 0;
        if (kotlin.jvm.internal.m.a(cVar, (Object) null)) {
            return false;
        }
        menu.clear();
        ?? r4 = cVar.f14313a;
        int size = r4.size();
        int i13 = 0;
        int i14 = 1;
        int i15 = 1;
        while (i13 < size) {
            t0.b bVar = (t0.b) r4.get(i13);
            if (bVar instanceof t0.d) {
                i10 = i14 + 1;
                Object obj = bVar.f14311a;
                if (kotlin.jvm.internal.m.a(obj, t0.e.f14317a)) {
                    i11 = R.id.cut;
                } else if (kotlin.jvm.internal.m.a(obj, t0.e.f14318b)) {
                    i11 = R.id.copy;
                } else if (kotlin.jvm.internal.m.a(obj, t0.e.f14319c)) {
                    i11 = R.id.paste;
                } else if (kotlin.jvm.internal.m.a(obj, t0.e.f14320d)) {
                    i11 = R.id.selectAll;
                } else {
                    i11 = kotlin.jvm.internal.m.a(obj, t0.e.f14321e) ? R.id.autofill : i14;
                }
                final t0.d dVar = (t0.d) bVar;
                MenuItem menuItemAdd = menu.add(i15, i11, i14, dVar.f14314b);
                menuItemAdd.setShowAsAction(2);
                final int i16 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i16) {
                            case 0:
                                ((t0.d) dVar).f14316d.invoke(((d) this).f15310a);
                                break;
                            default:
                                Context context = (Context) dVar;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e3) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (bVar instanceof t0.h) {
                    i10 = i14 + 1;
                    final Context context = this.f15313d.getContext();
                    t0.h hVar = (t0.h) bVar;
                    final TextClassification textClassification = hVar.f14323b;
                    int i17 = hVar.f14324c;
                    if (i17 < 0) {
                        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i14, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(textClassification.getIcon());
                        final int i18 = 1;
                        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                switch (i18) {
                                    case 0:
                                        ((t0.d) context).f14316d.invoke(((d) textClassification).f15310a);
                                        break;
                                    default:
                                        Context context2 = (Context) context;
                                        TextClassification textClassification2 = (TextClassification) textClassification;
                                        String text = textClassification2.getText();
                                        PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                        if (Build.VERSION.SDK_INT < 34) {
                                            activity.send();
                                        } else {
                                            try {
                                                activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                            } catch (PendingIntent.CanceledException e3) {
                                                Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                                                return true;
                                            }
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                    } else {
                        int i19 = i17 == 0 ? 1 : i12;
                        final RemoteAction remoteAction = textClassification.getActions().get(i17);
                        MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i19 != 0 ? 16908353 : i12, i14, remoteAction.getTitle());
                        menuItemAdd3.setShowAsAction(i19 == 0 ? 0 : 2);
                        if (i19 != 0 || remoteAction.shouldShowIcon()) {
                            menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                PendingIntent actionIntent = remoteAction.getActionIntent();
                                if (Build.VERSION.SDK_INT < 34) {
                                    actionIntent.send();
                                    return true;
                                }
                                try {
                                    actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                } catch (PendingIntent.CanceledException e3) {
                                    Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e3);
                                }
                                return true;
                            }
                        });
                    }
                } else if (bVar instanceof t0.f) {
                    i15++;
                }
                i13++;
                i12 = 0;
            }
            i14 = i10;
            i13++;
            i12 = 0;
        }
        return true;
    }
}
