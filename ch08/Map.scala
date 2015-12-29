val feeds = Map("Andy Hunt" -> "blog.toolshed.com",
  "Dave Thomas" -> "pragdave.pragprog.com",
  "Dan Steinberg" -> "dimsumthinking.com/blog")

val filterNameStringWithD = feeds filterKeys(_ startsWith "D")
println("# of Filtered: " + filterNameStringWithD.size)

val filterValue = feeds filter {
  element =>
    val (key, value) = element
    (key startsWith "D") && (value contains "blog")
}

println("# of feeds with auth name D* and blog in url: " + filterValue.size)

println("Get Andy's Feed: " + feeds.get("Andy Hunt"))
println("Get Bill's Feed: " + feeds.get("Bill WHo"))

try{
  println("Get Andy's Feed USing apply: " + feeds("Andy Hunt"))
  println("Get Bill's Feed: ")
  println(feeds("Bill WHo"))
}
catch{
  case ex: java.util.NoSuchElementException => println("Not found")
}

// XXX not working
val newFeeds1 = feeds.update("Venkat Subramaniam", "agiledeveloper.com/blog")
println("Venkat's blog in original feeds: " + feeds.get("Venkat subramaniam"))
println("new feed: " + newFeeds1.get("Venkat Subramaniam"))

val mutableFeeds = scala.collection.mutable.Map("Scala Book Forum" -> "forums.pargprog.com/forums/87")
mutableFeeds("Groovy Book Forum") = "forms.pragprog.com/forums/55"
println("Number of forums: " + mutableFeeds.size)
