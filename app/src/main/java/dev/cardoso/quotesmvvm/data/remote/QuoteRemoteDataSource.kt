package dev.cardoso.quotesmvvm.data.remote

import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.data.model.QuoteResponse
import kotlinx.coroutines.flow.Flow

interface QuoteRemoteDataSource {

    //suspend  fun getQuotes(): Flow<List<QuoteModel>?>

    suspend fun  getQuotes(token: String, quoteModel: QuoteModel): Flow<QuoteResponse?>

    suspend fun editQuote(quoteModel: QuoteModel,token:String):Flow<QuoteResponse?>

    suspend fun addQuote(quoteModel: QuoteModel, token: String):Flow<QuoteResponse?>

      suspend fun deleteQuote(token: String,id: Int ): Flow<QuoteResponse?>

}