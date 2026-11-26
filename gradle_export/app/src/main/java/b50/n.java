package b50;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z2;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import tf.h1;
import tf.p3;
import tf.q0;
import tf.r;
import tf.s;
import tf.t0;
import tf.y3;

public final class n {
    public final int a = 1;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public n(long j, Bundle bundle, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }

    public n(a50.e taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        this.b = timeUnit.toNanos(5L);
        this.c = taskRunner.e();
        this.d = new a50.b(this, x5.n(new StringBuilder(), y40.b.g, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
    }

    public static n c(s sVar) {
        String str = sVar.A;
        String str2 = sVar.C;
        return new n(sVar.D, sVar.B.e(), str, str2);
    }

    public boolean a(x40.a aVar, j jVar, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            m connection = (m) it.next();
            kotlin.jvm.internal.m.d(connection, "connection");
            synchronized (connection) {
                if (z) {
                    try {
                        if (!(connection.g != null)) {
                            continue;
                        } else if (connection.h(aVar, arrayList)) {
                            jVar.b(connection);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.h(aVar, arrayList)) {
                    jVar.b(connection);
                    return true;
                }
            }
        }
    }

    public int b(m mVar, long j) {
        byte[] bArr = y40.b.a;
        ArrayList arrayList = mVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String message = "A connection to " + mVar.b.a.h + " was leaked. Did you forget to close a response body?";
                f50.m mVar2 = f50.m.a;
                f50.m mVar3 = f50.m.a;
                Object obj = ((h) reference).a;
                mVar3.getClass();
                kotlin.jvm.internal.m.e(message, "message");
                if (obj == null) {
                    message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                }
                f50.m.g(message, 5, (Throwable) obj);
                arrayList.remove(i);
                mVar.j = true;
                if (arrayList.isEmpty()) {
                    mVar.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public a3 d(a3 a3Var, String str) throws Throwable {
        Cursor cursor;
        a3 a3Var2;
        long j;
        Cursor cursorRawQuery;
        a3 a3VarCreate;
        Object obj;
        String strS = a3Var.s();
        List listP = a3Var.p();
        tf.c cVar = (tf.c) this.e;
        y3 y3Var = ((p3) cVar).C;
        y3 y3Var2 = ((p3) cVar).C;
        h1 h1Var = (h1) ((f5.c) cVar).B;
        y3Var.h0();
        d3 d3VarD1 = t0.d1(a3Var, "_eid");
        Long l = (Long) (d3VarD1 == null ? null : t0.k1(d3VarD1));
        if (l != null) {
            if (strS.equals("_ep")) {
                y3Var.h0();
                d3 d3VarD2 = t0.d1(a3Var, "_en");
                String str2 = (String) (d3VarD2 == null ? null : t0.k1(d3VarD2));
                if (TextUtils.isEmpty(str2)) {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.H.c(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((a3) this.c) == null || ((Long) this.d) == null || l.longValue() != ((Long) this.d).longValue()) {
                    tf.m mVar = y3Var.C;
                    y3.R(mVar);
                    h1 h1Var2 = (h1) ((f5.c) mVar).B;
                    mVar.V0();
                    mVar.W0();
                    try {
                        cursorRawQuery = mVar.K1().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    a3Var2 = null;
                                    try {
                                        try {
                                            a3VarCreate = Pair.create(t0.I1(a3.z(), cursorRawQuery.getBlob(0)).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            q0 q0Var2 = h1Var2.F;
                                            h1.g(q0Var2);
                                            q0Var2.G.c(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            a3VarCreate = a3Var2;
                                        }
                                    } catch (IOException e2) {
                                        q0 q0Var3 = h1Var2.F;
                                        h1.g(q0Var3);
                                        j = 0;
                                        try {
                                            q0Var3.G.e("Failed to merge main event. appId, eventId", q0.d1(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            q0 q0Var4 = h1Var2.F;
                                            h1.g(q0Var4);
                                            q0Var4.G.c(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            a3VarCreate = a3Var2;
                                            if (a3VarCreate != null) {
                                            }
                                            q0 q0Var5 = h1Var.F;
                                            h1.g(q0Var5);
                                            q0Var5.H.d("Extra parameter without existing main event. eventName, eventId", str2, l);
                                            return a3Var2;
                                        }
                                        cursorRawQuery.close();
                                        a3VarCreate = a3Var2;
                                    }
                                } else {
                                    q0 q0Var6 = h1Var2.F;
                                    h1.g(q0Var6);
                                    q0Var6.O.b("Main event not found");
                                    cursorRawQuery.close();
                                    a3VarCreate = null;
                                    a3Var2 = null;
                                }
                                j = 0;
                            } catch (SQLiteException e4) {
                                e = e4;
                                a3Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        a3Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (a3VarCreate != null || (obj = ((Pair) a3VarCreate).first) == null) {
                        q0 q0Var7 = h1Var.F;
                        h1.g(q0Var7);
                        q0Var7.H.d("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return a3Var2;
                    }
                    this.c = (a3) obj;
                    this.b = ((Long) ((Pair) a3VarCreate).second).longValue();
                    y3Var2.h0();
                    this.d = (Long) t0.e1((a3) this.c, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.b - 1;
                this.b = j2;
                if (j2 <= j) {
                    tf.m mVar2 = y3Var2.C;
                    y3.R(mVar2);
                    h1 h1Var3 = (h1) ((f5.c) mVar2).B;
                    mVar2.V0();
                    q0 q0Var8 = h1Var3.F;
                    h1.g(q0Var8);
                    q0Var8.O.c(str, "Clearing complex main event info. appId");
                    try {
                        mVar2.K1().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        q0 q0Var9 = h1Var3.F;
                        h1.g(q0Var9);
                        q0Var9.G.c(e6, "Error clearing complex main event");
                    }
                } else {
                    tf.m mVar3 = y3Var2.C;
                    y3.R(mVar3);
                    mVar3.m1(str, l, this.b, (a3) this.c);
                }
                ArrayList arrayList = new ArrayList();
                for (d3 d3Var : ((a3) this.c).p()) {
                    y3Var2.h0();
                    if (t0.d1(a3Var, d3Var.q()) == null) {
                        arrayList.add(d3Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    q0 q0Var10 = h1Var.F;
                    h1.g(q0Var10);
                    q0Var10.H.c(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listP);
                    listP = arrayList;
                }
                strS = str2;
            } else {
                this.d = l;
                this.c = a3Var;
                y3Var.h0();
                d3 d3VarD3 = t0.d1(a3Var, "_epc");
                Serializable serializableK1 = d3VarD3 == null ? null : t0.k1(d3VarD3);
                long jLongValue = ((Long) (serializableK1 != null ? serializableK1 : 0L)).longValue();
                this.b = jLongValue;
                if (jLongValue <= 0) {
                    q0 q0Var11 = h1Var.F;
                    h1.g(q0Var11);
                    q0Var11.H.c(strS, "Complex event with zero extra param count. eventName");
                } else {
                    tf.m mVar4 = y3Var.C;
                    y3.R(mVar4);
                    mVar4.m1(str, l, this.b, a3Var);
                }
            }
        }
        z2 z2VarI = a3Var.i();
        z2VarI.b();
        ((d5) z2VarI).B.F(strS);
        z2VarI.b();
        ((d5) z2VarI).B.D();
        z2VarI.b();
        ((d5) z2VarI).B.C(listP);
        return z2VarI.e();
    }

    public s e() {
        return new s((String) this.c, new r(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.d;
                String string = ((Bundle) this.e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                a1.b.z(sb, "origin=", str, ",name=", str2);
                return x5.n(sb, ",params=", string);
            default:
                return super.toString();
        }
    }
}
