name := "scala-bugs"

version := "0.1"

scalaVersion := "2.11.2"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "com.typesafe.play" %% "play-test" % "2.3.4",
  "org.virtuslab" %% "unicorn" % "0.6.0",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.specs2" %% "specs2" % "2.4.2" % "test"
)
