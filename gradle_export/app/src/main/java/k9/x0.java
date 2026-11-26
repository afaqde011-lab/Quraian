package k9;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

public class x0 implements l1.a, kh.q, mi.b, mi.a, xf.c {
    public final int A;
    public Object B;
    public Object C;
    public Object D;

    public x0(char c10, int i10) {
        this.A = i10;
    }

    public x0(int i10) {
        this.A = 6;
        this.B = i10 != 1 ? new u.s(i10) : null;
    }

    public x0(int i10, byte b7) {
        this.A = i10;
        switch (i10) {
            case 13:
                this.B = new Object();
                break;
            case 25:
                p7.h hVar = p7.h.A;
                this.B = new HashSet();
                this.C = hVar;
                break;
            case 27:
                this.B = new u.s(16);
                long[] jArr = u.q0.f14885a;
                this.C = new u.i0();
                this.D = new tf.y(12);
                break;
            default:
                long[] jArr2 = u.q0.f14885a;
                this.B = new u.i0();
                break;
        }
    }

    public x0(Context context, TypedArray typedArray) {
        this.A = 24;
        this.B = context;
        this.C = typedArray;
    }

    public x0(View view) {
        this.A = 28;
        this.B = view;
        this.C = rd.a.I(g00.i.C, new b3.j0(this, 22));
        this.D = new wb.o(view);
    }

    public x0(FirebaseMessagingService firebaseMessagingService, o9.q qVar, ExecutorService executorService) {
        this.A = 23;
        this.B = executorService;
        this.C = firebaseMessagingService;
        this.D = qVar;
    }

    public x0(g20.e eVar, hf.c cVar) {
        this.A = 19;
        this.B = eVar;
        this.C = cVar;
        this.D = new ConcurrentHashMap();
    }

    public x0(hf.c cVar) {
        this.A = 11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.C = new Object();
        this.B = cVar;
    }

    public x0(File file, String str, cd.b bVar) {
        this.A = 26;
        kotlin.jvm.internal.m.e(str, "fileNameWithoutExtension");
        this.B = bVar;
        this.C = new Properties();
        this.D = new File(file, str.concat(".properties"));
    }

    public x0(Object obj) {
        this.A = 3;
        this.B = new u.v();
        this.C = new u.d0();
        this.D = obj;
    }

