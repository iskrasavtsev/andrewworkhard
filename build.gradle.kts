import org.jetbrains.kotlin.js.translate.context.Namer.kotlin

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
}
// Root build.gradle.kts
extra["material3_version"] = "1.3.1"

//dependencies{
//    implementation("androidx.compose.material3:material3:$material3_version")
//}
repositories {
    google()
    mavenCentral()
}
commonMain.dependencies {
        //"commonMainImplementation"("com.example:my-library:1.0")
        implementation("com.google.android.material:material:${rootProject.extra["material3_version"]}")
}

