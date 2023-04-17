package com.umutcansahin.feature.episode_detail

import com.umutcansahin.domain.model.CharacterResultDM
import com.umutcansahin.domain.model.EpisodeResultDM

fun EpisodeResultDM.toMap(): EpisodeDetailResultUiModel {
    return EpisodeDetailResultUiModel(
        airDate = airDate,
        characters = characters,
        created = created,
        episode = episode,
        id = id,
        name = name,
        url = url
    )
}

fun CharacterResultDM.toMap(): CharacterGroupResultUiModel {
    return CharacterGroupResultUiModel(
        image = image
    )
}