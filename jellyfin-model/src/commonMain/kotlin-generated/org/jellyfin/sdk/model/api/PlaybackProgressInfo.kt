// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class PlaybackProgressInfo.
 */
@Serializable
public data class PlaybackProgressInfo(
	/**
	 * Gets or sets a value indicating whether this instance can seek.
	 */
	@SerialName("CanSeek")
	public val canSeek: Boolean,
	/**
	 * Gets or sets the item.
	 */
	@SerialName("Item")
	public val item: BaseItemDto? = null,
	/**
	 * Gets or sets the item identifier.
	 */
	@SerialName("ItemId")
	public val itemId: UUID,
	/**
	 * Gets or sets the session id.
	 */
	@SerialName("SessionId")
	public val sessionId: String? = null,
	/**
	 * Gets or sets the media version identifier.
	 */
	@SerialName("MediaSourceId")
	public val mediaSourceId: String? = null,
	/**
	 * Gets or sets the index of the audio stream.
	 */
	@SerialName("AudioStreamIndex")
	public val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the index of the subtitle stream.
	 */
	@SerialName("SubtitleStreamIndex")
	public val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is paused.
	 */
	@SerialName("IsPaused")
	public val isPaused: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is muted.
	 */
	@SerialName("IsMuted")
	public val isMuted: Boolean,
	/**
	 * Gets or sets the position ticks.
	 */
	@SerialName("PositionTicks")
	public val positionTicks: Long? = null,
	@SerialName("PlaybackStartTimeTicks")
	public val playbackStartTimeTicks: Long? = null,
	/**
	 * Gets or sets the volume level.
	 */
	@SerialName("VolumeLevel")
	public val volumeLevel: Int? = null,
	@SerialName("Brightness")
	public val brightness: Int? = null,
	@SerialName("AspectRatio")
	public val aspectRatio: String? = null,
	/**
	 * Gets or sets the play method.
	 */
	@SerialName("PlayMethod")
	public val playMethod: PlayMethod,
	/**
	 * Gets or sets the live stream identifier.
	 */
	@SerialName("LiveStreamId")
	public val liveStreamId: String? = null,
	/**
	 * Gets or sets the play session identifier.
	 */
	@SerialName("PlaySessionId")
	public val playSessionId: String? = null,
	/**
	 * Gets or sets the repeat mode.
	 */
	@SerialName("RepeatMode")
	public val repeatMode: RepeatMode,
	@SerialName("NowPlayingQueue")
	public val nowPlayingQueue: List<QueueItem>? = null,
	@SerialName("PlaylistItemId")
	public val playlistItemId: String? = null
)
