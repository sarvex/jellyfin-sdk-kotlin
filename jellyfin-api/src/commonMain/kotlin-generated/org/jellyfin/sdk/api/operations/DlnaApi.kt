// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptyMap
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.delete
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.api.DeviceProfile
import org.jellyfin.sdk.model.api.DeviceProfileInfo

public class DlnaApi(
	private val api: ApiClient
) : Api {
	/**
	 * Creates a profile.
	 */
	public suspend fun createProfile(`data`: DeviceProfile? = null): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Dlna/Profiles", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Deletes a profile.
	 *
	 * @param profileId Profile id.
	 */
	public suspend fun deleteProfile(profileId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["profileId"] = profileId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Dlna/Profiles/{profileId}", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets the default profile.
	 */
	public suspend fun getDefaultProfile(): Response<DeviceProfile> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<DeviceProfile>("/Dlna/Profiles/Default", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets a single profile.
	 *
	 * @param profileId Profile Id.
	 */
	public suspend fun getProfile(profileId: String): Response<DeviceProfile> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["profileId"] = profileId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<DeviceProfile>("/Dlna/Profiles/{profileId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get profile infos.
	 */
	public suspend fun getProfileInfos(): Response<List<DeviceProfileInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<DeviceProfileInfo>>("/Dlna/ProfileInfos", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Updates a profile.
	 *
	 * @param profileId Profile id.
	 */
	public suspend fun updateProfile(profileId: String, `data`: DeviceProfile? = null):
			Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["profileId"] = profileId
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Dlna/Profiles/{profileId}", pathParameters, queryParameters, data)
		return response
	}
}
