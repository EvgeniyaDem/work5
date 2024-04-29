plugins {
    id 'java'
}

group = 'ru.netology'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:-junit-jupiter:5.7.0'
    testImplementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
}

test {
    useJUnitPlatform()
}