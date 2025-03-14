plugins {
    kotlin("jvm") version "2.1.10"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("it.unimi.dsi:fastutil:8.5.15")
}

kotlin {
    jvmToolchain(8)
}
