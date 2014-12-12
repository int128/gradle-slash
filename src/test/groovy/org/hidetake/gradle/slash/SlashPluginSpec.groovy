package org.hidetake.gradle.slash

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class SlashPluginSpec extends Specification {

    def "applying the plugin"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.hidetake.slash'
        }

        then:
        noExceptionThrown()
    }

}
