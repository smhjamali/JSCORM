package com.arcusys.learn.scorm.manifest.sequencing.storage.impl

import com.arcusys.learn.storage.impl.EntityStorageExt
import com.arcusys.learn.scorm.manifest.model.SequencingTracking
import com.arcusys.learn.scorm.manifest.sequencing.storage.SequencingTrackingStorage

/**
 * User: Yulia.Glushonkova
 * Date: 28.03.13
 */
trait SequencingTrackingEntityStorage extends SequencingTrackingStorage with EntityStorageExt[SequencingTracking] {
   def create(sequencingID: Int, entity: SequencingTracking) {
      create(entity, "sequencingID"->sequencingID)
    }
    def get(sequencingID: Int): Option[SequencingTracking] = getOne("sequencingID"->sequencingID)
    def delete(sequencingID: Int) { delete("sequencingID"->sequencingID) }
}
