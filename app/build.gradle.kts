plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.myguide"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.myguide"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
        // Core и UI
        implementation ("androidx.core:core-ktx:1.10.1")
        implementation ("androidx.appcompat:appcompat:1.6.1")
        implementation ("com.google.android.material:material:1.9.0")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

        // Lifecycle (ViewModel + LiveData)
        implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
        implementation( "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

        // Navigation Component
        implementation( "androidx.navigation:navigation-fragment-ktx:2.5.3")
        implementation( "androidx.navigation:navigation-ui-ktx:2.5.3")

        // Room (SQLite + ORM)
        implementation( "androidx.room:room-runtime:2.5.1")
        kapt       ("androidx.room:room-compiler:2.5.1")
        implementation ("androidx.room:room-ktx:2.5.1")

        // Retrofit + OkHttp (REST API)
        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")

        // Coroutines (для асинхронных запросов)
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.0")
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.0")

        // CameraX (камера)
        implementation ("androidx.camera:camera-core:1.2.2")
        implementation( "androidx.camera:camera-camera2:1.2.2")
        implementation ("androidx.camera:camera-lifecycle:1.2.2")
        implementation ("androidx.camera:camera-view:1.2.2")

        // Glide (загрузка и кэширование изображений)
        implementation ("com.github.bumptech.glide:glide:4.15.1")
        kapt      ( "com.github.bumptech.glide:compiler:4.15.1")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}