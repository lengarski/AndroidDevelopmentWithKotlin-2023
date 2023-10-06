// Homework
// 1. Find perimeter and surface of trapeze (a = 15, b = 8.25, c = 4.5, d = 5.5, h = 3.825)
// 2. Find circumference and surface of a circle (r = 12.755, 𝝅=3.14)

val a = 15f
val b = 8.25f
val c = 4.5f
val d = 5.5f
val h = 3.825f

val r = 12.755f

val trapezePerimeter = calculateTrapezePerimeter(a, b, c, d)
trapezePerimeter

val trapezeSurface = calculateTrapezeSurface(a, c, h)
trapezeSurface

val circleCircumference = calculateCircleCircumference(r)
circleCircumference

val circleSurface = calculateCircleSurface(r)
circleSurface


fun calculateTrapezeSurface(a: Float, c: Float, h: Float): Float {
    return ((a + c) * h) / 2
}

fun calculateTrapezePerimeter(a: Float, b: Float, c: Float, d: Float): Float {
    return a + b + c + d;
}

fun calculateCircleCircumference(r: Float): Float {
    val pi = 3.14f
    return 2 * pi * r
}

fun calculateCircleSurface(r: Float): Float {
    val pi = 3.14f
    return pi * r * r
}