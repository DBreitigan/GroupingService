package com.dbreitigan.GroupingService.service

import spock.lang.Specification

class GroupingServiceTest extends Specification{
    def groupingService = new GroupingService()

    def "test Add Exclamation"() {
        when:
        def string = groupingService.testFunc("value")

        then:
        string == "value!"
    }
}
