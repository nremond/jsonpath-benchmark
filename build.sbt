name := "jsonpath-benchmark"

version := "0.1"                                                       

organization := "io.gatling.benchmark"                                        

scalaVersion := "2.10.3"

/// ScalaMeter
resolvers += "Sonatype OSS Snapshots" at
  "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "com.github.axel22" %% "scalameter" % "0.4-SNAPSHOT" % "test"

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

/// Gatling JsonPath
libraryDependencies += "io.gatling" %% "jsonpath" % "0.3-SNAPSHOT" % "test"

/// Jayway JsonPath
libraryDependencies += "com.jayway.jsonpath" % "json-path" % "0.9.0" % "test"

/// Junit-Benchmark
libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.carrotsearch" % "junit-benchmarks" % "0.7.0" % "test"

