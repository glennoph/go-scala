// functions
def adder(a: Int, b: Int) : Int = {
  a+b
}

adder(3,4)

// check for odd num
def checkOdd(x: Int) : Boolean = {
  x%2 == 1
}

checkOdd(11)
checkOdd(22)

// check for odd in list
def checkForOdd(listin : List[Int]) : Boolean = {
  for(n <- listin) {
    if (n%2 == 1) return true
  }
  false
}

checkForOdd(List(2,22,222))
checkForOdd(List(2,22,223))

// double 7 in sum
def sumDouble7(listin : List[Int]) : Int = {
  var result = 0
  for(x <- listin) {
    if (x==7) result += 14
    else result += x
  }
  result
}

val r6 = sumDouble7(Range(0,7).toList)
val r7 = sumDouble7(Range(0,8).toList)
r7-r6

// test balanced list
def testBalList(listin : List[Int]) : Boolean = {
  var listSum1 = listin.sum
  var listSum2 = 0
  for(x <- listin) {
    listSum1 -= x
    listSum2 += x
    if (listSum1 == listSum2) return true
  }
  false
}

testBalList(List(1,1,3))
testBalList(List(1,2,3))

// Palindrome check
def palCheck(strin : String ) : Boolean = {
  strin.reverse == strin
}

palCheck("hi")
palCheck("abba")

