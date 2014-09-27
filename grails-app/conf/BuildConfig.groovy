grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits('global') {

    }
    log 'warn'
    repositories {
        mavenLocal()
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
    }

    plugins {
        compile ':less-asset-pipeline:1.10.0'

        build(':release:3.0.1', ':rest-client-builder:2.0.1') {
            export = false
        }
    }
}