plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "id.ac.polbeng.fitridestika.uas"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.ac.polbeng.fitridestika.uas"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // RecyclerView for displaying lists
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    // Material components (e.g., Buttons, Snackbars, etc.)
    implementation("com.google.android.material:material:1.9.0")

    // Navigation for fragments and UI handling
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.6.0")

    // Core AndroidX dependencies
    implementation("androidx.core:core-ktx:1.10.0")  // Explicit core dependency
    implementation("androidx.appcompat:appcompat:1.6.1")  // Explicit AppCompat version
    implementation("androidx.activity:activity-ktx:1.7.1")  // Activity KTX for lifecycle and more
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")  // ConstraintLayout

    // Lifecycle dependencies for LiveData and ViewModel
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")  // LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")  // ViewModel
    implementation ("androidx.core:core-splashscreen:1.0.0")
    // Fragment dependencies for fragment management
    implementation("androidx.fragment:fragment-ktx:1.6.1")  // Fragment KTX
    implementation ("com.google.android.material:material:1.9.0")  // Make sure this is included
    implementation ("androidx.navigation:navigation-ui-ktx:2.6.0")  // Navigation UI
    implementation ("androidx.navigation:navigation-fragment-ktx:2.6.0")
    // Unit testing and UI testing
    testImplementation("junit:junit:4.13.2")  // JUnit for testing
    androidTestImplementation("androidx.test.ext:junit:1.1.5")  // AndroidX JUnit for testing
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")  // Espresso for UI tests
}
