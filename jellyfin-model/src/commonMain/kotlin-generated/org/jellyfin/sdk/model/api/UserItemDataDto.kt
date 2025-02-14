// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(DateTimeSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.serializer.DateTimeSerializer

/**
 * Class UserItemDataDto.
 */
@Serializable
public data class UserItemDataDto(
	/**
	 * Gets or sets the rating.
	 */
	@SerialName("Rating")
	public val rating: Double? = null,
	/**
	 * Gets or sets the played percentage.
	 */
	@SerialName("PlayedPercentage")
	public val playedPercentage: Double? = null,
	/**
	 * Gets or sets the unplayed item count.
	 */
	@SerialName("UnplayedItemCount")
	public val unplayedItemCount: Int? = null,
	/**
	 * Gets or sets the playback position ticks.
	 */
	@SerialName("PlaybackPositionTicks")
	public val playbackPositionTicks: Long,
	/**
	 * Gets or sets the play count.
	 */
	@SerialName("PlayCount")
	public val playCount: Int,
	/**
	 * Gets or sets a value indicating whether this instance is favorite.
	 */
	@SerialName("IsFavorite")
	public val isFavorite: Boolean,
	/**
	 * Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is likes.
	 */
	@SerialName("Likes")
	public val likes: Boolean? = null,
	/**
	 * Gets or sets the last played date.
	 */
	@SerialName("LastPlayedDate")
	public val lastPlayedDate: DateTime? = null,
	/**
	 * Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is played.
	 */
	@SerialName("Played")
	public val played: Boolean,
	/**
	 * Gets or sets the key.
	 */
	@SerialName("Key")
	public val key: String? = null,
	/**
	 * Gets or sets the item identifier.
	 */
	@SerialName("ItemId")
	public val itemId: String? = null
)
