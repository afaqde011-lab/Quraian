package c3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

public final class s0 extends ThreadLocal {

    public final int f2757a;

    @Override
    public final Object initialValue() {
        switch (this.f2757a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                u0 u0Var = new u0(choreographer, Handler.createAsync(looperMyLooper));
                return rd.a.P(u0Var, u0Var.L);
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(y40.b.e);
                return simpleDateFormat;
            case 2:
                return Boolean.FALSE;
            case 3:
                return new com.google.android.gms.internal.cast.t3();
            case 4:
                return new PathMeasure();
            case 5:
                return new Path();
            case 6:
                return new Path();
            case 7:
                return new float[4];
            case 8:
                try {
                    return (Cipher) zh.o.f17495b.f17498a.d("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 9:
                try {
                    return (Cipher) zh.o.f17495b.f17498a.d("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 10:
                return new Random();
            case 11:
                return 0L;
            case 12:
                try {
                    return (Cipher) zh.o.f17495b.f17498a.d("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 13:
                try {
                    return (Cipher) zh.o.f17495b.f17498a.d("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 14:
                try {
                    return (Cipher) zh.o.f17495b.f17498a.d("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
