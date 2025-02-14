// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Defines the MediaBrowser.Common.Plugins.IPlugin.
 */
@Serializable
public data class IPlugin(
	/**
	 * Gets the name of the plugin.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets the Description.
	 */
	@SerialName("Description")
	public val description: String? = null,
	/**
	 * Gets the unique id.
	 */
	@SerialName("Id")
	public val id: UUID,
	/**
	 * Gets the plugin version.
	 */
	@SerialName("Version")
	public val version: Version? = null,
	/**
	 * Gets the path to the assembly file.
	 */
	@SerialName("AssemblyFilePath")
	public val assemblyFilePath: String? = null,
	/**
	 * Gets a value indicating whether the plugin can be uninstalled.
	 */
	@SerialName("CanUninstall")
	public val canUninstall: Boolean,
	/**
	 * Gets the full path to the data folder, where the plugin can store any miscellaneous files
	 * needed.
	 */
	@SerialName("DataFolderPath")
	public val dataFolderPath: String? = null
)
