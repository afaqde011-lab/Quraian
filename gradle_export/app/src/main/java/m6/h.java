package m6;

import a40.c0;
import a40.m0;
import a40.w1;
import a40.z;
import android.content.Context;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b6.n;
import d6.q1;
import h00.x;
import java.io.File;
import java.util.List;

public final class h implements g {

    public static final h f10569a = new h();

    @Override
    public final File a(Context context, String str) {
        return k00.f.O(context, str);
    }

    @Override
    public final Object b(Context context, String str) {
        q1 q1Var = new q1(1, context, str);
        h40.e eVar = m0.a;
        h40.d dVar = h40.d.C;
        w1 w1VarE = c0.e();
        dVar.getClass();
        z zVarC = c0.c(rd.a.P(dVar, w1VarE));
        return new t5.c(new t5.c(DataStoreFactory.INSTANCE.create((Storage) new FileStorage(t5.g.A, null, new n(4, q1Var), 2, null), (ReplaceFileCorruptionHandler) null, (List) x.A, zVarC)));
    }
}
