import objsets.{TweetList, TweetSet, TweetReader}

object GoogleVsApple2 {
  val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus")
  val apple = List("ios", "iOS", "iphone", "iPhone", "ipad", "iPad")

  lazy val googleTweets: TweetSet = TweetReader.allTweets.filter(tw => google.exists(e => tw.text.contains(e)))
  lazy val appleTweets: TweetSet = TweetReader.allTweets.filter(tw => apple.exists(e => tw.text.contains(e)))

  /**
    * A list of all tweets mentioning a keyword from either apple or google,
    * sorted by the number of retweets.
    */
  lazy val trending: TweetList = (googleTweets.union(appleTweets)).descendingByRetweet
}


  GoogleVsApple2.trending foreach println

