package d6;

import android.content.Context;
import androidx.datastore.core.DataStoreFactory;
import java.io.File;

public final class r1 implements m6.g {

    public static final r1 f4693a = new r1();

    @Override
    public final File a(Context context, String str) {
        return a10.h0.r(context, str);
    }

    @Override
    public final Object b(Context context, String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, f6.z.A, null, null, null, new q1(0, context, str), 14, null);
    }
}
