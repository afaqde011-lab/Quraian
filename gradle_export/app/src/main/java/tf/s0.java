package tf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

public final class s0 implements Runnable {
    public final int A = 1;
    public final URL B;
    public final byte[] C;
    public final String D;
    public final Map E;
    public final Object F;
    public final f5.c G;

    public s0(m2 m2Var, String str, URL url, byte[] bArr, HashMap map, k2 k2Var) {
        Objects.requireNonNull(m2Var);
        this.G = m2Var;
        com.google.android.gms.common.internal.d0.e(str);
        this.B = url;
        this.C = bArr;
        this.F = k2Var;
        this.D = str;
        this.E = map;
    }

    public s0(t0 t0Var, String str, URL url, byte[] bArr, Map map, r0 r0Var) {
        Objects.requireNonNull(t0Var);
        this.G = t0Var;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.h(url);
        this.B = url;
        this.C = bArr;
        this.F = r0Var;
        this.D = str;
        this.E = map;
    }

    public void a(int i10, IOException iOException, byte[] bArr, Map map) {
        e1 e1Var = ((h1) ((m2) this.G).B).G;
        h1.g(e1Var);
        e1Var.e1(new l2(this, i10, iOException, bArr, map));
    }

    @Override
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        Throwable th3;
        OutputStream outputStream6;
        IOException iOException2;
        ?? r10;
        OutputStream outputStream7;
        ?? r11;
        OutputStream outputStream8;
        InputStream inputStream2;
        boolean zHasNext;
        switch (this.A) {
            case 0:
                String str = this.D;
                t0 t0Var = (t0) this.G;
                h1 h1Var = (h1) t0Var.B;
                h1 h1Var2 = (h1) t0Var.B;
                e1 e1Var = h1Var.G;
                h1.g(e1Var);
                e1Var.Z0();
                int i10 = 0;
                OutputStream outputStream9 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = this.B.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    h1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map5 = this.E;
                        if (map5 != null) {
                            for (Map.Entry entry : map5.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.C;
                        if (bArr != null) {
                            t0 t0Var2 = t0Var.C.G;
                            y3.R(t0Var2);
                            byte[] bArrH1 = t0Var2.H1(bArr);
                            q0 q0Var = h1Var2.F;
                            h1.g(q0Var);
                            b50.b bVar = q0Var.O;
                            int length = bArrH1.length;
                            bVar.c(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream10 = httpURLConnection.getOutputStream();
                            try {
                                outputStream10.write(bArrH1);
                                outputStream10.close();
                            } catch (IOException e3) {
                                iOException = e3;
                                responseCode = 0;
                                map2 = null;
                                outputStream9 = outputStream10;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e10) {
                                        q0 q0Var2 = h1Var2.F;
                                        h1.g(q0Var2);
                                        q0Var2.G.d("Error closing HTTP compressed POST connection output stream. appId", q0.d1(str), e10);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                r0 r0Var = (r0) this.F;
                                e1 e1Var2 = h1Var2.G;
                                h1.g(e1Var2);
                                e1Var2.e1(new o0(this.D, r0Var, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                map = null;
                                outputStream9 = outputStream10;
                                th2 = th;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e11) {
                                        q0 q0Var3 = h1Var2.F;
                                        h1.g(q0Var3);
                                        q0Var3.G.d("Error closing HTTP compressed POST connection output stream. appId", q0.d1(str), e11);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                r0 r0Var2 = (r0) this.F;
                                e1 e1Var3 = h1Var2.G;
                                h1.g(e1Var3);
                                e1Var3.e1(new o0(this.D, r0Var2, i10, (IOException) null, (byte[]) null, map));
                                throw th2;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i11 = inputStream.read(bArr2);
                                            if (i11 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                r0 r0Var3 = (r0) this.F;
                                                e1 e1Var4 = h1Var2.G;
                                                h1.g(e1Var4);
                                                e1Var4.e1(new o0(this.D, r0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i11);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    inputStream = null;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                map2 = map4;
                                iOException = e;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                r0 r0Var4 = (r0) this.F;
                                e1 e1Var5 = h1Var2.G;
                                h1.g(e1Var5);
                                e1Var5.e1(new o0(this.D, r0Var4, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th7) {
                                th2 = th7;
                                i10 = responseCode;
                                map = map3;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                r0 r0Var5 = (r0) this.F;
                                e1 e1Var6 = h1Var2.G;
                                h1.g(e1Var6);
                                e1Var6.e1(new o0(this.D, r0Var5, i10, (IOException) null, (byte[]) null, map));
                                throw th2;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            map2 = null;
                            iOException = e;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            r0 r0Var6 = (r0) this.F;
                            e1 e1Var7 = h1Var2.G;
                            h1.g(e1Var7);
                            e1Var7.e1(new o0(this.D, r0Var6, responseCode, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th8) {
                            th2 = th8;
                            map = null;
                            i10 = responseCode;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            r0 r0Var7 = (r0) this.F;
                            e1 e1Var8 = h1Var2.G;
                            h1.g(e1Var8);
                            e1Var8.e1(new o0(this.D, r0Var7, i10, (IOException) null, (byte[]) null, map));
                            throw th2;
                        }
                    } catch (IOException e14) {
                        iOException = e14;
                        responseCode = 0;
                        map2 = null;
                    } catch (Throwable th9) {
                        th = th9;
                        map = null;
                    }
                } catch (IOException e15) {
                    iOException = e15;
                    responseCode = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th10) {
                    th = th10;
                    httpURLConnection = null;
                    map = null;
                }
                break;
            default:
                String str2 = this.D;
                m2 m2Var = (m2) this.G;
                h1 h1Var3 = (h1) m2Var.B;
                h1 h1Var4 = (h1) m2Var.B;
                e1 e1Var9 = h1Var3.G;
                h1.g(e1Var9);
                e1Var9.Z0();
                int responseCode2 = 0;
                try {
                    URLConnection uRLConnectionOpenConnection2 = this.B.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    h1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = this.E;
                            if (map6 != null) {
                                Iterator it = map6.entrySet().iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    if (zHasNext) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.C;
                            ?? r12 = zHasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    q0 q0Var4 = h1Var4.F;
                                    h1.g(q0Var4);
                                    b50.b bVar2 = q0Var4.O;
                                    int length2 = byteArray2.length;
                                    bVar2.c(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStream11 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream11.write(byteArray2);
                                        outputStream11.close();
                                        r12 = outputStream11;
                                    } catch (IOException e16) {
                                        e = e16;
                                        responseCode2 = 0;
                                        outputStream4 = null;
                                        outputStream6 = outputStream11;
                                        iOException2 = e;
                                        outputStream8 = outputStream6;
                                        r11 = outputStream4;
                                        if (outputStream8 != null) {
                                            try {
                                                outputStream8.close();
                                            } catch (IOException e17) {
                                                q0 q0Var5 = h1Var4.F;
                                                h1.g(q0Var5);
                                                q0Var5.G.d("Error closing HTTP compressed POST connection output stream. appId", q0.d1(str2), e17);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, iOException2, null, r11);
                                        return;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        responseCode2 = 0;
                                        outputStream3 = null;
                                        outputStream5 = outputStream11;
                                        th3 = th;
                                        outputStream7 = outputStream5;
                                        r10 = outputStream3;
                                        if (outputStream7 != null) {
                                            try {
                                                outputStream7.close();
                                            } catch (IOException e18) {
                                                q0 q0Var6 = h1Var4.F;
                                                h1.g(q0Var6);
                                                q0Var6.G.d("Error closing HTTP compressed POST connection output stream. appId", q0.d1(str2), e18);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, null, null, r10);
                                        throw th3;
                                    }
                                } catch (IOException e19) {
                                    q0 q0Var7 = h1Var4.F;
                                    h1.g(q0Var7);
                                    q0Var7.G.c(e19, "Failed to gzip post request content");
                                    throw e19;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i12 = inputStream2.read(bArr4);
                                                if (i12 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    a(responseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i12);
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e20) {
                                    iOException2 = e20;
                                    r11 = r12;
                                    outputStream8 = null;
                                    if (outputStream8 != null) {
                                        outputStream8.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, iOException2, null, r11);
                                    return;
                                } catch (Throwable th14) {
                                    th3 = th14;
                                    r10 = r12;
                                    outputStream7 = null;
                                    if (outputStream7 != null) {
                                        outputStream7.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, null, null, r10);
                                    throw th3;
                                }
                            } catch (IOException e21) {
                                iOException2 = e21;
                                outputStream8 = null;
                                r11 = 0;
                                if (outputStream8 != null) {
                                    outputStream8.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r11);
                                return;
                            } catch (Throwable th15) {
                                th3 = th15;
                                outputStream7 = null;
                                r10 = 0;
                                if (outputStream7 != null) {
                                    outputStream7.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r10);
                                throw th3;
                            }
                        } catch (IOException e22) {
                            e = e22;
                            outputStream2 = null;
                            outputStream4 = outputStream2;
                            outputStream6 = outputStream2;
                            iOException2 = e;
                            outputStream8 = outputStream6;
                            r11 = outputStream4;
                            if (outputStream8 != null) {
                                outputStream8.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r11);
                            return;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        outputStream = null;
                        outputStream3 = outputStream;
                        outputStream5 = outputStream;
                        th3 = th;
                        outputStream7 = outputStream5;
                        r10 = outputStream3;
                        if (outputStream7 != null) {
                            outputStream7.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r10);
                        throw th3;
                    }
                } catch (IOException e23) {
                    e = e23;
                    httpURLConnection2 = null;
                    outputStream2 = null;
                } catch (Throwable th17) {
                    th = th17;
                    httpURLConnection2 = null;
                    outputStream = null;
                }
                break;
        }
    }
}
