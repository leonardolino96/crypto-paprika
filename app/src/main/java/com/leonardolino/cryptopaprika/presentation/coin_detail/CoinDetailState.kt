package com.leonardolino.cryptopaprika.presentation.coin_detail

import com.leonardolino.cryptopaprika.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
