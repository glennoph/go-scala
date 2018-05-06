// what method test if list contains element
val l1 = List(1,2,3,4,5)
l1.contains(1)
l1 contains 3

// add all elements in list
l1.sum

// create an Array of odd numbers from 1 to 15
Range(1,15,2)
val arr = Array.range(1,15,2)

// find unique elements of List(2,3,1,4,5,6,6,1,2)
val l = List(2,3,1,4,5,6,6,1,2)
l.toSet

// create mutable map names -> ages
var mm = scala.collection.mutable.Map(("Sammy",3),("Frank",7),("Jon", 44))

// print keys
mm.keys

// add ("Mike", 22)
mm += ("Mike" -> 22)

