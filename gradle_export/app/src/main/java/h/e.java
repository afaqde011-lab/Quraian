package h;

import a40.c0;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.glance.session.SessionWorker;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import g00.b0;
import h0.p1;
import i2.v0;
import iv.n;
import j1.r;
import java.lang.reflect.Method;
import kotlin.KotlinNothingValueException;
import l1.l;
import l1.q;
import l1.q2;
import po.m;
import q0.j0;
import q40.s;
import q40.v;
import q40.z;

public final class e implements u00.a {
    public final int A;

    public e(int i10) {
        this.A = i10;
    }

    public e(SessionWorker sessionWorker) {
        this.A = 13;
    }

    public final Object invoke() throws KotlinNothingValueException {
        Class<?> returnType;
        int i10 = this.A;
        b0 b0Var = b0.a;
        Object obj = null;
        switch (i10) {
            case 0:
                return Integer.valueOf(x00.d.B.g(2147418112) + Cast.MAX_MESSAGE_LENGTH);
            case 1:
                float f3 = n.a;
                return b0Var;
            case 2:
                return new r(new x.b(Float.valueOf(0.0f), x.c.f16258k, obj, 12));
            case 3:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 4:
                return mk.a.f10927e;
            case 5:
                return nk.f.f11375f;
            case 6:
                return 4;
            case 7:
                return q.z(RuntimeVersion.SUFFIX);
            case 8:
                return TopRecitersLauncher.a();
            case 9:
                return q.z(RuntimeVersion.SUFFIX);
            case 10:
                l.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 11:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 12:
                return Long.valueOf(System.nanoTime());
            case 13:
                return c0.d();
            case 14:
                y50.a aVar = lt.b.a;
                return null;
            case 15:
                float f10 = np.a.a;
                return b0Var;
            case 16:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 17:
                try {
                    Method method = (Method) oa.b.D.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case TYPE_SINT64_VALUE:
                throw new IllegalStateException("TopSnackbarHostState is not provided");
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                p1 p1Var = m.a;
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new v0(i2.b0.c(1308617531));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                q2 q2Var = j0.f12636a;
                return null;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new y3.j(0L);
            case 23:
                return new y3.j(0L);
            case 24:
                return q40.c0.b;
            case 25:
                return v.b;
            case RuntimeVersion.MINOR:
                return s.b;
            case 27:
                return z.b;
            case 28:
                return q40.g.b;
            default:
                throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext");
        }
    }
}
