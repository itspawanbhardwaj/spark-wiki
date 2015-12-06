import sbt.Keys._

name := "spark-wiki"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.1",
  "org.apache.spark" %% "spark-sql" % "1.5.1",
  jdbc,
  javaEbean,
  cache,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
  filters
)

resolvers ++= Seq(
"cloudera" at "https://repository.cloudera.com/cloudera/cloudera-repos/",
	"Cloudera H-base " at "https://repository.cloudera.com/content/repositories/releases/",
        "Akka Repository" at "http://repo.akka.io/releases/", 
        "Conjars Repository" at "http://conjars.org/repo/",
        "Spring Repository" at "http://repo.springsource.org/plugins-snapshot",
        "Spray Repository" at "http://repo.spray.cc/",
	      "spray" at "http://repo.spray.io/",
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots"
)

