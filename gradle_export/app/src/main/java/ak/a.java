package ak;

import a8.q;
import a8.t;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.f1;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.o;
import androidx.media3.common.p2;
import androidx.media3.common.q0;
import androidx.media3.common.q2;
import androidx.media3.common.r;
import androidx.media3.common.r2;
import androidx.media3.common.z0;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.common.api.k;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.protobuf.RuntimeVersion;
import e7.h;
import e7.i0;
import e7.m;
import e7.n;
import ee.f;
import ee.g;
import fh.r0;
import fh.w0;
import ii.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k9.a2;
import k9.b;
import k9.b3;
import k9.c1;
import k9.d1;
import k9.d4;
import k9.g1;
import k9.m3;
import k9.n3;
import k9.o3;
import k9.p0;
import k9.p3;
import k9.r3;
import k9.s1;
import k9.s2;
import k9.t0;
import k9.t2;
import k9.t3;
import k9.v3;
import k9.z3;
import kh.v;
import l0.j1;
import l1.d2;
import l9.x;
import m3.p;
import s7.a0;
import s7.w;
import sd.y1;
import ud.d;
import xd.i;
import xf.c;

public final class a implements e, xf.e, fe.a, f, ij.a, n, m, p0, c1, s2, h, n3, d2, p, c, xf.a, t {
    public final int A;
    public final Object B;
    public final Object C;

    public a(int i10, Object obj, String str) {
        this.A = i10;
        this.C = obj;
        this.B = str;
    }

