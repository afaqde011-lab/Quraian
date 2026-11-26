package de;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.q0;
import com.google.android.gms.tasks.Task;
import ee.h;
import java.util.HashMap;
import k9.m;
import k9.p0;
import k9.t0;
import oi.k;
import ri.k1;
import xd.i;

public final class g implements fe.a, ee.f, p0, ij.a, xf.a {
    public final long A;
    public final Object B;
    public final Object C;

    public g(Object obj, long j9, Object obj2) {
        this.B = obj;
        this.A = j9;
        this.C = obj2;
    }

    public g(Object obj, Object obj2, long j9) {
        this.B = obj;
        this.C = obj2;
        this.A = j9;
    }

    @Override
    public Object M(Task task) {
        return ((sj.g) this.B).b(task, this.A, (HashMap) this.C);
    }

    @Override
    public Object apply(Object obj) {
        String str = (String) this.B;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((ae.c) this.C).A;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j9 = this.A;
            if (z10) {
                sQLiteDatabase.execSQL(k.i("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j9, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j9));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(m mVar, int i10) {
        mVar.n(((t0) this.B).f9440c, i10, ((q0) this.C).c(true), this.A);
    }

    @Override
    public Object i() {
        a30.k kVar = (a30.k) this.B;
        i iVar = (i) this.C;
        ee.d dVar = (ee.d) kVar.c;
        long jH = ((ge.a) kVar.g).h() + this.A;
        h hVar = (h) dVar;
        hVar.getClass();
        hVar.l(new ee.e(jH, iVar));
        return null;
    }

    @Override
    public void j(ij.b bVar) {
        ((li.a) bVar.get()).d((String) this.B, this.A, (k1) this.C);
    }
}
