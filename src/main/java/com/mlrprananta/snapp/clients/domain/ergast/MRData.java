package com.mlrprananta.snapp.clients.domain.ergast;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MRData(
    @JsonProperty("RaceTable") RaceTable raceTable,
    @JsonProperty("StandingsTable") StandingsTable standingsTable) {}
