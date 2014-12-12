package org.hidetake.gradle.slash

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class SlashPluginSpec extends Specification {

    def "apply() should load the plugin"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
        }

        then:
        project.plugins.hasPlugin(SlashPlugin)
    }

    def "slash operator should a path separator"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
            ext.actual = buildDir / 'tmp'
        }

        then:
        project.ext.actual == new File(project.buildDir, 'tmp')
    }

    def "slash operator should work for GString"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
            ext.actual = buildDir / "work"
        }

        then:
        project.ext.actual == new File(project.buildDir, 'work')
    }

    def "concatenated slash operators should work"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
            ext.actual = buildDir / 'tmp' / 'work'
        }

        then:
        project.ext.actual == new File(project.buildDir, 'tmp/work')
    }

    def "slash operator with null should throw an exception"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
            ext.actual = buildDir / null
        }

        then:
        thrown(NullPointerException)
    }


    def "plugin should be applied to sub-projects"() {
        given:
        def project = ProjectBuilder.builder().build()
        def subproject1 = ProjectBuilder.builder().withParent(project).build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
            ext.actual = buildDir / 'hello'
        }
        subproject1.with {
            ext.actual = buildDir / 'world'
        }

        then:
        project.ext.actual == new File(project.buildDir, 'hello')
        subproject1.ext.actual == new File(subproject1.buildDir, 'world')
    }

}
