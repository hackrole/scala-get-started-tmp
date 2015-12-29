val feeds = List("blog.toolshed.com", "pragdave.com", "dimsumc.com/blog")

println("First feed: " + feeds.head)
println("Second feed: " + feeds(1))

val pList = "forums.prog.com/87" :: feeds
println("First Feed in Prefixed: " + pList.head)

val fList = feeds ::: List("forum.com/87", "forums.com/55")
println("first of flist " + fList.head)
println("last of flist " + fList.last)

val appList = feeds ::: List("agil.com/blog")
println("last in feed: " + appList.last)

println(" filter: ", feeds.filter(_ contains "blog"))
println(" all: " + feeds.forall(_ contains "com"))
println(" all2: " + feeds.forall(_ contains "dave"))
println(" any: " + feeds.exists(_ contains "dave"))
println(" any: " + feeds.exists(_ contains "bill"))

println("Feed url lengths: " + feeds.map(_.length).mkString(", "))
val total = feeds.foldLeft(0) {(total, feed) => total + feed.length}
println("total length: " + total)

val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
println("total length of feed urls: " + total2)

val total3 = (0 /: feeds) {_ + _.length}
println("total length of feed urls: " + total3)
