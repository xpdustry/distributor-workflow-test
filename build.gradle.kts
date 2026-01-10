plugins {
    id("distributor.parent-conventions")
}

version = file("VERSION.txt").readText() + if (findProperty("release").toString().toBoolean()) "-SNAPSHOT" else ""
group = "com.xpdustry.TEST"
description = "The Mindustry plugin of ur dreams..."

tasks {
    spotlessCheck {
        dependsOn(gradle.includedBuild("distributor-build-logic").task(":spotlessCheck"))
    }
    spotlessApply {
        dependsOn(gradle.includedBuild("distributor-build-logic").task(":spotlessApply"))
    }
}
