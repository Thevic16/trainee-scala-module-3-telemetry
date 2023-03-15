// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.reactivebbq.customers.CustomerProtocol

@SerialVersionUID(0L)
final case class GetCustomerResponse(
    customerId: _root_.scala.Predef.String = "",
    customer: _root_.scala.Option[com.reactivebbq.customers.CustomerProtocol.Customer] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GetCustomerResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = customerId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (customer.isDefined) {
        val __value = customer.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = customerId
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      customer.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withCustomerId(__v: _root_.scala.Predef.String): GetCustomerResponse = copy(customerId = __v)
    def getCustomer: com.reactivebbq.customers.CustomerProtocol.Customer = customer.getOrElse(com.reactivebbq.customers.CustomerProtocol.Customer.defaultInstance)
    def clearCustomer: GetCustomerResponse = copy(customer = _root_.scala.None)
    def withCustomer(__v: com.reactivebbq.customers.CustomerProtocol.Customer): GetCustomerResponse = copy(customer = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = customerId
          if (__t != "") __t else null
        }
        case 2 => customer.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(customerId)
        case 2 => customer.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse
}

object GetCustomerResponse extends scalapb.GeneratedMessageCompanion[com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse] = this
  def merge(`_message__`: com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse = {
    var __customerId = `_message__`.customerId
    var __customer = `_message__`.customer
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __customerId = _input__.readStringRequireUtf8()
        case 18 =>
          __customer = Option(_root_.scalapb.LiteParser.readMessage(_input__, __customer.getOrElse(com.reactivebbq.customers.CustomerProtocol.Customer.defaultInstance)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse(
        customerId = __customerId,
        customer = __customer,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse(
        customerId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        customer = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.reactivebbq.customers.CustomerProtocol.Customer]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CustomerProtocolProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CustomerProtocolProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.reactivebbq.customers.CustomerProtocol.Customer
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse(
    customerId = "",
    customer = _root_.scala.None
  )
  implicit class GetCustomerResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse](_l) {
    def customerId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.customerId)((c_, f_) => c_.copy(customerId = f_))
    def customer: _root_.scalapb.lenses.Lens[UpperPB, com.reactivebbq.customers.CustomerProtocol.Customer] = field(_.getCustomer)((c_, f_) => c_.copy(customer = Option(f_)))
    def optionalCustomer: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.reactivebbq.customers.CustomerProtocol.Customer]] = field(_.customer)((c_, f_) => c_.copy(customer = f_))
  }
  final val CUSTOMERID_FIELD_NUMBER = 1
  final val CUSTOMER_FIELD_NUMBER = 2
  def of(
    customerId: _root_.scala.Predef.String,
    customer: _root_.scala.Option[com.reactivebbq.customers.CustomerProtocol.Customer],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse = _root_.com.reactivebbq.customers.CustomerProtocol.GetCustomerResponse(
    customerId,
    customer,
    unknownFields
  )
}
