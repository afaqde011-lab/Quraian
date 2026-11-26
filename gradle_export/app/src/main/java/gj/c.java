package gj;

import a1.e1;
import android.util.Base64OutputStream;
import az.k;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements Callable {

    public final int f6346a;

    public final d f6347b;

    public c(d dVar, int i10) {
        this.f6346a = i10;
        this.f6347b = dVar;
    }

    @Override
    public final Object call() {
        String string;
        switch (this.f6346a) {
            case 0:
                d dVar = this.f6347b;
                synchronized (dVar) {
                    try {
                        i iVar = (i) dVar.f6348a.get();
                        ArrayList arrayListA = iVar.a();
                        synchronized (iVar) {
                            iVar.f6356a.a(new e1(iVar, 22));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                            a aVar = (a) arrayListA.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f6344a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f6345b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
            default:
                d dVar2 = this.f6347b;
                synchronized (dVar2) {
                    i iVar2 = (i) dVar2.f6348a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((qj.b) dVar2.f6350c.get()).a();
                    synchronized (iVar2) {
                        iVar2.f6356a.a(new k(iVar2, iVar2.b(jCurrentTimeMillis), strA, va.a.i0(strA), 3));
                    }
                }
                return null;
        }
    }
}
