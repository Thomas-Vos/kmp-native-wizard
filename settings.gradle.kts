pluginManagement {
    repositories {
        mavenCentral()
        maven("https://redirector.kotlinlang.org/maven/dev") {
            content {
                includeGroupByRegex("org\\.jetbrains\\..*")
            }
        }
        gradlePluginPortal()
    }
}

rootProject.name = "KotlinNativeTemplate"