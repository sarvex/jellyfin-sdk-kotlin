// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	DateTimeSerializer::class,
	UUIDSerializer::class
)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.DateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class BaseItem.
 */
@Serializable
public data class BaseItem(
	@SerialName("Size")
	public val size: Long? = null,
	@SerialName("Container")
	public val container: String? = null,
	@SerialName("DateLastSaved")
	public val dateLastSaved: DateTime,
	/**
	 * Gets or sets the remote trailers.
	 */
	@SerialName("RemoteTrailers")
	public val remoteTrailers: List<MediaUrl>? = null,
	@SerialName("IsHD")
	public val isHd: Boolean,
	@SerialName("IsShortcut")
	public val isShortcut: Boolean,
	@SerialName("ShortcutPath")
	public val shortcutPath: String? = null,
	@SerialName("Width")
	public val width: Int,
	@SerialName("Height")
	public val height: Int,
	@SerialName("ExtraIds")
	public val extraIds: List<UUID>? = null,
	@SerialName("SupportsExternalTransfer")
	public val supportsExternalTransfer: Boolean
)