    public a(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public a(boolean z10, z3 z3Var, Bundle bundle) {
        this.A = 18;
        this.B = z3Var;
        this.C = bundle;
    }

    @Override
    public Object M(Task task) {
        oj.h hVar = (oj.h) this.C;
        String str = (String) this.B;
        synchronized (hVar) {
            ((u.e) hVar.f12094b).remove(str);
        }
        return task;
    }

    @Override
    public void a(a2 a2Var) {
        switch (this.A) {
            case 15:
                t2 t2Var = (t2) this.B;
                x xVar = (x) this.C;
                t2Var.getClass();
                String str = xVar.A;
                if (TextUtils.isEmpty(str)) {
                    e7.a.m("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    v3 v3Var = t2Var.f9463f.f9430t;
                    if (v3Var.isCommandAvailable(17)) {
                        k2 currentTimeline = v3Var.getCurrentTimeline();
                        j2 j2Var = new j2();
                        for (int i10 = 0; i10 < currentTimeline.getWindowCount(); i10++) {
                            if (TextUtils.equals(currentTimeline.getWindow(i10, j2Var).f1285c.f1413a, str)) {
                                v3Var.removeMediaItem(i10);
                            }
                        }
                    } else {
                        e7.a.m("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
            default:
                ((b) this.C).h(((t2) this.B).f9463f.f9430t);
                break;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.A) {
            case 17:
                p3 p3Var = (p3) this.B;
                q2 q2VarB = (q2) this.C;
                v3 v3Var = (v3) obj;
                w0 w0Var = q2VarB.H;
                if (!w0Var.isEmpty()) {
                    p2 p2VarC = q2VarB.a().c();
                    fh.s2 it = w0Var.values().iterator();
                    while (it.hasNext()) {
                        m2 m2Var = (m2) it.next();
                        l2 l2Var = (l2) p3Var.f9386h.H.get(m2Var.f1353a.f1339b);
                        if (l2Var == null || m2Var.f1353a.f1338a != l2Var.f1338a) {
                            p2VarC.a(m2Var);
                        } else {
                            p2VarC.a(new m2(l2Var, m2Var.f1354b));
                        }
                    }
                    q2VarB = p2VarC.b();
                }
                v3Var.setTrackSelectionParameters(q2VarB);
                break;
            case TYPE_SINT64_VALUE:
            default:
                p3 p3Var2 = (p3) this.B;
                Surface surface = (Surface) this.C;
                v3 v3Var2 = (v3) obj;
                ((s1) p3Var2.f9383e.get()).getClass();
                if (surface != null) {
                    o3 o3Var = new o3(surface);
                    p3Var2.f9388j = o3Var;
                    v3Var2.setVideoSurfaceHolder(o3Var);
                } else {
                    v3Var2.setVideoSurfaceHolder(null);
                    p3Var2.f9388j = null;
                }
                break;
            case k.REMOTE_EXCEPTION:
                p3 p3Var3 = (p3) this.B;
                a2 a2Var = (a2) this.C;
                s1 s1Var = (s1) p3Var3.f9383e.get();
                if (s1Var != null && !s1Var.o()) {
                    s1Var.l(a2Var, false);
                    break;
                }
                break;
        }
    }

    @Override
    public Object apply(Object obj) {
        ee.h hVar = (ee.h) this.B;
        i iVar = (i) this.C;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ee.a aVar = hVar.D;
        ArrayList arrayListR = hVar.r(sQLiteDatabase, iVar, aVar.f5359b);
        for (d dVar : d.values()) {
            if (dVar != iVar.f16549c) {
                int size = aVar.f5359b - arrayListR.size();
                if (size <= 0) {
                    break;
                }
                arrayListR.addAll(hVar.r(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListR.size(); i10++) {
            sb2.append(((ee.b) arrayListR.get(i10)).f5363a);
            if (i10 < arrayListR.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j9 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j9));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j9), hashSet);
                }
                hashSet.add(new g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListR.listIterator();
        while (listIterator.hasNext()) {
            ee.b bVar = (ee.b) listIterator.next();
            long j10 = bVar.f5363a;
            if (map.containsKey(Long.valueOf(j10))) {
                a1.n nVarC = bVar.f5365c.c();
                for (g gVar : (Set) map.get(Long.valueOf(j10))) {
                    nVarC.e(gVar.f5366a, gVar.f5367b);
                }
                listIterator.set(new ee.b(j10, bVar.f5364b, nVarC.f()));
            }
        }
        return arrayListR;
    }

    @Override
    public void b(k9.m mVar, int i10) {
        switch (this.A) {
            case 8:
                t0 t0Var = (t0) this.B;
                z0 z0Var = (z0) this.C;
                d1 d1Var = t0Var.f9440c;
                z0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(z0.f1686e, z0Var.f1688a);
                bundle.putFloat(z0.f1687f, z0Var.f1689b);
                mVar.U(d1Var, i10, bundle);
                break;
            case 9:
                t0 t0Var2 = (t0) this.B;
                mVar.I0(t0Var2.f9440c, i10, (Surface) this.C);
                break;
            case 10:
                mVar.M0(((t0) this.B).f9440c, i10, ((androidx.media3.common.t0) this.C).c());
                break;
            default:
                mVar.T1(((t0) this.B).f9440c, i10, ((q2) this.C).c());
                break;
        }
    }

    @Override
    public boolean c() {
        j1 j1Var = (j1) this.B;
        l0.b bVar = (l0.b) this.C;
        if (!j1Var.f9772q) {
            j1Var.h();
            long jA = l0.b.a(j1Var.f9770o, bVar.f9716a);
            bVar.f9716a = jA;
            j1Var.f9772q = !j1Var.g(j1Var.f9769n, jA + bVar.f9717b);
        }
        return j1Var.f9772q;
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        switch (this.A) {
            case TYPE_SINT64_VALUE:
                z3 z3Var = (z3) this.B;
                Bundle bundle = (Bundle) this.C;
                nv.p pVar = s1Var.f9417e;
                g1 g1Var = s1Var.f9423k;
                a2 a2VarF = s1Var.F(a2Var);
                pVar.getClass();
                return pVar.b(g1Var, a2VarF, z3Var, bundle);
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return s1Var.o() ? b5.x(new d4(-100)) : i0.V((v) ((n3) this.B).d(s1Var, a2Var, i10), new ce.a(s1Var, a2Var, (b3) this.C, 6));
            default:
                return s1Var.o() ? b5.x(new d4(-100)) : i0.V((v) ((n3) this.B).d(s1Var, a2Var, i10), new ce.a(s1Var, a2Var, (m3) this.C, 7));
        }
    }

    @Override
    public q[] e() {
        s7.n nVar = (s7.n) this.B;
        androidx.media3.common.t tVar = (androidx.media3.common.t) this.C;
        return new q[]{nVar.f13717c.m(tVar) ? new x8.g(nVar.f13717c.k(tVar), null) : new i8.a(tVar)};
    }

    @Override
    public void g(t0 t0Var) {
        t0Var.w((t3) this.B, (r3) this.C);
    }

    @Override
    public void h(Object obj, r rVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.media3.common.w0 w0Var;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        androidx.media3.common.t tVar;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z11;
        j7.h hVar;
        String str;
        Iterator it;
        j7.g gVar;
        j7.i iVar;
        androidx.media3.common.t tVar2;
        int i27;
        int i28;
        o oVar;
        int i29;
        j7.f fVar = (j7.f) this.B;
        f1 f1Var = (f1) this.C;
        j7.i iVar2 = (j7.i) obj;
        SparseArray sparseArray = fVar.E;
        SparseArray sparseArray2 = new SparseArray(rVar.f1465a.size());
        for (int i30 = 0; i30 < rVar.f1465a.size(); i30++) {
            int iB = rVar.b(i30);
            j7.a aVar = (j7.a) sparseArray.get(iB);
            aVar.getClass();
            sparseArray2.append(iB, aVar);
        }
        iVar2.getClass();
        if (rVar.f1465a.size() == 0) {
            return;
        }
        int i31 = 0;
        while (true) {
            boolean z12 = true;
            if (i31 >= rVar.f1465a.size()) {
                break;
            }
            int iB2 = rVar.b(i31);
            j7.a aVar2 = (j7.a) sparseArray2.get(iB2);
            aVar2.getClass();
            if (iB2 == 0) {
                j7.h hVar2 = iVar2.f8226c;
                synchronized (hVar2) {
                    try {
                        hVar2.f8220d.getClass();
                        k2 k2Var = hVar2.f8221e;
                        hVar2.f8221e = aVar2.f8199b;
                        Iterator it2 = hVar2.f8219c.values().iterator();
                        while (it2.hasNext()) {
                            j7.g gVar2 = (j7.g) it2.next();
                            if (!gVar2.b(k2Var, hVar2.f8221e) || gVar2.a(aVar2)) {
                                it2.remove();
                                if (gVar2.f8208a.equals(hVar2.f8222f)) {
                                    hVar2.a(gVar2);
                                }
                                if (gVar2.f8212e) {
                                    hVar2.f8220d.d(aVar2, gVar2.f8208a);
                                }
                            }
                        }
                        hVar2.d(aVar2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iB2 == 11) {
                j7.h hVar3 = iVar2.f8226c;
                int i32 = iVar2.l;
                synchronized (hVar3) {
                    try {
                        hVar3.f8220d.getClass();
                        if (i32 != 0) {
                            z12 = false;
                        }
                        Iterator it3 = hVar3.f8219c.values().iterator();
                        while (it3.hasNext()) {
                            j7.g gVar3 = (j7.g) it3.next();
                            if (gVar3.a(aVar2)) {
                                it3.remove();
                                boolean zEquals = gVar3.f8208a.equals(hVar3.f8222f);
                                if (zEquals) {
                                    hVar3.a(gVar3);
                                }
                                if (gVar3.f8212e) {
                                    if (z12 && zEquals) {
                                        boolean z13 = gVar3.f8213f;
                                    }
                                    hVar3.f8220d.d(aVar2, gVar3.f8208a);
                                }
                            }
                        }
                        hVar3.d(aVar2);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                iVar2.f8226c.e(aVar2);
            }
            i31++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (rVar.f1465a.get(0)) {
            j7.a aVar3 = (j7.a) sparseArray2.get(0);
            aVar3.getClass();
            if (iVar2.f8234k != null) {
                iVar2.c(aVar3.f8199b, aVar3.f8201d);
            }
        }
        if (rVar.f1465a.get(2) && iVar2.f8234k != null) {
            r0 r0VarListIterator = f1Var.getCurrentTracks().f1556a.listIterator(0);
            loop4: while (true) {
                if (!r0VarListIterator.hasNext()) {
                    oVar = null;
                    break;
                }
                r2 r2Var = (r2) r0VarListIterator.next();
                for (int i33 = 0; i33 < r2Var.f1486a; i33++) {
                    if (r2Var.f1490e[i33] && (oVar = r2Var.f1487b.f1341d[i33].f1598r) != null) {
                        break loop4;
                    }
                }
            }
            if (oVar != null) {
                PlaybackMetrics.Builder builder = iVar2.f8234k;
                String str2 = i0.f5136a;
                int i34 = 0;
                while (true) {
                    if (i34 >= oVar.D) {
                        i29 = 1;
                        break;
                    }
                    UUID uuid = oVar.A[i34].B;
                    if (uuid.equals(androidx.media3.common.h.f1217d)) {
                        i29 = 3;
                        break;
                    } else if (uuid.equals(androidx.media3.common.h.f1218e)) {
                        i29 = 2;
                        break;
                    } else {
                        if (uuid.equals(androidx.media3.common.h.f1216c)) {
                            i29 = 6;
                            break;
                        }
                        i34++;
                    }
                }
                builder.setDrmType(i29);
            }
        }
        if (rVar.f1465a.get(1011)) {
            iVar2.A++;
        }
        PlaybackException playbackException = iVar2.f8236o;
        if (playbackException == null) {
            i14 = 4;
            i22 = 1;
            i16 = 13;
            i11 = 6;
            i12 = 8;
            i13 = 7;
            i15 = 9;
        } else {
            int i35 = playbackException.A;
            Context context = iVar2.f8224a;
            boolean z14 = iVar2.f8244w == 4;
            if (i35 == 1001) {
                w0Var = new androidx.media3.common.w0(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z10 = exoPlaybackException.J == 1;
                    i10 = exoPlaybackException.N;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i36 = 28;
                    i11 = 6;
                    i12 = 8;
                    i13 = 7;
                    i14 = 4;
                    i15 = 9;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        w0Var = new androidx.media3.common.w0(35, 0);
                    } else if (z10 && i10 == 3) {
                        w0Var = new androidx.media3.common.w0(15, 0);
                    } else if (z10 && i10 == 2) {
                        w0Var = new androidx.media3.common.w0(23, 0);
                    } else if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                        i16 = 13;
                        w0Var = new androidx.media3.common.w0(13, i0.t(((MediaCodecRenderer$DecoderInitializationException) cause).D));
                    } else {
                        i16 = 13;
                        if (cause instanceof MediaCodecDecoderException) {
                            w0Var = new androidx.media3.common.w0(14, ((MediaCodecDecoderException) cause).A);
                        } else if (cause instanceof OutOfMemoryError) {
                            w0Var = new androidx.media3.common.w0(14, 0);
                        } else if (cause instanceof AudioSink$InitializationException) {
                            w0Var = new androidx.media3.common.w0(17, 0);
                        } else if (cause instanceof AudioSink$WriteException) {
                            w0Var = new androidx.media3.common.w0(18, ((AudioSink$WriteException) cause).A);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (i0.s(errorCode)) {
                                case 6002:
                                    i36 = 24;
                                    break;
                                case 6003:
                                    break;
                                case 6004:
                                    i36 = 25;
                                    break;
                                case 6005:
                                    i36 = 26;
                                    break;
                                default:
                                    i36 = 27;
                                    break;
                            }
                            w0Var = new androidx.media3.common.w0(i36, errorCode);
                        } else {
                            w0Var = new androidx.media3.common.w0(22, 0);
                        }
                    }
                    i16 = 13;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    w0Var = new androidx.media3.common.w0(5, ((HttpDataSource$InvalidResponseCodeException) cause).D);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        i17 = 9;
                        i18 = 4;
                        i19 = 7;
                        i20 = 8;
                        i11 = 6;
                        w0Var = new androidx.media3.common.w0(z14 ? 10 : 11, 0);
                    } else {
                        boolean z15 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z15 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                            i17 = 9;
                            if (e7.t.a(context).b() == 1) {
                                w0Var = new androidx.media3.common.w0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i11 = 6;
                                    w0Var = new androidx.media3.common.w0(6, 0);
                                    i15 = 9;
                                    i16 = 13;
                                    i12 = 8;
                                    i13 = 7;
                                    i14 = 4;
                                } else {
                                    i11 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        w0Var = new androidx.media3.common.w0(7, 0);
                                        i15 = 9;
                                        i13 = 7;
                                        i16 = 13;
                                        i12 = 8;
                                        i14 = 4;
                                    } else {
                                        i19 = 7;
                                        if (z15 && ((HttpDataSource$HttpDataSourceException) cause).C == 1) {
                                            w0Var = new androidx.media3.common.w0(4, 0);
                                            i15 = 9;
                                            i14 = 4;
                                            i13 = 7;
                                            i16 = 13;
                                            i12 = 8;
                                        } else {
                                            i18 = 4;
                                            i20 = 8;
                                            w0Var = new androidx.media3.common.w0(8, 0);
                                        }
                                    }
                                }
                            }
                        } else if (i35 == 1002) {
                            w0Var = new androidx.media3.common.w0(21, 0);
                        } else if (cause instanceof DrmSession$DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iT = i0.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (i0.s(iT)) {
                                    case 6002:
                                        i21 = 24;
                                        break;
                                    case 6003:
                                        i21 = 28;
                                        break;
                                    case 6004:
                                        i21 = 25;
                                        break;
                                    case 6005:
                                        i21 = 26;
                                        break;
                                    default:
                                        i21 = 27;
                                        break;
                                }
                                w0Var = new androidx.media3.common.w0(i21, iT);
                            } else if (cause3 instanceof MediaDrmResetException) {
                                w0Var = new androidx.media3.common.w0(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                w0Var = new androidx.media3.common.w0(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                w0Var = new androidx.media3.common.w0(29, 0);
                            } else if (cause3 instanceof UnsupportedDrmException) {
                                w0Var = new androidx.media3.common.w0(23, 0);
                            } else {
                                w0Var = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new androidx.media3.common.w0(28, 0) : new androidx.media3.common.w0(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            w0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new androidx.media3.common.w0(32, 0) : new androidx.media3.common.w0(31, 0);
                        } else {
                            i17 = 9;
                            w0Var = new androidx.media3.common.w0(9, 0);
                        }
                        i15 = i17;
                        i16 = 13;
                        i11 = 6;
                        i12 = 8;
                        i13 = 7;
                        i14 = 4;
                    }
                    i15 = i17;
                    i14 = i18;
                    i13 = i19;
                    i12 = i20;
                    i16 = 13;
                }
                iVar2.f8225b.execute(new ab.f(iVar2, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - iVar2.f8228e).setErrorCode(w0Var.f1663a).setSubErrorCode(w0Var.f1664b).setException(playbackException).build(), 27));
                i22 = 1;
                iVar2.B = true;
                iVar2.f8236o = null;
            }
            i16 = 13;
            i11 = 6;
            i12 = 8;
            i13 = 7;
            i14 = 4;
            i15 = 9;
            iVar2.f8225b.execute(new ab.f(iVar2, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - iVar2.f8228e).setErrorCode(w0Var.f1663a).setSubErrorCode(w0Var.f1664b).setException(playbackException).build(), 27));
            i22 = 1;
            iVar2.B = true;
            iVar2.f8236o = null;
        }
        if (rVar.f1465a.get(2)) {
            androidx.media3.common.s2 currentTracks = f1Var.getCurrentTracks();
            boolean zA = currentTracks.a(2);
            boolean zA2 = currentTracks.a(i22);
            boolean zA3 = currentTracks.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    tVar2 = null;
                } else {
                    tVar2 = null;
                    if (!Objects.equals(iVar2.f8240s, null)) {
                        int i37 = iVar2.f8240s == null ? 1 : 0;
                        iVar2.f8240s = null;
                        i16 = i16;
                        i14 = i14;
                        i23 = 26;
                        i24 = 10;
                        i25 = 5;
                        iVar2.e(1, jElapsedRealtime, null, i37);
                    }
                    if (!zA2 && !Objects.equals(iVar2.f8241t, tVar2)) {
                        if (iVar2.f8241t == null) {
                            i28 = 1;
                        } else {
                            i28 = 0;
                        }
                        iVar2.f8241t = tVar2;
                        iVar2.e(0, jElapsedRealtime, tVar2, i28);
                    }
                    if (!zA3 && !Objects.equals(iVar2.f8242u, tVar2)) {
                        if (iVar2.f8242u == null) {
                            i27 = 1;
                        } else {
                            i27 = 0;
                        }
                        iVar2.f8242u = tVar2;
                        iVar2.e(2, jElapsedRealtime, tVar2, i27);
                    }
                    tVar = tVar2;
                }
                i23 = 26;
                i24 = 10;
                i25 = 5;
                if (!zA2) {
                    if (iVar2.f8241t == null) {
                        i28 = 1;
                    } else {
                        i28 = 0;
                    }
                    iVar2.f8241t = tVar2;
                    iVar2.e(0, jElapsedRealtime, tVar2, i28);
                }
                if (!zA3) {
                    if (iVar2.f8242u == null) {
                        i27 = 1;
                    } else {
                        i27 = 0;
                    }
                    iVar2.f8242u = tVar2;
                    iVar2.e(2, jElapsedRealtime, tVar2, i27);
                }
                tVar = tVar2;
            } else {
                i16 = i16;
                i14 = i14;
                tVar = null;
                i23 = 26;
                i24 = 10;
                i25 = 5;
            }
        } else {
            i16 = i16;
            i14 = i14;
            tVar = null;
            i23 = 26;
            i24 = 10;
            i25 = 5;
        }
        if (iVar2.a(iVar2.f8237p)) {
            c50.h hVar4 = iVar2.f8237p;
            androidx.media3.common.t tVar3 = (androidx.media3.common.t) hVar4.C;
            if (tVar3.f1602v != -1) {
                int i38 = hVar4.B;
                if (!Objects.equals(iVar2.f8240s, tVar3)) {
                    int i39 = (iVar2.f8240s == null && i38 == 0) ? 1 : i38;
                    iVar2.f8240s = tVar3;
                    iVar2.e(1, jElapsedRealtime, tVar3, i39);
                }
                iVar2.f8237p = tVar;
            }
        }
        if (iVar2.a(iVar2.f8238q)) {
            c50.h hVar5 = iVar2.f8238q;
            androidx.media3.common.t tVar4 = (androidx.media3.common.t) hVar5.C;
            int i40 = hVar5.B;
            if (!Objects.equals(iVar2.f8241t, tVar4)) {
                int i41 = (iVar2.f8241t == null && i40 == 0) ? 1 : i40;
                iVar2.f8241t = tVar4;
                iVar2.e(0, jElapsedRealtime, tVar4, i41);
            }
            iVar2.f8238q = tVar;
        }
        if (iVar2.a(iVar2.f8239r)) {
            c50.h hVar6 = iVar2.f8239r;
            androidx.media3.common.t tVar5 = (androidx.media3.common.t) hVar6.C;
            int i42 = hVar6.B;
            if (!Objects.equals(iVar2.f8242u, tVar5)) {
                int i43 = (iVar2.f8242u == null && i42 == 0) ? 1 : i42;
                iVar2.f8242u = tVar5;
                iVar2.e(2, jElapsedRealtime, tVar5, i43);
            }
            iVar2.f8239r = tVar;
        }
        switch (e7.t.a(iVar2.f8224a).b()) {
            case 0:
                i26 = 0;
                break;
            case 1:
                i26 = i15;
                break;
            case 2:
                i26 = 2;
                break;
            case 3:
                i26 = i14;
                break;
            case 4:
                i26 = i25;
                break;
            case 5:
                i26 = i11;
                break;
            case 6:
            case 8:
            default:
                i26 = 1;
                break;
            case 7:
                i26 = 3;
                break;
            case 9:
                i26 = i12;
                break;
            case 10:
                i26 = i13;
                break;
        }
        if (i26 != iVar2.f8235n) {
            iVar2.f8235n = i26;
            iVar2.f8225b.execute(new ab.f(iVar2, new NetworkEvent.Builder().setNetworkType(i26).setTimeSinceCreatedMillis(jElapsedRealtime - iVar2.f8228e).build(), i23));
        }
        if (f1Var.getPlaybackState() != 2) {
            iVar2.f8243v = false;
        }
        if (f1Var.getPlayerError() == null) {
            iVar2.f8245x = false;
        } else if (rVar.f1465a.get(i24)) {
            iVar2.f8245x = true;
        }
        int playbackState = f1Var.getPlaybackState();
        if (iVar2.f8243v) {
            i24 = i25;
        } else if (iVar2.f8245x) {
            i24 = i16;
        } else if (playbackState == i14) {
            i24 = 11;
        } else {
            if (playbackState != 2) {
                if (playbackState != 3) {
                    z11 = true;
                    i24 = (playbackState != 1 || iVar2.m == 0) ? iVar2.m : 12;
                } else if (f1Var.getPlayWhenReady()) {
                    i24 = f1Var.getPlaybackSuppressionReason() != 0 ? i15 : 3;
                } else {
                    i24 = i14;
                }
                if (iVar2.m != i24) {
                    iVar2.m = i24;
                    iVar2.B = z11;
                    iVar2.f8225b.execute(new ab.f(iVar2, new PlaybackStateEvent.Builder().setState(iVar2.m).setTimeSinceCreatedMillis(jElapsedRealtime - iVar2.f8228e).build(), 29));
                }
                if (rVar.f1465a.get(1028)) {
                    hVar = iVar2.f8226c;
                    j7.a aVar4 = (j7.a) sparseArray2.get(1028);
                    aVar4.getClass();
                    synchronized (hVar) {
                        try {
                            str = hVar.f8222f;
                            if (str != null) {
                                j7.g gVar4 = (j7.g) hVar.f8219c.get(str);
                                gVar4.getClass();
                                hVar.a(gVar4);
                            }
                            it = hVar.f8219c.values().iterator();
                            while (it.hasNext()) {
                                gVar = (j7.g) it.next();
                                it.remove();
                                if (!gVar.f8212e && (iVar = hVar.f8220d) != null) {
                                    iVar.d(aVar4, gVar.f8208a);
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            int i44 = iVar2.m;
            if (i44 == 0 || i44 == 2 || i44 == 12) {
                i24 = 2;
            } else if (!f1Var.getPlayWhenReady()) {
                i24 = i13;
            } else if (f1Var.getPlaybackSuppressionReason() == 0) {
                i24 = i11;
            }
        }
        z11 = true;
        if (iVar2.m != i24) {
            iVar2.m = i24;
            iVar2.B = z11;
            iVar2.f8225b.execute(new ab.f(iVar2, new PlaybackStateEvent.Builder().setState(iVar2.m).setTimeSinceCreatedMillis(jElapsedRealtime - iVar2.f8228e).build(), 29));
        }
        if (rVar.f1465a.get(1028)) {
            hVar = iVar2.f8226c;
            j7.a aVar5 = (j7.a) sparseArray2.get(1028);
            aVar5.getClass();
            synchronized (hVar) {
                str = hVar.f8222f;
                if (str != null) {
                    j7.g gVar5 = (j7.g) hVar.f8219c.get(str);
                    gVar5.getClass();
                    hVar.a(gVar5);
                }
                it = hVar.f8219c.values().iterator();
                while (it.hasNext()) {
                    gVar = (j7.g) it.next();
                    it.remove();
                    if (!gVar.f8212e) {
                    }
                }
            }
        }
    }

    @Override
    public Object i() {
        switch (this.A) {
            case 2:
                a30.k kVar = (a30.k) this.B;
                Iterable iterable = (Iterable) this.C;
                ee.h hVar = (ee.h) ((ee.d) kVar.c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + ee.h.A(iterable)).execute();
                    break;
                }
                break;
            default:
                a30.k kVar2 = (a30.k) this.B;
                for (Map.Entry entry : ((HashMap) this.C).entrySet()) {
                    ((ee.h) ((ee.c) kVar2.i)).v(((Integer) entry.getValue()).intValue(), ae.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 7:
                j7.a aVar = (j7.a) this.B;
                w wVar = (w) this.C;
                j7.i iVar = (j7.i) obj;
                iVar.getClass();
                a0 a0Var = aVar.f8201d;
                if (a0Var != null) {
                    androidx.media3.common.t tVar = wVar.f13783c;
                    tVar.getClass();
                    int i10 = wVar.f13784d;
                    j7.h hVar = iVar.f8226c;
                    k2 k2Var = aVar.f8199b;
                    a0Var.getClass();
                    c50.h hVar2 = new c50.h(i10, 10, tVar, hVar.c(k2Var, a0Var));
                    int i11 = wVar.f13782b;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            iVar.f8238q = hVar2;
                            break;
                        } else if (i11 != 2) {
                            if (i11 == 3) {
                                iVar.f8239r = hVar2;
                                break;
                            }
                        }
                    }
                    iVar.f8237p = hVar2;
                    break;
                }
                break;
            case 12:
                ((androidx.media3.common.d1) obj).u(((Integer) this.C).intValue(), (q0) this.B);
                break;
            default:
                y1 y1Var = (y1) this.B;
                Integer num = (Integer) this.C;
                ((androidx.media3.common.d1) obj).u(num.intValue(), ((t3) y1Var.f14132a).s());
                break;
        }
    }

    @Override
    public void j(ij.b bVar) {
        ij.a aVar = (ij.a) this.B;
        ij.a aVar2 = (ij.a) this.C;
        aVar.j(bVar);
        aVar2.j(bVar);
    }

    @Override
    public void l(m3.o oVar) {
        u00.k kVar = (u00.k) this.C;
        String str = (String) this.B;
        kotlin.jvm.internal.m.e(oVar, "it");
        kVar.invoke(str);
    }

    @Override
    public Object m(y1 y1Var) {
        String strValueOf;
        switch (this.A) {
            case 0:
                String str = (String) this.B;
                ii.b bVar = (ii.b) this.C;
                try {
                    Trace.beginSection(str);
                    return bVar.f7681f.m(y1Var);
                } finally {
                    Trace.endSection();
                }
            default:
                String str2 = (String) this.B;
                a8.n nVar = (a8.n) this.C;
                Context context = (Context) y1Var.a(Context.class);
                switch (nVar.A) {
                    case 14:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = RuntimeVersion.SUFFIX;
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 15:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = RuntimeVersion.SUFFIX;
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 16:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = RuntimeVersion.SUFFIX;
                        } else {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = RuntimeVersion.SUFFIX;
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new qj.a(str2, strValueOf);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((oj.g) this.B).a((Intent) this.C);
    }

    @Override
    public void onSuccess(Object obj) {
        ((d4.h) this.B).a((MediaRouteButton) this.C);
    }
}
