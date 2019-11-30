// source: cmds.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

/* eslint-disable */

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.clientmarketdataservice.AddSubscriptionResponse', null, global);
goog.exportSymbol('proto.clientmarketdataservice.Book', null, global);
goog.exportSymbol('proto.clientmarketdataservice.BookLine', null, global);
goog.exportSymbol('proto.clientmarketdataservice.SubscribeRequest', null, global);
goog.exportSymbol('proto.clientmarketdataservice.Subscription', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.clientmarketdataservice.Subscription = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.clientmarketdataservice.Subscription, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.clientmarketdataservice.Subscription.displayName = 'proto.clientmarketdataservice.Subscription';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.clientmarketdataservice.AddSubscriptionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.clientmarketdataservice.AddSubscriptionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.clientmarketdataservice.AddSubscriptionResponse.displayName = 'proto.clientmarketdataservice.AddSubscriptionResponse';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.clientmarketdataservice.SubscribeRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.clientmarketdataservice.SubscribeRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.clientmarketdataservice.SubscribeRequest.displayName = 'proto.clientmarketdataservice.SubscribeRequest';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.clientmarketdataservice.BookLine = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.clientmarketdataservice.BookLine, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.clientmarketdataservice.BookLine.displayName = 'proto.clientmarketdataservice.BookLine';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.clientmarketdataservice.Book = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.clientmarketdataservice.Book.repeatedFields_, null);
};
goog.inherits(proto.clientmarketdataservice.Book, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.clientmarketdataservice.Book.displayName = 'proto.clientmarketdataservice.Book';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.clientmarketdataservice.Subscription.prototype.toObject = function(opt_includeInstance) {
  return proto.clientmarketdataservice.Subscription.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.clientmarketdataservice.Subscription} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.Subscription.toObject = function(includeInstance, msg) {
  var f, obj = {
    subscriberid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    listingid: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.clientmarketdataservice.Subscription}
 */
proto.clientmarketdataservice.Subscription.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.clientmarketdataservice.Subscription;
  return proto.clientmarketdataservice.Subscription.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.clientmarketdataservice.Subscription} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.clientmarketdataservice.Subscription}
 */
proto.clientmarketdataservice.Subscription.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubscriberid(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setListingid(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.clientmarketdataservice.Subscription.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.clientmarketdataservice.Subscription.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.clientmarketdataservice.Subscription} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.Subscription.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubscriberid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getListingid();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string subscriberId = 1;
 * @return {string}
 */
proto.clientmarketdataservice.Subscription.prototype.getSubscriberid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.Subscription.prototype.setSubscriberid = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string listingId = 2;
 * @return {string}
 */
proto.clientmarketdataservice.Subscription.prototype.getListingid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.Subscription.prototype.setListingid = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.clientmarketdataservice.AddSubscriptionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.clientmarketdataservice.AddSubscriptionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.clientmarketdataservice.AddSubscriptionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.AddSubscriptionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    message: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.clientmarketdataservice.AddSubscriptionResponse}
 */
proto.clientmarketdataservice.AddSubscriptionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.clientmarketdataservice.AddSubscriptionResponse;
  return proto.clientmarketdataservice.AddSubscriptionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.clientmarketdataservice.AddSubscriptionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.clientmarketdataservice.AddSubscriptionResponse}
 */
proto.clientmarketdataservice.AddSubscriptionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMessage(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.clientmarketdataservice.AddSubscriptionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.clientmarketdataservice.AddSubscriptionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.clientmarketdataservice.AddSubscriptionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.AddSubscriptionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMessage();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string message = 1;
 * @return {string}
 */
proto.clientmarketdataservice.AddSubscriptionResponse.prototype.getMessage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.AddSubscriptionResponse.prototype.setMessage = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.clientmarketdataservice.SubscribeRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.clientmarketdataservice.SubscribeRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.clientmarketdataservice.SubscribeRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.SubscribeRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    subscriberid: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.clientmarketdataservice.SubscribeRequest}
 */
proto.clientmarketdataservice.SubscribeRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.clientmarketdataservice.SubscribeRequest;
  return proto.clientmarketdataservice.SubscribeRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.clientmarketdataservice.SubscribeRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.clientmarketdataservice.SubscribeRequest}
 */
