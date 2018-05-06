import java.util.NoSuchElementException

// create map m contains key/value pairs
val m = Map(("a",1),("b",2),("c",3))

// get value for a key
m("a")
m("b")

// get value for key not in set
//m("xx") returns exception

// map get
m get "c"
