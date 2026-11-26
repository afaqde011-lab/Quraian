package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import com.google.android.gms.internal.cast.g2;
import com.google.android.gms.internal.cast.i2;
import com.google.android.gms.internal.measurement.m8;
import java.util.Objects;
import k9.t2;
import o9.t0;
import tf.e1;
import tf.h1;

public final class g extends BroadcastReceiver {

    public final int f1732a;

    public final Object f1733b;

    public g(Object obj, int i10) {
        this.f1732a = i10;
        this.f1733b = obj;
    }

    public g(h1 h1Var) {
        this.f1732a = 9;
        this.f1733b = h1Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.f1732a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((h) this.f1733b).dismiss();
                }
                break;
            case 1:
                g2 g2Var = (g2) this.f1733b;
                String action = intent.getAction();
                if (action != null) {
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        g2Var.b();
                    } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        g2Var.a();
                    }
                    break;
                }
                break;
            case 2:
                ((i2) this.f1733b).b();
                break;
            case 3:
                ((e7.t) this.f1733b).f5173a.execute(new ab.f(this, context, 14));
                break;
            case 4:
                kotlin.jvm.internal.m.e(context, "context");
                kotlin.jvm.internal.m.e(intent, "intent");
                fb.a aVar = (fb.a) this.f1733b;
                switch (aVar.f5586g) {
                    case 0:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            za.v.d().a(fb.b.f5587a, "Received ".concat(action2));
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            za.v.d().a(fb.c.f5588a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode = action3.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.c(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.c(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            za.v.d().a(fb.f.f5591a, "Received " + intent.getAction());
                            String action4 = intent.getAction();
                            if (action4 != null) {
                                int iHashCode2 = action4.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.c(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.c(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 5:
                ((c3.b) this.f1733b).n();
                break;
            case 6:
                if (!isInitialStickyBroadcast()) {
                    k7.e eVar = (k7.e) this.f1733b;
                    eVar.d(k7.b.b(context, intent, (androidx.media3.common.d) eVar.f9032j, (AudioDeviceInfo) eVar.f9031i));
                }
                break;
            case 7:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((l9.v) ((h7.b) ((t2) this.f1733b).f9467j.C).A).f10183a.dispatchMediaButtonEvent(keyEvent);
                }
                break;
            case 8:
                ((t0) this.f1733b).a();
                break;
            default:
                h1 h1Var = (h1) this.f1733b;
                if (intent != null) {
                    String action5 = intent.getAction();
                    if (action5 != null) {
                        int iHashCode3 = action5.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action5.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                tf.q0 q0Var = h1Var.F;
                                h1.g(q0Var);
                                q0Var.O.b("[sgtm] App Receiver notified batches are available");
                                e1 e1Var = h1Var.G;
                                h1.g(e1Var);
                                e1Var.e1(new a50.d(this, 25));
                            }
                            break;
                        } else if (action5.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            m8.a();
                            if (h1Var.D.f1(null, tf.b0.Q0)) {
                                tf.q0 q0Var2 = h1Var.F;
                                h1.g(q0Var2);
                                q0Var2.O.b("App receiver notified triggers are available");
                                e1 e1Var2 = h1Var.G;
                                h1.g(e1Var2);
                                e1Var2.e1(new a50.d(h1Var, 26));
                                break;
                            }
                        }
                        tf.q0 q0Var3 = h1Var.F;
                        h1.g(q0Var3);
                        q0Var3.J.b("App receiver called with unknown action");
                    } else {
                        tf.q0 q0Var4 = h1Var.F;
                        h1.g(q0Var4);
                        q0Var4.J.b("App receiver called with null action");
                    }
                } else {
                    tf.q0 q0Var5 = h1Var.F;
                    h1.g(q0Var5);
                    q0Var5.J.b("App receiver called with null intent");
                }
                break;
        }
    }
}
