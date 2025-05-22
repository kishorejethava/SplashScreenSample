include(":app")


pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.2.2"
        id("org.jetbrains.kotlin.android") version "1.8.22"
        id("org.sonarqube") version "2.7.1"
        id("com.google.gms.google-services") version "4.4.2" apply false
    }
}
