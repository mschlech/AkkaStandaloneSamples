import sbt._
import sbt.Keys._

object AkkaSampleHello extends Build {

  lazy val akkaSampleHello = Project(
    id = "akkaSampleHello",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "akkaSampleHello",
      organization := "sample.hello",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0-RC1",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      resolvers += "Sonatype" at "https://oss.sonatype.org/content/repositories/releases",
      libraryDependencies ++= Seq("com.typesafe.akka" % "akka-actor_2.10.0-RC1" % "2.1.0-RC1",
        "org.scala-lang" % "scala-reflect" % "2.10.0-RC1")))}

