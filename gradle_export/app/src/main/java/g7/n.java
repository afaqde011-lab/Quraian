package g7;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.android.gms.cast.CastStatusCodes;
import e7.i0;
import fh.i2;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import l9.f0;

public final class n extends b {
    public final int E;
    public final int F;
    public final f0 G;
    public final f0 H;
    public j I;
    public HttpURLConnection J;
    public InputStream K;
    public boolean L;
    public int M;
    public long N;
    public long O;

    public n(int i10, int i11, f0 f0Var) {
        super(true);
        this.E = i10;
        this.F = i11;
        this.G = f0Var;
        this.H = new f0(29);
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.K;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    String str = i0.f5136a;
                    throw new HttpDataSource$HttpDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, 3, e3);
                }
            }
            this.K = null;
            k();
            if (this.L) {
                this.L = false;
                c();
            }
            this.J = null;
            this.I = null;
        } catch (Throwable th2) {
            this.K = null;
            k();
            if (this.L) {
                this.L = false;
                c();
            }
            this.J = null;
            this.I = null;
            throw th2;
        }
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.J;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                e7.a.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
        }
    }

    public final HttpURLConnection l(URL url, int i10, byte[] bArr, long j9, long j10, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.E);
        httpURLConnection.setReadTimeout(this.F);
        HashMap map2 = new HashMap();
        f0 f0Var = this.G;
        if (f0Var != null) {
            map2.putAll(f0Var.k());
        }
        map2.putAll(this.H.k());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = p.f6226a;
        if (j9 == 0 && j10 == -1) {
            string = null;
        } else {
            StringBuilder sbN = w.c.n("bytes=", j9, "-");
            if (j10 != -1) {
                sbN.append((j9 + j10) - 1);
            }
            string = sbN.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = j.f6217i;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void o(long j9) throws IOException {
        if (j9 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j9 > 0) {
            int iMin = (int) Math.min(j9, 4096);
            InputStream inputStream = this.K;
            String str = i0.f5136a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, 1, new InterruptedIOException());
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j9 -= (long) i10;
            b(i10);
        }
    }

    @Override
    public final long p(j jVar) throws HttpDataSource$HttpDataSourceException {
        boolean z10;
        long j9;
        long jMax;
        String str;
        this.I = jVar;
        this.O = 0L;
        this.N = 0L;
        e();
        try {
            HttpURLConnection httpURLConnectionL = l(new URL(jVar.f6218a.toString()), jVar.f6219b, jVar.f6220c, jVar.f6222e, jVar.f6223f, (jVar.f6225h & 1) == 1, true, jVar.f6221d);
            long j10 = jVar.f6222e;
            long j11 = jVar.f6223f;
            this.J = httpURLConnectionL;
            this.M = httpURLConnectionL.getResponseCode();
            httpURLConnectionL.getResponseMessage();
            int i10 = this.M;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionL.getHeaderFields();
                if (this.M == 416) {
                    String headerField = httpURLConnectionL.getHeaderField("Content-Range");
                    Pattern pattern = p.f6226a;
                    if (TextUtils.isEmpty(headerField)) {
                        j9 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = p.f6227b.matcher(headerField);
                        z10 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j9 = Long.parseLong(strGroup);
                        } else {
                            j9 = -1;
                        }
                    }
                    if (j10 == j9) {
                        this.L = z10;
                        h(jVar);
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionL.getErrorStream();
                try {
                    if (errorStream != null) {
                        gh.f.b(errorStream);
                    } else {
                        String str2 = i0.f5136a;
                    }
                } catch (IOException unused) {
                    String str3 = i0.f5136a;
                }
                k();
                throw new HttpDataSource$InvalidResponseCodeException(this.M, this.M == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionL.getContentType();
            if (this.M != 200 || j10 == 0) {
                j10 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionL.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j11 != -1) {
                this.N = j11;
            } else {
                String headerField2 = httpURLConnectionL.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionL.getHeaderField("Content-Range");
                Pattern pattern2 = p.f6226a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        e7.a.d("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = p.f6226a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j12 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j13 = (j12 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j13;
                            } else if (jMax != j13) {
                                try {
                                    e7.a.m("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j13);
                                } catch (NumberFormatException unused3) {
                                    e7.a.d("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.N = jMax != -1 ? jMax - j10 : -1L;
            }
            try {
                this.K = httpURLConnectionL.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.K = new GZIPInputStream(this.K);
                }
                this.L = true;
                h(jVar);
                try {
                    o(j10);
                    return this.N;
                } catch (IOException e3) {
                    k();
                    if (e3 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e3);
                    }
                    throw new HttpDataSource$HttpDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, 1, e3);
                }
            } catch (IOException e10) {
                k();
                throw new HttpDataSource$HttpDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, 1, e10);
            }
        } catch (IOException e11) {
            k();
            throw HttpDataSource$HttpDataSourceException.a(1, e11);
        }
    }

    @Override
    public final Map r() {
        HttpURLConnection httpURLConnection = this.J;
        return httpURLConnection == null ? i2.G : new m(httpURLConnection.getHeaderFields());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j9 = this.N;
            if (j9 != -1) {
                long j10 = j9 - this.O;
                if (j10 != 0) {
                    i11 = (int) Math.min(i11, j10);
                    InputStream inputStream = this.K;
                    String str = i0.f5136a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 != -1) {
                        this.O += (long) i12;
                        b(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.K;
                String str2 = i0.f5136a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 != -1) {
                    this.O += (long) i12;
                    b(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e3) {
            String str3 = i0.f5136a;
            throw HttpDataSource$HttpDataSourceException.a(2, e3);
        }
    }

    @Override
    public final Uri y() {
        HttpURLConnection httpURLConnection = this.J;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        j jVar = this.I;
        if (jVar != null) {
            return jVar.f6218a;
        }
        return null;
    }
}
