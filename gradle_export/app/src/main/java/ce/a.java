package ce;

import a40.a0;
import a40.c0;
import ab.k;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import androidx.media3.common.d1;
import androidx.media3.common.l2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.protobuf.RuntimeVersion;
import d4.i;
import e7.h;
import e7.i0;
import e7.m;
import ee.f;
import fh.d2;
import fh.q0;
import fh.t0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.a2;
import k9.b2;
import k9.b3;
import k9.d4;
import k9.g1;
import k9.s1;
import k9.s2;
import k9.t2;
import k9.t3;
import k9.z3;
import kh.b0;
import kh.v;
import nv.p;
import oj.q;
import oj.r;
import q3.e0;
import s7.g0;
import s7.w;
import sd.y1;
import sj.j;
import u00.n;
import wb.o;
import xd.l;
import xf.e;
import xf.g;

public final class a implements fe.a, f, m, s2, kh.m, xf.f, xf.a, h, e, v7.m, i {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public a(ee.h hVar, Object obj, xd.i iVar, int i10) {
        this.A = i10;
        this.D = hVar;
        this.B = obj;
        this.C = iVar;
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.D = obj;
        this.C = obj2;
        this.B = obj3;
    }

    public a(k00.i iVar, a0 a0Var, n nVar) {
        this.A = 16;
        this.D = iVar;
        this.C = a0Var;
        this.B = (m00.i) nVar;
    }

