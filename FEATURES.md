# المميزات — نتيجة التحقق من السورس

تم التحقق من وجود ملفات المميزات داخل `source/java/` (jadx output).

| الميزة | الحالة | علامات موجودة في الكود |
|---|---|---|
| الرئيسية Home | ✅ | `HomeScreen`, `HomeTabRoute`, `HomeEffect` |
| القرّاء Reciters + بحث | ✅ | `ReciterScreen`, `ReciterTabRoute`, `SearchReciter` |
| قوائم التشغيل Playlists | ✅ | `PlaylistsScreen`, `PlaylistScreen`, `PlaylistsTabRoute` |
| الإحصائيات Insights | ✅ | `InsightsScreen`, `InsightsTabRoute`, `DebugConfiguration` |
| البحث Search | ✅ | `SearchScreen`, `SearchTabRoute` |
| الإعدادات Settings | ✅ | `SettingsScreen`, `DownloadManagerScreen`, `NotificationScreen` |
| المشغّل Player | ⚠️ 2/3 | `AudioPlayerService`, `FullScreenLauncher` (MiniPlayer مدمج في ملفات Compose) |
| التفسير وال lyrics | ⚠️ 1/3 | `Tafsir` (باقي النصوص عبر موارد `res/`) |
| المؤثرات الصوتية | ✅ | `SoundEffectPicker`, `SoundEffect` |
| القصص الصوتية | ✅ | `AudioStoryScreen`, `AudioStoryCatalog`, `AudioStoryPlayer` |
| onboarding | ✅ | `Onboarding` |
| الروابط العميقة | ✅ | `ShareLauncher`, `DeepLink` |
| الوidgets | ✅ | `WidgetUpdateReceiver`, `WidgetPlaybackEvent` |
| الاشتراك/Premium | ✅ | `BillingException`, `ManageSubscriptionScreen` |

## التعديلات المطبقة (smali-patches)
- `AuthLocalDataSource.isAuthorized()` → `true`
- `vp/x` → `l()`, `k()`, `m()` → `true` (تفعيل Premium)
- `er/j.f()` → token محلي
- `AndroidManifest.xml` → إزالة PairIP و Google Sign-In

## تنبيه
بعض المميزات تعتمد على خدمات Google (إشعارات FCM، Cast، Play Billing). بعد إزالة خدمات Google ستعمل الميزات المحلية فقط. راجع `GOOGLE_SERVICES_REMOVAL.md`.
