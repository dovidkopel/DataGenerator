package org.finra.scaffolding.action

import java.util.UUID

import org.finra.scaffolding.messaging.MessageHandler

/**
  * Created by dkopel on 9/14/16.
  */
trait Trigger[T] {
    val id: UUID
    val handlers: Seq[MessageHandler]
}