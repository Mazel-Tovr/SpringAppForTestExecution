package com.epam.sber

import Test_1
import Test_2
import org.junit.runner.*
import org.springframework.web.bind.annotation.*

@RestController
class Controller {


    @GetMapping("/test1")
    fun startTest_1() {
        val junit = JUnitCore()
        val result = junit.run(Test_1::class.java)
        println("Test finished with time ${result.runTime}")
    }

    @GetMapping("/test2")
    fun startTest_2() {
        val junit = JUnitCore()
        val result = junit.run(Test_2::class.java)
        println("Test finished with time ${result.runTime}")
    }

}
