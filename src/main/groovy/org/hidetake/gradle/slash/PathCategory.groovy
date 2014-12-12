package org.hidetake.gradle.slash

@Category(File)
class PathCategory {
    File div(String child) {
        new File(this as File, child)
    }
}
