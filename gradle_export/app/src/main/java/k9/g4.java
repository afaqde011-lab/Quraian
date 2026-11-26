package k9;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

public final class g4 implements e4 {

    public static final String f9311k;
    public static final String l;
    public static final String m;

    public static final String f9312n;

    public static final String f9313o;

    public static final String f9314p;

    public static final String f9315q;

    public static final String f9316r;

    public static final String f9317s;

    public static final String f9318t;

    public final int f9319a;

    public final int f9320b;

    public final int f9321c;

    public final int f9322d;

    public final String f9323e;

    public final String f9324f;

    public final ComponentName f9325g;

    public final IBinder f9326h;

    public final Bundle f9327i;

    public final MediaSession.Token f9328j;

    static {
        String str = e7.i0.f5136a;
        f9311k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        f9312n = Integer.toString(3, 36);
        f9313o = Integer.toString(4, 36);
        f9314p = Integer.toString(5, 36);
        f9315q = Integer.toString(6, 36);
        f9316r = Integer.toString(7, 36);
        f9317s = Integer.toString(8, 36);
        f9318t = Integer.toString(9, 36);
    }

    public g4(int i10, int i11, int i12, int i13, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.f9319a = i10;
        this.f9320b = i11;
        this.f9321c = i12;
        this.f9322d = i13;
        this.f9323e = str;
        this.f9324f = str2;
        this.f9325g = componentName;
        this.f9326h = iBinder;
        this.f9327i = bundle;
        this.f9328j = token;
    }

    @Override
    public final int a() {
        return this.f9319a;
    }

    @Override
    public final ComponentName b() {
        return this.f9325g;
    }

    @Override
    public final Object c() {
        return this.f9326h;
    }

    @Override
    public final String d() {
        return this.f9324f;
    }

    @Override
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.f9319a == g4Var.f9319a && this.f9320b == g4Var.f9320b && this.f9321c == g4Var.f9321c && this.f9322d == g4Var.f9322d && TextUtils.equals(this.f9323e, g4Var.f9323e) && TextUtils.equals(this.f9324f, g4Var.f9324f) && Objects.equals(this.f9325g, g4Var.f9325g) && Objects.equals(this.f9326h, g4Var.f9326h) && Objects.equals(this.f9328j, g4Var.f9328j);
    }

    @Override
    public final int f() {
        return this.f9322d;
    }

    @Override
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9311k, this.f9319a);
        bundle.putInt(l, this.f9320b);
        bundle.putInt(m, this.f9321c);
        bundle.putString(f9312n, this.f9323e);
        bundle.putString(f9313o, this.f9324f);
        bundle.putBinder(f9315q, this.f9326h);
        bundle.putParcelable(f9314p, this.f9325g);
        bundle.putBundle(f9316r, this.f9327i);
        bundle.putInt(f9317s, this.f9322d);
        MediaSession.Token token = this.f9328j;
        if (token != null) {
            bundle.putParcelable(f9318t, token);
        }
        return bundle;
    }

    @Override
    public final Bundle getExtras() {
        return new Bundle(this.f9327i);
    }

    @Override
    public final int getType() {
        return this.f9320b;
    }

    @Override
    public final MediaSession.Token h() {
        return this.f9328j;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9319a), Integer.valueOf(this.f9320b), Integer.valueOf(this.f9321c), Integer.valueOf(this.f9322d), this.f9323e, this.f9324f, this.f9325g, this.f9326h, this.f9328j);
    }

    @Override
    public final String j() {
        return this.f9323e;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f9323e + " type=" + this.f9320b + " libraryVersion=" + this.f9321c + " interfaceVersion=" + this.f9322d + " service=" + this.f9324f + " IMediaSession=" + this.f9326h + " extras=" + this.f9327i + "}";
    }
}
