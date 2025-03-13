//> using repository sonatype:snapshots
//> using dep ba.sake::hepek-cli:0.29.1+6-5304a33a-SNAPSHOT
import ba.sake.hepek.cli.HepekCLI

@main def runHepekCLI() =
  HepekCLI().run()
