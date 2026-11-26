package ee;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public final class h implements d, fe.b, c {
    public static final ud.c F = new ud.c("proto");
    public final j A;
    public final ge.a B;
    public final ge.a C;
    public final a D;
    public final f00.a E;

    public h(ge.a aVar, ge.a aVar2, a aVar3, j jVar, f00.a aVar4) {
        this.A = jVar;
        this.B = aVar;
        this.C = aVar2;
        this.D = aVar3;
        this.E = aVar4;
    }

    public static String A(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f5363a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object F(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, xd.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f16547a, String.valueOf(he.a.a(iVar.f16549c))));
        byte[] bArr = iVar.f16548b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.A;
        Objects.requireNonNull(jVar);
        ge.a aVar = this.C;
        long jH = aVar.h();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (aVar.h() >= ((long) this.D.f5360c) + jH) {
                    throw new SynchronizationException("Timed out while trying to open db.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override
    public final void close() {
        this.A.close();
    }

    public final Object l(f fVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList r(SQLiteDatabase sQLiteDatabase, xd.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lI = i(sQLiteDatabase, iVar);
        if (lI == null) {
            return arrayList;
        }
        F(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lI.toString()}, null, null, null, String.valueOf(i10)), new ce.a(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void v(long j9, ae.c cVar, String str) {
        l(new de.g(str, cVar, j9));
    }

    public final Object x(fe.a aVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        ge.a aVar2 = this.C;
        long jH = aVar2.h();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objI = aVar.i();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objI;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e3) {
                if (aVar2.h() >= ((long) this.D.f5360c) + jH) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
