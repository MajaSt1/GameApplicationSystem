package com.capgemini.gamecapmates.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class PreviousGames {
    private Long idUser;
    private Long idGame;
    private GameResult gameResult;
}
