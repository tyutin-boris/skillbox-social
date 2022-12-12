val jupiterVersion: String by project.properties
val springBootVersion: String by project.properties

plugins {
    id("java")
}

group = "org.training"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jupiterVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
