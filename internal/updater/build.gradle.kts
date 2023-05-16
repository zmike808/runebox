plugins {
    java
}

dependencies {
    implementation(project(":runebox-asm"))
    implementation(project(":runebox-logger"))
    implementation("com.github.lukfor:magic-progress:_")
    implementation("org.fusesource.jansi:jansi:_")
}