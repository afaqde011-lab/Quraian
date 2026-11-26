package js;

import a40.z;
import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import g00.b0;
import hx.t;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.m;
import ri.t1;
import ta.c0;
import u00.n;

public final class g extends m00.i implements n {
    public final int A;
    public final h B;

    public g(h hVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = hVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.B, cVar, 0);
            case 1:
                return new g(this.B, cVar, 1);
            default:
                return new g(this.B, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((g) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException {
        int i = this.A;
        h hVar = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                SharedPreferences.Editor editorEdit = hVar.b.edit();
                editorEdit.remove("listening_import");
                editorEdit.apply();
                return Boolean.valueOf(hVar.a().delete());
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                FileInputStream fileInputStream = new FileInputStream(hVar.a());
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            fileInputStream.close();
                            byte[] bArrDigest = messageDigest.digest();
                            m.d(bArrDigest, "digest(...)");
                            return h00.n.L0(bArrDigest, "", new t(17), 30);
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0.C(fileInputStream, th);
                        throw th2;
                    }
                }
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                File fileA = hVar.a();
                if (!fileA.exists()) {
                    fileA = null;
                }
                if (fileA == null) {
                    return null;
                }
                try {
                    ik.a aVar4 = new ik.a(new InputStreamReader(new GZIPInputStream(new BufferedInputStream(new FileInputStream(fileA), 65536)), r30.a.a));
                    try {
                        bk.m mVar = hVar.c;
                        mVar.getClass();
                        hs.j jVar = (hs.j) mVar.b(aVar4, TypeToken.get(hs.j.class));
                        aVar4.close();
                        return jVar;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            c0.C(aVar4, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}
