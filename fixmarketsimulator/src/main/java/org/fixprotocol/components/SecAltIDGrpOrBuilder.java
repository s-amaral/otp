// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface SecAltIDGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.SecAltIDGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string security_alt_id = 1 [(.fix.tag) = 455, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getSecurityAltId();
  /**
   * <code>string security_alt_id = 1 [(.fix.tag) = 455, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getSecurityAltIdBytes();

  /**
   * <code>.Common.SecurityAltIDSourceEnum security_alt_id_source = 2 [(.fix.tag) = 456, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getSecurityAltIdSourceValue();
  /**
   * <code>.Common.SecurityAltIDSourceEnum security_alt_id_source = 2 [(.fix.tag) = 456, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SecurityAltIDSourceEnum getSecurityAltIdSource();
}