package com.andrex.ngefilm

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class NgefilmProvider : MainAPI() {
    override var mainUrl = "https://new39.ngefilm.site"
    override var name = "Ngefilm"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
    override var lang = "id"

    override suspend fun search(query: String): List<SearchResponse> {
        // TODO: Implement only for content you are authorized to index.
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse? {
        // TODO: Parse an authorized detail page.
        return null
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // TODO: Resolve only authorized streaming URLs.
        return false
    }
}
