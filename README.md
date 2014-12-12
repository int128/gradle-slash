Gradle Slash Plugin
===================

A Gradle plugin which introduces slash operator `/` as a path separator.

[![Build Status](https://travis-ci.org/int128/gradle-slash.png)](https://travis-ci.org/int128/gradle-slash)



Getting Started
---------------

```groovy
plugins {
  id 'org.hidetake.slash' version '0.1'
}

println buildDir / 'tmp'
```


Contributions
-------------

This is an open source software licensed under the Apache License Version 2.0.
Any issues or pull requests are welcome.

### Development

JDK 7 or later is required.
Intellij IDEA is recommended.
All dependencies are downloaded by Gradle wrapper.

Travis CI will compile and test the branch on each push and pull request.

Artifacts will be published on [Bintray](https://bintray.com) and [Gradle Plugins](http://plugins.gradle.org).

### Build

Run the build task.

```sh
./gradlew build
```

### Publish

Update metadata of the plugin in `gradle.properties`.

You must have Bintray account and provide its credential in `~/.gradle/gradle.properties` as follows:

```ini
bintrayUser=example
bintrayKey=secret
```

Run the upload task with publishing version.

```sh
./gradlew -Pversion=x.y.z bintrayUpload
```

