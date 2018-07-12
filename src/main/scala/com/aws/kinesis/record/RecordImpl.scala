package com.aws.kinesis.record

import java.nio.ByteBuffer

import com.amazonaws.services.kinesis.model.Record

import scala.util.Try

trait RecordImpl[T] {
  def getPartitionKey: String
  def getData: T
  def getByteBuffer: Try[ByteBuffer]
  def getSequenceNumber: Option[String]
  def getKinesisRecord: Record
}