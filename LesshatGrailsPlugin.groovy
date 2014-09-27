/*
 * Copyright 2014 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
class LesshatGrailsPlugin {

    def version = '3.0.2.1'
    def grailsVersion = '2.0 > *'

    def title = 'LESS Hat for Asset-Pipeline'
    def author = 'Alexey Zhokhov'
    def authorEmail = 'donbeave@gmail.com'
    def description = '''\
Provides [LESS Hat|http://lesshat.madebysource.com/] support for the asset-pipeline static asset management plugin.
'''

    def documentation = 'http://grails.org/plugin/lesshat'

    def license = 'APACHE'

    def developers = [
            [name: 'Alexey Zhokhov', email: 'donbeave@gmail.com']
    ]
    def organization = [name: 'Polusharie', url: 'http://www.polusharie.com']

    def issueManagement = [system: 'GitHub',
                           url   : 'https://github.com/donbeave/grails-lesshat/issues']
    def scm = [url: 'https://github.com/donbeave/grails-lesshat']

}