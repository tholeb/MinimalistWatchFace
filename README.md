# Minimal Hybrid – Galaxy Watch watch face

A minimalist analog + digital watch face for the Galaxy Watch 9 (any watch on Wear OS 5 or newer). It's written in Watch Face Format v2 and has no code, only resources.

<p align="center">
  <img src="docs/screenshots/default.png" width="300" alt="Default setup: UV and rain bars, next event, weather">
</p>

## Looks

Every widget can be swapped, recoloured or hidden from the watch itself. Here are a few setups:

| Default | Sunny, high UV | Rainy, low battery |
|:---:|:---:|:---:|
| <img src="docs/screenshots/default.png" width="220"> | <img src="docs/screenshots/sunny-high-uv.png" width="220"> | <img src="docs/screenshots/rainy-low-battery.png" width="220"> |
| UV 3 (yellow), 40 % rain, orange accent | UV 9 turns the bar red; pink accent | 90 % rain; the battery ring turns orange when low; yellow accent |

| Fitness | Minimal | Always-on |
|:---:|:---:|:---:|
| <img src="docs/screenshots/fitness.png" width="220"> | <img src="docs/screenshots/minimal.png" width="220"> | <img src="docs/screenshots/always-on.png" width="220"> |
| Bars set to steps and heart rate; white hands, blue accent | Bars, date and event turned off; green accent | Seconds hidden, everything dimmed |

The screenshots are drawn mock-ups, not captures from a watch.

## What's on the face

| Widget | Default | Changeable to |
|---|---|---|
| **Left bar** | UV index from the watch's weather. Fills from the bottom; colour follows the UV scale: green 0–2, yellow 3–5, orange 6–7, red 8–10, violet 11+ | Any source with a value or text (steps, floors, a goal…) |
| **Right bar** | Chance of rain (%) from the watch's weather | Any source with a value or text (heart rate, battery…) |
| **Weather** | Icon (sun, moon, cloud, rain, snow, storm, fog) + temperature | Any short-text or icon source |
| **Event** | Next calendar event: `time : title` | Any short or long text source |
| Battery ring | Charge level around the edge, orange when low | On / off |
| Date | Grey, e.g. `Wed 18/11` | On / off |
| Digital + analog time | Digital follows the phone's 12/24 h setting | Hands colour, seconds on / off |

## Customise it on the watch

1. Long-press the watch face, then tap **Customise**.
2. Swipe between the pages:
   - **Colour**: **Accent colour** (seconds hand and centre dot: orange, red, yellow, green, blue, violet, pink, white) and **Hands colour** (grey, white, dark grey).
   - **Show / hide**: turn **Side bars**, **Weather**, **Event**, **Battery ring**, **Date** and **Seconds hand** on or off.
   - **Complications**: tap **Left bar**, **Right bar**, **Weather** or **Event** to pick another source. Choose **Empty** to go back to the built-in UV, rain or weather display.

You can do the same from the phone in the **Galaxy Wearable** app under **Watch faces → Customise**.

## Build & install

1. Open this folder in Android Studio (Ladybug or newer). Let it sync and add the Gradle wrapper.
2. On the watch, go to **Settings → Developer options** and turn on **ADB debugging** and **Debug over Wi-Fi**. Then pair from Android Studio, or run `adb connect <ip>:<port>`.
3. Build and install:
   ```bash
   ./gradlew :app:installDebug
   ```
4. Long-press the current watch face, scroll to **Minimal Hybrid** and select it.

## Files

- `app/src/main/res/raw/watchface.xml`: the whole face, including layout, colours and customisation options.
- `app/src/main/res/values/strings.xml`: names shown in the Customise screen.
- `app/src/main/res/drawable-nodpi/preview.png`: the picture shown in the watch face picker.
