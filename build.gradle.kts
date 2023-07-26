plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")
    testImplementation("org.testng:testng:7.5.1")



}
tasks.test {
    useTestNG()
}