    @Override
    public Object M(Task task) {
        sj.e eVar;
        URL url;
        switch (this.A) {
            case 9:
                g gVar = (g) this.D;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.C;
                wi.b bVar = (wi.b) this.B;
                if (task.o()) {
                    gVar.d(task.k());
                } else if (task.j() != null) {
                    gVar.c(task.j());
                } else if (atomicBoolean.getAndSet(true)) {
                    ((xf.n) ((o) bVar.B).A).r(null);
                }
                return Tasks.d(null);
            case 10:
                rj.b bVar2 = (rj.b) this.D;
                Task task2 = (Task) this.C;
                Task task3 = (Task) this.B;
                if (!task2.o() || task2.k() == null) {
                    return Tasks.d(Boolean.FALSE);
                }
                sj.e eVar2 = (sj.e) task2.k();
                return (task3.o() && (eVar = (sj.e) task3.k()) != null && eVar2.f14256c.equals(eVar.f14256c)) ? Tasks.d(Boolean.FALSE) : bVar2.f13588d.d(eVar2).h(bVar2.f13586b, new rj.a(bVar2));
            default:
                j jVar = (j) this.D;
                Task task4 = (Task) this.C;
                Task task5 = (Task) this.B;
                if (!task4.o()) {
                    return Tasks.c(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task4.j()));
                }
                if (!task5.o()) {
                    return Tasks.c(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task5.j()));
                }
                try {
                    try {
                        url = new URL(jVar.c(jVar.f14294n));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    jVar.i(httpURLConnection, (String) task5.k(), ((jj.a) task4.k()).f8290a);
                    return Tasks.d(httpURLConnection);
                } catch (IOException e3) {
                    return Tasks.c(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e3));
                }
        }
    }

    @Override
    public void a(a2 a2Var) {
        t2 t2Var = (t2) this.D;
        z3 z3Var = (z3) this.C;
        Bundle bundle = (Bundle) this.B;
        s1 s1Var = t2Var.f9463f;
        p pVar = s1Var.f9417e;
        g1 g1Var = s1Var.f9423k;
        a2 a2VarF = s1Var.F(a2Var);
        pVar.getClass();
        pVar.b(g1Var, a2VarF, z3Var, bundle);
    }

    @Override
    public void accept(Object obj) {
        c50.h hVar = (c50.h) this.D;
        ((g0) obj).o(hVar.B, (s7.a0) this.C, (w) this.B);
    }

    @Override
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        ee.h hVar;
        ae.c cVar;
        int i10 = this.A;
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        ae.c cVar2 = ae.c.CACHE_FULL;
        int i15 = 2;
        int i16 = 1;
        Object obj2 = this.B;
        Object obj3 = this.C;
        Object obj4 = this.D;
        int i17 = 0;
        switch (i10) {
            case 1:
                ee.h hVar2 = (ee.h) obj4;
                xd.h hVar3 = (xd.h) obj2;
                l lVar = hVar3.f16539c;
                String str = hVar3.f16537a;
                xd.i iVar = (xd.i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ee.a aVar = hVar2.D;
                if (jSimpleQueryForLong >= aVar.f5358a) {
                    hVar2.v(1L, cVar2, str);
                    return -1L;
                }
                Long lI = ee.h.i(sQLiteDatabase, iVar);
                if (lI != null) {
                    jInsert = lI.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f16547a);
                    contentValues.put("priority", Integer.valueOf(he.a.a(iVar.f16549c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f16548b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i18 = aVar.f5362e;
                byte[] bArr2 = lVar.f16551b;
                boolean z10 = bArr2.length <= i18;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f16540d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f16541e));
                contentValues2.put("payload_encoding", lVar.f16550a.f15250a);
                contentValues2.put("code", hVar3.f16538b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar3.f16543g);
                contentValues2.put("pseudonymous_id", hVar3.f16544h);
                contentValues2.put("experiment_ids_clear_blob", hVar3.f16545i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar3.f16546j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i18));
                    for (int i19 = 1; i19 <= iCeil; i19++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i19 - 1) * i18, Math.min(i19 * i18, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i19));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar3.f16542f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                ee.h hVar4 = (ee.h) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                xd.i iVar2 = (xd.i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j9 = cursor2.getLong(0);
                    int i20 = cursor2.getInt(7) != 0 ? i16 : 0;
                    a1.n nVar = new a1.n();
                    nVar.G = new HashMap();
                    String string = cursor2.getString(i16);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    nVar.B = string;
                    nVar.E = Long.valueOf(cursor2.getLong(i15));
                    nVar.F = Long.valueOf(cursor2.getLong(3));
                    if (i20 != 0) {
                        String string2 = cursor2.getString(4);
                        nVar.D = new l(string2 == null ? ee.h.F : new ud.c(string2), cursor2.getBlob(5));
                        hVar = hVar4;
                    } else {
                        String string3 = cursor2.getString(4);
                        ud.c cVar3 = string3 == null ? ee.h.F : new ud.c(string3);
                        Cursor cursorQuery = hVar4.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j9)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i21 = 0;
                            int length2 = 0;
                            while (i21 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i21);
                                ee.h hVar5 = hVar4;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i21++;
                                    cursorQuery = cursor;
                                    hVar4 = hVar5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            hVar = hVar4;
                            cursorQuery.close();
                            nVar.D = new l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        nVar.C = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        nVar.H = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        nVar.I = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        nVar.J = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        nVar.K = cursor2.getBlob(11);
                    }
                    arrayList.add(new ee.b(j9, iVar2, nVar.f()));
                    hVar4 = hVar;
                    i15 = 2;
                    i16 = 1;
                }
                return null;
            default:
                ee.h hVar6 = (ee.h) obj4;
                HashMap map = (HashMap) obj3;
                q qVar = (q) obj2;
                ArrayList arrayList3 = (ArrayList) qVar.D;
                Cursor cursor3 = (Cursor) obj;
                hVar6.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i17);
                    int i22 = cursor3.getInt(1);
                    ae.c cVar4 = ae.c.REASON_UNKNOWN;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = ae.c.MESSAGE_TOO_OLD;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                        } else if (i22 == i14) {
                            cVar4 = ae.c.PAYLOAD_TOO_BIG;
                        } else if (i22 == i13) {
                            cVar4 = ae.c.MAX_RETRIES_REACHED;
                        } else if (i22 == i12) {
                            cVar4 = ae.c.INVALID_PAYLOD;
                        } else if (i22 == i11) {
                            cVar4 = ae.c.SERVER_ERROR;
                        } else {
                            g4.y(Integer.valueOf(i22), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j10 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new ae.d(j10, cVar));
                    i11 = 6;
                    i12 = 5;
                    i13 = 4;
                    i14 = 3;
                    i17 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i23 = ae.e.f456c;
                    new ArrayList();
                    arrayList3.add(new ae.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jH = hVar6.B.h();
                SQLiteDatabase sQLiteDatabaseA = hVar6.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        ae.g gVar = new ae.g(cursorRawQuery.getLong(0), jH);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        qVar.C = gVar;
                        qVar.E = new ae.b(new ae.f(hVar6.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar6.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), ee.a.f5357f.f5358a));
                        qVar.B = (String) hVar6.E.get();
                        return new ae.a((ae.g) qVar.C, Collections.unmodifiableList(arrayList3), (ae.b) qVar.E, (String) qVar.B);
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    sQLiteDatabaseA.endTransaction();
                    throw th5;
                }
        }
    }

    @Override
    public v apply(Object obj) {
        int i10 = this.A;
        int i11 = 7;
        Object obj2 = this.B;
        Object obj3 = this.C;
        Object obj4 = this.D;
        switch (i10) {
            case 6:
                s1 s1Var = (s1) obj4;
                Handler handler = s1Var.l;
                ji.a aVar = new ji.a(s1Var, (a2) obj3, new ab.e(s1Var, (b3) obj2, (b2) obj, 17));
                d4 d4Var = new d4(0);
                String str = i0.f5136a;
                b0 b0Var = new b0();
                i0.M(handler, new ab.e(b0Var, aVar, d4Var, i11));
                return b0Var;
            default:
                s1 s1Var2 = (s1) obj4;
                a2 a2Var = (a2) obj3;
                Handler handler2 = s1Var2.l;
                ji.a aVar2 = new ji.a(s1Var2, a2Var, new k((Object) s1Var2, obj2, (Object) a2Var, (List) obj, 13));
                d4 d4Var2 = new d4(0);
                String str2 = i0.f5136a;
                b0 b0Var2 = new b0();
                i0.M(handler2, new ab.e(b0Var2, aVar2, d4Var2, i11));
                return b0Var2;
        }
    }

    @Override
    public d2 b(int i10, l2 l2Var, int[] iArr) {
        v7.j jVar = (v7.j) this.D;
        String str = (String) this.C;
        String str2 = (String) this.B;
        q0 q0VarM = t0.m();
        for (int i11 = 0; i11 < l2Var.f1338a; i11++) {
            q0VarM.c(new v7.l(i10, l2Var, i11, jVar, iArr[i11], str, str2));
        }
        return q0VarM.g();
    }

    @Override
    public Object h(d4.h hVar) {
        switch (this.A) {
            case 16:
                k00.i iVar = (k00.i) this.D;
                a0 a0Var = (a0) this.C;
                m00.i iVar2 = (m00.i) this.B;
                m9.f fVar = new m9.f(iVar.get(a40.w.B), 24);
                za.j jVar = za.j.A;
                d4.m mVar = hVar.f4611c;
                if (mVar != null) {
                    mVar.a(fVar, jVar);
                }
                return c0.y(c0.c(iVar), (k00.i) null, a0Var, new pz.k(iVar2, hVar, (k00.c) null), 1);
            default:
                Executor executor = (Executor) this.D;
                String str = (String) this.C;
                u00.a aVar = (u00.a) this.B;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                za.o oVar = new za.o(atomicBoolean, 0);
                za.j jVar2 = za.j.A;
                d4.m mVar2 = hVar.f4611c;
                if (mVar2 != null) {
                    mVar2.a(oVar, jVar2);
                }
                executor.execute(new za.p(atomicBoolean, hVar, aVar, 0));
                return str;
        }
    }

    @Override
    public Object i() {
        b bVar = (b) this.D;
        xd.i iVar = (xd.i) this.C;
        xd.h hVar = (xd.h) this.B;
        ee.h hVar2 = (ee.h) bVar.f3146d;
        hVar2.getClass();
        ud.d dVar = iVar.f16549c;
        String str = hVar.f16537a;
        String str2 = iVar.f16547a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.l(new a(hVar2, (Object) hVar, iVar, 1))).getClass();
        bVar.f3143a.x(iVar, 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        ((d1) obj).U(((t3) ((y1) this.D).f14132a).f9497c.f9253a, ((t3) ((y1) this.C).f14132a).f9497c.f9253a, ((Integer) this.B).intValue());
    }

    @Override
    public Task k(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.D;
        String str = (String) this.C;
        r rVar = (r) this.B;
        String str2 = (String) obj;
        bd.d dVarC = FirebaseMessaging.c(firebaseMessaging.f4355b);
        bi.g gVar = firebaseMessaging.f4354a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f2532b) ? RuntimeVersion.SUFFIX : gVar.d();
        String strB = firebaseMessaging.f4361h.b();
        synchronized (dVarC) {
            String strA = r.a(str2, System.currentTimeMillis(), strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = dVarC.f2493a.edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.f12102a)) {
            bi.g gVar2 = firebaseMessaging.f4354a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f2532b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f2532b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new oj.h(firebaseMessaging.f4355b).b(intent);
            }
        }
        return Tasks.d(str2);
    }

    @Override
    public void onSuccess(Object obj) {
        p10.a aVar = (p10.a) this.D;
        Task task = (Task) this.C;
        li.b bVar = (li.b) this.B;
        try {
            sj.e eVar = (sj.e) task.k();
            if (eVar != null) {
                ((Executor) aVar.C).execute(new tj.a(bVar, ((e0) aVar.B).l(eVar), 0));
            }
        } catch (FirebaseRemoteConfigException e3) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e3);
        }
    }
}
