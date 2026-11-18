plugins {
    id("com.android.application")
}

android {
    namespace = "com.watch9.minimalhybrid"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.watch9.minimalhybrid"
        // Watch Face Format v2 (weather data) requires Wear OS 5 = API 34
        minSdk = 34
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
