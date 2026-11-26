package de;

import a30.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ee.h;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xd.i;

public final class f implements fe.a, ji.g {
    public final int A;
    public final long B;
    public final Object C;
    public final Object D;
    public final Object E;

    public f(k kVar, Iterable iterable, i iVar, long j9) {
        this.A = 0;
        this.C = kVar;
        this.D = iterable;
        this.E = iVar;
        this.B = j9;
    }

    public f(ji.f fVar, Object obj, long j9, TimeUnit timeUnit, int i10) {
        this.A = i10;
        this.C = fVar;
        this.D = obj;
        this.B = j9;
        this.E = timeUnit;
    }

    @Override
    public ScheduledFuture a(gi.c cVar) {
        switch (this.A) {
            case 1:
                ji.f fVar = (ji.f) this.C;
                Runnable runnable = (Runnable) this.D;
                return fVar.B.schedule(new ji.e(fVar, runnable, cVar, 1), this.B, (TimeUnit) this.E);
            default:
                ji.f fVar2 = (ji.f) this.C;
                Callable callable = (Callable) this.D;
                return fVar2.B.schedule(new ab.d(fVar2, callable, cVar, 2), this.B, (TimeUnit) this.E);
        }
    }

    @Override
    public Object i() {
        k kVar = (k) this.C;
        Iterable iterable = (Iterable) this.D;
        i iVar = (i) this.E;
        h hVar = (h) ((ee.d) kVar.c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + h.A(iterable);
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.v(cursorRawQuery.getInt(0), ae.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th3) {
                sQLiteDatabaseA.endTransaction();
                throw th3;
            }
        }
        hVar.l(new ee.e(((ge.a) kVar.g).h() + this.B, iVar));
        return null;
    }
}
