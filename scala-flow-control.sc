var b = true

if (b) {
  println("print if true")
}

val name = "Abe"

if (name == "x") {
  println(" true")
} else {
  println("not true")
}

// for stmts

for(item <- List(1,2,3)) println(item)

for(i <- Range(0,10)) if (i%3 == 0) println(s"$i")