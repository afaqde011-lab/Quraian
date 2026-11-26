package vz;

import a40.m0;
import android.content.Context;
import g00.n;
import h40.d;
import h40.e;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import ri.t1;
import ta.c0;
import x40.b0;
import x40.d0;
import x40.w;

public final class c {
    public final Context a;
    public final w b;

    public c(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
    }

    public static final void a(c cVar, String str, File file) {
        if (!file.exists() || file.length() <= 0) {
            ce.c cVar2 = new ce.c(18);
            cVar2.H(str);
            b0 b0VarF = cVar.b.a(cVar2.r()).f();
            try {
                if (!b0VarF.i()) {
                    throw new IllegalStateException(("Download failed: " + b0VarF.D).toString());
                }
                d0 d0Var = b0VarF.G;
                if (d0Var == null) {
                    throw new IllegalStateException("Empty body");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    w50.c.w(d0Var.v().l0(), fileOutputStream, 8192);
                    fileOutputStream.close();
                    b0VarF.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0.C(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c0.C(b0VarF, th3);
                    throw th4;
                }
            }
        }
    }

    public static final File b(c cVar, String str) {
        File file = new File(cVar.a.getFilesDir(), "Downloads/SoundEffectIcons");
        file.mkdirs();
        return new File(file, str + "..png");
    }

    public final Object c(String str, String str2, String str3, String str4, zz.b bVar, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.C = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        if (i2 == 0) {
            t1.O(objJ);
            e eVar = m0.a;
            d dVar = d.C;
            b bVar2 = new b(str2, str3, str4, this, str, bVar, null);
            aVar.C = 1;
            objJ = a40.c0.J(bVar2, dVar, aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        return ((n) objJ).A;
    }

    public final File d(String str) {
        File file = new File(this.a.getFilesDir(), "Downloads/SoundEffects");
        file.mkdirs();
        return new File(file, str + ".mp3");
    }

    public final File e(String str, zz.b bVar) {
        File file;
        int iOrdinal = bVar.ordinal();
        Context context = this.a;
        if (iOrdinal == 0) {
            file = new File(context.getFilesDir(), "Downloads/SoundEffectVideos4k");
            file.mkdirs();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            file = new File(context.getFilesDir(), "Downloads/SoundEffectVideos");
            file.mkdirs();
        }
        return new File(file, w.c.j(str, ".mp4"));
    }

    public final String f(String soundId, String str) {
        m.e(soundId, "soundId");
        File fileD = d(soundId);
        if (!fileD.exists()) {
            return str == null ? "" : str;
        }
        String string = fileD.toURI().toString();
        m.d(string, "toString(...)");
        return string;
    }
}
