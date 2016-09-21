Gradle Slash Plugin [![Build Status](https://travis-ci.org/int128/gradle-slash.svg)](https://travis-ci.org/int128/gradle-slash) [![Gradle Status](https://gradleupdate.appspot.com/int128/gradle-slash/status.svg)](https://gradleupdate.appspot.com/int128/gradle-slash/status)
===================

A Gradle plugin introducing slash operator `/` as a path separator.


Getting Started
---------------

See https://plugins.gradle.org/plugin/org.hidetake.slash for the latest version.

```groovy
plugins {
  id 'org.hidetake.slash' version 'x.x.x'
}

println buildDir / 'tmp'
```


Contributions
-------------

This is an open source software licensed under the Apache License Version 2.0.
Feel free to open issues or pull requests.


### Publish the plugin

Push a tag named as version `x.x.x` into GitHub and Travis CI will publish the plugin.
