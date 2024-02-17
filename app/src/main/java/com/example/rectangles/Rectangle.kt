package com.example.rectangles

class Rectangle (var length : Double, var width : Double) {

    var area : Double = 0.0
        get() = length * width
        private set

}