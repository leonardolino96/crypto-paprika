package com.leonardolino.cryptopaprika.domain.use_case.get_coins

import com.leonardolino.cryptopaprika.common.Resource
import com.leonardolino.cryptopaprika.data.repository.CoinRepository
import com.leonardolino.cryptopaprika.domain.model.Coin
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Coin>>> = repository.getCoins()
}