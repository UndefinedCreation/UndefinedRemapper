plugins {
    kotlin("jvm") version "1.9.21"
    id("maven-publish")
    id("com.gradle.plugin-publish") version "1.2.1"
}

group = "com.undefined"
version = "0.0.2"

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib"))

    implementation("net.md-5:SpecialSource:1.11.4")
}


gradlePlugin {

    website.set("https://github.com/UndefinedCreation")
    vcsUrl.set("https://github.com/UndefinedCreation")

    plugins {

        create("mapper") {
            id = "com.undefined.mapper"
            displayName = "Undefined mapper"
            description = "This gradle plugin will remapped you NMS projects."
            tags = listOf("spigot", "mapping", "NMS", "mojang", "utils", "remapper")
            implementationClass = "com.undefined.remapper.RemappingPlugin"
        }
    }

}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}