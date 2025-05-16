plugins {
    alias(libs.plugins.kotlin.android)
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.Nasa"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.Nasa"
        minSdk = 24
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
}

dependencies {
    // AndroidX Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))
    implementation("com.google.firebase:firebase-analytics")

    // UI Components
    implementation("androidx.recyclerview:recyclerview:1.3.2") // Update ke versi terbaru
    implementation("androidx.cardview:cardview:1.0.0")

    // Firebase
    // Gunakan BOM untuk versi terbaru
    implementation(libs.firebase.auth) // Bisa dihapus jika menggunakan BOM
    implementation("com.google.firebase:firebase-auth-ktx") // Tidak perlu versi jika pakai BOM
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    // Firebase UI Auth (Opsional)
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")

    // Coroutines untuk operasi async
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3") // Untuk coroutines dengan Firebase

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation("androidx.test:rules:1.5.0")


    debugImplementation("androidx.fragment:fragment-testing:1.6.2")
}