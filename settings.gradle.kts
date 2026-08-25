pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}
    }
}

rootProject.name = "cloudstream-ngefilm-repo"

file(".").listFiles()?.filter { it.isDirectory && File(it, "build.gradle.kts").exists() }?.forEach {
    include(":${it.name}")
}
