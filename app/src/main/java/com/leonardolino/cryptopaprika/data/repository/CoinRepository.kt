package com.leonardolino.cryptopaprika.data.repository

import com.leonardolino.cryptopaprika.data.remote.CoinPaprikaApi
import com.leonardolino.cryptopaprika.data.remote.dto.CoinDetailDto
import com.leonardolino.cryptopaprika.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}