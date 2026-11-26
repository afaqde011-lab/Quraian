package com.revenuecat.purchases.common;

import a1.b;
import android.content.Context;
import c3.y2;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import g00.b0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import q30.a;
import q30.j;
import q30.l;
import ta.c0;
import u00.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u001e\u0010\rJ5\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Lg00/b0;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lu00/k;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "Lq30/j;", "block", "readFilePerLines", "", "numberOfLinesToRemove", "", "onException", "removeFirstLinesFromFile", "(Ljava/lang/String;ILu00/k;)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileHelper {
    private final Context applicationContext;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Lg00/b0;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $block;

        public AnonymousClass1(k kVar) {
            super(1);
            this.$block = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return b0.a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            m.e(bufferedReader, "bufferedReader");
            this.$block.invoke(new a(new y2(bufferedReader, 7)));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq30/j;", "", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00881 extends n implements k {
        final int $numberOfLinesToRemove;
        final StringBuilder $textToAppend;

        public C00881(int i, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i;
            this.$textToAppend = sb;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            j jVarL0 = l.l0(sequence, this.$numberOfLinesToRemove);
            StringBuilder sb = this.$textToAppend;
            Iterator it = jVarL0.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
    }

    public FileHelper(Context applicationContext) {
        m.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String filePath) {
        return new File(getFilesDir(), filePath);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        m.d(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String filePath, k contentBlock) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(filePath));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    contentBlock.invoke(bufferedReader);
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0.C(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c0.C(inputStreamReader, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                c0.C(fileInputStream, th5);
                throw th6;
            }
        }
    }

    public static void removeFirstLinesFromFile$default(FileHelper fileHelper, String str, int i, k kVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            kVar = null;
        }
        fileHelper.removeFirstLinesFromFile(str, i, kVar);
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IOException {
        m.e(filePath, "filePath");
        m.e(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(r30.a.a);
            m.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.C(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final boolean deleteFile(String filePath) {
        m.e(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        m.e(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        m.e(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, k block) throws IOException {
        m.e(filePath, "filePath");
        m.e(block, "block");
        openBufferedReader(filePath, new AnonymousClass1(block));
    }

    public final void removeFirstLinesFromFile(String filePath, int numberOfLinesToRemove, k onException) {
        m.e(filePath, "filePath");
        try {
            StringBuilder sb = new StringBuilder();
            readFilePerLines(filePath, new C00881(numberOfLinesToRemove, sb));
            deleteFile(filePath);
            String string = sb.toString();
            m.d(string, "textToAppend.toString()");
            appendToFile(filePath, string);
        } catch (FileNotFoundException e) {
            if (onException != null) {
                onException.invoke(e);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", b.p("FileHelper: file not found when trying to remove first lines from file: ", filePath, ". Ignoring."), e);
        } catch (Throwable th) {
            if (onException != null) {
                onException.invoke(th);
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", b.p("FileHelper: error removing first lines from file: ", filePath, ". Ignoring."), th);
            throw th;
        }
    }
}
