// def a set, sets are immutable
val s0 = Set()

// set s1
val s1 = Set(1,2,3)

// sets do not have dups
val s2 = Set(1,2,2,2,3)

// add element to set
val s3 = s1 + 4

val s4 = s3.+(5)

// max and min
s4.min
s4.max
s4.sum
