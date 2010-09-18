package net.pms

import net.pms.dlna.{DLNAMediaInfo, DLNAResource}
import net.pms.external.{ExternalListener, StartStopListener}

import javax.swing._

sealed class AudioFileListener extends StartStopListener with ExternalListener {

  override def nowPlaying(media: DLNAMediaInfo, resource: DLNAResource) = {
  }

  override def donePlaying(media: DLNAMediaInfo, resource: DLNAResource) = {
  }
  
  override def config(): JComponent = {
    null
  }
  
  override def name(): String = { 
    "pms-scrobbler"
  }
  
  override def shutdown() = {
  }
}

