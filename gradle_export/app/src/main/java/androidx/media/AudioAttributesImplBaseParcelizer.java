package androidx.media;

import va.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1035a = bVar.f(audioAttributesImplBase.f1035a, 1);
        audioAttributesImplBase.f1036b = bVar.f(audioAttributesImplBase.f1036b, 2);
        audioAttributesImplBase.f1037c = bVar.f(audioAttributesImplBase.f1037c, 3);
        audioAttributesImplBase.f1038d = bVar.f(audioAttributesImplBase.f1038d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f1035a, 1);
        bVar.j(audioAttributesImplBase.f1036b, 2);
        bVar.j(audioAttributesImplBase.f1037c, 3);
        bVar.j(audioAttributesImplBase.f1038d, 4);
    }
}
