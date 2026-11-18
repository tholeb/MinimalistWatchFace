# Minimal Hybrid – Galaxy Watch watch face

A minimalist face in Watch Face Format v2 (needs Wear OS 5 or newer, so Galaxy Watch 9 works). It has no code, only resources.

| Element | Source |
|---|---|
| Analog hands (hour / minute / orange seconds) | `[HOUR_0_11_MINUTE]`, `[MINUTE_SECOND]`, `[SECOND]` |
| Digital time (follows the phone's 12/24h setting) | `DigitalClock` |
| Left / right edge bars (customisable; the bar fills for range values such as steps or a goal) | Complication slots 2 and 3, defaults `STEP_COUNT` and `HEART_RATE` |
| Weather icon + temperature (customisable: "Empty" shows the built-in weather, any other provider replaces it) | Complication slot 1, plus `[WEATHER.CONDITION]`, `[WEATHER.IS_DAY]`, `[WEATHER.TEMPERATURE]` |
| Battery ring around the edge (turns orange when low) | `[BATTERY_PERCENT]`, `[BATTERY_IS_LOW]` |
| Date, grey (e.g. `Wed 18/11`) | `[DAY_OF_WEEK_S]`, `[DAY_Z]`, `[MONTH_Z]` |
| Next event | Complication slot, default provider `NEXT_EVENT` (you can change it in the watch's Customize menu) |

In always-on mode, the seconds hand is hidden and the rest is dimmed.

## Build & install

1. Open this folder in Android Studio (Ladybug or newer). Let it sync and add the Gradle wrapper.
2. On the watch, go to **Settings → Developer options** and turn on **ADB debugging** and **Debug over Wi-Fi**. Then pair from Android Studio, or run `adb connect <ip>:<port>`.
3. Build and install:
   ```bash
   ./gradlew :app:installDebug
   ```
4. Long-press the current watch face, scroll to **Minimal Hybrid** and select it.

The main file is `app/src/main/res/raw/watchface.xml`.
