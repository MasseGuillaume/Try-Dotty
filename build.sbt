lazy val evaluation = project.settings(
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "ch.epfl.lamp" % "dotty_2.11" % "0.1-SNAPSHOT-20160609-8fe3e37",
    "com.lihaoyi" %% "utest" % "0.4.3" % "test"
  ),
  testFrameworks += new TestFramework("utest.runner.Framework")
)