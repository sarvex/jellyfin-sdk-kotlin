package org.jellyfin.sample.cli.command

import com.github.ajalt.clikt.core.CliktCommand
import kotlinx.coroutines.runBlocking
import org.jellyfin.sample.cli.apiInstanceHolder
import org.jellyfin.sdk.Jellyfin
import org.jellyfin.sdk.api.client.extensions.sessionApi
import org.jellyfin.sdk.api.client.extensions.userViewsApi

class Libraries(
	jellyfin: Jellyfin
) : CliktCommand("List all libraries") {
	private val api by apiInstanceHolder(jellyfin)

	override fun run(): Unit = runBlocking {
		val sessionInfo = api.sessionApi.getSessions(deviceId = api.deviceInfo.id).content.firstOrNull()
		if (sessionInfo == null) println("Unknown session")
		api.userId = sessionInfo?.userId

		val libraries by api.userViewsApi.getUserViews(includeHidden = false)

		if (libraries.items.isNullOrEmpty()) println("No libraries found")

		libraries.items?.forEach {
			println(it.name)
		}
	}
}