    public x0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public x0(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public x0(String str) {
        this.A = 15;
        x0 x0Var = new x0((char) 0, 14);
        this.C = x0Var;
        this.D = x0Var;
        this.B = str;
    }

    public x0(ConcurrentMap concurrentMap, mh.j jVar, wh.a aVar, Class cls) {
        this.A = 10;
        this.B = concurrentMap;
        this.C = jVar;
        this.D = aVar;
    }

    public x0(z0 z0Var) {
        this.A = 0;
        this.D = z0Var;
        this.B = new l9.e(this);
    }

    public x0(l1.t1 t1Var) {
        this.A = 2;
        this.B = new v1.a(0);
        this.C = new ce.c(16);
        this.D = new a1.o1(this, t1Var, 27);
    }

    public x0(m9.u uVar, View view, ViewGroup viewGroup) {
        this.A = 8;
        this.D = uVar;
        this.B = view;
        this.C = viewGroup;
    }

    public x0(n4.j jVar) {
        ?? r16;
        ?? r10;
        int i10;
        int i11;
        this.A = 12;
        this.D = new Bundle();
        this.C = jVar;
        Context context = jVar.f11065a;
        ArrayList arrayList = jVar.f11068d;
        Notification.Builder builder = new Notification.Builder(context, jVar.f11084v);
        this.B = builder;
        Notification notification = jVar.f11088z;
        ?? r7 = 0;
        int i12 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(jVar.f11069e).setContentText(jVar.f11070f).setContentInfo(null).setContentIntent(jVar.f11071g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Cast.MAX_NAMESPACE_LENGTH) != 0).setNumber(jVar.f11073i).setProgress(jVar.f11077o, jVar.f11078p, false);
        IconCompat iconCompat = jVar.f11072h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.c());
        builder.setSubText(jVar.f11076n).setUsesChronometer(jVar.l).setPriority(jVar.f11074j);
        for (n4.f fVar : jVar.f11066b) {
            if (fVar.f11058b == null && (i11 = fVar.f11062f) != 0) {
                fVar.f11058b = IconCompat.a(null, RuntimeVersion.SUFFIX, i11);
            }
            IconCompat iconCompat2 = fVar.f11058b;
            boolean z10 = fVar.f11060d;
            Bundle bundle = fVar.f11057a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.c() : null, fVar.f11063g, fVar.f11064h);
            n4.u[] uVarArr = fVar.f11059c;
            if (uVarArr != null) {
                int length = uVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (uVarArr.length > 0) {
                    n4.u uVar = uVarArr[0];
                    throw null;
                }
                for (int i13 = 0; i13 < length; i13++) {
                    builder2.addRemoteInput(remoteInputArr[i13]);
                }
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            builder2.setAllowGeneratedReplies(z10);
            bundle2.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            builder2.setContextual(false);
            builder2.setAuthenticationRequired(false);
            bundle2.putBoolean("android.support.action.showsUserInterface", fVar.f11061e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.B).addAction(builder2.build());
        }
        Bundle bundle3 = jVar.f11081s;
        if (bundle3 != null) {
            ((Bundle) this.D).putAll(bundle3);
        }
        ((Notification.Builder) this.B).setShowWhen(jVar.f11075k);
        ((Notification.Builder) this.B).setLocalOnly(jVar.f11080r);
        ((Notification.Builder) this.B).setGroup(jVar.f11079q);
        ((Notification.Builder) this.B).setSortKey(null);
        ((Notification.Builder) this.B).setGroupSummary(false);
        ((Notification.Builder) this.B).setCategory(null);
        ((Notification.Builder) this.B).setColor(jVar.f11082t);
        ((Notification.Builder) this.B).setVisibility(jVar.f11083u);
        ((Notification.Builder) this.B).setPublicVersion(null);
        ((Notification.Builder) this.B).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = jVar.A;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Notification.Builder) this.B).addPerson((String) it.next());
            }
        }
        if (arrayList.size() > 0) {
            if (jVar.f11081s == null) {
                jVar.f11081s = new Bundle();
            }
            Bundle bundle4 = jVar.f11081s.getBundle("android.car.EXTENSIONS");
            ?? bundle5 = bundle4 == null ? new Bundle() : bundle4;
            ?? bundle6 = new Bundle((Bundle) bundle5);
            ?? bundle7 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList.size()) {
                String string = Integer.toString(i14);
                n4.f fVar2 = (n4.f) arrayList.get(i14);
                ?? bundle8 = new Bundle();
                if (fVar2.f11058b == null && (i10 = fVar2.f11062f) != 0) {
                    fVar2.f11058b = IconCompat.a(r7, RuntimeVersion.SUFFIX, i10);
                }
                IconCompat iconCompat3 = fVar2.f11058b;
                ?? r17 = r7;
                Bundle bundle9 = fVar2.f11057a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i12);
                bundle8.putCharSequence("title", fVar2.f11063g);
                bundle8.putParcelable("actionIntent", fVar2.f11064h);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", fVar2.f11060d);
                bundle8.putBundle("extras", bundle10);
                n4.u[] uVarArr2 = fVar2.f11059c;
                if (uVarArr2 == null) {
                    r10 = r17;
                } else {
                    r10 = new Bundle[uVarArr2.length];
                    if (uVarArr2.length > 0) {
                        n4.u uVar2 = uVarArr2[0];
                        new Bundle();
                        throw r17;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", r10);
                bundle8.putBoolean("showsUserInterface", fVar2.f11061e);
                i12 = 0;
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i14++;
                r7 = r17;
            }
            r16 = r7;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (jVar.f11081s == null) {
                jVar.f11081s = new Bundle();
            }
            jVar.f11081s.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.D).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            r16 = 0;
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.B).setExtras(jVar.f11081s);
        ?? r4 = r16;
        ((Notification.Builder) this.B).setRemoteInputHistory(r4);
        ((Notification.Builder) this.B).setBadgeIconType(jVar.f11085w);
        ((Notification.Builder) this.B).setSettingsText(r4);
        ((Notification.Builder) this.B).setShortcutId(r4);
        ((Notification.Builder) this.B).setTimeoutAfter(0L);
        ((Notification.Builder) this.B).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(jVar.f11084v)) {
            ((Notification.Builder) this.B).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it2 = jVar.f11067c.iterator();
        if (it2.hasNext()) {
            throw a1.b.j(it2);
        }
        ((Notification.Builder) this.B).setAllowSystemGeneratedContextualActions(jVar.f11087y);
        ((Notification.Builder) this.B).setBubbleMetadata(null);
        int i16 = jVar.f11086x;
        if (i16 != 0) {
            ((Notification.Builder) this.B).setForegroundServiceBehavior(i16);
        }
        if (i15 >= 36) {
            n4.k.a((Notification.Builder) this.B);
        }
    }

    public x0(o9.f fVar, android.support.v4.media.session.t tVar) {
        this.A = 20;
        this.D = fVar;
        this.B = tVar;
    }

    public x0(og.b bVar, View view) {
        this.A = 22;
        this.B = Build.VERSION.SDK_INT >= 34 ? new og.e() : new og.c();
        this.C = bVar;
        this.D = view;
    }

    public x0(yh.f1 f1Var, List list) {
        this.A = 9;
        this.B = f1Var;
        this.C = list;
        this.D = wh.a.f16082b;
    }

    public static x0 K(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final x0 N(mh.f fVar, sh.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f10911b;
        try {
            yh.n0 n0VarZ = yh.n0.z(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p.a());
            byteArrayInputStream.close();
            if (n0VarZ.x().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                yh.f1 f1VarD = yh.f1.D(bVar.b(n0VarZ.x().h(), bArr), com.google.crypto.tink.shaded.protobuf.p.a());
                if (f1VarD.y() > 0) {
                    return r(f1VarD);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static n7.d q(androidx.media3.common.i0 i0Var) {
        bg.b bVar = new bg.b(2);
        Uri uri = i0Var.f1257b;
        String string = uri == null ? null : uri.toString();
        boolean z10 = i0Var.f1261f;
        c7.c cVar = new c7.c();
        ta.c0.s((z10 && TextUtils.isEmpty(string)) ? false : true);
        cVar.B = bVar;
        cVar.C = string;
        cVar.A = z10;
        cVar.D = new HashMap();
        fh.w0 w0Var = i0Var.f1258c;
        fh.e1 e1VarC = w0Var.A;
        if (e1VarC == null) {
            e1VarC = w0Var.c();
            w0Var.A = e1VarC;
        }
        fh.s2 s2VarK = e1VarC.iterator();
        while (s2VarK.hasNext()) {
            Map.Entry entry = (Map.Entry) s2VarK.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) cVar.D)) {
                ((HashMap) cVar.D).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = androidx.media3.common.h.f1214a;
        tf.w wVar = new tf.w(17);
        UUID uuid2 = i0Var.f1256a;
        uuid2.getClass();
        boolean z11 = i0Var.f1259d;
        boolean z12 = i0Var.f1260e;
        int[] iArrU = bi.b.U(i0Var.f1262g);
        int length = iArrU.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArrU[i10];
            ta.c0.s(i11 == 2 || i11 == 1);
        }
        n7.d dVar = new n7.d(uuid2, cVar, map, z11, (int[]) iArrU.clone(), z12, wVar);
        byte[] bArr = i0Var.f1263h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        ta.c0.A(dVar.m.isEmpty());
        dVar.f11163v = bArrCopyOf;
        return dVar;
    }

    public static final x0 r(yh.f1 f1Var) throws GeneralSecurityException {
        if (f1Var.y() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(f1Var.y());
        for (yh.e1 e1Var : f1Var.z()) {
            e1Var.getClass();
            try {
                try {
                    mh.b bVarA = th.i.f14800b.a(th.o.r(e1Var.z().A(), e1Var.z().B(), e1Var.z().z(), e1Var.B(), e1Var.B() == yh.q1.RAW ? null : Integer.valueOf(e1Var.A())));
                    int iOrdinal = e1Var.C().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new mh.g(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e3) {
                throw new TinkBugException("Creating a protokey serialization failed", e3);
            }
        }
        return new x0(f1Var, Collections.unmodifiableList(arrayList));
    }

    @Override
    public void A(Bundle bundle) {
        synchronized (this.C) {
            try {
                li.c cVar = li.c.f10296a;
                cVar.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.D = new CountDownLatch(1);
                ((hf.c) this.B).A(bundle);
                cVar.e("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.D).await(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, TimeUnit.MILLISECONDS)) {
                        cVar.e("App exception callback received from Analytics listener.");
                    } else {
                        cVar.f("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.D = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int B() {
        if (C().f10365a.isEmpty()) {
            return -1;
        }
        long j9 = ((long) ((m0.f) h00.q.T0(C().f10365a)).f10321a) + ((long) C().f10372h);
        long jH = ((long) H()) - 1;
        if (j9 > jH) {
            j9 = jH;
        }
        return (int) j9;
    }

    public m0.q C() {
        m0.q qVar = (m0.q) this.C;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.m.k("layoutInfo");
        throw null;
    }

    public int D() {
        if (C().f10365a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((m0.f) h00.q.T0(C().f10365a)).f10330j + C().f10366b) + C().f10367c) - C().f10371g);
    }

    public int E() {
        if (C().f10365a.isEmpty()) {
            return 0;
        }
        int i10 = ((m0.f) h00.q.L0(C().f10365a)).f10330j + (-C().f10370f);
        return Math.abs(i10 <= 0 ? i10 : 0);
    }

    public Object F(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference atomicReference = mh.m.f10922a;
        try {
            clsA = th.h.f14798b.a(cls);
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.C;
        yh.f1 f1Var = (yh.f1) this.B;
        int i10 = mh.n.f10926a;
        int iA = f1Var.A();
        Iterator it = f1Var.z().iterator();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            yh.y0 y0Var = yh.y0.ENABLED;
            if (!zHasNext) {
                if (i11 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z10 && !z11) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                oj.q qVar = new oj.q(clsA);
                wh.a aVar = (wh.a) this.D;
                if (((ConcurrentHashMap) qVar.C) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                qVar.E = aVar;
                for (int i12 = 0; i12 < f1Var.y(); i12++) {
                    yh.e1 e1VarX = f1Var.x(i12);
                    if (e1VarX.C().equals(y0Var)) {
                        try {
                            yh.x0 x0VarZ = e1VarX.z();
                            AtomicReference atomicReference2 = mh.m.f10922a;
                            objC = mh.m.c(x0VarZ.A(), x0VarZ.B(), clsA);
                        } catch (GeneralSecurityException e3) {
                            if (!e3.getMessage().contains("No key manager found for key type ") && !e3.getMessage().contains(" not supported by key manager of type ")) {
                                throw e3;
                            }
                            objC = null;
                        }
                        if (list.get(i12) != null) {
                            try {
                                objB = mh.m.b(((mh.g) list.get(i12)).f10912a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (e1VarX.A() == f1Var.A()) {
                            qVar.s(objB, objC, e1VarX, true);
                        } else {
                            qVar.s(objB, objC, e1VarX, false);
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) qVar.C;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                mh.j jVar = (mh.j) qVar.D;
                wh.a aVar2 = (wh.a) qVar.E;
                Class cls2 = (Class) qVar.B;
                x0 x0Var = new x0(concurrentHashMap, jVar, aVar2, cls2);
                qVar.C = null;
                AtomicReference atomicReference3 = mh.m.f10922a;
                HashMap map = ((th.n) th.h.f14798b.f14799a.get()).f14809b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                mh.l lVar = (mh.l) map.get(cls);
                if (cls2.equals(lVar.a()) && lVar.a().equals(cls2)) {
                    return lVar.c(x0Var);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            yh.e1 e1Var = (yh.e1) it.next();
            if (e1Var.C() == y0Var) {
                if (!e1Var.D()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(e1Var.A())));
                }
                if (e1Var.B() == yh.q1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(e1Var.A())));
                }
                if (e1Var.C() == yh.y0.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(e1Var.A())));
                }
                if (e1Var.A() == iA) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (e1Var.z().z() != yh.w0.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i11++;
            }
        }
    }

    public List G(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.B).get(new mh.k(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int H() {
        return ((Number) ((m0.c) this.B).invoke()).intValue();
    }

    public boolean I() {
        oj.k kVar;
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z10;
        int i10;
        int identifier2;
        String string;
        if (((o9.q) this.D).H("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.C;
        boolean z11 = false;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strN = ((o9.q) this.D).N("gcm.n.image");
        if (TextUtils.isEmpty(strN)) {
            kVar = null;
        } else {
            try {
                kVar = new oj.k(new URL(strN));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strN);
                kVar = null;
            }
        }
        int i11 = 2;
        if (kVar != null) {
            ExecutorService executorService = (ExecutorService) this.B;
            xf.g gVar = new xf.g();
            kVar.B = executorService.submit(new oi.p(kVar, gVar, i11));
            kVar.C = gVar.f16565a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.C;
        o9.q qVar = (o9.q) this.D;
        AtomicInteger atomicInteger = oj.e.f12089a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), Cast.MAX_NAMESPACE_LENGTH);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
        }
        Bundle bundle2 = bundle;
        String strN2 = qVar.N("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strN2 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strN2)) {
                    strN2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strN2)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strN2) != null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strN2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strN2) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strN2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strN2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strN2)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strN2) != null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strN2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = oj.e.f12089a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        n4.j jVar = new n4.j(firebaseMessagingService2, strN2);
        String strM = qVar.M(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM)) {
            jVar.f11069e = n4.j.c(strM);
        }
        String strM2 = qVar.M(resources, packageName, "gcm.n.body");
        int i12 = 8;
        if (!TextUtils.isEmpty(strM2)) {
            jVar.f11070f = n4.j.c(strM2);
            n4.i iVar = new n4.i(i12, z11);
            iVar.C = n4.j.c(strM2);
            jVar.e(iVar);
        }
        String strN3 = qVar.N("gcm.n.icon");
        if (TextUtils.isEmpty(strN3)) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
                }
            }
            if (identifier == 0) {
                identifier = 17301651;
            }
        } else {
            identifier = resources.getIdentifier(strN3, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strN3, "mipmap", packageName)) == 0) {
                Log.w("FirebaseMessaging", "Icon resource " + strN3 + " not found. Notification will use default icon.");
                identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (identifier == 0) {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                }
                if (identifier == 0) {
                    identifier = 17301651;
                }
            }
        }
        jVar.f11088z.icon = identifier;
        String strN4 = qVar.N("gcm.n.sound2");
        if (TextUtils.isEmpty(strN4)) {
            strN4 = qVar.N("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strN4)) {
            defaultUri = null;
        } else if ("default".equals(strN4) || resources.getIdentifier(strN4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(i11);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strN4);
        }
        char c10 = 4;
        if (defaultUri != null) {
            Notification notification = jVar.f11088z;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strN5 = qVar.N("gcm.n.click_action");
        if (TextUtils.isEmpty(strN5)) {
            String strN6 = qVar.N("gcm.n.link_android");
            if (TextUtils.isEmpty(strN6)) {
                strN6 = qVar.N("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strN6) ? Uri.parse(strN6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strN5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) qVar.B;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                char c11 = c10;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                c10 = c11;
            }
            launchIntentForPackage.putExtras(bundle4);
            if (qVar.H("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", qVar.Q());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        jVar.f11071g = activity;
        PendingIntent broadcast = !qVar.H("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(qVar.Q())), 1140850688);
        if (broadcast != null) {
            jVar.f11088z.deleteIntent = broadcast;
        }
        String strN7 = qVar.N("gcm.n.color");
        if (TextUtils.isEmpty(strN7)) {
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i10));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strN7));
            } catch (IllegalArgumentException unused3) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strN7 + ". Notification will use default color.");
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i10));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            jVar.f11082t = numValueOf.intValue();
        }
        jVar.d(16, !qVar.H("gcm.n.sticky"));
        jVar.f11080r = qVar.H("gcm.n.local_only");
        String strN8 = qVar.N("gcm.n.ticker");
        if (strN8 != null) {
            jVar.f11088z.tickerText = n4.j.c(strN8);
        }
        Integer numK = qVar.K("gcm.n.notification_priority");
        if (numK == null) {
            numK = null;
        } else if (numK.intValue() < -2 || numK.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numK + ". Skipping setting notificationPriority.");
            numK = null;
        }
        if (numK != null) {
            jVar.f11074j = numK.intValue();
        }
        Integer numK2 = qVar.K("gcm.n.visibility");
        if (numK2 == null) {
            numK2 = null;
        } else if (numK2.intValue() < -1 || numK2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numK2 + ". Skipping setting visibility.");
            numK2 = null;
        }
        if (numK2 != null) {
            jVar.f11083u = numK2.intValue();
        }
        Integer numK3 = qVar.K("gcm.n.notification_count");
        if (numK3 == null) {
            numK3 = null;
        } else if (numK3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numK3 + ". Skipping setting notificationCount.");
            numK3 = null;
        }
        if (numK3 != null) {
            jVar.f11073i = numK3.intValue();
        }
        String strN9 = qVar.N("gcm.n.event_time");
        if (TextUtils.isEmpty(strN9)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strN9));
            } catch (NumberFormatException unused5) {
                Log.w("NotificationParams", "Couldn't parse value of " + o9.q.W("gcm.n.event_time") + "(" + strN9 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            jVar.f11075k = true;
            jVar.f11088z.when = lValueOf.longValue();
        }
        JSONArray jSONArrayL = qVar.L("gcm.n.vibrate_timings");
        if (jSONArrayL == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayL.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayL.length();
                jArr = new long[length];
                for (int i13 = 0; i13 < length; i13++) {
                    jArr[i13] = jSONArrayL.optLong(i13);
                }
            } catch (NumberFormatException | JSONException unused6) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayL + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            jVar.f11088z.vibrate = jArr;
        }
        JSONArray jSONArrayL2 = qVar.L("gcm.n.light_settings");
        if (jSONArrayL2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayL2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayL2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayL2.optInt(1);
                iArr[2] = jSONArrayL2.optInt(2);
            } catch (IllegalArgumentException e11) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayL2 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused7) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayL2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            Notification notification2 = jVar.f11088z;
            notification2.ledARGB = i14;
            notification2.ledOnMS = i15;
            notification2.ledOffMS = i16;
            notification2.flags = ((i15 == 0 || i16 == 0) ? 0 : 1) | ((-2) & notification2.flags);
        }
        boolean zH = qVar.H("gcm.n.default_sound");
        ?? r4 = zH;
        if (qVar.H("gcm.n.default_vibrate_timings")) {
            r4 = (zH ? 1 : 0) | 2;
        }
        ?? r7 = r4;
        if (qVar.H("gcm.n.default_light_settings")) {
            r7 = (r4 == true ? 1 : 0) | 4;
        }
        Notification notification3 = jVar.f11088z;
        notification3.defaults = r7;
        if ((r7 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strN10 = qVar.N("gcm.n.tag");
        if (TextUtils.isEmpty(strN10)) {
            strN10 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strN10;
        if (kVar != null) {
            try {
                xf.n nVar = kVar.C;
                com.google.android.gms.common.internal.d0.h(nVar);
                Bitmap bitmap = (Bitmap) Tasks.a(nVar, 5L, TimeUnit.SECONDS);
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f569b = bitmap;
                }
                jVar.f11072h = iconCompat;
                n4.h hVar = new n4.h(8, z11);
                if (bitmap == null) {
                    iconCompat2 = null;
                    z10 = true;
                } else {
                    z10 = true;
                    iconCompat2 = new IconCompat(1);
                    iconCompat2.f569b = bitmap;
                }
                hVar.C = iconCompat2;
                hVar.D = null;
                hVar.E = z10;
                jVar.e(hVar);
            } catch (InterruptedException unused8) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                kVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e12) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e12.getCause());
            } catch (TimeoutException unused9) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                kVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.C).getSystemService("notification")).notify(str2, 0, jVar.b());
        return true;
    }

    public void J(g7.f fVar, Uri uri, Map map, long j9, long j10, s7.s0 s0Var) throws UnrecognizedInputFormatException {
        a8.m mVar = new a8.m(fVar, j9, j10);
        this.D = mVar;
        if (((a8.q) this.C) != null) {
            return;
        }
        a8.q[] qVarArrF = ((a8.t) this.B).f(uri, map);
        fh.q0 q0VarN = fh.t0.n(qVarArrF.length);
        boolean z10 = true;
        if (qVarArrF.length == 1) {
            this.C = qVarArrF[0];
        } else {
            for (a8.q qVar : qVarArrF) {
                try {
                    if (qVar.e(mVar)) {
                        this.C = qVar;
                        mVar.F = 0;
                        break;
                    }
                    q0VarN.e(qVar.c());
                    boolean z11 = ((a8.q) this.C) != null || mVar.D == j9;
                    ta.c0.A(z11);
                    mVar.F = 0;
                } catch (EOFException unused) {
                    if (((a8.q) this.C) != null || mVar.D == j9) {
                    }
                } catch (Throwable th2) {
                    if (((a8.q) this.C) == null && mVar.D != j9) {
                        z10 = false;
                    }
                    ta.c0.A(z10);
                    mVar.F = 0;
                    throw th2;
                }
                ta.c0.A(z11);
                mVar.F = 0;
            }
            if (((a8.q) this.C) == null) {
                String str = "None of the available extractors (" + new eh.l(", ").b(fh.w.A(new oj.l(5), fh.t0.p(qVarArrF))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, q0VarN.g());
            }
        }
        ((a8.q) this.C).a(s0Var);
    }

    public void L(a30.x xVar, v1.i iVar) {
        Exception exc;
        Exception exc2;
        int i10;
        u.v vVar = (u.v) this.B;
        int i11 = vVar.f14904b;
        u.d0 d0Var = (u.d0) this.C;
        u.d0 d0Var2 = new u.d0();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i12 + 1;
            try {
                try {
                    switch (vVar.c(i12)) {
                        case 0:
                            xVar.l();
                            i12 = i14;
                            break;
                        case 1:
                            int i15 = i13 + 1;
                            xVar.e(d0Var.f(i13));
                            i13 = i15;
                            i12 = i14;
                            break;
                        case 2:
                            int i16 = i12 + 2;
                            i12 += 3;
                            xVar.h(vVar.c(i14), vVar.c(i16));
                            break;
                        case 3:
                            int i17 = i12 + 2;
                            try {
                                int i18 = i12 + 3;
                                try {
                                    i12 += 4;
                                    xVar.g(vVar.c(i14), vVar.c(i17), vVar.c(i18));
                                } catch (Exception e3) {
                                    exc = e3;
                                    i12 = i18;
                                    throw new l1.h(d0Var, d0Var2, vVar, i12 - 1, exc);
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                i12 = i17;
                            }
                            break;
                        case 4:
                            xVar.a();
                            i12 = i14;
                            break;
                        case 5:
                            i12 += 2;
                            i10 = i13 + 1;
                            xVar.d(vVar.c(i14), d0Var.f(i13));
                            i13 = i10;
                            break;
                        case 6:
                            i12 += 2;
                            try {
                                i10 = i13 + 1;
                                xVar.n(vVar.c(i14), d0Var.f(i13));
                                i13 = i10;
                            } catch (Exception e11) {
                                exc2 = e11;
                                exc = exc2;
                                throw new l1.h(d0Var, d0Var2, vVar, i12 - 1, exc);
                            }
                            break;
                        case 7:
                            int i19 = i13 + 1;
                            Object objF = d0Var.f(i13);
                            kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            kotlin.jvm.internal.d0.d(2, objF);
                            i13 += 2;
                            xVar.j(d0Var.f(i19), (u00.n) objF);
                            i12 = i14;
                            break;
                        case 8:
                            Object obj = xVar.D;
                            if (obj instanceof l1.f) {
                                l1.f fVar = (l1.f) obj;
                                if (iVar.f15340f.j(fVar)) {
                                    fVar.b();
                                }
                            }
                            d0Var2.a(obj);
                            xVar.f();
                            i12 = i14;
                            break;
                        default:
                            i12 = i14;
                            break;
                    }
                } catch (Exception e12) {
                    exc2 = e12;
                    i12 = i14;
                    exc = exc2;
                    throw new l1.h(d0Var, d0Var2, vVar, i12 - 1, exc);
                }
            } catch (Throwable th2) {
                xVar.o();
                throw th2;
            }
        }
        if (i13 != d0Var.f14838b) {
            l1.l.a("Applier operation size mismatch");
        }
        d0Var.d();
        vVar.f14904b = 0;
        xVar.o();
    }

    public void M(String str, String str2) {
        kotlin.jvm.internal.m.e(str2, "value");
        ((Properties) this.C).setProperty(str, str2);
        Q();
    }

    public void O() {
        ((TypedArray) this.C).recycle();
    }

    public void P(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.B).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.D) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void Q() {
        File file = (File) this.D;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((Properties) this.C).store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ta.c0.C(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            cd.b bVar = (cd.b) this.B;
            if (bVar != null) {
                bVar.a("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + qd.s0.s0(th4));
            }
        }
    }

    public void R(int i10) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.D;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.D = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, kh.p.A, new p7.g(this));
        this.D = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.B).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void S(Object obj, String str) {
        x0 x0Var = new x0((char) 0, 14);
        ((x0) this.D).D = x0Var;
        this.D = x0Var;
        x0Var.C = obj;
        x0Var.B = str;
    }

    public nh.i a() throws GeneralSecurityException {
        me.i iVar;
        nh.k kVar = (nh.k) this.B;
        if (kVar == null || (iVar = (me.i) this.C) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f11335b != ((ai.a) iVar.B).f486a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        nh.j jVar = kVar.f11338e;
        nh.j jVar2 = nh.j.f11322e;
        if (jVar != jVar2 && ((Integer) this.D) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.D) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            ai.a.a(new byte[0]);
        } else if (jVar == nh.j.f11321d) {
            ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.D).intValue()).array());
        } else {
            if (jVar != nh.j.f11320c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((nh.k) this.B).f11338e);
            }
            ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.D).intValue()).array());
        }
        return new nh.i();
    }

    public nh.m b() throws GeneralSecurityException {
        me.i iVar;
        nh.n nVar = (nh.n) this.B;
        if (nVar == null || (iVar = (me.i) this.C) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f11343b != ((ai.a) iVar.B).f486a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        nh.j jVar = nVar.f11346e;
        nh.j jVar2 = nh.j.f11325h;
        if (jVar != jVar2 && ((Integer) this.D) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.D) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            ai.a.a(new byte[0]);
        } else if (jVar == nh.j.f11324g) {
            ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.D).intValue()).array());
        } else {
            if (jVar != nh.j.f11323f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((nh.n) this.B).f11346e);
            }
            ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.D).intValue()).array());
        }
        return new nh.m();
    }

    public nh.p c() throws GeneralSecurityException {
        me.i iVar;
        nh.q qVar = (nh.q) this.B;
        if (qVar == null || (iVar = (me.i) this.C) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qVar.f11351b != ((ai.a) iVar.B).f486a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        nh.j jVar = qVar.f11352c;
        nh.j jVar2 = nh.j.f11328k;
        if (jVar != jVar2 && ((Integer) this.D) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar == jVar2 && ((Integer) this.D) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar == jVar2) {
            ai.a.a(new byte[0]);
        } else if (jVar == nh.j.f11327j) {
            ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.D).intValue()).array());
        } else {
            if (jVar != nh.j.f11326i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((nh.q) this.B).f11352c);
            }
            ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.D).intValue()).array());
        }
        return new nh.p();
    }

    @Override
    public void d(int i10, Object obj) {
        u.v vVar = (u.v) this.B;
        vVar.a(5);
        vVar.a(i10);
        ((u.d0) this.C).a(obj);
    }

    @Override
    public void e(Object obj) {
        ((u.v) this.B).a(1);
        ((u.d0) this.C).a(obj);
    }

    @Override
    public void f() {
        ((u.v) this.B).a(8);
    }

    @Override
    public void g(int i10, int i11, int i12) {
        u.v vVar = (u.v) this.B;
        vVar.a(3);
        vVar.a(i10);
        vVar.a(i11);
        vVar.a(i12);
    }

    @Override
    public void h(int i10, int i11) {
        u.v vVar = (u.v) this.B;
        vVar.a(2);
        vVar.a(i10);
        vVar.a(i11);
    }

    @Override
    public void h0(Throwable th2) {
        ((View) this.B).setVisibility(8);
    }

    @Override
    public void i(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.D;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override
    public void j(Object obj, u00.n nVar) {
        ((u.v) this.B).a(7);
        u.d0 d0Var = (u.d0) this.C;
        d0Var.a(nVar);
        d0Var.a(obj);
    }

    public String k(String str, int i10, long j9, long j10) {
        ArrayList arrayList = (ArrayList) this.B;
        ArrayList arrayList2 = (ArrayList) this.D;
        ArrayList arrayList3 = (ArrayList) this.C;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j9)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    @Override
    public void l() {
        ((u.v) this.B).a(0);
    }

    public void m() {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.B;
        if (tVar != null) {
            int i10 = ((o9.f) this.D).f11790o.E;
            android.support.v4.media.session.q qVar = tVar.f515a;
            qVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            qVar.f505a.setPlaybackToLocal(builder.build());
            this.C = null;
        }
    }

    @Override
    public void n(int i10, Object obj) {
        u.v vVar = (u.v) this.B;
        vVar.a(6);
        vVar.a(i10);
        ((u.d0) this.C).a(obj);
    }

    @Override
    public void onComplete(Task task) {
        oe.b bVar = (oe.b) this.B;
        String str = (String) this.C;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.D;
        synchronized (bVar.f11941a) {
            bVar.f11941a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void onSuccess(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.C;
        View view2 = (View) this.B;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new IllegalStateException("The media route button placeholder missing layout params.");
        }
        view.setId(2131362156);
        view.setLayoutParams(layoutParams);
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, iIndexOfChild);
        view.setVisibility(0);
        ((m9.u) this.D).A.h(view, true);
    }

    @Override
    public Object p() {
        return this.D;
    }

    public n7.l s(androidx.media3.common.q0 q0Var) {
        n7.d dVar;
        q0Var.f1414b.getClass();
        androidx.media3.common.i0 i0Var = q0Var.f1414b.f1330c;
        if (i0Var == null) {
            return n7.l.f11172a;
        }
        synchronized (this.B) {
            try {
                if (!i0Var.equals((androidx.media3.common.i0) this.C)) {
                    this.C = i0Var;
                    this.D = q(i0Var);
                }
                dVar = (n7.d) this.D;
                dVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public ColorStateList t(int i10) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.C;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListB = n4.b.b((Context) this.B, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListB;
    }

    public String toString() {
        switch (this.A) {
            case 9:
                return mh.n.a((yh.f1) this.B).toString();
            case 15:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.B);
                sb2.append('{');
                x0 x0Var = (x0) ((x0) this.C).D;
                String str = RuntimeVersion.SUFFIX;
                while (x0Var != null) {
                    Object obj = x0Var.C;
                    sb2.append(str);
                    String str2 = (String) x0Var.B;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    x0Var = (x0) x0Var.D;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        a8.m mVar = (a8.m) this.D;
        if (mVar != null) {
            return mVar.D;
        }
        return -1L;
    }

    public Drawable v(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.C;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : p30.f.f0((Context) this.B, resourceId);
    }

    public Drawable w(int i10) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.C).hasValue(i10) || (resourceId = ((TypedArray) this.C).getResourceId(i10, 0)) == 0) {
            return null;
        }
        p.r rVarA = p.r.a();
        Context context = (Context) this.B;
        synchronized (rVarA) {
            drawableD = rVarA.f12195a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public int x() {
        if (C().f10365a.isEmpty()) {
            return -1;
        }
        long j9 = ((long) ((m0.f) h00.q.L0(C().f10365a)).f10321a) - ((long) C().f10372h);
        if (j9 < 0) {
            j9 = 0;
        }
        return (int) j9;
    }

    public Typeface y(int i10, int i11, p.o0 o0Var) {
        int resourceId = ((TypedArray) this.C).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.D) == null) {
            this.D = new TypedValue();
        }
        Context context = (Context) this.B;
        TypedValue typedValue = (TypedValue) this.D;
        ThreadLocal threadLocal = p4.i.f12335a;
        if (context.isRestricted()) {
            return null;
        }
        return p4.i.b(context, resourceId, typedValue, i11, o0Var, true, false);
    }

    public boolean z() {
        return !C().f10365a.isEmpty();
    }
}
