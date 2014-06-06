name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.7" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

