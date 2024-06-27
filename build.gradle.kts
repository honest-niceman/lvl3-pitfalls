// Достаточно Java
plugins {
    id("java")
}

group = "ru.honest.niceman"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

//application {
//    mainClass = "ru.honest.niceman.case2.PredicateExample"
//}
