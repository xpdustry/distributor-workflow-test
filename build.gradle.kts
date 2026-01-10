plugins {
    id("distributor.parent-conventions")
}

version = "4.2.5" + if (findProperty("release").toString().toBoolean()) "" else "-SNAPSHOT"
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
