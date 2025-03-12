plugins {
    kotlin("jvm") version "2.1.10"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {

}

kotlin {
    jvmToolchain(8)
}
