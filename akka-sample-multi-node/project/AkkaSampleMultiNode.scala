import sbt._
import sbt.Keys._
import akka.sbt.AkkaKernelPlugin
import akka.sbt.AkkaKernelPlugin.{Dist,outputDirectory,distJvmOptions}

object AkkaSampleMultiNodeJvm extends Build {

  lazy val akkaSampleMultiNode = Project(
    id = "akkaSampleMultiNode",
    base = file("."),
    settings = Project.defaultSettings ++ AkkaKernelPlugin.distSettings ++ Seq(
      name := "akkaSampleMultiNode",
      organization := "sample.multinode",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0-RC1",
      distJvmOptions in Dist := "-Xms256M -Xmx1024M",
      outputDirectory in Dist := file("target/hello-dist"),
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      resolvers += "Sonatype" at "https://oss.sonatype.org/content/repositories/releases",
      libraryDependencies ++= Seq("com.typesafe.akka" % "akka-actor_2.10.0-RC1" % "2.1.0-RC1",
	"com.typesafe.akka" % "akka-kernel_2.10.0-RC1" % "2.1.0-RC1",
	"com.typesafe.akka" % "akka-sample-multi-node-experimental_2.10.0-RC1" % "2.1.0-RC1",
	"com.typesafe.akka" % "akka-slf4j_2.10.0-RC1" % "2.1.0-RC1",
	"ch.qos.logback" % "logback-classic" % "1.0.7",
        "org.scala-lang" % "scala-reflect" % "2.10.0-RC1")))}
