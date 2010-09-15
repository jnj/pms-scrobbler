package net.pms

import net.pms.dlna.{DLNAMediaInfo, DLNAResource}
import net.pms.external.StartStopListener

import javax.swing._

class AudioFileListener extends StartStopListener {
  def nowPlaying(media: DLNAMediaInfo, resource: DLNAResource) = {
  }

  def donePlaying(media: DLNAMediaInfo, resource: DLNAResource) = {
  }
  
  def config(): JComponent = {
    null
  }
  
  def name() = "pms-scrobbler"
  
  def shutdown() = {
  }
}

