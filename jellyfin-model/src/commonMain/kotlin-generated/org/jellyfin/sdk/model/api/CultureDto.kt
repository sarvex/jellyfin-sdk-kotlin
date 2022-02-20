// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class CultureDto.
 */
@Serializable
public data class CultureDto(
	/**
	 * Gets the name.
	 */
	@SerialName("Name")
	public val name: String,
	/**
	 * Gets the display name.
	 */
	@SerialName("DisplayName")
	public val displayName: String,
	/**
	 * Gets the name of the two letter ISO language.
	 */
	@SerialName("TwoLetterISOLanguageName")
	public val twoLetterIsoLanguageName: String,
	/**
	 * Gets the name of the three letter ISO language.
	 */
	@SerialName("ThreeLetterISOLanguageName")
	public val threeLetterIsoLanguageName: String? = null,
	@SerialName("ThreeLetterISOLanguageNames")
	public val threeLetterIsoLanguageNames: List<String>
)
