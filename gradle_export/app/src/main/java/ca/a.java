package ca;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class a {

    public final Context f3015a;

    public final String f3016b;

    public final na.b f3017c;

    public final me.i f3018d;

    public final List f3019e;

    public final boolean f3020f;

    public final s f3021g;

    public final Executor f3022h;

    public final Executor f3023i;

    public final Intent f3024j;

    public final boolean f3025k;
    public final boolean l;
    public final Set m;

    public final String f3026n;

    public final File f3027o;

    public final Callable f3028p;

    public final List f3029q;

    public final List f3030r;

    public final boolean f3031s;

    public final ma.b f3032t;

    public final k00.i f3033u;

    public boolean f3034v;

    public a(Context context, String str, na.b bVar, me.i iVar, List list, boolean z10, s sVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z13, ma.b bVar2, k00.i iVar2) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(iVar, "migrationContainer");
        kotlin.jvm.internal.m.e(executor, "queryExecutor");
        kotlin.jvm.internal.m.e(executor2, "transactionExecutor");
        kotlin.jvm.internal.m.e(list2, "typeConverters");
        kotlin.jvm.internal.m.e(list3, "autoMigrationSpecs");
        this.f3015a = context;
        this.f3016b = str;
        this.f3017c = bVar;
        this.f3018d = iVar;
        this.f3019e = list;
        this.f3020f = z10;
        this.f3021g = sVar;
        this.f3022h = executor;
        this.f3023i = executor2;
        this.f3024j = intent;
        this.f3025k = z11;
        this.l = z12;
        this.m = set;
        this.f3026n = str2;
        this.f3027o = file;
        this.f3028p = callable;
        this.f3029q = list2;
        this.f3030r = list3;
        this.f3031s = z13;
        this.f3032t = bVar2;
        this.f3033u = iVar2;
        this.f3034v = true;
    }
}
