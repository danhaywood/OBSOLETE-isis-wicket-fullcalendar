isis-wicket-fullcalendar
========================

[![Build Status](https://travis-ci.org/danhaywood/isis-wicket-fullcalendar.png?branch=master)](https://travis-ci.org/danhaywood/isis-wicket-fullcalendar)

Extension for Apache Isis' Wicket Viewer, to render a collection of entities within a calendar.  

### Usage

Add this component to your classpath, eg:

    <dependency>
        <groupId>com.danhaywood.isis.wicket</groupId>
        <artifactId>danhaywood-isis-wicket-fullcalendar</artifactId>
        <version>x.y.z</version>
    </dependency>

where `x.y.z` is the latest available version (search the [Maven Central Repo](http://search.maven.org/#search|ga|1|isis-wicket-fullcalendar)).

You should then find that any collections of entities that have date properties (either returned from an action, or as a parented collection) will be rendered in a calendar.


## Legal Stuff

### License

    Copyright 2013 Dan Haywood

    Licensed under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

### Dependencies

    <dependencies>
        <dependency>
            <!-- ASL v2.0 -->
            <groupId>org.apache.isis.viewer</groupId>
            <artifactId>isis-viewer-wicket-ui</artifactId>
            <version>${isis-viewer-wicket.version}</version>
        </dependency>

        <dependency>
            <!-- ASL v2.0 -->
            <!-- in turn, depends on: 
                 * http://arshaw.com/fullcalendar/ (MIT License)
                 * http://jquery.com (MIT License)  
             -->
            <groupId>net.ftlines.wicket-fullcalendar</groupId>
            <artifactId>wicket-fullcalendar-core</artifactId>
            <version>${wicket-fullcalendar.version}</version>
        </dependency>
    </dependencies>