proto.clientmarketdataservice.SubscribeRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubscriberid(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.clientmarketdataservice.SubscribeRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.clientmarketdataservice.SubscribeRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.clientmarketdataservice.SubscribeRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.SubscribeRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubscriberid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string subscriberId = 1;
 * @return {string}
 */
proto.clientmarketdataservice.SubscribeRequest.prototype.getSubscriberid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.SubscribeRequest.prototype.setSubscriberid = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.clientmarketdataservice.BookLine.prototype.toObject = function(opt_includeInstance) {
  return proto.clientmarketdataservice.BookLine.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.clientmarketdataservice.BookLine} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.BookLine.toObject = function(includeInstance, msg) {
  var f, obj = {
    bidsize: jspb.Message.getFieldWithDefault(msg, 1, ""),
    bidprice: jspb.Message.getFieldWithDefault(msg, 2, ""),
    asksize: jspb.Message.getFieldWithDefault(msg, 3, ""),
    askprice: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.clientmarketdataservice.BookLine}
 */
proto.clientmarketdataservice.BookLine.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.clientmarketdataservice.BookLine;
  return proto.clientmarketdataservice.BookLine.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.clientmarketdataservice.BookLine} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.clientmarketdataservice.BookLine}
 */
proto.clientmarketdataservice.BookLine.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBidsize(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBidprice(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAsksize(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAskprice(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.clientmarketdataservice.BookLine.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.clientmarketdataservice.BookLine.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.clientmarketdataservice.BookLine} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.BookLine.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBidsize();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBidprice();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAsksize();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAskprice();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string bidSize = 1;
 * @return {string}
 */
proto.clientmarketdataservice.BookLine.prototype.getBidsize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.BookLine.prototype.setBidsize = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string bidPrice = 2;
 * @return {string}
 */
proto.clientmarketdataservice.BookLine.prototype.getBidprice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.BookLine.prototype.setBidprice = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string askSize = 3;
 * @return {string}
 */
proto.clientmarketdataservice.BookLine.prototype.getAsksize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.BookLine.prototype.setAsksize = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string askPrice = 4;
 * @return {string}
 */
proto.clientmarketdataservice.BookLine.prototype.getAskprice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.BookLine.prototype.setAskprice = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.clientmarketdataservice.Book.repeatedFields_ = [2];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.clientmarketdataservice.Book.prototype.toObject = function(opt_includeInstance) {
  return proto.clientmarketdataservice.Book.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.clientmarketdataservice.Book} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.Book.toObject = function(includeInstance, msg) {
  var f, obj = {
    listingid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    depthList: jspb.Message.toObjectList(msg.getDepthList(),
    proto.clientmarketdataservice.BookLine.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.clientmarketdataservice.Book}
 */
proto.clientmarketdataservice.Book.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.clientmarketdataservice.Book;
  return proto.clientmarketdataservice.Book.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.clientmarketdataservice.Book} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.clientmarketdataservice.Book}
 */
proto.clientmarketdataservice.Book.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setListingid(value);
      break;
    case 2:
      var value = new proto.clientmarketdataservice.BookLine;
      reader.readMessage(value,proto.clientmarketdataservice.BookLine.deserializeBinaryFromReader);
      msg.addDepth(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.clientmarketdataservice.Book.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.clientmarketdataservice.Book.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.clientmarketdataservice.Book} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.clientmarketdataservice.Book.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getListingid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDepthList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.clientmarketdataservice.BookLine.serializeBinaryToWriter
    );
  }
};


/**
 * optional string listingId = 1;
 * @return {string}
 */
proto.clientmarketdataservice.Book.prototype.getListingid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.clientmarketdataservice.Book.prototype.setListingid = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated BookLine depth = 2;
 * @return {!Array<!proto.clientmarketdataservice.BookLine>}
 */
proto.clientmarketdataservice.Book.prototype.getDepthList = function() {
  return /** @type{!Array<!proto.clientmarketdataservice.BookLine>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.clientmarketdataservice.BookLine, 2));
};


/** @param {!Array<!proto.clientmarketdataservice.BookLine>} value */
proto.clientmarketdataservice.Book.prototype.setDepthList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.clientmarketdataservice.BookLine=} opt_value
 * @param {number=} opt_index
 * @return {!proto.clientmarketdataservice.BookLine}
 */
proto.clientmarketdataservice.Book.prototype.addDepth = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.clientmarketdataservice.BookLine, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 */
proto.clientmarketdataservice.Book.prototype.clearDepthList = function() {
  this.setDepthList([]);
};


goog.object.extend(exports, proto.clientmarketdataservice);
