package gd;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import oi.g;

public final class d {

    public final int f6313a;

    public String f6314b;

    public String f6315c;

    public d(h7.b bVar) {
        this.f6313a = 2;
        Context context = (Context) bVar.A;
        int iD = g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f6314b = "Unity";
            String string = context.getResources().getString(iD);
            this.f6315c = string;
            String strO = a1.b.o("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strO, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f6314b = "Flutter";
                this.f6315c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f6314b = null;
        this.f6315c = null;
    }

    public d(String str, String str2, int i10) {
        this.f6313a = i10;
        this.f6314b = str;
        this.f6315c = str2;
    }

    public boolean equals(Object obj) {
        switch (this.f6313a) {
            case 1:
                if (!(obj instanceof y4.b)) {
                    return false;
                }
                y4.b bVar = (y4.b) obj;
                Object obj2 = bVar.f16603a;
                String str = this.f6314b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = bVar.f16604b;
                String str2 = this.f6315c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f6313a) {
            case 1:
                String str = this.f6314b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f6315c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f6313a) {
            case 1:
                return "Pair{" + ((Object) this.f6314b) + " " + ((Object) this.f6315c) + "}";
            case 2:
            default:
                return super.toString();
            case 3:
                return this.f6314b + ", " + this.f6315c;
        }
    }
}
