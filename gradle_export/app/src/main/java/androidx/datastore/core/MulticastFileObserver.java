package androidx.datastore.core;

import a40.o0;
import android.content.Context;
import android.os.FileObserver;
import b40.c;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import d00.a1;
import d40.e;
import d40.i;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k00.j;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", RuntimeVersion.SUFFIX, "path", "<init>", "(Ljava/lang/String;)V", RuntimeVersion.SUFFIX, "event", "Lg00/b0;", "onEvent", "(ILjava/lang/String;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "delegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastFileObserver extends FileObserver {

    public static final Companion INSTANCE = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<k> delegates;
    private final String path;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0003R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", RuntimeVersion.SUFFIX, "<init>", "()V", "Ljava/io/File;", "parent", "Lkotlin/Function1;", RuntimeVersion.SUFFIX, "Lg00/b0;", "Landroidx/datastore/core/FileMoveObserver;", "observer", "La40/o0;", "observe", "(Ljava/io/File;Lu00/k;)La40/o0;", "file", "Ld40/i;", "(Ljava/io/File;)Ld40/i;", "removeAllObservers$datastore_core_release", "removeAllObservers", RuntimeVersion.SUFFIX, "Landroidx/datastore/core/MulticastFileObserver;", "fileObservers", "Ljava/util/Map;", "getFileObservers$datastore_core_release", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getFileObservers$datastore_core_release$annotations() {
        }

        public final o0 observe(File parent, final k observer) {
            final String path = parent.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release();
                    m.d(path, "key");
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(path);
                    if (multicastFileObserver == null) {
                        multicastFileObserver = new MulticastFileObserver(path, null);
                        fileObservers$datastore_core_release.put(path, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(observer);
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final int i10 = 0;
            return new o0() {
                public final void dispose() {
                    switch (i10) {
                        case 0:
                            MulticastFileObserver.Companion.observe$lambda$4((String) path, (k) observer);
                            break;
                        case 1:
                            c cVar = (c) path;
                            cVar.C.removeCallbacks((Runnable) observer);
                            break;
                        default:
                            ((Context) path).unregisterComponentCallbacks((a1) observer);
                            break;
                    }
                }
            };
        }

        public static final void observe$lambda$4(String str, k kVar) {
            m.e(kVar, "$observer");
            synchronized (MulticastFileObserver.LOCK) {
                Companion companion = MulticastFileObserver.INSTANCE;
                MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core_release().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(kVar);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        companion.getFileObservers$datastore_core_release().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
            }
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        public final i observe(File file) {
            m.e(file, "file");
            return new e(new MulticastFileObserver$Companion$observe$1(file, null), j.A, -2, c40.a.A);
        }

        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private MulticastFileObserver(String str) {
        super(str, Cast.MAX_NAMESPACE_LENGTH);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    public MulticastFileObserver(String str, f fVar) {
        this(str);
    }

    public final String getPath() {
        return this.path;
    }

    @Override
    public void onEvent(int event, String path) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(path);
        }
    }
}
