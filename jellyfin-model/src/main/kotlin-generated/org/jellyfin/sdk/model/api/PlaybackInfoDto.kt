// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Plabyback info dto.
 */
@Serializable
public data class PlaybackInfoDto(
	/**
	 * Gets or sets the playback userId.
	 */
	@SerialName("UserId")
	public val userId: UUID? = null,
	/**
	 * Gets or sets the max streaming bitrate.
	 */
	@SerialName("MaxStreamingBitrate")
	public val maxStreamingBitrate: Int? = null,
	/**
	 * Gets or sets the start time in ticks.
	 */
	@SerialName("StartTimeTicks")
	public val startTimeTicks: Long? = null,
	/**
	 * Gets or sets the audio stream index.
	 */
	@SerialName("AudioStreamIndex")
	public val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the subtitle stream index.
	 */
	@SerialName("SubtitleStreamIndex")
	public val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets the max audio channels.
	 */
	@SerialName("MaxAudioChannels")
	public val maxAudioChannels: Int? = null,
	/**
	 * Gets or sets the media source id.
	 */
	@SerialName("MediaSourceId")
	public val mediaSourceId: String? = null,
	/**
	 * Gets or sets the live stream id.
	 */
	@SerialName("LiveStreamId")
	public val liveStreamId: String? = null,
	/**
	 * Gets or sets the device profile.
	 */
	@SerialName("DeviceProfile")
	public val deviceProfile: DeviceProfile? = null,
	/**
	 * Gets or sets a value indicating whether to enable direct play.
	 */
	@SerialName("EnableDirectPlay")
	public val enableDirectPlay: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to enable direct stream.
	 */
	@SerialName("EnableDirectStream")
	public val enableDirectStream: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to enable transcoding.
	 */
	@SerialName("EnableTranscoding")
	public val enableTranscoding: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to enable video stream copy.
	 */
	@SerialName("AllowVideoStreamCopy")
	public val allowVideoStreamCopy: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to allow audio stream copy.
	 */
	@SerialName("AllowAudioStreamCopy")
	public val allowAudioStreamCopy: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether to auto open the live stream.
	 */
	@SerialName("AutoOpenLiveStream")
	public val autoOpenLiveStream: Boolean? = null
)
