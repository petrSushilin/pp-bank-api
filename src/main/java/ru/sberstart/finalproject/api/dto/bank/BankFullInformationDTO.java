package ru.sberstart.finalproject.api.dto.bank;

import java.util.UUID;

/**
 * Представляет полную информацию о банковском учреждении.
 *
 * @param id Уникальный идентификатор банка.
 * @param name Название банка.
 * @param identityNumber Идентификационный номер банка.
 */
public record BankFullInformationDTO (UUID id, String name, String identityNumber) {
}
