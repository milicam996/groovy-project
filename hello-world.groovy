// Printing Hello
println('Hello World')

// Lists
def lst = ['Moon', 'Earth', 'Sun']
// using implicit argument
lst.each { println it }

// using explicit argument
lst.each { val -> println val }

// Maps
def map = [earth: 'Earth', moon: 'Moon', sun: 'Sun']

// using implicit argument
map.each { println "key: ${it.key }, value: ${it.value }"}

// using explicit arguments
map.each { k, v -> println "key: $k, value: $v" }

// Mathematics
int a = 8
int b = 2
int c
c = a + b
println 'Addition = ' + c
c = a - b
println 'Subtraction = ' + c
c = a * b
println 'Multiplication = ' + c
c = a / b
println 'Division = ' + c
c = a % b

// Checking if
int k = 31
if (k < 65) {
    println('groovy')
}

// Checking if/else
int m = 15
if (m < 40) {
    println('The value is less than 40')
      } else {
    println('The value is greater than 40')
}

int l = -90
if (l > 0) {
    println('Number is positive')
      } else {
    println('Number is negative')
}
