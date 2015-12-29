val colors1 = Set("Blue", "Green", "Red")
var colors = colors1

println("colors1 (colors): " + colors)
colors += "Black"

println("colors: " + colors)
println("colors1: " + colors1)

val feeds1 = Set("blog.toolshed.com", "pragdave.pragprog.com",
  "pragmactic-osxer.blogspot.com", "vita-contemplativa.blogspot.com")
val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")

val blogSpotFeeds = feeds1 filter(_ contains "blogspot")
println("blogsport feeds: " + blogSpotFeeds.mkString(", "))

var mergedFeeds = feeds1 ++ feeds2
println("# of merged feeds: " + mergedFeeds.size)

// XXX errors
val commonFeeds = feeds1 ** feeds2
println("common feeds: " + commonFeeds.mkString(", "))

val urls = feeds1 map ("http://" + _)
println("One url: " + urls.toArray(0))

println("Refresh Feeds:")
feeds1 foreach {feed => println(" Refreshing " + feed)}
