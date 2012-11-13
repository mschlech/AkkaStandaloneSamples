resolvers += Resolver.url("scalasbt releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-sbt" % "sbt-android-plugin" % "0.6.2") 

addSbtPlugin("com.typesafe.akka" % "akka-sbt-plugin" % "2.1.0-RC1")
