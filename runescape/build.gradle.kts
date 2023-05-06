plugins {
    `java-library`
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
}

tasks.compileJava {
    sourceCompatibility = "11"
    targetCompatibility = "11"
    options.encoding = "UTF-8"
}