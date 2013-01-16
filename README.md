isis-wicket-fullcalendar
========================

Extension for Apache Isis' Wicket Viewer, to render a collection of entities within a calendar.  

### Prerequisites

The module has a dependency on the `wicket-fullcalendar` component, not yet released to Maven central repo.  To get this code:

* clone my fork of this component, [danhaywood/wicket-fullcalendar](https://github.com/danhaywood/wicket-fullcalendar) repo in github

* checkout the `wicket-6` branch

    `git checkout wicket-6`
* reset to SHA 7f5fcb91f82a30768ed34e58a5ba0450e0457ed1

    `git reset --hard 7f5fcb91f`


Make sure this component and the `wicket-fullcalendar` have been built.


### Usage

Add this component to your classpath, eg:

    <dependency>
        <groupId>com.danhaywood.isis.wicket.ui.components</groupId>
        <artifactId>danhaywood-isis-wicket-fullcalendar</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>


You should then find that any collections of entities that have date properties (either returned from an action, or as a parented collection) will be rendered in a calendar.