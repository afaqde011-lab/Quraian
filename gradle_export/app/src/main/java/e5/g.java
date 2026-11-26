package e5;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.z2;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;
import tf.h1;
import tf.k;
import tf.q0;
import tf.t0;

public final class g {

    public final Object f5097a;

    public long f5098b;

    public final Object f5099c;

    public g() {
        w2.b bVar = w2.b.A;
        this.f5099c = new w2.c();
        this.f5097a = new w2.c();
    }

    public g(Parcel parcel) {
        m.e(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.f5099c = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        m.b(string);
        this.f5097a = string;
        this.f5098b = parcel.readLong();
    }

    public g(tf.m mVar, String str) {
        this.f5099c = mVar;
        d0.e(str);
        this.f5097a = str;
        this.f5098b = -1L;
    }

    public g(tf.m mVar, String str, long j9) {
        this.f5099c = mVar;
        d0.e(str);
        this.f5097a = str;
        this.f5098b = mVar.G1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j9)}, -1L);
    }

    public void a(long j9, long j10) {
        ((w2.c) this.f5099c).a(Float.intBitsToFloat((int) (j10 >> 32)), j9);
        ((w2.c) this.f5097a).a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j9);
    }

    public List b() {
        List list;
        tf.m mVar = (tf.m) this.f5099c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f5097a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.K1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f5098b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j9 = cursorQuery.getLong(0);
                        long j10 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j9 > this.f5098b) {
                            this.f5098b = j9;
                        }
                        try {
                            z2 z2Var = (z2) t0.I1(a3.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = RuntimeVersion.SUFFIX;
                            }
                            z2Var.b();
                            ((a3) z2Var.B).F(string);
                            long j11 = cursorQuery.getLong(2);
                            z2Var.b();
                            ((a3) z2Var.B).G(j11);
                            arrayList.add(new k(j9, j10, z10, (a3) z2Var.e()));
                        } catch (IOException e3) {
                            q0 q0Var = ((h1) mVar.B).F;
                            h1.g(q0Var);
                            q0Var.G.d("Data loss. Failed to merge raw event. appId", q0.d1(str), e3);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                q0 q0Var2 = ((h1) mVar.B).F;
                h1.g(q0Var2);
                q0Var2.G.d("Data loss. Error querying raw events batch. appId", q0.d1(str), e10);
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }
}
