package k9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class t1 implements Runnable {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public t1(int i10, Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
        this.B = z10;
    }

    @Override
    public final void run() {
        int i10;
        oe.o oVar;
        n4.j jVar;
        s1 s1Var;
        long jCurrentTimeMillis;
        boolean z10;
        kh.v vVarX0;
        com.google.android.gms.internal.measurement.f4 f4Var;
        Bitmap bitmap;
        IconCompat iconCompat;
        int i11;
        int i12 = this.A;
        Object obj = this.F;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i12) {
            case 0:
                w1 w1Var = (w1) obj4;
                g1 g1Var = (g1) obj3;
                fh.t0 t0Var = (fh.t0) obj2;
                androidx.media3.cast.a aVar = (androidx.media3.cast.a) obj;
                oe.o oVar2 = w1Var.H;
                qd.j0 j0Var = w1Var.B;
                Context context = (Context) oVar2.B;
                NotificationManager notificationManager = (NotificationManager) oVar2.C;
                if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("default_channel_id", context.getString(2131886405), 2));
                }
                androidx.media3.common.f1 f1VarA = g1Var.a();
                s1 s1Var2 = g1Var.f9307a;
                n4.j jVar2 = new n4.j(context, "default_channel_id");
                a7.c cVar = new a7.c(g1Var);
                androidx.media3.common.b1 availableCommands = f1VarA.getAvailableCommands();
                boolean zS = e7.i0.S(f1VarA, s1Var2.f9426p);
                fh.d2 d2VarJ = b.j(t0Var, true, true);
                boolean zC = b.c(2, d2VarJ);
                boolean zC2 = b.c(3, d2VarJ);
                fh.q0 q0Var = new fh.q0(4);
                if (zC) {
                    q0Var.c((b) d2VarJ.get(0));
                    i10 = 1;
                } else {
                    if (availableCommands.f1103a.a(7, 6)) {
                        a aVar2 = new a(57413);
                        aVar2.c(6);
                        aVar2.f9201f = context.getString(2131886763);
                        q0Var.c(aVar2.a());
                    }
                    i10 = 0;
                }
                if (availableCommands.a(1)) {
                    if (zS) {
                        a aVar3 = new a(57399);
                        aVar3.c(1);
                        aVar3.f9201f = context.getString(2131886759);
                        q0Var.c(aVar3.a());
                    } else {
                        a aVar4 = new a(57396);
                        aVar4.c(1);
                        aVar4.f9201f = context.getString(2131886758);
                        q0Var.c(aVar4.a());
                    }
                }
                if (zC2) {
                    q0Var.c((b) d2VarJ.get(i10));
                    i10++;
                } else if (availableCommands.f1103a.a(9, 8)) {
                    a aVar5 = new a(57412);
                    aVar5.c(8);
                    aVar5.f9201f = context.getString(2131886762);
                    q0Var.c(aVar5.a());
                }
                while (i10 < d2VarJ.D) {
                    q0Var.c((b) d2VarJ.get(i10));
                    i10++;
                }
                fh.d2 d2VarG = q0Var.g();
                int[] iArrCopyOf = new int[3];
                int[] iArr = new int[3];
                Arrays.fill(iArrCopyOf, -1);
                Arrays.fill(iArr, -1);
                int i13 = 0;
                boolean z11 = false;
                while (true) {
                    int[] iArr2 = iArr;
                    if (i13 >= d2VarG.D) {
                        androidx.media3.cast.a aVar6 = aVar;
                        oe.o oVar3 = oVar2;
                        w1 w1Var2 = w1Var;
                        androidx.media3.common.f1 f1Var = f1VarA;
                        a7.c cVar2 = cVar;
                        s1 s1Var3 = s1Var2;
                        n4.j jVar3 = jVar2;
                        if (!z11) {
                            int i14 = 0;
                            int i15 = 0;
                            for (int i16 = 3; i14 < i16; i16 = 3) {
                                int i17 = iArr2[i14];
                                if (i17 != -1) {
                                    iArrCopyOf[i15] = i17;
                                    i15++;
                                }
                                i14++;
                            }
                        }
                        for (int i18 = 0; i18 < 3; i18++) {
                            if (iArrCopyOf[i18] == -1) {
                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                cVar2.D = iArrCopyOf;
                                if (f1Var.isCommandAvailable(18)) {
                                    androidx.media3.common.t0 mediaMetadata = f1Var.getMediaMetadata();
                                    jVar = jVar3;
                                    jVar.f11069e = n4.j.c(mediaMetadata.f1627a);
                                    jVar.f11070f = n4.j.c(mediaMetadata.f1628b);
                                    s1Var = s1Var3;
                                    vVarX0 = s1Var.m.x0(mediaMetadata);
                                    oVar = oVar3;
                                    if (vVarX0 != null) {
                                        f4Var = (com.google.android.gms.internal.measurement.f4) oVar.D;
                                        if (f4Var != null) {
                                            f4Var.B = true;
                                        }
                                        if (vVarX0.isDone()) {
                                            try {
                                                bitmap = (Bitmap) b5.u(vVarX0);
                                                if (bitmap == null) {
                                                    iconCompat = null;
                                                } else {
                                                    IconCompat iconCompat2 = new IconCompat(1);
                                                    iconCompat2.f569b = bitmap;
                                                    iconCompat = iconCompat2;
                                                }
                                                jVar.f11072h = iconCompat;
                                            } catch (CancellationException | ExecutionException e3) {
                                                e7.a.m("NotificationProvider", "Failed to load bitmap: " + e3.getMessage());
                                            }
                                        } else {
                                            com.google.android.gms.internal.measurement.f4 f4Var2 = new com.google.android.gms.internal.measurement.f4(jVar, aVar6, 4);
                                            oVar.D = f4Var2;
                                            Handler handler = s1Var.l;
                                            Objects.requireNonNull(handler);
                                            vVarX0.a(new kh.r(vVarX0, f4Var2, 0), new androidx.media3.cast.s(handler));
                                        }
                                    }
                                    break;
                                } else {
                                    oVar = oVar3;
                                    jVar = jVar3;
                                    s1Var = s1Var3;
                                }
                                if (f1Var.isPlaying() || f1Var.isPlayingAd() || f1Var.isCurrentMediaItemDynamic() || f1Var.getPlaybackParameters().f1688a != 1.0f) {
                                    jCurrentTimeMillis = -9223372036854775807L;
                                } else {
                                    jCurrentTimeMillis = System.currentTimeMillis() - f1Var.getContentPosition();
                                }
                                if (jCurrentTimeMillis != -9223372036854775807L) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    jCurrentTimeMillis = 0;
                                }
                                Notification notification = jVar.f11088z;
                                notification.when = jCurrentTimeMillis;
                                jVar.f11075k = z10;
                                jVar.l = z10;
                                jVar.f11086x = 1;
                                jVar.f11071g = s1Var.f9431u;
                                notification.deleteIntent = PendingIntent.getService((h1) j0Var.C, 86, j0Var.j(g1Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                                jVar.d(8, true);
                                notification.icon = oVar.A;
                                jVar.e(cVar2);
                                jVar.f11083u = 1;
                                jVar.d(2, false);
                                jVar.f11079q = "media3_group_key";
                                w1Var2.E.execute(new com.revenuecat.purchases.c(w1Var2, g1Var, new gi.c(jVar.b()), this.B, 2));
                                return;
                            }
                        }
                        cVar2.D = iArrCopyOf;
                        if (f1Var.isCommandAvailable(18)) {
                            androidx.media3.common.t0 mediaMetadata2 = f1Var.getMediaMetadata();
                            jVar = jVar3;
                            jVar.f11069e = n4.j.c(mediaMetadata2.f1627a);
                            jVar.f11070f = n4.j.c(mediaMetadata2.f1628b);
                            s1Var = s1Var3;
                            vVarX0 = s1Var.m.x0(mediaMetadata2);
                            oVar = oVar3;
                            if (vVarX0 != null) {
                                f4Var = (com.google.android.gms.internal.measurement.f4) oVar.D;
                                if (f4Var != null) {
                                    f4Var.B = true;
                                }
                                if (vVarX0.isDone()) {
                                    bitmap = (Bitmap) b5.u(vVarX0);
                                    if (bitmap == null) {
                                        iconCompat = null;
                                    } else {
                                        IconCompat iconCompat3 = new IconCompat(1);
                                        iconCompat3.f569b = bitmap;
                                        iconCompat = iconCompat3;
                                    }
                                    jVar.f11072h = iconCompat;
                                } else {
                                    com.google.android.gms.internal.measurement.f4 f4Var3 = new com.google.android.gms.internal.measurement.f4(jVar, aVar6, 4);
                                    oVar.D = f4Var3;
                                    Handler handler2 = s1Var.l;
                                    Objects.requireNonNull(handler2);
                                    vVarX0.a(new kh.r(vVarX0, f4Var3, 0), new androidx.media3.cast.s(handler2));
                                }
                            }
                            break;
                        } else {
                            oVar = oVar3;
                            jVar = jVar3;
                            s1Var = s1Var3;
                        }
                        if (f1Var.isPlaying()) {
                            jCurrentTimeMillis = -9223372036854775807L;
                        } else {
                            jCurrentTimeMillis = -9223372036854775807L;
                        }
                        if (jCurrentTimeMillis != -9223372036854775807L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            jCurrentTimeMillis = 0;
                        }
                        Notification notification2 = jVar.f11088z;
                        notification2.when = jCurrentTimeMillis;
                        jVar.f11075k = z10;
                        jVar.l = z10;
                        jVar.f11086x = 1;
                        jVar.f11071g = s1Var.f9431u;
                        notification2.deleteIntent = PendingIntent.getService((h1) j0Var.C, 86, j0Var.j(g1Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                        jVar.d(8, true);
                        notification2.icon = oVar.A;
                        jVar.e(cVar2);
                        jVar.f11083u = 1;
                        jVar.d(2, false);
                        jVar.f11079q = "media3_group_key";
                        w1Var2.E.execute(new com.revenuecat.purchases.c(w1Var2, g1Var, new gi.c(jVar.b()), this.B, 2));
                        return;
                    }
                    b bVar = (b) d2VarG.get(i13);
                    z3 z3Var = bVar.f9222a;
                    Context context2 = context;
                    int i19 = bVar.f9223b;
                    int i20 = i13;
                    CharSequence charSequence = bVar.f9227f;
                    fh.d2 d2Var = d2VarG;
                    int i21 = bVar.f9225d;
                    boolean z12 = z11;
                    jh.a aVar7 = bVar.f9229h;
                    w1 w1Var3 = w1Var;
                    ArrayList arrayList = jVar2.f11066b;
                    if (z3Var != null) {
                        h1 h1Var = (h1) j0Var.C;
                        ta.c0.s(z3Var.f9578a == 0);
                        PorterDuff.Mode mode = IconCompat.f567k;
                        IconCompat iconCompatA = IconCompat.a(h1Var.getResources(), h1Var.getPackageName(), i21);
                        String str = z3Var.f9579b;
                        Bundle bundle = z3Var.f9580c;
                        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                        intent.setData(s1Var2.f9414b);
                        intent.setComponent(new ComponentName(h1Var, h1Var.getClass()));
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                        int i22 = j0Var.B + 1;
                        j0Var.B = i22;
                        arrayList.add(new n4.f(iconCompatA, charSequence, PendingIntent.getService(h1Var, i22, intent, 201326592)));
                    } else {
                        ta.c0.A(i19 != -1);
                        PorterDuff.Mode mode2 = IconCompat.f567k;
                        context2.getClass();
                        IconCompat iconCompatA2 = IconCompat.a(context2.getResources(), context2.getPackageName(), i21);
                        long j9 = i19;
                        h1 h1Var2 = (h1) j0Var.C;
                        if (j9 == 8 || j9 == 9) {
                            i11 = 87;
                        } else if (j9 == 6 || j9 == 7) {
                            i11 = 88;
                        } else if (j9 == 3) {
                            i11 = 86;
                        } else if (j9 == 12) {
                            i11 = 90;
                        } else if (j9 == 11) {
                            i11 = 89;
                        } else {
                            i11 = j9 == 1 ? 85 : 0;
                        }
                        Intent intentJ = j0Var.j(g1Var, i11);
                        arrayList.add(new n4.f(iconCompatA2, charSequence, (j9 != 1 || g1Var.a().getPlayWhenReady()) ? PendingIntent.getService(h1Var2, i11, intentJ, 67108864) : PendingIntent.getForegroundService(h1Var2, i11, intentJ, 67108864)));
                    }
                    int i23 = bVar.f9228g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                    if (i23 < 0 || i23 >= 3) {
                        if (aVar7.a(0) == 2) {
                            iArr2[0] = i20;
                        } else {
                            if (aVar7.a(0) == 1) {
                                iArr2[1] = i20;
                            } else if (aVar7.a(0) == 3) {
                                iArr2[2] = i20;
                            }
                            z11 = z12;
                        }
                        z11 = z12;
                    } else {
                        iArrCopyOf[i23] = i20;
                        z11 = true;
                    }
                    i13 = i20 + 1;
                    cVar = cVar;
                    iArr = iArr2;
                    context = context2;
                    d2VarG = d2Var;
                    w1Var = w1Var3;
                    aVar = aVar;
                    oVar2 = oVar2;
                    jVar2 = jVar2;
                    f1VarA = f1VarA;
                    s1Var2 = s1Var2;
                }
                break;
            default:
                v2 v2Var = (v2) obj4;
                k kVar = (k) obj3;
                l9.g0 g0Var = (l9.g0) obj2;
                g gVar = (g) obj;
                boolean z13 = this.B;
                v2Var.f9538g.remove(kVar);
                try {
                    try {
                        AudioPlayerService audioPlayerService = (h1) v2Var.f9536e.get();
                        if (audioPlayerService != null) {
                            int i24 = gVar.f9299a;
                            int i25 = gVar.f9300b;
                            a2 a2Var = new a2(g0Var, i24, i25, z13, new k3(kVar, i25), gVar.f9303e);
                            g1 g1Var2 = audioPlayerService.I;
                            if (g1Var2 != null) {
                                audioPlayerService.a(g1Var2);
                                g1Var2.f9307a.f9419g.d(kVar, a2Var);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.measurement.z3.v(kVar);
                        throw th2;
                    }
                } catch (Exception e10) {
                    e7.a.n("MSessionService", "Failed to add a session to session service", e10);
                }
                com.google.android.gms.internal.measurement.z3.v(kVar);
                return;
        }
    }
}
