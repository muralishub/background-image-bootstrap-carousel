name := "background-image-bootstrap-carousel"

version := "0.1"

scalaVersion := "2.13.1"
lazy val root = (project in file(".")).enablePlugins(PlayScala)



libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.23.4" % Test


