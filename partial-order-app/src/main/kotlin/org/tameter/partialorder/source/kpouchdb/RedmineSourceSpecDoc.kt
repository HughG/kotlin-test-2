package org.tameter.partialorder.source.kpouchdb

import org.tameter.partialorder.source.RedmineSourceSpec

external interface RedmineSourceSpecDoc : SourceSpecDoc, RedmineSourceSpec

const val REDMINE_SOURCE_SPEC_DOC_TYPE = "redmine"

fun RedmineSourceSpecDoc(
        description: String,
        url: String,
        projectId: String? = null,
        apiKey: String? = null
): RedmineSourceSpecDoc {
    return SourceSpecDoc<RedmineSourceSpecDoc>(
            "redmine:${url}:projectId=${projectId}",
            REDMINE_SOURCE_SPEC_DOC_TYPE,
            description
    ).apply {
        asDynamic().url = url
        asDynamic().projectId = projectId
        asDynamic().apiKey = apiKey
    }
}
