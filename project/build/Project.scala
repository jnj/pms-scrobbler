import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) with ProguardProject {
  
  override val artifactID = "pms-scrobbler"

  override def mainClass: Option[String] = None

  override def proguardOptions = List(
    "-dontoptimize",
    "-dontobfuscate",
    proguardKeepLimitedSerializability,
    proguardKeepAllScala,
    "-keep interface scala.ScalaObject",
    "-keep class net.pms.AudioFileListener",
    "-dontshrink"
  )
 
  override def proguardInJars = Path.fromFile(scalaLibraryJar)
}
