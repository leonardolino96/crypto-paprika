package com.leonardolino.cryptopaprika.domain.use_case.get_coin

import com.leonardolino.cryptopaprika.common.Resource
import com.leonardolino.cryptopaprika.data.repository.CoinRepository
import com.leonardolino.cryptopaprika.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = repository.getCoinById(coinId)
}