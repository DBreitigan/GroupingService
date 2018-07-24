package com.dbreitigan.GroupingService.service

import org.springframework.stereotype.Service

@Service
class GroupingService {

    fun testFunc(string: String): String {
        println(string)
        return "$string!"
    }
}