package jb;

import android.os.Looper;
import com.google.android.gms.internal.cast.a3;
import java.util.concurrent.Executor;
import ji.j;
import tf.e1;
import tf.h1;
import tf.i2;

public final class a implements Executor {
    public final int A;
    public final Object B;

    public a() {
        this.A = 4;
        a3 a3Var = new a3(Looper.getMainLooper(), 6, false);
        Looper.getMainLooper();
        this.B = a3Var;
    }

    public a(Looper looper) {
        this.A = 2;
        this.B = new a3(looper, 4);
    }

    public a(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                ((b) this.B).f8260c.post(runnable);
                break;
            case 1:
                e1 e1Var = ((h1) ((i2) this.B).B).G;
                h1.g(e1Var);
                e1Var.e1(runnable);
                break;
            case 2:
                ((a3) this.B).post(runnable);
                break;
            case 3:
                ((Executor) this.B).execute(new j(runnable, 2));
                break;
            default:
                ((a3) this.B).post(runnable);
                break;
        }
    }
}
