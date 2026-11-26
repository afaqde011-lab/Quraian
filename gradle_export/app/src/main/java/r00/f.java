package r00;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public final class f extends h00.c {
    public final ArrayDeque C;
    public final q30.i D;

    public f(q30.i iVar) {
        this.D = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.C = arrayDeque;
        File rootFile = (File) iVar.b;
        if (rootFile.isDirectory()) {
            arrayDeque.push(c(rootFile));
        } else if (!rootFile.isFile()) {
            this.A = 2;
        } else {
            m.e(rootFile, "rootFile");
            arrayDeque.push(new d(rootFile));
        }
    }

    @Override
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            File fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(gVar.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(c(fileA));
            }
        }
        if (file == null) {
            this.A = 2;
        } else {
            this.B = file;
            this.A = 1;
        }
    }

    public final b c(File rootDir) {
        int iOrdinal = ((h) this.D.c).ordinal();
        if (iOrdinal == 0) {
            m.e(rootDir, "rootDir");
            return new e(rootDir);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        m.e(rootDir, "rootDir");
        return new c(rootDir);
    }
}
