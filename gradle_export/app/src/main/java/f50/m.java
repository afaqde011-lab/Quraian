package f50;

import android.util.Log;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ri.t1;
import x40.w;

public class m {
    public static volatile m a;
    public static final Logger b;

    static {
        m mVar;
        String jvmVersion;
        m iVar = null;
        if (c.N()) {
            for (Map.Entry entry : g50.c.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (g50.c.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(g50.d.a);
                }
            }
            mVar = a.d ? new a() : null;
            if (mVar == null) {
                int i = b.c;
                kotlin.jvm.internal.m.b(null);
            } else {
                iVar = mVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            mVar = g.d ? new g() : null;
            if (mVar != null) {
                iVar = mVar;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (d.d) {
                    mVar = new d();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (l.d) {
                        mVar = new l();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        if (j.c) {
                            mVar = new j();
                        } else {
                            mVar = null;
                        }
                        if (mVar != null) {
                            iVar = mVar;
                        } else {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                Method getMethod = cls.getMethod("get", SSLSocket.class);
                                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                kotlin.jvm.internal.m.d(putMethod, "putMethod");
                                kotlin.jvm.internal.m.d(getMethod, "getMethod");
                                kotlin.jvm.internal.m.d(removeMethod, "removeMethod");
                                kotlin.jvm.internal.m.d(clientProviderClass, "clientProviderClass");
                                kotlin.jvm.internal.m.d(serverProviderClass, "serverProviderClass");
                                iVar = new i(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                            }
                            if (iVar == null) {
                                mVar = new m();
                                iVar = mVar;
                            }
                        }
                    }
                } else {
                    if (j.c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                            Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                            Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod2, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod2, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod2, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass2, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass2, "serverProviderClass");
                            iVar = new i(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (j.c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                        Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                        Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                        kotlin.jvm.internal.m.d(putMethod3, "putMethod");
                        kotlin.jvm.internal.m.d(getMethod3, "getMethod");
                        kotlin.jvm.internal.m.d(removeMethod3, "removeMethod");
                        kotlin.jvm.internal.m.d(clientProviderClass3, "clientProviderClass");
                        kotlin.jvm.internal.m.d(serverProviderClass3, "serverProviderClass");
                        iVar = new i(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            } else {
                if (l.d) {
                    mVar = new l();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    if (j.c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                            Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                            Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod4, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod4, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod4, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass4, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass4, "serverProviderClass");
                            iVar = new i(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (d.d) {
                mVar = new d();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (j.c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                        Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                        kotlin.jvm.internal.m.d(putMethod5, "putMethod");
                        kotlin.jvm.internal.m.d(getMethod5, "getMethod");
                        kotlin.jvm.internal.m.d(removeMethod5, "removeMethod");
                        kotlin.jvm.internal.m.d(clientProviderClass5, "clientProviderClass");
                        kotlin.jvm.internal.m.d(serverProviderClass5, "serverProviderClass");
                        iVar = new i(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            } else {
                if (l.d) {
                    mVar = new l();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    if (j.c) {
                        mVar = new j();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        iVar = mVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                            Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                            Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod6, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod6, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod6, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass6, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass6, "serverProviderClass");
                            iVar = new i(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                        }
                        if (iVar == null) {
                            mVar = new m();
                            iVar = mVar;
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (j.c) {
                mVar = new j();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            kotlin.jvm.internal.m.d(putMethod7, "putMethod");
                            kotlin.jvm.internal.m.d(getMethod7, "getMethod");
                            kotlin.jvm.internal.m.d(removeMethod7, "removeMethod");
                            kotlin.jvm.internal.m.d(clientProviderClass7, "clientProviderClass");
                            kotlin.jvm.internal.m.d(serverProviderClass7, "serverProviderClass");
                            iVar = new i(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (iVar == null) {
                    mVar = new m();
                    iVar = mVar;
                }
            }
        } else {
            if (l.d) {
                mVar = new l();
            } else {
                mVar = null;
            }
            if (mVar != null) {
                iVar = mVar;
            } else {
                if (j.c) {
                    mVar = new j();
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    iVar = mVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    kotlin.jvm.internal.m.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        kotlin.jvm.internal.m.d(putMethod8, "putMethod");
                        kotlin.jvm.internal.m.d(getMethod8, "getMethod");
                        kotlin.jvm.internal.m.d(removeMethod8, "removeMethod");
                        kotlin.jvm.internal.m.d(clientProviderClass8, "clientProviderClass");
                        kotlin.jvm.internal.m.d(serverProviderClass8, "serverProviderClass");
                        iVar = new i(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (iVar == null) {
                        mVar = new m();
                        iVar = mVar;
                    }
                }
            }
        }
        a = iVar;
        b = Logger.getLogger(w.class.getName());
    }

    public static void g(String message, int i, Throwable th) {
        kotlin.jvm.internal.m.e(message, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public t1 b(X509TrustManager x509TrustManager) {
        return new j50.a(c(x509TrustManager));
    }

    public j50.b c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.m.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new j50.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
    }

    public String e(SSLSocket sSLSocket) {
        return null;
    }

    public boolean f(String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return true;
    }

    public SSLContext h() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory i(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextH = h();
            sSLContextH.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextH.getSocketFactory();
            kotlin.jvm.internal.m.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager j() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
