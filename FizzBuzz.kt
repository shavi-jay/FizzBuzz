package com.example.fizzbuzz

fun main() {
    print("Enter maximum number: ")
    val xmax = Integer.valueOf(readLine())
    print("Rules you want to keep (Y for yes and N for no e.g. YNYYYN): ")
    val rules = readLine()

    for (x in 1..xmax) {
        var output1 = ""
        var output2 = ""

        //Calculating divisions
        var div = mutableListOf(0,0,0,0,0)

        if (x % 3 == 0 && rules?.get(0) != 'N') {
            div[0] = 1
            output1 += "Fizz"
            output2 = "Fizz$output2"
        }
        if (x % 13 == 0 && rules?.get(4) != 'N') {
            div[4] = 1
            output1 += "Fezz"
            output2 = "Fezz$output2"
        }
        if (x % 5 == 0 && rules?.get(1) != 'N') {
            div[1] = 1
            output1 += "Buzz"
            output2 = "Buzz$output2"
        }
        if (x % 7 == 0 && rules?.get(2) != 'N') {
            div[2] = 1
            output1 += "Bang"
            output2 = "Bang$output2"
        }
        if (x % 11 == 0 && rules?.get(3) != 'N') {
            div[3] = 1
        }
        var x17 = 0
        if (x % 17 == 0 && rules?.get(5) != 'N') {
            x17 = 1
        }

        if (div == mutableListOf(0,0,0,0,0)) {
            println(x)
        } else {
            if (x17 == 0) {
                if (div[3] == 1) {
                    when (div[4]) {
                        0 -> println("Bong")
                        1 -> println("FezzBong")
                    }
                } else {
                    println(output1)
                }
            } else { //reversing direction of output
                if (div[3] == 1) {
                    when (div[4]) {
                        0 -> println("Bong")
                        1 -> println("BongFezz")
                    }
                } else {
                    println(output2)
                }
            }
        }
        }


    }
