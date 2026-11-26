package v4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class d implements Callable {

    public final int f15441a;

    public final String f15442b;

    public final Context f15443c;

    public final int f15444d;

    public final Object f15445e;

    public d(String str, Context context, Object obj, int i10, int i11) {
        this.f15441a = i11;
        this.f15442b = str;
        this.f15443c = context;
        this.f15445e = obj;
        this.f15444d = i10;
    }

    @Override
    public final Object call() {
        switch (this.f15441a) {
            case 0:
                return f.b(this.f15442b, this.f15443c, List.of((c) this.f15445e), this.f15444d);
            default:
                try {
                    return f.b(this.f15442b, this.f15443c, (ArrayList) this.f15445e, this.f15444d);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
